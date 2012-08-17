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
	private static final String DEBUG_KEY = "ServiceComposition.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID
					.equals(view.getType())) {
				return serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
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
		if (serviceComposition.ServiceCompositionPackage.eINSTANCE
				.getServiceComposition().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((serviceComposition.ServiceComposition) domainElement)) {
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
		if (!serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"serviceComposition".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID
				.equals(containerModelID)) {
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
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getServiceActivity().isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getCompositionObjectNode().isSuperTypeOf(
							domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getCompositionStart()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getCompositionFinish().isSuperTypeOf(
							domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getCompositionDecision().isSuperTypeOf(
							domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getCompositionFork().isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getCompositionJoin().isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityPerformanceAnnotation().isSuperTypeOf(
							domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getSwimlaneContainer().isSuperTypeOf(
							domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID;
			}
			break;
		case serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID:
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityAction().isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityObjectNode().isSuperTypeOf(
							domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityStart().isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityFinish().isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityDecision()
					.isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityFork().isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActivityJoin().isSuperTypeOf(domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID;
			}
			if (serviceComposition.ServiceCompositionPackage.eINSTANCE
					.getActionPerformanceAnnotation().isSuperTypeOf(
							domainElement.eClass())) {
				return serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID;
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
		if (!serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"serviceComposition".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID
				.equals(containerModelID)) {
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
			if (serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ServiceActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.CompositionObjectNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActivityActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActivityObjectNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsers2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationSecsTimeLimitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationMinimumTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationWeightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationManuallyAddedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.CompositionControlFlowConditionProbabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
			if (serviceComposition.diagram.edit.parts.ActivityControlFlowConditionProbabilityEditPart.VISUAL_ID == nodeVisualID) {
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
		if (serviceComposition.ServiceCompositionPackage.eINSTANCE
				.getCompositionControlFlow().isSuperTypeOf(
						domainElement.eClass())) {
			return serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID;
		}
		if (serviceComposition.ServiceCompositionPackage.eINSTANCE
				.getCompositionObjectFlow().isSuperTypeOf(
						domainElement.eClass())) {
			return serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID;
		}
		if (serviceComposition.ServiceCompositionPackage.eINSTANCE
				.getActivityControlFlow().isSuperTypeOf(domainElement.eClass())) {
			return serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID;
		}
		if (serviceComposition.ServiceCompositionPackage.eINSTANCE
				.getActivityObjectFlow().isSuperTypeOf(domainElement.eClass())) {
			return serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			serviceComposition.ServiceComposition element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
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
		case serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID:
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
		case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
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
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
