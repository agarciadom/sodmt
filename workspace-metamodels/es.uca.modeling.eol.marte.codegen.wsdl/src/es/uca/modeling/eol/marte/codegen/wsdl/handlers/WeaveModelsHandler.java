package es.uca.modeling.eol.marte.codegen.wsdl.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * If the user has selected an UML model and a WSDL catalog model, this handler
 * will create an empty weaving model and open all three models in a new
 * ModeLink configuration.
 *
 * @author Antonio García-Domínguez
 */
public class WeaveModelsHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Wsdl",
				"Hello, Eclipse world");
		return null;
	}

}
