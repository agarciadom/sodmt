/*
 * 
 */
package serviceComposition.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ActionItemSemanticEditPolicy
		extends serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActionItemSemanticEditPolicy() {
		super(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.getVisualID(
					outgoingLink) == serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ControlFlowCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ObjectFlowCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ExecutableNodeAnnotation_4003 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ExecutableNodeAnnotationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ControlFlowCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ObjectFlowCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ExecutableNodeAnnotation_4003 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ExecutableNodeAnnotationCreateCommand(req,
					req.getTarget(), req.getSource()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ControlFlowReorientCommand(req));
		case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ObjectFlowReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
			return getGEFWrapper(
					new serviceComposition.diagram.edit.commands.ExecutableNodeAnnotationReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
