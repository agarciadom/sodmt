/*
 * 
 */
package serviceComposition.diagram.edit.parts;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.draw2d.labels.VerticalLabel;
import org.eclipse.swt.graphics.Color;

import serviceComposition.diagram.borders.LeftBorder;

/**
 * @generated
 */
public class ActivityPartitionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public ActivityPartitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new serviceComposition.diagram.edit.policies.ActivityPartitionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(
				EditPolicyRoles.OPEN_ROLE,
				new serviceComposition.diagram.edit.policies.OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated no
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					NonResizableEditPolicy nrPolicy = new NonResizableEditPolicy();
					nrPolicy.setDragAllowed(false);
					result = nrPolicy;
					
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
		return primaryShape = new ActivityPartitionFigure();
	}

	/**
	 * @generated
	 */
	public ActivityPartitionFigure getPrimaryShape() {
		return (ActivityPartitionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart) {
			((serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureActivityPartitionLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getActivityPartitionNodesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart) {
			return true;
		}
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getActivityPartitionNodesCompartmentFigure();
			pane.remove(((serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart) {
			return getPrimaryShape()
					.getActivityPartitionNodesCompartmentFigure();
		}
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
				.getType(serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ActivityPartitionFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private VerticalLabel fFigureActivityPartitionLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fActivityPartitionNodesCompartmentFigure;

		/**
		 * @generated
		 */
		public ActivityPartitionFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 2;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(-4),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(-4),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureActivityPartitionLabelFigure = new VerticalLabel();

			fFigureActivityPartitionLabelFigure.setText("ActivityPartition");
			fFigureActivityPartitionLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			GridData constraintFFigureActivityPartitionLabelFigure = new GridData();
			constraintFFigureActivityPartitionLabelFigure.verticalAlignment = GridData.FILL;
			constraintFFigureActivityPartitionLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureActivityPartitionLabelFigure.horizontalIndent = 0;
			constraintFFigureActivityPartitionLabelFigure.horizontalSpan = 1;
			constraintFFigureActivityPartitionLabelFigure.verticalSpan = 1;
			constraintFFigureActivityPartitionLabelFigure.grabExcessHorizontalSpace = false;
			constraintFFigureActivityPartitionLabelFigure.grabExcessVerticalSpace = true;
			this.add(fFigureActivityPartitionLabelFigure,
					constraintFFigureActivityPartitionLabelFigure);

			fActivityPartitionNodesCompartmentFigure = new RectangleFigure();

			fActivityPartitionNodesCompartmentFigure.setFill(false);
			fActivityPartitionNodesCompartmentFigure.setOutline(false);
			fActivityPartitionNodesCompartmentFigure.setBorder(createBorder0());

			GridData constraintFActivityPartitionNodesCompartmentFigure = new GridData();
			constraintFActivityPartitionNodesCompartmentFigure.verticalAlignment = GridData.FILL;
			constraintFActivityPartitionNodesCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFActivityPartitionNodesCompartmentFigure.horizontalIndent = 0;
			constraintFActivityPartitionNodesCompartmentFigure.horizontalSpan = 1;
			constraintFActivityPartitionNodesCompartmentFigure.verticalSpan = 1;
			constraintFActivityPartitionNodesCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFActivityPartitionNodesCompartmentFigure.grabExcessVerticalSpace = true;
			this.add(fActivityPartitionNodesCompartmentFigure,
					constraintFActivityPartitionNodesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		private Border createBorder0() {
			serviceComposition.diagram.borders.LeftBorder result = new serviceComposition.diagram.borders.LeftBorder();

			return result;
		}

		/**
		 * @generated
		 */
		public VerticalLabel getFigureActivityPartitionLabelFigure() {
			return fFigureActivityPartitionLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getActivityPartitionNodesCompartmentFigure() {
			return fActivityPartitionNodesCompartmentFigure;
		}

	}

}
