/*
 * 
 */
package serviceComposition.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ServiceCompositionDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> getSemanticChildren(
			View view) {
		switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getVisualID(view)) {
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return getServiceComposition_1000SemanticChildren(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID:
			return getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7001SemanticChildren(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID:
			return getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7002SemanticChildren(view);
		case serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID:
			return getActivityPartitionActivityPartitionNodesCompartment_7003SemanticChildren(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID:
			return getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> getServiceComposition_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		serviceComposition.ServiceComposition modelElement = (serviceComposition.ServiceComposition) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceComposition.ActivityNode childElement = (serviceComposition.ActivityNode) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPartitions().iterator(); it
				.hasNext();) {
			serviceComposition.ActivityPartition childElement = (serviceComposition.ActivityPartition) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			serviceComposition.PerformanceAnnotation childElement = modelElement
					.getProcessPerformance();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) containerView
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceComposition.ActivityNode childElement = (serviceComposition.ActivityNode) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) containerView
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceComposition.ActivityNode childElement = (serviceComposition.ActivityNode) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> getActivityPartitionActivityPartitionNodesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceComposition.ActivityPartition modelElement = (serviceComposition.ActivityPartition) containerView
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceComposition.ActivityNode childElement = (serviceComposition.ActivityNode) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) containerView
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceComposition.ActivityNode childElement = (serviceComposition.ActivityNode) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getContainedLinks(
			View view) {
		switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getVisualID(view)) {
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return getServiceComposition_1000ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2001ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_2002ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2003ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getObjectNode_2004ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2005ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2006ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2007ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2008ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2009ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2010ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2011ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getAction_3001ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3002ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3003ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3004ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3005ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3006ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3007ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3008ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3009ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
			return getAction_3010ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID:
			return getStructuredActivityNode_3011ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3012ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
			return getObjectNode_3013ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID:
			return getInitialNode_3014ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID:
			return getFinalNode_3015ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID:
			return getDecisionNode_3016ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID:
			return getForkNode_3017ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID:
			return getJoinNode_3018ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingLinks(
			View view) {
		switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getVisualID(view)) {
		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2001IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_2002IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2003IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getObjectNode_2004IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2005IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2006IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2007IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2008IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2009IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2010IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2011IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getAction_3001IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3002IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3003IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3004IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3005IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3006IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3007IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3008IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3009IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
			return getAction_3010IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID:
			return getStructuredActivityNode_3011IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3012IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
			return getObjectNode_3013IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID:
			return getInitialNode_3014IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID:
			return getFinalNode_3015IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID:
			return getDecisionNode_3016IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID:
			return getForkNode_3017IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID:
			return getJoinNode_3018IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getVisualID(view)) {
		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2001OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_2002OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2003OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getObjectNode_2004OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2005OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2006OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2007OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2008OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2009OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2010OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2011OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getAction_3001OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3002OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3003OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3004OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3005OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3006OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3007OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3008OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3009OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
			return getAction_3010OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID:
			return getStructuredActivityNode_3011OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3012OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
			return getObjectNode_3013OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID:
			return getInitialNode_3014OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID:
			return getFinalNode_3015OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID:
			return getDecisionNode_3016OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID:
			return getForkNode_3017OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID:
			return getJoinNode_3018OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getServiceComposition_1000ContainedLinks(
			View view) {
		serviceComposition.ServiceComposition modelElement = (serviceComposition.ServiceComposition) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_2001ContainedLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_2002ContainedLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityPartition_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getPerformanceAnnotation_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_3001ContainedLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_3002ContainedLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_3010ContainedLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_3011ContainedLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getControlFlow_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectFlow_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_2001IncomingLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_2002IncomingLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_2003IncomingLinks(
			View view) {
		serviceComposition.LocalPerformanceAnnotation modelElement = (serviceComposition.LocalPerformanceAnnotation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_2004IncomingLinks(
			View view) {
		serviceComposition.ObjectNode modelElement = (serviceComposition.ObjectNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityPartition_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_2006IncomingLinks(
			View view) {
		serviceComposition.InitialNode modelElement = (serviceComposition.InitialNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_2007IncomingLinks(
			View view) {
		serviceComposition.FinalNode modelElement = (serviceComposition.FinalNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_2008IncomingLinks(
			View view) {
		serviceComposition.DecisionNode modelElement = (serviceComposition.DecisionNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_2009IncomingLinks(
			View view) {
		serviceComposition.ForkNode modelElement = (serviceComposition.ForkNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_2010IncomingLinks(
			View view) {
		serviceComposition.JoinNode modelElement = (serviceComposition.JoinNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getPerformanceAnnotation_2011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_3001IncomingLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_3002IncomingLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_3003IncomingLinks(
			View view) {
		serviceComposition.LocalPerformanceAnnotation modelElement = (serviceComposition.LocalPerformanceAnnotation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_3004IncomingLinks(
			View view) {
		serviceComposition.ObjectNode modelElement = (serviceComposition.ObjectNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_3005IncomingLinks(
			View view) {
		serviceComposition.InitialNode modelElement = (serviceComposition.InitialNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_3006IncomingLinks(
			View view) {
		serviceComposition.FinalNode modelElement = (serviceComposition.FinalNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_3007IncomingLinks(
			View view) {
		serviceComposition.DecisionNode modelElement = (serviceComposition.DecisionNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_3008IncomingLinks(
			View view) {
		serviceComposition.ForkNode modelElement = (serviceComposition.ForkNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_3009IncomingLinks(
			View view) {
		serviceComposition.JoinNode modelElement = (serviceComposition.JoinNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_3010IncomingLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_3011IncomingLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_3012IncomingLinks(
			View view) {
		serviceComposition.LocalPerformanceAnnotation modelElement = (serviceComposition.LocalPerformanceAnnotation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_3013IncomingLinks(
			View view) {
		serviceComposition.ObjectNode modelElement = (serviceComposition.ObjectNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_3014IncomingLinks(
			View view) {
		serviceComposition.InitialNode modelElement = (serviceComposition.InitialNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_3015IncomingLinks(
			View view) {
		serviceComposition.FinalNode modelElement = (serviceComposition.FinalNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_3016IncomingLinks(
			View view) {
		serviceComposition.DecisionNode modelElement = (serviceComposition.DecisionNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_3017IncomingLinks(
			View view) {
		serviceComposition.ForkNode modelElement = (serviceComposition.ForkNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_3018IncomingLinks(
			View view) {
		serviceComposition.JoinNode modelElement = (serviceComposition.JoinNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getControlFlow_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectFlow_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_2001OutgoingLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_2002OutgoingLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_2003OutgoingLinks(
			View view) {
		serviceComposition.LocalPerformanceAnnotation modelElement = (serviceComposition.LocalPerformanceAnnotation) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_2004OutgoingLinks(
			View view) {
		serviceComposition.ObjectNode modelElement = (serviceComposition.ObjectNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityPartition_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_2006OutgoingLinks(
			View view) {
		serviceComposition.InitialNode modelElement = (serviceComposition.InitialNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_2007OutgoingLinks(
			View view) {
		serviceComposition.FinalNode modelElement = (serviceComposition.FinalNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_2008OutgoingLinks(
			View view) {
		serviceComposition.DecisionNode modelElement = (serviceComposition.DecisionNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_2009OutgoingLinks(
			View view) {
		serviceComposition.ForkNode modelElement = (serviceComposition.ForkNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_2010OutgoingLinks(
			View view) {
		serviceComposition.JoinNode modelElement = (serviceComposition.JoinNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getPerformanceAnnotation_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_3001OutgoingLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_3002OutgoingLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_3003OutgoingLinks(
			View view) {
		serviceComposition.LocalPerformanceAnnotation modelElement = (serviceComposition.LocalPerformanceAnnotation) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_3004OutgoingLinks(
			View view) {
		serviceComposition.ObjectNode modelElement = (serviceComposition.ObjectNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_3005OutgoingLinks(
			View view) {
		serviceComposition.InitialNode modelElement = (serviceComposition.InitialNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_3006OutgoingLinks(
			View view) {
		serviceComposition.FinalNode modelElement = (serviceComposition.FinalNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_3007OutgoingLinks(
			View view) {
		serviceComposition.DecisionNode modelElement = (serviceComposition.DecisionNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_3008OutgoingLinks(
			View view) {
		serviceComposition.ForkNode modelElement = (serviceComposition.ForkNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_3009OutgoingLinks(
			View view) {
		serviceComposition.JoinNode modelElement = (serviceComposition.JoinNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getAction_3010OutgoingLinks(
			View view) {
		serviceComposition.Action modelElement = (serviceComposition.Action) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getStructuredActivityNode_3011OutgoingLinks(
			View view) {
		serviceComposition.StructuredActivityNode modelElement = (serviceComposition.StructuredActivityNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getLocalPerformanceAnnotation_3012OutgoingLinks(
			View view) {
		serviceComposition.LocalPerformanceAnnotation modelElement = (serviceComposition.LocalPerformanceAnnotation) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectNode_3013OutgoingLinks(
			View view) {
		serviceComposition.ObjectNode modelElement = (serviceComposition.ObjectNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getInitialNode_3014OutgoingLinks(
			View view) {
		serviceComposition.InitialNode modelElement = (serviceComposition.InitialNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getFinalNode_3015OutgoingLinks(
			View view) {
		serviceComposition.FinalNode modelElement = (serviceComposition.FinalNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getDecisionNode_3016OutgoingLinks(
			View view) {
		serviceComposition.DecisionNode modelElement = (serviceComposition.DecisionNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getForkNode_3017OutgoingLinks(
			View view) {
		serviceComposition.ForkNode modelElement = (serviceComposition.ForkNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getJoinNode_3018OutgoingLinks(
			View view) {
		serviceComposition.JoinNode modelElement = (serviceComposition.JoinNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getControlFlow_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getObjectFlow_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getContainedTypeModelFacetLinks_ControlFlow_4001(
			serviceComposition.ServiceComposition container) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.ControlFlow) {
				continue;
			}
			serviceComposition.ControlFlow link = (serviceComposition.ControlFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.ActivityNode dst = link.getTarget();
			serviceComposition.ActivityNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001,
					serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getContainedTypeModelFacetLinks_ObjectFlow_4002(
			serviceComposition.ServiceComposition container) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.ObjectFlow) {
				continue;
			}
			serviceComposition.ObjectFlow link = (serviceComposition.ObjectFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.ActivityNode dst = link.getTarget();
			serviceComposition.ActivityNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002,
					serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingTypeModelFacetLinks_ControlFlow_4001(
			serviceComposition.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof serviceComposition.ControlFlow) {
				continue;
			}
			serviceComposition.ControlFlow link = (serviceComposition.ControlFlow) setting
					.getEObject();
			if (serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.ActivityNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					target,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001,
					serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingTypeModelFacetLinks_ObjectFlow_4002(
			serviceComposition.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof serviceComposition.ObjectFlow) {
				continue;
			}
			serviceComposition.ObjectFlow link = (serviceComposition.ObjectFlow) setting
					.getEObject();
			if (serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.ActivityNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					target,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002,
					serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(
			serviceComposition.LocalPerformanceAnnotation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getExecutableNode_Annotation()) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
						setting.getEObject(),
						target,
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ExecutableNodeAnnotation_4003,
						serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingTypeModelFacetLinks_ControlFlow_4001(
			serviceComposition.ActivityNode source) {
		serviceComposition.ServiceComposition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof serviceComposition.ServiceComposition) {
				container = (serviceComposition.ServiceComposition) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.ControlFlow) {
				continue;
			}
			serviceComposition.ControlFlow link = (serviceComposition.ControlFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.ActivityNode dst = link.getTarget();
			serviceComposition.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001,
					serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingTypeModelFacetLinks_ObjectFlow_4002(
			serviceComposition.ActivityNode source) {
		serviceComposition.ServiceComposition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof serviceComposition.ServiceComposition) {
				container = (serviceComposition.ServiceComposition) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.ObjectFlow) {
				continue;
			}
			serviceComposition.ObjectFlow link = (serviceComposition.ObjectFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.ActivityNode dst = link.getTarget();
			serviceComposition.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002,
					serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(
			serviceComposition.ExecutableNode source) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		serviceComposition.LocalPerformanceAnnotation destination = source
				.getAnnotation();
		if (destination == null) {
			return result;
		}
		result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
				source,
				destination,
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.ExecutableNodeAnnotation_4003,
				serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> getSemanticChildren(
				View view) {
			return ServiceCompositionDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getContainedLinks(
				View view) {
			return ServiceCompositionDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingLinks(
				View view) {
			return ServiceCompositionDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingLinks(
				View view) {
			return ServiceCompositionDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
