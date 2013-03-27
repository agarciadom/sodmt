package es.uca.modeling.performance.sodmt.sprocess.contextmenu.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.flock.FlockModule;
import org.eclipse.epsilon.flock.IFlockContext;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import serviceComposition.ServiceCompositionPackage;
import serviceProcess.ServiceProcessPackage;

public class GenerateServiceCompositionModelHandler extends AbstractHandler {

	@SuppressWarnings("unchecked")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection) {
			final IStructuredSelection ssel = (IStructuredSelection) sel;

			try {
				for (final Iterator<Object> it = ssel.iterator(); it.hasNext();) {
					final Object o = it.next();
					if (o instanceof IFile) {
						transform((IFile) o);
					}
				}
			} catch (Exception ex) {
				throw new ExecutionException(
						"Exception while generating service composition model",
						ex);
			}
		}

		return null;
	}

	private void transform(IFile file) throws Exception {
		final FlockModule module = new FlockModule();
		module.parse(getClass().getResource("/flock/sp2sc.mig").toURI());
		
		final EmfModel spModel = new EmfModel();
		spModel.setName("SP");
		spModel.setMetamodelUri(ServiceProcessPackage.eNS_URI);
		spModel.setModelFileUri(getFileURI(file));
		spModel.setReadOnLoad(true);
		spModel.setStoredOnDisposal(false);
		spModel.load();

		final IContainer container = file.getParent();
		final IFile scFile = container.getFile(new Path(file.getName().replace(file.getFileExtension(), "sc")));
		final EmfModel scModel = new EmfModel();
		scModel.setName("SC");
		scModel.setMetamodelUri(ServiceCompositionPackage.eNS_URI);
		scModel.setModelFileUri(getFileURI(scFile));
		scModel.setReadOnLoad(false);
		scModel.setStoredOnDisposal(true);
		scModel.load();
		
		final IFlockContext context = module.getContext();
		context.getModelRepository().addModel(spModel);
		context.getModelRepository().addModel(scModel);
		context.setOriginalModel(spModel);
		context.setMigratedModel(scModel);

		module.execute();
		context.getModelRepository().dispose();
		context.dispose();
	}

	private URI getFileURI(IFile file) {
		// Try using a platform: URI whenever possible
		URI modelUri = null;
		IFile[] workspaceMatches = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(file.getLocationURI());
		if (workspaceMatches.length > 0) {
			final IProject project = workspaceMatches[0].getProject();
			modelUri = URI.createPlatformResourceURI("/" + project.getName() + "/" + workspaceMatches[0].getProjectRelativePath(), true);
		}
		if (modelUri == null) {
			modelUri = URI.createURI(file.getLocationURI().toString());
		}
		return modelUri;
	}

}
