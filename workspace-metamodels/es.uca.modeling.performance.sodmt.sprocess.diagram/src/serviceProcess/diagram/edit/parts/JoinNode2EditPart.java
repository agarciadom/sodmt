/*
 * 
 */
package serviceProcess.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class JoinNode2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3026;

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
	public JoinNode2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new serviceProcess.diagram.edit.policies.JoinNode2ItemSemanticEditPolicy());
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
		return primaryShape = new JoinNodeFigure();
	}

	/**
	 * @generated
	 */
	public JoinNodeFigure getPrimaryShape() {
		return (JoinNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(10, 30);
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
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3018);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3019);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3020);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3021);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3022);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3023);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3024);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3025);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3026);
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
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3018);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3019);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3020);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3021);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3022);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3023);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3024);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3025);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3026);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001);
		types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002);
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
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3018);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3019);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3020);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3021);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3022);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3023);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3024);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3025);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3026);
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
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3018);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3019);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3020);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3021);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3022);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3023);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3024);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3025);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3026);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class JoinNodeFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		public JoinNodeFigure() {
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(30)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(30)));
			this.setFill(true);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(30)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 0, 0, 0);

}
