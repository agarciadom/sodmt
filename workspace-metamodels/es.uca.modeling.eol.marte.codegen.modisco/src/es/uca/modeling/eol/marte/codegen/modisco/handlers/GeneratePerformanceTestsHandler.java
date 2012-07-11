package es.uca.modeling.eol.marte.codegen.modisco.handlers;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.dt.launching.EclipseContextManager;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.ui.handlers.HandlerUtil;

import es.uca.modeling.eol.marte.codegen.modisco.Activator;
import es.uca.modeling.eol.marte.weaving.links.LinksPackage;

/**
 * Generates a set of Java source files from a MoDisco SODM+T weaving model.
 */
public class GeneratePerformanceTestsHandler extends AbstractHandler {

	private static final String PATH_TO_EGL = "/egl/main.egl";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			final ISelection selection = HandlerUtil.getCurrentSelection(event);
			if (selection instanceof IStructuredSelection) {
				final IStructuredSelection ssel = (IStructuredSelection) selection;
				final IFile file = (IFile) ssel.getFirstElement();
				EmfModel weavingModel = loadWeavingModel(file);
				try {
					generateCode(file.getProject(), weavingModel);
					file.getProject().refreshLocal(IProject.DEPTH_INFINITE,  null);
				} finally {
					weavingModel.dispose();
				}
			}
		} catch (Exception e) {
			Activator.getDefault().logError(e);
			throw new ExecutionException(e.getLocalizedMessage(), e);
		}

		return null;
	}

	private void generateCode(final IProject iProject, final EmfModel weavingModel)
			throws Exception, URISyntaxException, EolRuntimeException
	{
		final EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		factory.setOutputRoot(new File(iProject.getLocationURI()).getAbsolutePath());

		final EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
		eglModule.parse(GeneratePerformanceTestsHandler.class.getResource(PATH_TO_EGL).toURI());
		EclipseContextManager.setup(eglModule.getContext());
		eglModule.getContext().getModelRepository().addModel(weavingModel);
		eglModule.execute();
	}

	private EmfModel loadWeavingModel(final IFile file)	throws EolModelLoadingException, IOException {
		final EmfModel model = new EmfModel();

		// Try using a platform: URI whenever possible - model weaving tends to create these
		URI modelUri = null;
		IFile[] workspaceMatches = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(file.getLocationURI());
		if (workspaceMatches.length > 0) {
			final IProject project = workspaceMatches[0].getProject();
			modelUri = URI.createPlatformResourceURI("/" + project.getName() + "/" + workspaceMatches[0].getProjectRelativePath(), true);
		}
		if (modelUri == null) {
			modelUri = URI.createURI(file.getLocationURI().toString());
		}
		model.setModelFileUri(modelUri);

		model.setMetamodelUris(Arrays.asList(LinksPackage.eNS_URI, MARTEPackage.eNS_URI));
		model.setName("Weaving");
		model.setExpand(true);
		model.setCachingEnabled(true);
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(false);
		model.load();
		return model;
	}
}
