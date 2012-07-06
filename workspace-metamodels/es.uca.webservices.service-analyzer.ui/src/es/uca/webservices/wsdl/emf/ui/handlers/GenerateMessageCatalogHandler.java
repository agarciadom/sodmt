package es.uca.webservices.wsdl.emf.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlOptions;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import serviceAnalyzer.messageCatalog.ServicesDocument;
import es.uca.webservices.wsdl.analyzer.ServiceAnalyzer;

/**
 * Generates a ServiceAnalyzer catalog from the selected WSDL files.
 *
 * @author Antonio García-Domínguez
 */
public class GenerateMessageCatalogHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection sel = HandlerUtil.getCurrentSelection(event);
		
		if (sel instanceof IStructuredSelection) {
			final IStructuredSelection ssel = (IStructuredSelection)sel;

			final List<String> inputPaths = new ArrayList<String>();
			IFile firstIFile = null;
			File firstFile = null;
			for (Object o : ssel.toList()) {
				if (o instanceof IFile) {
					final IFile iFile = (IFile)o;
					try {
						final File file = new File(iFile.getLocationURI());
						if (firstFile == null) {
							firstIFile = iFile;
							firstFile = file;
						}
						inputPaths.add(file.getCanonicalPath());
					} catch (IOException e) {
						throw new ExecutionException("Error when converting IFile to File", e);
					}
				}
			}
			if (firstFile == null) {
				throw new ExecutionException("Selection cannot be empty");
			}

			try {
				final ServiceAnalyzer analyzer = new ServiceAnalyzer(inputPaths.toArray(new String[inputPaths.size()]));
				final ServicesDocument catalog = analyzer.generateMessageCatalog();

				final XmlOptions options = new XmlOptions();
		        options.setSavePrettyPrint();
		        options.setSavePrettyPrintIndent(2);
		        options.setSaveCDataEntityCountThreshold(0);
		        options.setSaveCDataLengthThreshold(0);
		        catalog.save(new File(firstFile.getParentFile(), firstIFile.getName() + ".msgcat"), options);
			} catch (Exception e) {
				throw new ExecutionException("Error while parsing the WSDL files", e);
			}

			try {
				firstIFile.getProject().refreshLocal(IProject.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				throw new ExecutionException("Could not refresh the project", e);
			}
		}

		return null;
	}

}
