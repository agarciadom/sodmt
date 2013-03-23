/*
 * 
 */
package serviceComposition.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ServiceCompositionEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(view)) {

			case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ServiceCompositionEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionNameEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionNameEditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNodeNameEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNodeNameEditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ObjectNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityPartitionEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart(
						view);

			case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.InitialNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.FinalNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.DecisionNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ForkNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.JoinNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart(
						view);

			case serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart(
						view);

			case serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart(
						view);

			case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.Action2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionName2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionName2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNodeName2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNodeName2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers4EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers4EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ObjectNode2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ObjectNodeName2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ObjectNodeName2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.InitialNode2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.FinalNode2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.DecisionNode2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ForkNode2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.JoinNode2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.Action3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionName3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionName3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNodeName3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNodeName3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers6EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers6EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ObjectNode3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ObjectNodeName3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ObjectNodeName3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.InitialNode3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.FinalNode3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.DecisionNode3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ForkNode3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.JoinNode3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart(
						view);

			case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ControlFlowEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ControlFlowConditionProbabilityEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ControlFlowConditionProbabilityEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ObjectFlowEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart(
						view);

			case serviceComposition.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.WrappingLabelEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
