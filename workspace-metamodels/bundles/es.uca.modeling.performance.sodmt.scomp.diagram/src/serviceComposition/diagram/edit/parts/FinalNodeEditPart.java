/*
 * 
 */
package serviceComposition.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
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
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class FinalNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

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
	public FinalNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new serviceComposition.diagram.edit.policies.FinalNodeItemSemanticEditPolicy());
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
		return primaryShape = new FinalNodeFigure();
	}

	/**
	 * @generated
	 */
	public FinalNodeFigure getPrimaryShape() {
		return (FinalNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(30, 30);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
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
	public class FinalNodeFigure extends SVGFigure {

		/**
		 * @generated
		 */
		public FinalNodeFigure() {
			this.setURI("platform:/plugin/es.uca.modeling.performance.sodmt.sprocess/svg/flow-final.svg");
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(30),
					getMapMode().DPtoLP(30)));
		}

	}

}
