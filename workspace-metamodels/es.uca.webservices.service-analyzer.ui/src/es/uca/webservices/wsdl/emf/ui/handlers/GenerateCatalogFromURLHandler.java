package es.uca.webservices.wsdl.emf.ui.handlers;

import java.io.File;
import java.util.Arrays;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

import es.uca.webservices.wsdl.emf.ui.dialogs.GenerateCatalogFromURLDialog;

/**
 * Generates a ServiceAnalyzer catalog from the URI provided by the user.
 *
 * @author Antonio García-Domínguez
 */
public class GenerateCatalogFromURLHandler extends AbstractCatalogHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Based on http://www.vogella.com/articles/EclipseDialogs/article.html
		final GenerateCatalogFromURLDialog dialog =
			new GenerateCatalogFromURLDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		dialog.create();
		if (dialog.open() == Window.OK) {
			final IFile targetFile = dialog.getTargetIFile();
			final String sSourceURL = dialog.getSourceURL();
			generateCatalog(Arrays.asList(sSourceURL), new File(targetFile.getLocationURI()));

			try {
				targetFile.getProject().refreshLocal(IProject.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				throw new ExecutionException(
					"There was a problem while refreshing the project", e);
			}
		}
		
		return null;
	}

}
