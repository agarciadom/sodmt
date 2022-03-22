/*
 * 
 */
package serviceProcess.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ExecutableNodeAnnotationItemSemanticEditPolicy
		extends
		serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExecutableNodeAnnotationItemSemanticEditPolicy() {
		super(
				serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
