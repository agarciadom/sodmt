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
public class ActivityControlFlowItemSemanticEditPolicy
		extends
		serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityControlFlowItemSemanticEditPolicy() {
		super(
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
