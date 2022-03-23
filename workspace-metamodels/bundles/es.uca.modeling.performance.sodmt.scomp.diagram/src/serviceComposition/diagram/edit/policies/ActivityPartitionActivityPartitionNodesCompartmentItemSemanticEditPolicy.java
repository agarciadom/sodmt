/*
 * 
 */
package serviceComposition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActivityPartitionActivityPartitionNodesCompartmentItemSemanticEditPolicy
		extends serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityPartitionActivityPartitionNodesCompartmentItemSemanticEditPolicy() {
		super(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPartition_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3010 == req.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.Action3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011 == req
				.getElementType()) {
			return getGEFWrapper(
					new serviceComposition.diagram.edit.commands.StructuredActivityNode3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3012 == req
				.getElementType()) {
			return getGEFWrapper(
					new serviceComposition.diagram.edit.commands.LocalPerformanceAnnotation3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3013 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ObjectNode3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3014 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.InitialNode3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3015 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.FinalNode3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3016 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.DecisionNode3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3017 == req.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ForkNode3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3018 == req.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.JoinNode3CreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3020 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.MergeNode3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
