/*
 * 
 */
package serviceComposition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredActivityNodeStructuredActivityNodeNodesCompartment3ItemSemanticEditPolicy
		extends
		serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredActivityNodeStructuredActivityNodeNodesCompartment3ItemSemanticEditPolicy() {
		super(
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3001 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.Action2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3002 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.StructuredActivityNode2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.LocalPerformanceAnnotation2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ObjectNode2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3005 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.InitialNode2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3006 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.FinalNode2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3007 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.DecisionNode2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3008 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ForkNode2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3009 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.JoinNode2CreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3019 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.MergeNode2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
