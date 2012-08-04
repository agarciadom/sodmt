package es.uca.modeling.eol.marte.codegen.wsdl.handlers;

import java.io.IOException;
import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks;
import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;

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

	private void generatePerformanceTestsFor(IFile file) throws EolModelLoadingException, IOException, EolModelElementTypeNotFoundException, CoreException {
		final EmfModel weavingModel = loadWeavingModel(file);
		final PerformanceRequirementLinks allLinks =
				(PerformanceRequirementLinks)weavingModel
					.getAllOfType("PerformanceRequirementLinks")
					.iterator().next();

		populateProject(createProject(allLinks));
	}

	private IProject createProject(final PerformanceRequirementLinks allLinks)
			throws CoreException {
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

	private void populateProject(IProject project) {
		// TODO Auto-generated method stub
		
	}

	private EmfModel loadWeavingModel(final IFile file)	throws EolModelLoadingException, IOException {
		final EmfModel model = new EmfModel();
		model.setModelFileUri(URI.createFileURI(file.getLocation().toFile().getAbsolutePath()));
		model.setMetamodelUris(Arrays.asList(LinksPackage.eNS_URI, MessageCatalogPackage.eNS_URI));
		model.setName("Weaving");
		model.setExpand(true);
		model.setCachingEnabled(true);
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(false);
		model.load();
		return model;
	}
}
