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
		if (false == referenceOwner instanceof serviceComposition.ServiceActivity) {
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
		if (!(oldEnd instanceof serviceComposition.ActivityPerformanceAnnotation && newEnd instanceof serviceComposition.ServiceActivity)) {
			return false;
		}
		return serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistServiceActivityAnnotation_4014(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof serviceComposition.ActivityPerformanceAnnotation && newEnd instanceof serviceComposition.ActivityPerformanceAnnotation)) {
			return false;
		}
		return serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistServiceActivityAnnotation_4014(
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
	protected serviceComposition.ServiceActivity getOldSource() {
		return (serviceComposition.ServiceActivity) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ServiceActivity getNewSource() {
		return (serviceComposition.ServiceActivity) newEnd;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActivityPerformanceAnnotation getOldTarget() {
		return (serviceComposition.ActivityPerformanceAnnotation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected serviceComposition.ActivityPerformanceAnnotation getNewTarget() {
		return (serviceComposition.ActivityPerformanceAnnotation) newEnd;
	}
}
