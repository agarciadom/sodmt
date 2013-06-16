/*
 * 
 */
package serviceComposition.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class ServiceCompositionModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof serviceComposition.diagram.edit.parts.ServiceCompositionEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(12);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPartition_2005);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.MergeNode_2012);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.PerformanceAnnotation_2011);
			return types;
		}
		if (editPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(10);
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
			return types;
		}
		if (editPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(10);
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
			return types;
		}
		if (editPart instanceof serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(10);
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
			return types;
		}
		if (editPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(10);
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
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.Action2EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.Action3EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.Action2EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.Action3EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.Action2EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.Action3EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.Action2EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.Action3EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.Action2EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode2EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.Action3EditPart) {
			return ((serviceComposition.diagram.edit.parts.Action3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) {
			return ((serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ObjectNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ObjectNode3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.InitialNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.InitialNode3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.FinalNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.FinalNode3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.DecisionNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.DecisionNode3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ForkNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.ForkNode3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.JoinNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.JoinNode3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.MergeNode3EditPart) {
			return ((serviceComposition.diagram.edit.parts.MergeNode3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(serviceComposition.diagram.part.Messages.ServiceCompositionModelingAssistantProviderMessage);
		dialog.setTitle(serviceComposition.diagram.part.Messages.ServiceCompositionModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
