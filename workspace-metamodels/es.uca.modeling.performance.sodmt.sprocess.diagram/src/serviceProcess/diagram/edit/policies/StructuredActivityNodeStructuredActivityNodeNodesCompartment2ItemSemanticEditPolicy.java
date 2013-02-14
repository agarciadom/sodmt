/*
 * 
 */
package serviceProcess.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredActivityNodeStructuredActivityNodeNodesCompartment2ItemSemanticEditPolicy
		extends
		serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredActivityNodeStructuredActivityNodeNodesCompartment2ItemSemanticEditPolicy() {
		super(
				serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3019);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3018 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.Action2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3019 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.StructuredActivityNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3020 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.LocalPerformanceAnnotation2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3021 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ObjectNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3022 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.InitialNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3023 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.FinalNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3024 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.DecisionNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3025 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ForkNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3026 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.JoinNode2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
