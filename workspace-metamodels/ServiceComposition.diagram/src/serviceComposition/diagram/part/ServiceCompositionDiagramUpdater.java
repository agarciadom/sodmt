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
		case serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID:
			return getServiceActivityServiceActivityNodesCompartment_7003SemanticChildren(view);
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
			serviceComposition.CompositionFlowNode childElement = (serviceComposition.CompositionFlowNode) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActivityPerformance().iterator(); it
				.hasNext();) {
			serviceComposition.ActivityPerformanceAnnotation childElement = (serviceComposition.ActivityPerformanceAnnotation) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			serviceComposition.SwimlaneContainer childElement = modelElement
					.getSwimlanes();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> getServiceActivityServiceActivityNodesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceComposition.ServiceActivity modelElement = (serviceComposition.ServiceActivity) containerView
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceComposition.ActivityElement childElement = (serviceComposition.ActivityElement) it
					.next();
			int visualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID) {
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
		case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getServiceActivity_2022ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
			return getCompositionObjectNode_2031ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID:
			return getCompositionStart_2023ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID:
			return getCompositionFinish_2024ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID:
			return getCompositionDecision_2025ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID:
			return getCompositionFork_2026ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID:
			return getCompositionJoin_2027ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotation_2028ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID:
			return getSwimlaneContainer_2030ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
			return getActivityAction_3001ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
			return getActivityObjectNode_3008ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
			return getActivityStart_3002ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
			return getActivityFinish_3003ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
			return getActivityDecision_3004ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
			return getActivityFork_3005ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
			return getActivityJoin_3006ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
			return getActionPerformanceAnnotation_3007ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
			return getCompositionControlFlow_4007ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID:
			return getCompositionObjectFlow_4015ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
			return getActivityControlFlow_4011ContainedLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID:
			return getActivityObjectFlow_4012ContainedLinks(view);
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
		case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getServiceActivity_2022IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
			return getCompositionObjectNode_2031IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID:
			return getCompositionStart_2023IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID:
			return getCompositionFinish_2024IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID:
			return getCompositionDecision_2025IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID:
			return getCompositionFork_2026IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID:
			return getCompositionJoin_2027IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotation_2028IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID:
			return getSwimlaneContainer_2030IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
			return getActivityAction_3001IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
			return getActivityObjectNode_3008IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
			return getActivityStart_3002IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
			return getActivityFinish_3003IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
			return getActivityDecision_3004IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
			return getActivityFork_3005IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
			return getActivityJoin_3006IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
			return getActionPerformanceAnnotation_3007IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
			return getCompositionControlFlow_4007IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID:
			return getCompositionObjectFlow_4015IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
			return getActivityControlFlow_4011IncomingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID:
			return getActivityObjectFlow_4012IncomingLinks(view);
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
		case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getServiceActivity_2022OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
			return getCompositionObjectNode_2031OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID:
			return getCompositionStart_2023OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID:
			return getCompositionFinish_2024OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID:
			return getCompositionDecision_2025OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID:
			return getCompositionFork_2026OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID:
			return getCompositionJoin_2027OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotation_2028OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID:
			return getSwimlaneContainer_2030OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
			return getActivityAction_3001OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
			return getActivityObjectNode_3008OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
			return getActivityStart_3002OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
			return getActivityFinish_3003OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
			return getActivityDecision_3004OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
			return getActivityFork_3005OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
			return getActivityJoin_3006OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
			return getActionPerformanceAnnotation_3007OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
			return getCompositionControlFlow_4007OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID:
			return getCompositionObjectFlow_4015OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
			return getActivityControlFlow_4011OutgoingLinks(view);
		case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID:
			return getActivityObjectFlow_4012OutgoingLinks(view);
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
		result.addAll(getContainedTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getServiceActivity_2022ContainedLinks(
			View view) {
		serviceComposition.ServiceActivity modelElement = (serviceComposition.ServiceActivity) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ServiceActivity_Annotation_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionObjectNode_2031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionStart_2023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionFinish_2024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionDecision_2025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionFork_2026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionJoin_2027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityPerformanceAnnotation_2028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getSwimlaneContainer_2030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityAction_3001ContainedLinks(
			View view) {
		serviceComposition.ActivityAction modelElement = (serviceComposition.ActivityAction) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActivityAction_Annotation_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityObjectNode_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityStart_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityFinish_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityDecision_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityFork_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityJoin_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActionPerformanceAnnotation_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionControlFlow_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionObjectFlow_4015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityControlFlow_4011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityObjectFlow_4012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getServiceActivity_2022IncomingLinks(
			View view) {
		serviceComposition.ServiceActivity modelElement = (serviceComposition.ServiceActivity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionObjectNode_2031IncomingLinks(
			View view) {
		serviceComposition.CompositionObjectNode modelElement = (serviceComposition.CompositionObjectNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionStart_2023IncomingLinks(
			View view) {
		serviceComposition.CompositionStart modelElement = (serviceComposition.CompositionStart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionFinish_2024IncomingLinks(
			View view) {
		serviceComposition.CompositionFinish modelElement = (serviceComposition.CompositionFinish) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionDecision_2025IncomingLinks(
			View view) {
		serviceComposition.CompositionDecision modelElement = (serviceComposition.CompositionDecision) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionFork_2026IncomingLinks(
			View view) {
		serviceComposition.CompositionFork modelElement = (serviceComposition.CompositionFork) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionJoin_2027IncomingLinks(
			View view) {
		serviceComposition.CompositionJoin modelElement = (serviceComposition.CompositionJoin) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityPerformanceAnnotation_2028IncomingLinks(
			View view) {
		serviceComposition.ActivityPerformanceAnnotation modelElement = (serviceComposition.ActivityPerformanceAnnotation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ServiceActivity_Annotation_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getSwimlaneContainer_2030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityAction_3001IncomingLinks(
			View view) {
		serviceComposition.ActivityAction modelElement = (serviceComposition.ActivityAction) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityObjectNode_3008IncomingLinks(
			View view) {
		serviceComposition.ActivityObjectNode modelElement = (serviceComposition.ActivityObjectNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityStart_3002IncomingLinks(
			View view) {
		serviceComposition.ActivityStart modelElement = (serviceComposition.ActivityStart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityFinish_3003IncomingLinks(
			View view) {
		serviceComposition.ActivityFinish modelElement = (serviceComposition.ActivityFinish) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityDecision_3004IncomingLinks(
			View view) {
		serviceComposition.ActivityDecision modelElement = (serviceComposition.ActivityDecision) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityFork_3005IncomingLinks(
			View view) {
		serviceComposition.ActivityFork modelElement = (serviceComposition.ActivityFork) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityJoin_3006IncomingLinks(
			View view) {
		serviceComposition.ActivityJoin modelElement = (serviceComposition.ActivityJoin) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActionPerformanceAnnotation_3007IncomingLinks(
			View view) {
		serviceComposition.ActionPerformanceAnnotation modelElement = (serviceComposition.ActionPerformanceAnnotation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ActivityAction_Annotation_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionControlFlow_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionObjectFlow_4015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityControlFlow_4011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityObjectFlow_4012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getServiceActivity_2022OutgoingLinks(
			View view) {
		serviceComposition.ServiceActivity modelElement = (serviceComposition.ServiceActivity) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ServiceActivity_Annotation_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionObjectNode_2031OutgoingLinks(
			View view) {
		serviceComposition.CompositionObjectNode modelElement = (serviceComposition.CompositionObjectNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionStart_2023OutgoingLinks(
			View view) {
		serviceComposition.CompositionStart modelElement = (serviceComposition.CompositionStart) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionFinish_2024OutgoingLinks(
			View view) {
		serviceComposition.CompositionFinish modelElement = (serviceComposition.CompositionFinish) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionDecision_2025OutgoingLinks(
			View view) {
		serviceComposition.CompositionDecision modelElement = (serviceComposition.CompositionDecision) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionFork_2026OutgoingLinks(
			View view) {
		serviceComposition.CompositionFork modelElement = (serviceComposition.CompositionFork) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionJoin_2027OutgoingLinks(
			View view) {
		serviceComposition.CompositionJoin modelElement = (serviceComposition.CompositionJoin) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityPerformanceAnnotation_2028OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getSwimlaneContainer_2030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityAction_3001OutgoingLinks(
			View view) {
		serviceComposition.ActivityAction modelElement = (serviceComposition.ActivityAction) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActivityAction_Annotation_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityObjectNode_3008OutgoingLinks(
			View view) {
		serviceComposition.ActivityObjectNode modelElement = (serviceComposition.ActivityObjectNode) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityStart_3002OutgoingLinks(
			View view) {
		serviceComposition.ActivityStart modelElement = (serviceComposition.ActivityStart) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityFinish_3003OutgoingLinks(
			View view) {
		serviceComposition.ActivityFinish modelElement = (serviceComposition.ActivityFinish) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityDecision_3004OutgoingLinks(
			View view) {
		serviceComposition.ActivityDecision modelElement = (serviceComposition.ActivityDecision) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityFork_3005OutgoingLinks(
			View view) {
		serviceComposition.ActivityFork modelElement = (serviceComposition.ActivityFork) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityJoin_3006OutgoingLinks(
			View view) {
		serviceComposition.ActivityJoin modelElement = (serviceComposition.ActivityJoin) view
				.getElement();
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActionPerformanceAnnotation_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionControlFlow_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getCompositionObjectFlow_4015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityControlFlow_4011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getActivityObjectFlow_4012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getContainedTypeModelFacetLinks_CompositionControlFlow_4007(
			serviceComposition.ServiceComposition container) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		for (Iterator<?> links = container.getCompositionEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.CompositionControlFlow) {
				continue;
			}
			serviceComposition.CompositionControlFlow link = (serviceComposition.CompositionControlFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode dst = link.getTarget();
			serviceComposition.FlowNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007,
					serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getContainedTypeModelFacetLinks_CompositionObjectFlow_4015(
			serviceComposition.ServiceComposition container) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		for (Iterator<?> links = container.getCompositionEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.CompositionObjectFlow) {
				continue;
			}
			serviceComposition.CompositionObjectFlow link = (serviceComposition.CompositionObjectFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode dst = link.getTarget();
			serviceComposition.FlowNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectFlow_4015,
					serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getContainedTypeModelFacetLinks_ActivityControlFlow_4011(
			serviceComposition.ServiceComposition container) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		for (Iterator<?> links = container.getActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.ActivityControlFlow) {
				continue;
			}
			serviceComposition.ActivityControlFlow link = (serviceComposition.ActivityControlFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode dst = link.getTarget();
			serviceComposition.FlowNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011,
					serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getContainedTypeModelFacetLinks_ActivityObjectFlow_4012(
			serviceComposition.ServiceComposition container) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		for (Iterator<?> links = container.getActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.ActivityObjectFlow) {
				continue;
			}
			serviceComposition.ActivityObjectFlow link = (serviceComposition.ActivityObjectFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode dst = link.getTarget();
			serviceComposition.FlowNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectFlow_4012,
					serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingTypeModelFacetLinks_CompositionControlFlow_4007(
			serviceComposition.FlowNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getFlowEdge_Target()
					|| false == setting.getEObject() instanceof serviceComposition.CompositionControlFlow) {
				continue;
			}
			serviceComposition.CompositionControlFlow link = (serviceComposition.CompositionControlFlow) setting
					.getEObject();
			if (serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					target,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007,
					serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingTypeModelFacetLinks_CompositionObjectFlow_4015(
			serviceComposition.FlowNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getFlowEdge_Target()
					|| false == setting.getEObject() instanceof serviceComposition.CompositionObjectFlow) {
				continue;
			}
			serviceComposition.CompositionObjectFlow link = (serviceComposition.CompositionObjectFlow) setting
					.getEObject();
			if (serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					target,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectFlow_4015,
					serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityControlFlow_4011(
			serviceComposition.FlowNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getFlowEdge_Target()
					|| false == setting.getEObject() instanceof serviceComposition.ActivityControlFlow) {
				continue;
			}
			serviceComposition.ActivityControlFlow link = (serviceComposition.ActivityControlFlow) setting
					.getEObject();
			if (serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					target,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011,
					serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityObjectFlow_4012(
			serviceComposition.FlowNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getFlowEdge_Target()
					|| false == setting.getEObject() instanceof serviceComposition.ActivityObjectFlow) {
				continue;
			}
			serviceComposition.ActivityObjectFlow link = (serviceComposition.ActivityObjectFlow) setting
					.getEObject();
			if (serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode src = link.getSource();
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					target,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectFlow_4012,
					serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingFeatureModelFacetLinks_ServiceActivity_Annotation_4014(
			serviceComposition.ActivityPerformanceAnnotation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getServiceActivity_Annotation()) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
						setting.getEObject(),
						target,
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivityAnnotation_4014,
						serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getIncomingFeatureModelFacetLinks_ActivityAction_Annotation_4008(
			serviceComposition.ActionPerformanceAnnotation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityAction_Annotation()) {
				result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
						setting.getEObject(),
						target,
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityActionAnnotation_4008,
						serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingTypeModelFacetLinks_CompositionControlFlow_4007(
			serviceComposition.FlowNode source) {
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
		for (Iterator<?> links = container.getCompositionEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.CompositionControlFlow) {
				continue;
			}
			serviceComposition.CompositionControlFlow link = (serviceComposition.CompositionControlFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode dst = link.getTarget();
			serviceComposition.FlowNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007,
					serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingTypeModelFacetLinks_CompositionObjectFlow_4015(
			serviceComposition.FlowNode source) {
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
		for (Iterator<?> links = container.getCompositionEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.CompositionObjectFlow) {
				continue;
			}
			serviceComposition.CompositionObjectFlow link = (serviceComposition.CompositionObjectFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode dst = link.getTarget();
			serviceComposition.FlowNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectFlow_4015,
					serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityControlFlow_4011(
			serviceComposition.FlowNode source) {
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
		for (Iterator<?> links = container.getActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.ActivityControlFlow) {
				continue;
			}
			serviceComposition.ActivityControlFlow link = (serviceComposition.ActivityControlFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode dst = link.getTarget();
			serviceComposition.FlowNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011,
					serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityObjectFlow_4012(
			serviceComposition.FlowNode source) {
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
		for (Iterator<?> links = container.getActivityEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceComposition.ActivityObjectFlow) {
				continue;
			}
			serviceComposition.ActivityObjectFlow link = (serviceComposition.ActivityObjectFlow) linkObject;
			if (serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID != serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceComposition.FlowNode dst = link.getTarget();
			serviceComposition.FlowNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
					src,
					dst,
					link,
					serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectFlow_4012,
					serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingFeatureModelFacetLinks_ServiceActivity_Annotation_4014(
			serviceComposition.ServiceActivity source) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		serviceComposition.ActivityPerformanceAnnotation destination = source
				.getAnnotation();
		if (destination == null) {
			return result;
		}
		result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
				source,
				destination,
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivityAnnotation_4014,
				serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActivityAction_Annotation_4008(
			serviceComposition.ActivityAction source) {
		LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor> result = new LinkedList<serviceComposition.diagram.part.ServiceCompositionLinkDescriptor>();
		serviceComposition.ActionPerformanceAnnotation destination = source
				.getAnnotation();
		if (destination == null) {
			return result;
		}
		result.add(new serviceComposition.diagram.part.ServiceCompositionLinkDescriptor(
				source,
				destination,
				serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityActionAnnotation_4008,
				serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID));
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
