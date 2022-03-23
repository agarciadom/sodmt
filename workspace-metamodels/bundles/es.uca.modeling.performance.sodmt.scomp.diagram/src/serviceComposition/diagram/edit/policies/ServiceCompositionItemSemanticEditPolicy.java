/*
 * 
 */
package serviceComposition.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ServiceCompositionItemSemanticEditPolicy
		extends serviceComposition.diagram.edit.policies.ServiceCompositionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceCompositionItemSemanticEditPolicy() {
		super(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceComposition_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001 == req.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActionCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.StructuredActivityNodeCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003 == req
				.getElementType()) {
			return getGEFWrapper(
					new serviceComposition.diagram.edit.commands.LocalPerformanceAnnotationCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ObjectNodeCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPartition_2005 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ActivityPartitionCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.InitialNodeCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.FinalNodeCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.DecisionNodeCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009 == req.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.ForkNodeCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010 == req.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.JoinNodeCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_2012 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.MergeNodeCreateCommand(req));
		}
		if (serviceComposition.diagram.providers.ServiceCompositionElementTypes.PerformanceAnnotation_2011 == req
				.getElementType()) {
			return getGEFWrapper(new serviceComposition.diagram.edit.commands.PerformanceAnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
