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
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CompositionForkItemSemanticEditPolicy
		extends
		serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositionForkItemSemanticEditPolicy() {
		super(
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFork_2026);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
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
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionControlFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectFlow_4015 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionObjectFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityControlFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectFlow_4012 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityObjectFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionControlFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectFlow_4015 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionObjectFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityControlFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectFlow_4012 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityObjectFlowCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionControlFlowReorientCommand(
					req));
		case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.CompositionObjectFlowReorientCommand(
					req));
		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityControlFlowReorientCommand(
					req));
		case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityObjectFlowReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
