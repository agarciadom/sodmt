/*
 * 
 */
package serviceProcess.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredActivityNodeStructuredActivityNodeSubnodesCompartment2ItemSemanticEditPolicy
		extends
		serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredActivityNodeStructuredActivityNodeSubnodesCompartment2ItemSemanticEditPolicy() {
		super(
				serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.Action2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.StructuredActivityNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.LocalPerformanceAnnotation2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ObjectNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.InitialNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.FinalNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.DecisionNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ForkNode2CreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.JoinNode2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
