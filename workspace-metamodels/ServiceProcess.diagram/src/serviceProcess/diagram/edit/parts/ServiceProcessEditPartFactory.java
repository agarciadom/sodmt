/*
 * 
 */
package serviceProcess.diagram.edit.parts;

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

			case serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ServiceActivityEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ServiceActivityNameEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ServiceActivityNameEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessStartEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessFinishEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessDecisionEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessForkEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessJoinEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsers2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationSecsTimeLimitEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationMinimumTimeEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationWeightEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationWeightEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationManuallyAddedEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationManuallyAddedEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationConcurrentUsersEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationConcurrentUsers2EditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationSecsTimeLimitEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ProcessControlFlowConditionProbabilityEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ProcessControlFlowConditionProbabilityEditPart(
						view);

			case serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
				return new serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart(
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
