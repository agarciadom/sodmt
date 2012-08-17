/*
 * 
 */
package serviceProcess.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ServiceProcessItemSemanticEditPolicy
		extends
		serviceProcess.diagram.edit.policies.ServiceProcessBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceProcessItemSemanticEditPolicy() {
		super(
				serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceProcess_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivity_2019 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ServiceActivityCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessStart_2020 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ProcessStartCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFinish_2021 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ProcessFinishCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessDecision_2022 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ProcessDecisionCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFork_2023 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ProcessForkCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessJoin_2024 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ProcessJoinCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ActivityPerformanceAnnotation_2017 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ActivityPerformanceAnnotationCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessPerformanceAnnotation_2018 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ProcessPerformanceAnnotationCreateCommand(
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
