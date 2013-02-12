/*
 * 
 */
package serviceProcess.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class LocalPerformanceAnnotationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public LocalPerformanceAnnotationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new serviceProcess.diagram.edit.policies.LocalPerformanceAnnotationItemSemanticEditPolicy());
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
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart) {
			((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLocalPerformanceAnnotationLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart) {
			((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePerformanceAnnotationConcurrentUsersLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart) {
			((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePerformanceAnnotationSecsTimeLimitLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart) {
			((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLocalPerformanceAnnotationMinimumTimeLabelFigure());
			return true;
		}
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart) {
			((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLocalPerformanceAnnotationWeightLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart) {
			return true;
		}
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart) {
			return true;
		}
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart) {
			return true;
		}
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart) {
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
		return getChildBySemanticHint(serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
				.getType(serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ActionEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.InitialNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.FinalNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ForkNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.JoinNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.Action2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.InitialNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.FinalNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ForkNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.JoinNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ActionEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.InitialNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.FinalNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ForkNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.JoinNodeEditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.Action2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.InitialNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.FinalNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ForkNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.JoinNode2EditPart) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017);
		} else if (relationshipType == serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017);
		} else if (relationshipType == serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017);
		} else if (relationshipType == serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003) {
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
		}
		return types;
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
		public LocalPerformanceAnnotationFigure() {
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLocalPerformanceAnnotationLabelFigure = new WrappingLabel();

			fFigureLocalPerformanceAnnotationLabelFigure
					.setText("LocalPerformanceAnnotation");

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

	}

}