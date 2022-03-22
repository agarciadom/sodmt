/*
 * 
 */
package serviceProcess.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ObjectFlowItemSemanticEditPolicy
		extends
		serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectFlowItemSemanticEditPolicy() {
		super(
				serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
