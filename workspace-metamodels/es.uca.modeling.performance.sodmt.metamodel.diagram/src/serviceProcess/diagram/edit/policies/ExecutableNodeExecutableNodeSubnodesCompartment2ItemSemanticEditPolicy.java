/*
 * 
 */
package serviceProcess.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ExecutableNodeExecutableNodeSubnodesCompartment2ItemSemanticEditPolicy
		extends
		serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExecutableNodeExecutableNodeSubnodesCompartment2ItemSemanticEditPolicy() {
		super(
				serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNode_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3001 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.LocalPerformanceAnnotation2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNode_3002 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ExecutableNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3003 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ObjectNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3004 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.InitialNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3005 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.FinalNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3006 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.DecisionNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3007 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ForkNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3008 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.JoinNode2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
