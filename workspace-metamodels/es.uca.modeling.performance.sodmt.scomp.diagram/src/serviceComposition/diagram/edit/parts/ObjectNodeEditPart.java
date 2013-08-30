/*
 * 
 */
package serviceComposition.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
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
public class ObjectNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public ObjectNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new serviceComposition.diagram.edit.policies.ObjectNodeItemSemanticEditPolicy());
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
		return primaryShape = new ObjectNodeFigure();
	}

	/**
	 * @generated
	 */
	public ObjectNodeFigure getPrimaryShape() {
		return (ObjectNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart) {
			((serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureObjectNodeLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart) {
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
				.getType(serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActionEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.Action2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.Action3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActionEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNodeEditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.Action2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode2EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.Action3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode3EditPart) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_2012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3005);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3019);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3013);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3014);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3015);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3016);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3017);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3018);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3020);
		} else if (relationshipType == serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_2012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3005);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3019);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3013);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3014);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3015);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3016);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3017);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3018);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3020);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001);
		types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_2012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3005);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3019);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3013);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3014);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3015);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3016);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3017);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3018);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3020);
		} else if (relationshipType == serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002) {
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_2012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3005);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3019);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3013);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3014);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3015);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3016);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3017);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3018);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_3020);
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
	public class ObjectNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureObjectNodeLabelFigure;

		/**
		 * @generated
		 */
		public ObjectNodeFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureObjectNodeLabelFigure = new WrappingLabel();

			fFigureObjectNodeLabelFigure.setText("ObjectNode");

			GridData constraintFFigureObjectNodeLabelFigure = new GridData();
			constraintFFigureObjectNodeLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureObjectNodeLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureObjectNodeLabelFigure.horizontalIndent = 0;
			constraintFFigureObjectNodeLabelFigure.horizontalSpan = 1;
			constraintFFigureObjectNodeLabelFigure.verticalSpan = 1;
			constraintFFigureObjectNodeLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureObjectNodeLabelFigure.grabExcessVerticalSpace = true;
			this.add(fFigureObjectNodeLabelFigure,
					constraintFFigureObjectNodeLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureObjectNodeLabelFigure() {
			return fFigureObjectNodeLabelFigure;
		}

	}

}
