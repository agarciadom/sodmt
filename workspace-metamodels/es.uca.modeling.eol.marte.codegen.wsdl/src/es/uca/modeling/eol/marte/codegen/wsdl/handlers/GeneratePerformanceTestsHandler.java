package es.uca.modeling.eol.marte.codegen.wsdl.handlers;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.xmlbeans.XmlException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.commons.util.StringUtil;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.util.FileUtil;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.dt.launching.EclipseContextManager;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.ui.actions.AddBookmarkAction;
import org.eclipse.ui.handlers.HandlerUtil;

import serviceAnalyzer.messageCatalog.ServicesDocument;
import es.uca.modeling.eol.marte.codegen.wsdl.Activator;
import es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks;
import es.uca.webservices.specgen.SpecGenerator;
import es.uca.webservices.testgen.TestGeneratorCommand;
import es.uca.webservices.testgen.api.generators.GenerationException;
import es.uca.webservices.testgen.api.parsers.ParserException;
import es.uca.webservices.testgen.parsers.MessageDirection;
import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService;

/**
 * Generates a The Grinder basic Jython script and a Velocity data file
 * for running performance tests of a web service.
 *
 * @author Antonio García-Domínguez
 */
public class GeneratePerformanceTestsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection)sel;
			IFile file = (IFile)ssel.getFirstElement();
			try {
				generatePerformanceTestsFor(file);
			} catch (Exception e) {
				throw new ExecutionException("Error while generating the performance test project", e);
			}
		}

		return null;
	}

	private void generatePerformanceTestsFor(IFile file) throws URISyntaxException, EolRuntimeException, Exception {
		final EmfModel weavingModel = loadWeavingModel(file);
		try {
			final PerformanceRequirementLinks allLinks =
				(PerformanceRequirementLinks)weavingModel
					.getAllOfType("PerformanceRequirementLinks")
					.iterator().next();

			final IProject project = createProject(allLinks);
			populateProject(project, weavingModel, allLinks);
			addMavenNature(project, null);
		} finally {
			weavingModel.dispose();
		}
	}

	private IProject createProject(final PerformanceRequirementLinks allLinks) throws CoreException {
		final String projectName = allLinks.getEclipseProjectName();
		final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		final IProject project = workspaceRoot.getProject(projectName);
		if (!project.exists()) {
			project.create(null);
		}
		if (!project.isOpen()) {
			project.open(null);
		}
		return project;
	}

	private void populateProject(IProject project, EmfModel weavingModel, PerformanceRequirementLinks allLinks) throws Exception {
		generateCode(weavingModel, project.getFile("pom.xml"));
		generateCode(weavingModel, createTestResourceFolder(project, "jython").getFile("tests.py"));
		generateCode(weavingModel, createTestResourceFolder(project, "config").getFile("grinder.properties"));

		final Set<TypeOperation> operations = collectAllOperations(allLinks);
		final Map<Resource, ServicesDocument> emf2XMLBeans = loadAllServiceCatalogs(operations);
		final Map<TypeOperation, File> specFiles = generateSpecs(createTestResourceFolder(project, "spec"), operations, emf2XMLBeans);
		generateInputs(createTestResourceFolder(project, "velocity/inputs"), allLinks, specFiles);
		generateMessageTemplates(createTestResourceFolder(project, "velocity/messages"), operations);

		project.refreshLocal(IProject.DEPTH_INFINITE, null);
	}

	private Map<TypeOperation, File> generateSpecs(IFolder folder, final Set<TypeOperation> operations, final Map<Resource, ServicesDocument> emf2XMLBeans)
			throws ParserException, IOException
	{
		final Map<TypeOperation, File> specFiles = new HashMap<TypeOperation, File>();
		final File fFolder = new File(folder.getLocationURI());
		final SpecGenerator gen = new SpecGenerator();
		gen.setDirection(MessageDirection.IN);

		for (TypeOperation op : operations) {
			// The operation is inside a port, which is inside a service  
			final TypeService service = (TypeService)op.eContainer().eContainer();
			gen.setServiceName(service.getName());
			gen.setOperationName(op.getName());

			final ServicesDocument sDoc = emf2XMLBeans.get(op.eResource());
			final String spec = gen.generate(sDoc);

			final File fSpec = new File(fFolder, service.getName() + "-" + op.getName() + ".spec");
			FileUtil.write(fSpec, spec);
			specFiles.put(op, fSpec);
		}

		return specFiles;
	}

	private Map<Resource, ServicesDocument> loadAllServiceCatalogs(
			final Set<TypeOperation> operations) throws XmlException,
			IOException {
		final Map<Resource, ServicesDocument> emf2XMLBeans = new HashMap<Resource, ServicesDocument>();
		for (TypeOperation op : operations) {
			final Resource opResource = op.eResource();
			if (!emf2XMLBeans.containsKey(opResource)) {
				final File fResource = new File(opResource.getURI().toFileString());
				final ServicesDocument sDoc = ServicesDocument.Factory.parse(fResource);
				emf2XMLBeans.put(opResource, sDoc);
			}
		}
		return emf2XMLBeans;
	}

	private Set<TypeOperation> collectAllOperations(PerformanceRequirementLinks allLinks) {
		// List all selected operations
		final Set<TypeOperation> operations = new HashSet<TypeOperation>();
		for (PerformanceRequirementLink link : allLinks.getLinks()) {
			operations.add(link.getOperation());
		}
		return operations;
	}

	private void generateInputs(IFolder folder, PerformanceRequirementLinks allLinks, Map<TypeOperation, File> specFiles) throws IOException, ParserException, GenerationException {
		final File fFolder = new File(folder.getLocationURI());
		for (File specFile : specFiles.values()) {
			final File fInputs = new File(fFolder, specFile.getName().replace(".spec", ".vm"));
			final TestGeneratorCommand cmd = new TestGeneratorCommand();
			cmd.parseArgs(specFile.getAbsolutePath(), allLinks.getNumberInputsOnSpecChanged() + "", "--output", fInputs.getAbsolutePath());
			cmd.run();
		}
	}

	private void generateMessageTemplates(IFolder folder, Set<TypeOperation> operations) throws IOException {
		final File fFolder = new File(folder.getLocationURI());
		for (TypeOperation op : operations) {
			final TypeService service = (TypeService)op.eContainer().eContainer();
			final File fTemplate = new File(fFolder, service.getName() + "-" + op.getName() + ".vm");
			final String sTemplate = op.getInput().getTemplate().getValue();
			FileUtil.write(fTemplate, sTemplate);
		}
	}

	private IFolder createTestResourceFolder(IProject project, String path) throws CoreException {
		final IFolder jythonFolder = project.getFolder(new Path("src/test/" + path));
		ensureFolderExists(jythonFolder);
		return jythonFolder;
	}

	private void ensureFolderExists(IFolder f) throws CoreException {
		if (f.getParent() instanceof IFolder && !f.getParent().exists()) {
			ensureFolderExists((IFolder)f.getParent());
		}
		if (!f.exists()) {
			f.create(true, true, null);
		}
	}

	private void generateCode(EmfModel weavingModel, IFile targetIFile) throws URISyntaxException, EolRuntimeException, Exception {
		final String pathToEGL = "/egl/" + targetIFile.getName() + ".egl";
		final File targetFile = new File(targetIFile.getLocationURI());
		generateCode(weavingModel, pathToEGL, targetFile);
	}

	private void generateCode(final EmfModel weavingModel, final String pathToEGL, final File targetFile)
			throws Exception, URISyntaxException, EolRuntimeException
	{
		// Parse the EGL script
		final EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		final EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
		eglModule.parse(GeneratePerformanceTestsHandler.class.getResource(pathToEGL).toURI());

		// Run it
		EclipseContextManager.setup(eglModule.getContext());
		eglModule.getContext().getModelRepository().addModel(weavingModel);

		// Save the result to a file
		final String result = StringUtil.toString(eglModule.execute());
		FileUtil.write(targetFile, result);
	}

	private EmfModel loadWeavingModel(final IFile file)	throws EolModelLoadingException, IOException {
		// Required in RCP apps: otherwise, the MARTE metamodel won't be found until the EPackage Registr
		// view or a Papyrus editor is opened.
		preloadEPackageRegistry();

		final EmfModel model = new EmfModel();
		model.setModelFileUri(URI.createFileURI(file.getLocation().toFile().getAbsolutePath()));
		model.setMetamodelUris(Arrays.asList(LinksPackage.eNS_URI, MessageCatalogPackage.eNS_URI, MARTEPackage.eNS_URI));
		model.setName("Weaving");
		model.setExpand(true);
		model.setCachingEnabled(true);
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(false);
		model.load();
		return model;
	}

	private void preloadEPackageRegistry() {
		final Registry registry = EPackage.Registry.INSTANCE;
		final EPackage marteEPackage = registry.getEPackage(MARTEPackage.eNS_URI);
		if (marteEPackage == null) {
			final Set<String> urls = new HashSet<String>(registry.keySet());
			for (String url : urls) {
				final EPackage pkg = registry.getEPackage(url);
				if (pkg == null) {
					Activator.getDefault().logWarning("EPackage for '" + url + "' is null");
				}
			}
		}
	}

	/**
	 * Taken from org.eclipse.m2e.core.internal.project.ProjectConfigurationManager, by Sonatype.
	 */
	private void addMavenNature(IProject project, IProgressMonitor monitor) throws CoreException {
		if (!project.hasNature(IMavenConstants.NATURE_ID)) {
			IProjectDescription description = project.getDescription();
			String[] prevNatures = description.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 1, prevNatures.length);
			newNatures[0] = IMavenConstants.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, monitor);
		}
	}
}
