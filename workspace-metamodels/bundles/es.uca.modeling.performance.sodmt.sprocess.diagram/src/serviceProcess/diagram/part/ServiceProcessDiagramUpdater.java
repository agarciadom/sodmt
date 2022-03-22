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
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID:
			return getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7003SemanticChildren(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID:
			return getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7005SemanticChildren(view);
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
			if (visualID == serviceProcess.diagram.edit.parts.ActionEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID) {
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
			if (visualID == serviceProcess.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID) {
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
	public static List<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceProcess.StructuredActivityNode modelElement = (serviceProcess.StructuredActivityNode) containerView
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceProcess.ActivityNode childElement = (serviceProcess.ActivityNode) it
					.next();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.Action2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID) {
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
			if (visualID == serviceProcess.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID) {
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
	public static List<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> getStructuredActivityNodeStructuredActivityNodeNodesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		serviceProcess.StructuredActivityNode modelElement = (serviceProcess.StructuredActivityNode) containerView
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			serviceProcess.ActivityNode childElement = (serviceProcess.ActivityNode) it
					.next();
			int visualID = serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == serviceProcess.diagram.edit.parts.Action2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID) {
				result.add(new serviceProcess.diagram.part.ServiceProcessNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID) {
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
			if (visualID == serviceProcess.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID) {
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
		case serviceProcess.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2010ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_2011ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2001ContainedLinks(view);
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
		case serviceProcess.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2012ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2009ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getAction_3018ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3019ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3020ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3021ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3022ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3023ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3024ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3025ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3026ContainedLinks(view);
		case serviceProcess.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3027ContainedLinks(view);
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
		case serviceProcess.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2010IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_2011IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2001IncomingLinks(view);
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
		case serviceProcess.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2012IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2009IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getAction_3018IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3019IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3020IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3021IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3022IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3023IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3024IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3025IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3026IncomingLinks(view);
		case serviceProcess.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3027IncomingLinks(view);
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
		case serviceProcess.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2010OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_2011OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2001OutgoingLinks(view);
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
		case serviceProcess.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2012OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2009OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getAction_3018OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3019OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3020OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3021OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3022OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3023OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3024OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3025OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3026OutgoingLinks(view);
		case serviceProcess.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3027OutgoingLinks(view);
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getAction_2010ContainedLinks(
			View view) {
		serviceProcess.Action modelElement = (serviceProcess.Action) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getStructuredActivityNode_2011ContainedLinks(
			View view) {
		serviceProcess.StructuredActivityNode modelElement = (serviceProcess.StructuredActivityNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getMergeNode_2012ContainedLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getAction_3018ContainedLinks(
			View view) {
		serviceProcess.Action modelElement = (serviceProcess.Action) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getStructuredActivityNode_3019ContainedLinks(
			View view) {
		serviceProcess.StructuredActivityNode modelElement = (serviceProcess.StructuredActivityNode) view
				.getElement();
		LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> result = new LinkedList<serviceProcess.diagram.part.ServiceProcessLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExecutableNode_Annotation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getMergeNode_3027ContainedLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getAction_2010IncomingLinks(
			View view) {
		serviceProcess.Action modelElement = (serviceProcess.Action) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getStructuredActivityNode_2011IncomingLinks(
			View view) {
		serviceProcess.StructuredActivityNode modelElement = (serviceProcess.StructuredActivityNode) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getMergeNode_2012IncomingLinks(
			View view) {
		serviceProcess.MergeNode modelElement = (serviceProcess.MergeNode) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getAction_3018IncomingLinks(
			View view) {
		serviceProcess.Action modelElement = (serviceProcess.Action) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getStructuredActivityNode_3019IncomingLinks(
			View view) {
		serviceProcess.StructuredActivityNode modelElement = (serviceProcess.StructuredActivityNode) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_3020IncomingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_3021IncomingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_3022IncomingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_3023IncomingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_3024IncomingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_3025IncomingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_3026IncomingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getMergeNode_3027IncomingLinks(
			View view) {
		serviceProcess.MergeNode modelElement = (serviceProcess.MergeNode) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getAction_2010OutgoingLinks(
			View view) {
		serviceProcess.Action modelElement = (serviceProcess.Action) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getStructuredActivityNode_2011OutgoingLinks(
			View view) {
		serviceProcess.StructuredActivityNode modelElement = (serviceProcess.StructuredActivityNode) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getMergeNode_2012OutgoingLinks(
			View view) {
		serviceProcess.MergeNode modelElement = (serviceProcess.MergeNode) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getAction_3018OutgoingLinks(
			View view) {
		serviceProcess.Action modelElement = (serviceProcess.Action) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getStructuredActivityNode_3019OutgoingLinks(
			View view) {
		serviceProcess.StructuredActivityNode modelElement = (serviceProcess.StructuredActivityNode) view
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getLocalPerformanceAnnotation_3020OutgoingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getObjectNode_3021OutgoingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getInitialNode_3022OutgoingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getFinalNode_3023OutgoingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getDecisionNode_3024OutgoingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getForkNode_3025OutgoingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getJoinNode_3026OutgoingLinks(
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
	public static List<serviceProcess.diagram.part.ServiceProcessLinkDescriptor> getMergeNode_3027OutgoingLinks(
			View view) {
		serviceProcess.MergeNode modelElement = (serviceProcess.MergeNode) view
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
