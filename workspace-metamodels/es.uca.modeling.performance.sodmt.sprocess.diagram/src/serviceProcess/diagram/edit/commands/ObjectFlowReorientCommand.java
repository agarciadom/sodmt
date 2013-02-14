/*
 * 
 */
package serviceProcess.diagram.edit.commands;

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
public class ObjectFlowReorientCommand extends EditElementCommand {

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
	public ObjectFlowReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof serviceProcess.ObjectFlow) {
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
		if (!(oldEnd instanceof serviceProcess.ActivityNode && newEnd instanceof serviceProcess.ActivityNode)) {
			return false;
		}
		serviceProcess.ActivityNode target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof serviceProcess.ServiceProcess)) {
			return false;
		}
		serviceProcess.ServiceProcess container = (serviceProcess.ServiceProcess) getLink()
				.eContainer();
		return serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistObjectFlow_4002(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof serviceProcess.ActivityNode && newEnd instanceof serviceProcess.ActivityNode)) {
			return false;
		}
		serviceProcess.ActivityNode source = getLink().getSource();
		if (!(getLink().eContainer() instanceof serviceProcess.ServiceProcess)) {
			return false;
		}
		serviceProcess.ServiceProcess container = (serviceProcess.ServiceProcess) getLink()
				.eContainer();
		return serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistObjectFlow_4002(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
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
	protected serviceProcess.ObjectFlow getLink() {
		return (serviceProcess.ObjectFlow) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected serviceProcess.ActivityNode getOldSource() {
		return (serviceProcess.ActivityNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected serviceProcess.ActivityNode getNewSource() {
		return (serviceProcess.ActivityNode) newEnd;
	}

	/**
	 * @generated
	 */
	protected serviceProcess.ActivityNode getOldTarget() {
		return (serviceProcess.ActivityNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected serviceProcess.ActivityNode getNewTarget() {
		return (serviceProcess.ActivityNode) newEnd;
	}
}
