/*
 * 
 */
package serviceComposition.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

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

			case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ServiceActivityEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ServiceActivityNameEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ServiceActivityNameEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionObjectNodeNameEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionObjectNodeNameEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionStartEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionFinishEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionDecisionEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionForkEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionJoinEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsers2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationSecsTimeLimitEditPart(
						view);

			case serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityActionEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityActionNameEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityActionNameEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityObjectNodeNameEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityObjectNodeNameEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityStartEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityFinishEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityDecisionEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityForkEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityJoinEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsersEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsers2EditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationSecsTimeLimitEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationMinimumTimeEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationWeightEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationWeightEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationManuallyAddedEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationManuallyAddedEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionControlFlowConditionProbabilityEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionControlFlowConditionProbabilityEditPart(
						view);

			case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityControlFlowConditionProbabilityEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityControlFlowConditionProbabilityEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart(
						view);

			case serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID:
				return new serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart(
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
