/*
 * 
 */
package serviceComposition.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ControlFlowReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ControlFlowReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof serviceComposition.ControlFlow) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof serviceComposition.ActivityNode && newEnd instanceof serviceComposition.ActivityNode)) {
			return false;
		}
		serviceComposition.ActivityNode target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof serviceComposition.ServiceComposition)) {
			return false;
		}
		serviceComposition.ServiceComposition container = (serviceComposition.ServiceComposition) getLink()
				.eContainer();
		return serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistControlFlow_4001(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof serviceComposition.ActivityNode && newEnd instanceof serviceComposition.ActivityNode)) {
			return false;
		}
		serviceComposition.ActivityNode source = getLink().getSource();
		if (!(getLink().eContainer() instanceof serviceComposition.ServiceComposition)) {
			return false;
		}
		serviceComposition.ServiceComposition container = (serviceComposition.ServiceComposition) getLink()
				.eContainer();
		return serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistControlFlow_4001(container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ControlFlow getLink() {
		return (serviceComposition.ControlFlow) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActivityNode getOldSource() {
		return (serviceComposition.ActivityNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActivityNode getNewSource() {
		return (serviceComposition.ActivityNode) newEnd;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActivityNode getOldTarget() {
		return (serviceComposition.ActivityNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActivityNode getNewTarget() {
		return (serviceComposition.ActivityNode) newEnd;
	}
}
