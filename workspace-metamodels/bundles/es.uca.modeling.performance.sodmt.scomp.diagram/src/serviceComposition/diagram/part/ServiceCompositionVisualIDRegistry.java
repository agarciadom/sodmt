/*
 * 
 */
package serviceComposition.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ServiceCompositionVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.uca.modeling.performance.sodmt.scomp.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID.equals(view.getType())) {
				return serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getServiceComposition().isSuperTypeOf(
				domainElement.eClass()) && isDiagram((serviceComposition.ServiceComposition) domainElement)) {
			return serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getModelID(containerView);
		if (!serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID.equals(containerModelID)
				&& !"sc".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getStructuredActivityNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getObjectNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getActivityPartition()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getPerformanceAnnotation()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID:
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getStructuredActivityNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getObjectNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID:
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getStructuredActivityNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getObjectNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID:
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getStructuredActivityNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getObjectNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.MergeNode3EditPart.VISUAL_ID;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID:
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getStructuredActivityNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getLocalPerformanceAnnotation()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getObjectNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getModelID(containerView);
		if (!serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID.equals(containerModelID)
				&& !"sc".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.StructuredActivityNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationRepsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.PerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.StructuredActivityNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationReps2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ObjectNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.StructuredActivityNodeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationSecsTimeLimit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationMinimumTime3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationWeight3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationReps3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ObjectNodeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.MergeNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ControlFlowConditionProbabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getControlFlow()
				.isSuperTypeOf(domainElement.eClass())) {
			return serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID;
		}
		if (serviceComposition.ServiceCompositionPackage.eINSTANCE.getObjectFlow()
				.isSuperTypeOf(domainElement.eClass())) {
			return serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(serviceComposition.ServiceComposition element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return false;
		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.MergeNode3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
