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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ServiceActivityAnnotationReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public ServiceActivityAnnotationReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof serviceProcess.ServiceActivity) {
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
		if (!(oldEnd instanceof serviceProcess.ActivityPerformanceAnnotation && newEnd instanceof serviceProcess.ServiceActivity)) {
			return false;
		}
		return serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistServiceActivityAnnotation_4008(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof serviceProcess.ActivityPerformanceAnnotation && newEnd instanceof serviceProcess.ActivityPerformanceAnnotation)) {
			return false;
		}
		return serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistServiceActivityAnnotation_4008(
						getOldSource(), getNewTarget());
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
		getOldSource().setAnnotation(null);
		getNewSource().setAnnotation(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setAnnotation(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected serviceProcess.ServiceActivity getOldSource() {
		return (serviceProcess.ServiceActivity) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected serviceProcess.ServiceActivity getNewSource() {
		return (serviceProcess.ServiceActivity) newEnd;
	}

	/**
	 * @generated
	 */
	protected serviceProcess.ActivityPerformanceAnnotation getOldTarget() {
		return (serviceProcess.ActivityPerformanceAnnotation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected serviceProcess.ActivityPerformanceAnnotation getNewTarget() {
		return (serviceProcess.ActivityPerformanceAnnotation) newEnd;
	}
}
