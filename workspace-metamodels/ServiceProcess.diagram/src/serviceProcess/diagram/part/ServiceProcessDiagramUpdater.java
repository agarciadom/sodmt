/*
 * 
 */
package serviceProcess.diagram.part;

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
public class ServiceProcessDiagramUpdater {

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
	public static List<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> getSemanticChildren(
			View view) {
		switch (serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
				.getVisualID(view)) {
		case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID:
			return getServiceProcess_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> getServiceProcess_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		serviceProcess.ServiceProcess modelElement = (serviceProcess.ServiceProcess) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceProcess.ProcessFlowNode childElement = (serviceProcess.ProcessFlowNode) it
					.next();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActivityPerformance().iterator(); it
				.hasNext();) {
			serviceProcess.ActivityPerformanceAnnotation childElement = (serviceProcess.ActivityPerformanceAnnotation) it
					.next();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			serviceProcess.ProcessPerformanceAnnotation childElement = modelElement
					.getProcessPerformance();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getContainedLinks(
			View view) {
		switch (serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
				.getVisualID(view)) {
		case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID:
			return getServiceProcess_1000ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getServiceActivity_2019ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID:
			return getProcessStart_2020ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID:
			return getProcessFinish_2021ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID:
			return getProcessDecision_2022ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID:
			return getProcessFork_2023ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID:
			return getProcessJoin_2024ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotation_2017ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID:
			return getProcessPerformanceAnnotation_2018ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID:
			return getProcessControlFlow_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getIncomingLinks(
			View view) {
		switch (serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
				.getVisualID(view)) {
		case serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getServiceActivity_2019IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID:
			return getProcessStart_2020IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID:
			return getProcessFinish_2021IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID:
			return getProcessDecision_2022IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID:
			return getProcessFork_2023IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID:
			return getProcessJoin_2024IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotation_2017IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID:
			return getProcessPerformanceAnnotation_2018IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID:
			return getProcessControlFlow_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
				.getVisualID(view)) {
		case serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getServiceActivity_2019OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID:
			return getProcessStart_2020OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID:
			return getProcessFinish_2021OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID:
			return getProcessDecision_2022OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID:
			return getProcessFork_2023OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID:
			return getProcessJoin_2024OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotation_2017OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID:
			return getProcessPerformanceAnnotation_2018OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID:
			return getProcessControlFlow_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getServiceProcess_1000ContainedLinks(
			View view) {
		serviceProcess.ServiceProcess modelElement = (serviceProcess.ServiceProcess) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ProcessControlFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getServiceActivity_2019ContainedLinks(
			View view) {
		serviceProcess.ServiceActivity modelElement = (serviceProcess.ServiceActivity) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ServiceActivity_Annotation_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessStart_2020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessFinish_2021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessDecision_2022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessFork_2023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessJoin_2024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getActivityPerformanceAnnotation_2017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessPerformanceAnnotation_2018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessControlFlow_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getServiceActivity_2019IncomingLinks(
			View view) {
		serviceProcess.ServiceActivity modelElement = (serviceProcess.ServiceActivity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ProcessControlFlow_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessStart_2020IncomingLinks(
			View view) {
		serviceProcess.ProcessStart modelElement = (serviceProcess.ProcessStart) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ProcessControlFlow_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessFinish_2021IncomingLinks(
			View view) {
		serviceProcess.ProcessFinish modelElement = (serviceProcess.ProcessFinish) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ProcessControlFlow_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessDecision_2022IncomingLinks(
			View view) {
		serviceProcess.ProcessDecision modelElement = (serviceProcess.ProcessDecision) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ProcessControlFlow_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessFork_2023IncomingLinks(
			View view) {
		serviceProcess.ProcessFork modelElement = (serviceProcess.ProcessFork) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ProcessControlFlow_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessJoin_2024IncomingLinks(
			View view) {
		serviceProcess.ProcessJoin modelElement = (serviceProcess.ProcessJoin) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ProcessControlFlow_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getActivityPerformanceAnnotation_2017IncomingLinks(
			View view) {
		serviceProcess.ActivityPerformanceAnnotation modelElement = (serviceProcess.ActivityPerformanceAnnotation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ServiceActivity_Annotation_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessPerformanceAnnotation_2018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessControlFlow_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getServiceActivity_2019OutgoingLinks(
			View view) {
		serviceProcess.ServiceActivity modelElement = (serviceProcess.ServiceActivity) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ProcessControlFlow_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ServiceActivity_Annotation_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessStart_2020OutgoingLinks(
			View view) {
		serviceProcess.ProcessStart modelElement = (serviceProcess.ProcessStart) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ProcessControlFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessFinish_2021OutgoingLinks(
			View view) {
		serviceProcess.ProcessFinish modelElement = (serviceProcess.ProcessFinish) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ProcessControlFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessDecision_2022OutgoingLinks(
			View view) {
		serviceProcess.ProcessDecision modelElement = (serviceProcess.ProcessDecision) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ProcessControlFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessFork_2023OutgoingLinks(
			View view) {
		serviceProcess.ProcessFork modelElement = (serviceProcess.ProcessFork) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ProcessControlFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessJoin_2024OutgoingLinks(
			View view) {
		serviceProcess.ProcessJoin modelElement = (serviceProcess.ProcessJoin) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ProcessControlFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getActivityPerformanceAnnotation_2017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessPerformanceAnnotation_2018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getProcessControlFlow_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getContainedTypeModelFacetLinks_ProcessControlFlow_4005(
			serviceProcess.ServiceProcess container) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceProcess.ProcessControlFlow) {
				continue;
			}
			serviceProcess.ProcessControlFlow link = (serviceProcess.ProcessControlFlow) linkObject;
			if (serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.FlowNode dst = link.getTarget();
			serviceProcess.FlowNode src = link.getSource();
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					dst,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessControlFlow_4005,
					serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getIncomingTypeModelFacetLinks_ProcessControlFlow_4005(
			serviceProcess.FlowNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceProcess.ServiceProcessPackage.eINSTANCE
					.getFlowEdge_Target()
					|| false == setting.getEObject() instanceof serviceProcess.ProcessControlFlow) {
				continue;
			}
			serviceProcess.ProcessControlFlow link = (serviceProcess.ProcessControlFlow) setting
					.getEObject();
			if (serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.FlowNode src = link.getSource();
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					target,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessControlFlow_4005,
					serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getIncomingFeatureModelFacetLinks_ServiceActivity_Annotation_4008(
			serviceProcess.ActivityPerformanceAnnotation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == serviceProcess.ServiceProcessPackage.eINSTANCE
					.getServiceActivity_Annotation()) {
				result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
						setting.getEObject(),
						target,
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivityAnnotation_4008,
						serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getOutgoingTypeModelFacetLinks_ProcessControlFlow_4005(
			serviceProcess.FlowNode source) {
		serviceProcess.ServiceProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof serviceProcess.ServiceProcess) {
				container = (serviceProcess.ServiceProcess) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceProcess.ProcessControlFlow) {
				continue;
			}
			serviceProcess.ProcessControlFlow link = (serviceProcess.ProcessControlFlow) linkObject;
			if (serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.FlowNode dst = link.getTarget();
			serviceProcess.FlowNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					dst,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessControlFlow_4005,
					serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getOutgoingFeatureModelFacetLinks_ServiceActivity_Annotation_4008(
			serviceProcess.ServiceActivity source) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		serviceProcess.ActivityPerformanceAnnotation destination = source
				.getAnnotation();
		if (destination == null) {
			return result;
		}
		result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
				source,
				destination,
				serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivityAnnotation_4008,
				serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
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
		public List<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> getSemanticChildren(
				View view) {
			return ServiceProcessDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getContainedLinks(
				View view) {
			return ServiceProcessDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getIncomingLinks(
				View view) {
			return ServiceProcessDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getOutgoingLinks(
				View view) {
			return ServiceProcessDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
