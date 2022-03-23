/*
 * 
 */
package serviceComposition.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class LocalPerformanceAnnotation3EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3012;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public LocalPerformanceAnnotation3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new serviceComposition.diagram.edit.policies.LocalPerformanceAnnotation3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new LocalPerformanceAnnotationFigure();
	}

	/**
	 * @generated
	 */
	public LocalPerformanceAnnotationFigure getPrimaryShape() {
		return (LocalPerformanceAnnotationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart) {
			((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLocalPerformanceAnnotationLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers6EditPart) {
			((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers6EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePerformanceAnnotationConcurrentUsersLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit3EditPart) {
			((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePerformanceAnnotationSecsTimeLimitLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime3EditPart) {
			((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLocalPerformanceAnnotationMinimumTimeLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight3EditPart) {
			((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLocalPerformanceAnnotationWeightLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationReps3EditPart) {
			((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationReps3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLocalPerformanceAnnotationRepsLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart) {
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers6EditPart) {
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit3EditPart) {
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime3EditPart) {
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight3EditPart) {
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationReps3EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.getType(
				serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class LocalPerformanceAnnotationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocalPerformanceAnnotationLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePerformanceAnnotationConcurrentUsersLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePerformanceAnnotationSecsTimeLimitLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocalPerformanceAnnotationMinimumTimeLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocalPerformanceAnnotationWeightLabelFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocalPerformanceAnnotationRepsLabelFigure;

		/**
		 * @generated
		 */
		public LocalPerformanceAnnotationFigure() {
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLocalPerformanceAnnotationLabelFigure = new WrappingLabel();

			fFigureLocalPerformanceAnnotationLabelFigure.setText("LocalPerformanceAnnotation");

			this.add(fFigureLocalPerformanceAnnotationLabelFigure);

			fFigurePerformanceAnnotationConcurrentUsersLabelFigure = new WrappingLabel();

			fFigurePerformanceAnnotationConcurrentUsersLabelFigure.setText("");

			this.add(fFigurePerformanceAnnotationConcurrentUsersLabelFigure);

			fFigurePerformanceAnnotationSecsTimeLimitLabelFigure = new WrappingLabel();

			fFigurePerformanceAnnotationSecsTimeLimitLabelFigure.setText("");

			this.add(fFigurePerformanceAnnotationSecsTimeLimitLabelFigure);

			fFigureLocalPerformanceAnnotationMinimumTimeLabelFigure = new WrappingLabel();

			fFigureLocalPerformanceAnnotationMinimumTimeLabelFigure.setText("");

			this.add(fFigureLocalPerformanceAnnotationMinimumTimeLabelFigure);

			fFigureLocalPerformanceAnnotationWeightLabelFigure = new WrappingLabel();

			fFigureLocalPerformanceAnnotationWeightLabelFigure.setText("");

			this.add(fFigureLocalPerformanceAnnotationWeightLabelFigure);

			fFigureLocalPerformanceAnnotationRepsLabelFigure = new WrappingLabel();

			fFigureLocalPerformanceAnnotationRepsLabelFigure.setText("");

			this.add(fFigureLocalPerformanceAnnotationRepsLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocalPerformanceAnnotationLabelFigure() {
			return fFigureLocalPerformanceAnnotationLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePerformanceAnnotationConcurrentUsersLabelFigure() {
			return fFigurePerformanceAnnotationConcurrentUsersLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePerformanceAnnotationSecsTimeLimitLabelFigure() {
			return fFigurePerformanceAnnotationSecsTimeLimitLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocalPerformanceAnnotationMinimumTimeLabelFigure() {
			return fFigureLocalPerformanceAnnotationMinimumTimeLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocalPerformanceAnnotationWeightLabelFigure() {
			return fFigureLocalPerformanceAnnotationWeightLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocalPerformanceAnnotationRepsLabelFigure() {
			return fFigureLocalPerformanceAnnotationRepsLabelFigure;
		}

	}

}
