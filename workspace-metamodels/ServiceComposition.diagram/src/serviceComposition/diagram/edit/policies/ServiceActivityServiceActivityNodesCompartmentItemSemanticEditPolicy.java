/*
 * 
 */
package serviceComposition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ServiceActivityServiceActivityNodesCompartmentItemSemanticEditPolicy
		extends
		serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceActivityServiceActivityNodesCompartmentItemSemanticEditPolicy() {
		super(
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivity_2022);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityAction_3001 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityActionCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectNode_3008 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityObjectNodeCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityStart_3002 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityStartCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFinish_3003 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityFinishCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityDecision_3004 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityDecisionCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFork_3005 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityForkCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityJoin_3006 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityJoinCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActionPerformanceAnnotation_3007 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActionPerformanceAnnotationCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
