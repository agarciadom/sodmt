/*
 * 
 */
package serviceComposition.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
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
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ServiceActivityItemSemanticEditPolicy
		extends
		serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceActivityItemSemanticEditPolicy() {
		super(
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivity_2022);
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
			if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(node)) {
			case serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getVisualID(cnode)) {
					case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(outgoingLink) == serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
									.getVisualID(incomingLink) == serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivityAnnotation_4014 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ServiceActivityAnnotationCreateCommand(
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
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivityAnnotation_4014 == req
				.getElementType()) {
			return null;
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

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ServiceActivityAnnotationReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
