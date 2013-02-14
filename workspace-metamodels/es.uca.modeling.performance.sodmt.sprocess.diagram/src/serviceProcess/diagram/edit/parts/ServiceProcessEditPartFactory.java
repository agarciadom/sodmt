/*
 * 
 */
package serviceProcess.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ServiceProcessEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getVisualID(view)) {

			case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ServiceProcessEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActionEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActionEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActionNameEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActionNameEditPart(
						view);

			case serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.StructuredActivityNodeNameEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.StructuredActivityNodeNameEditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ObjectNodeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ObjectNodeNameEditPart(
						view);

			case serviceProcess.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.InitialNodeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.FinalNodeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.DecisionNodeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ForkNodeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.JoinNodeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart(
						view);

			case serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart(
						view);

			case serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart(
						view);

			case serviceProcess.diagram.edit.parts.Action2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.Action2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActionName2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActionName2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.StructuredActivityNodeName2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.StructuredActivityNodeName2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers4EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers4EditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeight2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeight2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ObjectNode2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.ObjectNodeName2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ObjectNodeName2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.InitialNode2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.FinalNode2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.DecisionNode2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ForkNode2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.JoinNode2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart(
						view);

			case serviceProcess.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ControlFlowEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ControlFlowConditionProbabilityEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ControlFlowConditionProbabilityEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ObjectFlowEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ExecutableNodeAnnotationEditPart(
						view);

			case serviceProcess.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.WrappingLabelEditPart(
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
