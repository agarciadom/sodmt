/*
 * 
 */
package serviceComposition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ObjectFlowItemSemanticEditPolicy
		extends serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectFlowItemSemanticEditPolicy() {
		super(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
