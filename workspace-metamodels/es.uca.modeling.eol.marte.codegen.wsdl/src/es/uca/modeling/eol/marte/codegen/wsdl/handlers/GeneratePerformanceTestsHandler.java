package es.uca.modeling.eol.marte.codegen.wsdl.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Generates a The Grinder basic Jython script and a Velocity data file
 * for running performance tests of a web service.
 *
 * @author Antonio García-Domínguez
 */
public class GeneratePerformanceTestsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Wsdl",
				"Hello, Eclipse world (generate)");
		return null;
	}

}
