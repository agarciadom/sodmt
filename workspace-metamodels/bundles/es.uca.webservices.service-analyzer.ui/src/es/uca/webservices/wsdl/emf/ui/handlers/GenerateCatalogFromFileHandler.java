package es.uca.webservices.wsdl.emf.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * Generates a ServiceAnalyzer catalog from the selected WSDL files.
 *
 * @author Antonio García-Domínguez
 */
public class GenerateCatalogFromFileHandler extends AbstractCatalogHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection sel = HandlerUtil.getCurrentSelection(event);
		
		if (sel instanceof IStructuredSelection && !sel.isEmpty()) {
			final IStructuredSelection ssel = (IStructuredSelection)sel;
			final List<IFile> inputFiles = collectSelectedIFiles(ssel);
			final List<String> inputPaths = mapIFilesToPaths(inputFiles);

	        final File targetFile = new File(inputPaths.get(0) + ".msgcat");
			generateCatalog(inputPaths, targetFile);

			try {
				final IProject project = inputFiles.get(0).getProject();
				project.refreshLocal(IProject.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				throw new ExecutionException("Could not refresh the project", e);
			}
		}

		return null;
	}

	private List<IFile> collectSelectedIFiles(final IStructuredSelection ssel) throws ExecutionException {
		final List<IFile> inputPaths = new ArrayList<IFile>();
		for (Object o : ssel.toList()) {
			if (o instanceof IFile) {
				final IFile iFile = (IFile)o;
				inputPaths.add(iFile);
			}
		}
		if (inputPaths.isEmpty()) {
			throw new ExecutionException("Selection cannot be empty");
		}
		return inputPaths;
	}

	private List<String> mapIFilesToPaths(final List<IFile> iFiles) throws ExecutionException {
		final List<String> inputPaths = new ArrayList<String>();
		for (IFile iFile : iFiles) {
			try {
				final File file = new File(iFile.getLocationURI());
				inputPaths.add(file.getCanonicalPath());
			} catch (IOException e) {
				throw new ExecutionException(
						"Error when converting IFile to File", e);
			}
		}
		return inputPaths;
	}

}
