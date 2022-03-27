package es.uca.modeling.eol.marte.codegen.modisco.handlers;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.epsilon.dt.exeed.modelink.LinkedModel;
import org.eclipse.epsilon.dt.exeed.modelink.ModeLink;
import org.eclipse.epsilon.dt.exeed.modelink.ModelPosition;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks;

public class WeaveModelsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection) {
			final IStructuredSelection ssel = (IStructuredSelection)sel;
			if (ssel.size() == 2) {
				IFile fUML = getSelectionByExtension(ssel, "uml");
				IFile fMoDisco = getSelectionByExtension(ssel, "javaxmi");
				try {
					weave(fUML, fMoDisco);
				} catch (Exception ex) {
					throw new ExecutionException("There was an exception while weaving the UML and MoDisco models", ex);
				}
			}
		}

		return null;
	}

	private void weave(IFile fUML, IFile fMoDisco)
			throws IOException, EolModelLoadingException, EolModelElementTypeNotFoundException,
				EolNotInstantiableModelElementTypeException, CoreException
	{
		final IProject javaProject = fMoDisco.getProject();
		final String sMoDiscoBasename = fMoDisco.getName().replaceAll("[.].*$", "");
		final IFile fWeavingModel = javaProject.getFile(new Path("/" + sMoDiscoBasename + ".modisco_perfreq"));

		// Create an empty weaving model if it doesn't exist yet
		if (!fWeavingModel.exists()) {
			final EmfModel model = new EmfModel();
			model.setMetamodelUri(LinksPackage.eNS_URI);
			model.setReadOnLoad(false);
			model.setStoredOnDisposal(true);
			model.setModelFile(new File(fWeavingModel.getLocationURI()).getCanonicalPath());
			model.load();
			final PerformanceRequirementLinks links =
				(PerformanceRequirementLinks)model.createInstance("PerformanceRequirementLinks");
			links.getLinks().add(
				(PerformanceRequirementLink)model.createInstance("PerformanceRequirementLink"));
			model.dispose();
		}

		// Create the ModeLink input file
		final IFile fModeLink = javaProject.getFile(new Path("/" + sMoDiscoBasename + ".modelink"));
		if (!fModeLink.exists()) {
			ModeLink ml = new ModeLink();
			ml.getLinkedModels().add(new LinkedModel(fUML.getFullPath().toOSString(), ModelPosition.LEFT));
			ml.getLinkedModels().add(new LinkedModel(fWeavingModel.getFullPath().toOSString(), ModelPosition.MIDDLE));
			ml.getLinkedModels().add(new LinkedModel(fMoDisco.getFullPath().toOSString(), ModelPosition.RIGHT));

			// We need the Exeed editor for the weaving model: otherwise, drag and drop won't work
			ml.setForceExeed(ModelPosition.MIDDLE, true);

			// We want the Exeed editor for the MoDisco model, not the crowded default one
			ml.setForceExeed(ModelPosition.RIGHT, true);

			ml.store(fModeLink);
		}

		// Open the ModeLink editor on it
		javaProject.refreshLocal(IProject.DEPTH_ONE, null);
		IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), fModeLink);
	}

	private IFile getSelectionByExtension(IStructuredSelection ssel, String extension) {
		for (Object o : ssel.toList()) {
			if (o instanceof IAdaptable) {
				final IFile adapted = (IFile)((IAdaptable)o).getAdapter(IFile.class);
				if (adapted != null) {
					o = adapted;
				}
			}
			if (o instanceof IFile) {
				final IFile file = (IFile)o;
				if (extension.equals(file.getFileExtension())) {
					return file;
				}
			}
		}
		return null;
	}

}