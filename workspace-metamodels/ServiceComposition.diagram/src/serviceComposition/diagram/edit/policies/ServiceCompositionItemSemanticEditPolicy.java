/*
 * 
 */
package serviceComposition.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ServiceCompositionItemSemanticEditPolicy
		extends
		serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceCompositionItemSemanticEditPolicy() {
		super(
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceComposition_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivity_2022 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ServiceActivityCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectNode_2031 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionObjectNodeCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionStart_2023 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionStartCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFinish_2024 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionFinishCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionDecision_2025 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionDecisionCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFork_2026 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionForkCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionJoin_2027 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionJoinCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPerformanceAnnotation_2028 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityPerformanceAnnotationCreateCommand(
					req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.SwimlaneContainer_2030 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.SwimlaneContainerCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
