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
		case serviceProcess.diagram.edit.parts.ExecutableNodeExecutableNodeSubnodesCompartmentEditPart.VISUAL_ID:
			return getExecutableNodeExecutableNodeSubnodesCompartment_7001SemanticChildren(view);
		case serviceProcess.diagram.edit.parts.ExecutableNodeExecutableNodeSubnodesCompartment2EditPart.VISUAL_ID:
			return getExecutableNodeExecutableNodeSubnodesCompartment_7002SemanticChildren(view);
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
			serviceProcess.ActivityNode childElement = (serviceProcess.ActivityNode) it
					.next();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ExecutableNodeEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			serviceProcess.PerformanceAnnotation childElement = modelElement
					.getProcessPerformance();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> getExecutableNodeExecutableNodeSubnodesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceProcess.ExecutableNode modelElement = (serviceProcess.ExecutableNode) containerView
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSubnodes().iterator(); it
				.hasNext();) {
			serviceProcess.ActivityNode childElement = (serviceProcess.ActivityNode) it
					.next();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ExecutableNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> getExecutableNodeExecutableNodeSubnodesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceProcess.ExecutableNode modelElement = (serviceProcess.ExecutableNode) containerView
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSubnodes().iterator(); it
				.hasNext();) {
			serviceProcess.ActivityNode childElement = (serviceProcess.ActivityNode) it
					.next();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ExecutableNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
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
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2001ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ExecutableNodeEditPart.VISUAL_ID:
			return getExecutableNode_2002ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getObjectNode_2003ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2005ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2006ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2007ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2008ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2009ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3001ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ExecutableNode2EditPart.VISUAL_ID:
			return getExecutableNode_3002ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3003ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3004ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3005ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3006ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3007ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3008ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002ContainedLinks(view);
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
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2001IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ExecutableNodeEditPart.VISUAL_ID:
			return getExecutableNode_2002IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getObjectNode_2003IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2005IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2006IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2007IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2008IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2009IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3001IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ExecutableNode2EditPart.VISUAL_ID:
			return getExecutableNode_3002IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3003IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3004IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3005IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3006IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3007IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3008IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002IncomingLinks(view);
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
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2001OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ExecutableNodeEditPart.VISUAL_ID:
			return getExecutableNode_2002OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getObjectNode_2003OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2005OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2006OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2007OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2008OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2009OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3001OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ExecutableNode2EditPart.VISUAL_ID:
			return getExecutableNode_3002OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3003OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3004OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3005OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3006OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3007OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3008OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002OutgoingLinks(view);
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
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getExecutableNode_2002ContainedLinks(
			View view) {
		serviceProcess.ExecutableNode modelElement = (serviceProcess.ExecutableNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getPerformanceAnnotation_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getExecutableNode_3002ContainedLinks(
			View view) {
		serviceProcess.ExecutableNode modelElement = (serviceProcess.ExecutableNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getControlFlow_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectFlow_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_2001IncomingLinks(
			View view) {
		serviceProcess.LocalPerformanceAnnotation modelElement = (serviceProcess.LocalPerformanceAnnotation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getExecutableNode_2002IncomingLinks(
			View view) {
		serviceProcess.ExecutableNode modelElement = (serviceProcess.ExecutableNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_2003IncomingLinks(
			View view) {
		serviceProcess.ObjectNode modelElement = (serviceProcess.ObjectNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_2004IncomingLinks(
			View view) {
		serviceProcess.InitialNode modelElement = (serviceProcess.InitialNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_2005IncomingLinks(
			View view) {
		serviceProcess.FinalNode modelElement = (serviceProcess.FinalNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_2006IncomingLinks(
			View view) {
		serviceProcess.DecisionNode modelElement = (serviceProcess.DecisionNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_2007IncomingLinks(
			View view) {
		serviceProcess.ForkNode modelElement = (serviceProcess.ForkNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_2008IncomingLinks(
			View view) {
		serviceProcess.JoinNode modelElement = (serviceProcess.JoinNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getPerformanceAnnotation_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_3001IncomingLinks(
			View view) {
		serviceProcess.LocalPerformanceAnnotation modelElement = (serviceProcess.LocalPerformanceAnnotation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getExecutableNode_3002IncomingLinks(
			View view) {
		serviceProcess.ExecutableNode modelElement = (serviceProcess.ExecutableNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_3003IncomingLinks(
			View view) {
		serviceProcess.ObjectNode modelElement = (serviceProcess.ObjectNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_3004IncomingLinks(
			View view) {
		serviceProcess.InitialNode modelElement = (serviceProcess.InitialNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_3005IncomingLinks(
			View view) {
		serviceProcess.FinalNode modelElement = (serviceProcess.FinalNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_3006IncomingLinks(
			View view) {
		serviceProcess.DecisionNode modelElement = (serviceProcess.DecisionNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_3007IncomingLinks(
			View view) {
		serviceProcess.ForkNode modelElement = (serviceProcess.ForkNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_3008IncomingLinks(
			View view) {
		serviceProcess.JoinNode modelElement = (serviceProcess.JoinNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getControlFlow_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectFlow_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_2001OutgoingLinks(
			View view) {
		serviceProcess.LocalPerformanceAnnotation modelElement = (serviceProcess.LocalPerformanceAnnotation) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getExecutableNode_2002OutgoingLinks(
			View view) {
		serviceProcess.ExecutableNode modelElement = (serviceProcess.ExecutableNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_2003OutgoingLinks(
			View view) {
		serviceProcess.ObjectNode modelElement = (serviceProcess.ObjectNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_2004OutgoingLinks(
			View view) {
		serviceProcess.InitialNode modelElement = (serviceProcess.InitialNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_2005OutgoingLinks(
			View view) {
		serviceProcess.FinalNode modelElement = (serviceProcess.FinalNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_2006OutgoingLinks(
			View view) {
		serviceProcess.DecisionNode modelElement = (serviceProcess.DecisionNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_2007OutgoingLinks(
			View view) {
		serviceProcess.ForkNode modelElement = (serviceProcess.ForkNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_2008OutgoingLinks(
			View view) {
		serviceProcess.JoinNode modelElement = (serviceProcess.JoinNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getPerformanceAnnotation_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_3001OutgoingLinks(
			View view) {
		serviceProcess.LocalPerformanceAnnotation modelElement = (serviceProcess.LocalPerformanceAnnotation) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getExecutableNode_3002OutgoingLinks(
			View view) {
		serviceProcess.ExecutableNode modelElement = (serviceProcess.ExecutableNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_3003OutgoingLinks(
			View view) {
		serviceProcess.ObjectNode modelElement = (serviceProcess.ObjectNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_3004OutgoingLinks(
			View view) {
		serviceProcess.InitialNode modelElement = (serviceProcess.InitialNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_3005OutgoingLinks(
			View view) {
		serviceProcess.FinalNode modelElement = (serviceProcess.FinalNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_3006OutgoingLinks(
			View view) {
		serviceProcess.DecisionNode modelElement = (serviceProcess.DecisionNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_3007OutgoingLinks(
			View view) {
		serviceProcess.ForkNode modelElement = (serviceProcess.ForkNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_3008OutgoingLinks(
			View view) {
		serviceProcess.JoinNode modelElement = (serviceProcess.JoinNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getControlFlow_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectFlow_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getContainedTypeModelFacetLinks_ControlFlow_4001(
			serviceProcess.ServiceProcess container) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceProcess.ControlFlow) {
				continue;
			}
			serviceProcess.ControlFlow link = (serviceProcess.ControlFlow) linkObject;
			if (serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.ActivityNode dst = link.getTarget();
			serviceProcess.ActivityNode src = link.getSource();
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					dst,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001,
					serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getContainedTypeModelFacetLinks_ObjectFlow_4002(
			serviceProcess.ServiceProcess container) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof serviceProcess.ObjectFlow) {
				continue;
			}
			serviceProcess.ObjectFlow link = (serviceProcess.ObjectFlow) linkObject;
			if (serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.ActivityNode dst = link.getTarget();
			serviceProcess.ActivityNode src = link.getSource();
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					dst,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002,
					serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getIncomingTypeModelFacetLinks_ControlFlow_4001(
			serviceProcess.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceProcess.ServiceProcessPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof serviceProcess.ControlFlow) {
				continue;
			}
			serviceProcess.ControlFlow link = (serviceProcess.ControlFlow) setting
					.getEObject();
			if (serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.ActivityNode src = link.getSource();
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					target,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001,
					serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getIncomingTypeModelFacetLinks_ObjectFlow_4002(
			serviceProcess.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != serviceProcess.ServiceProcessPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof serviceProcess.ObjectFlow) {
				continue;
			}
			serviceProcess.ObjectFlow link = (serviceProcess.ObjectFlow) setting
					.getEObject();
			if (serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.ActivityNode src = link.getSource();
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					target,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002,
					serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getIncomingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(
			serviceProcess.LocalPerformanceAnnotation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == serviceProcess.ServiceProcessPackage.eINSTANCE
					.getExecutableNode_Annotation()) {
				result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
						setting.getEObject(),
						target,
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003,
						serviceProcess.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getOutgoingTypeModelFacetLinks_ControlFlow_4001(
			serviceProcess.ActivityNode source) {
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
			if (false == linkObject instanceof serviceProcess.ControlFlow) {
				continue;
			}
			serviceProcess.ControlFlow link = (serviceProcess.ControlFlow) linkObject;
			if (serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.ActivityNode dst = link.getTarget();
			serviceProcess.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					dst,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001,
					serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getOutgoingTypeModelFacetLinks_ObjectFlow_4002(
			serviceProcess.ActivityNode source) {
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
			if (false == linkObject instanceof serviceProcess.ObjectFlow) {
				continue;
			}
			serviceProcess.ObjectFlow link = (serviceProcess.ObjectFlow) linkObject;
			if (serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			serviceProcess.ActivityNode dst = link.getTarget();
			serviceProcess.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
					src,
					dst,
					link,
					serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002,
					serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(
			serviceProcess.ExecutableNode source) {
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		serviceProcess.LocalPerformanceAnnotation destination = source
				.getAnnotation();
		if (destination == null) {
			return result;
		}
		result.add(new serviceProcess.diagram.part.ServiceProcessLinkDescriptor(
				source,
				destination,
				serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003,
				serviceProcess.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
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
