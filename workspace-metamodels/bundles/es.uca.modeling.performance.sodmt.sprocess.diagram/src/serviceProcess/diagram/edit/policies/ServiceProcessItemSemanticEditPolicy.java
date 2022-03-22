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
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ActionCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.StructuredActivityNodeCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.LocalPerformanceAnnotationCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ObjectNodeCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.InitialNodeCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.FinalNodeCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.DecisionNodeCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.ForkNodeCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.JoinNodeCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.MergeNode_2012 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.MergeNodeCreateCommand(
					req));
		}
		if (serviceProcess.diagram.providers.ServiceProcessElementTypes.PerformanceAnnotation_2009 == req
				.getElementType()) {
			return getGEFWrapper(new serviceProcess.diagram.edit.commands.PerformanceAnnotationCreateCommand(
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
