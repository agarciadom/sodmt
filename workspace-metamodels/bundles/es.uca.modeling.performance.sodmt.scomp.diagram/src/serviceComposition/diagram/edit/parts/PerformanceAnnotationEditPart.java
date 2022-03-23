/*
 * 
 */
package serviceComposition.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class PerformanceAnnotationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

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
	public PerformanceAnnotationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new serviceComposition.diagram.edit.policies.PerformanceAnnotationItemSemanticEditPolicy());
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
		return primaryShape = new PerformanceAnnotationFigure();
	}

	/**
	 * @generated
	 */
	public PerformanceAnnotationFigure getPrimaryShape() {
		return (PerformanceAnnotationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart) {
			((serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePerformanceAnnotationLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart) {
			((serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePerformanceAnnotationConcurrentUsersLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart) {
			((serviceComposition.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePerformanceAnnotationSecsTimeLimitLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart) {
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart) {
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart) {
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
		return getChildBySemanticHint(serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getType(serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class PerformanceAnnotationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePerformanceAnnotationLabelFigure;
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
		public PerformanceAnnotationFigure() {
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePerformanceAnnotationLabelFigure = new WrappingLabel();

			fFigurePerformanceAnnotationLabelFigure.setText("PerformanceAnnotation");

			this.add(fFigurePerformanceAnnotationLabelFigure);

			fFigurePerformanceAnnotationConcurrentUsersLabelFigure = new WrappingLabel();

			fFigurePerformanceAnnotationConcurrentUsersLabelFigure.setText("");

			this.add(fFigurePerformanceAnnotationConcurrentUsersLabelFigure);

			fFigurePerformanceAnnotationSecsTimeLimitLabelFigure = new WrappingLabel();

			fFigurePerformanceAnnotationSecsTimeLimitLabelFigure.setText("");

			this.add(fFigurePerformanceAnnotationSecsTimeLimitLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePerformanceAnnotationLabelFigure() {
			return fFigurePerformanceAnnotationLabelFigure;
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

	}

}
