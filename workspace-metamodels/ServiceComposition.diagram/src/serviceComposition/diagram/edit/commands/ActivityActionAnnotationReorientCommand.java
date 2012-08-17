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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ActivityActionAnnotationReorientCommand extends EditElementCommand {

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
	public ActivityActionAnnotationReorientCommand(
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
		if (false == referenceOwner instanceof serviceComposition.ActivityAction) {
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
		if (!(oldEnd instanceof serviceComposition.ActionPerformanceAnnotation && newEnd instanceof serviceComposition.ActivityAction)) {
			return false;
		}
		return serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistActivityActionAnnotation_4008(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof serviceComposition.ActionPerformanceAnnotation && newEnd instanceof serviceComposition.ActionPerformanceAnnotation)) {
			return false;
		}
		return serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistActivityActionAnnotation_4008(
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
	protected serviceComposition.ActivityAction getOldSource() {
		return (serviceComposition.ActivityAction) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActivityAction getNewSource() {
		return (serviceComposition.ActivityAction) newEnd;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActionPerformanceAnnotation getOldTarget() {
		return (serviceComposition.ActionPerformanceAnnotation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActionPerformanceAnnotation getNewTarget() {
		return (serviceComposition.ActionPerformanceAnnotation) newEnd;
	}
}
