/*
 * 
 */
package serviceComposition.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ServiceCompositionElementTypes {

	/**
	 * @generated
	 */
	private ServiceCompositionElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ServiceComposition_1000 = getElementType("ServiceComposition.diagram.ServiceComposition_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceActivity_2022 = getElementType("ServiceComposition.diagram.ServiceActivity_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionObjectNode_2031 = getElementType("ServiceComposition.diagram.CompositionObjectNode_2031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionStart_2023 = getElementType("ServiceComposition.diagram.CompositionStart_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionFinish_2024 = getElementType("ServiceComposition.diagram.CompositionFinish_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionDecision_2025 = getElementType("ServiceComposition.diagram.CompositionDecision_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionFork_2026 = getElementType("ServiceComposition.diagram.CompositionFork_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionJoin_2027 = getElementType("ServiceComposition.diagram.CompositionJoin_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityPerformanceAnnotation_2028 = getElementType("ServiceComposition.diagram.ActivityPerformanceAnnotation_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SwimlaneContainer_2030 = getElementType("ServiceComposition.diagram.SwimlaneContainer_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityAction_3001 = getElementType("ServiceComposition.diagram.ActivityAction_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityObjectNode_3008 = getElementType("ServiceComposition.diagram.ActivityObjectNode_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityStart_3002 = getElementType("ServiceComposition.diagram.ActivityStart_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityFinish_3003 = getElementType("ServiceComposition.diagram.ActivityFinish_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityDecision_3004 = getElementType("ServiceComposition.diagram.ActivityDecision_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityFork_3005 = getElementType("ServiceComposition.diagram.ActivityFork_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityJoin_3006 = getElementType("ServiceComposition.diagram.ActivityJoin_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionPerformanceAnnotation_3007 = getElementType("ServiceComposition.diagram.ActionPerformanceAnnotation_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionControlFlow_4007 = getElementType("ServiceComposition.diagram.CompositionControlFlow_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionObjectFlow_4015 = getElementType("ServiceComposition.diagram.CompositionObjectFlow_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityControlFlow_4011 = getElementType("ServiceComposition.diagram.ActivityControlFlow_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityObjectFlow_4012 = getElementType("ServiceComposition.diagram.ActivityObjectFlow_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceActivityAnnotation_4014 = getElementType("ServiceComposition.diagram.ServiceActivityAnnotation_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityActionAnnotation_4008 = getElementType("ServiceComposition.diagram.ActivityActionAnnotation_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ServiceComposition_1000,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getServiceComposition());

			elements.put(ServiceActivity_2022,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getServiceActivity());

			elements.put(CompositionObjectNode_2031,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getCompositionObjectNode());

			elements.put(CompositionStart_2023,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getCompositionStart());

			elements.put(CompositionFinish_2024,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getCompositionFinish());

			elements.put(CompositionDecision_2025,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getCompositionDecision());

			elements.put(CompositionFork_2026,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getCompositionFork());

			elements.put(CompositionJoin_2027,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getCompositionJoin());

			elements.put(ActivityPerformanceAnnotation_2028,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityPerformanceAnnotation());

			elements.put(SwimlaneContainer_2030,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getSwimlaneContainer());

			elements.put(ActivityAction_3001,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityAction());

			elements.put(ActivityObjectNode_3008,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityObjectNode());

			elements.put(ActivityStart_3002,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityStart());

			elements.put(ActivityFinish_3003,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityFinish());

			elements.put(ActivityDecision_3004,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityDecision());

			elements.put(ActivityFork_3005,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityFork());

			elements.put(ActivityJoin_3006,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityJoin());

			elements.put(ActionPerformanceAnnotation_3007,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActionPerformanceAnnotation());

			elements.put(CompositionControlFlow_4007,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getCompositionControlFlow());

			elements.put(CompositionObjectFlow_4015,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getCompositionObjectFlow());

			elements.put(ActivityControlFlow_4011,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityControlFlow());

			elements.put(ActivityObjectFlow_4012,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityObjectFlow());

			elements.put(ServiceActivityAnnotation_4014,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getServiceActivity_Annotation());

			elements.put(ActivityActionAnnotation_4008,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityAction_Annotation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ServiceComposition_1000);
			KNOWN_ELEMENT_TYPES.add(ServiceActivity_2022);
			KNOWN_ELEMENT_TYPES.add(CompositionObjectNode_2031);
			KNOWN_ELEMENT_TYPES.add(CompositionStart_2023);
			KNOWN_ELEMENT_TYPES.add(CompositionFinish_2024);
			KNOWN_ELEMENT_TYPES.add(CompositionDecision_2025);
			KNOWN_ELEMENT_TYPES.add(CompositionFork_2026);
			KNOWN_ELEMENT_TYPES.add(CompositionJoin_2027);
			KNOWN_ELEMENT_TYPES.add(ActivityPerformanceAnnotation_2028);
			KNOWN_ELEMENT_TYPES.add(SwimlaneContainer_2030);
			KNOWN_ELEMENT_TYPES.add(ActivityAction_3001);
			KNOWN_ELEMENT_TYPES.add(ActivityObjectNode_3008);
			KNOWN_ELEMENT_TYPES.add(ActivityStart_3002);
			KNOWN_ELEMENT_TYPES.add(ActivityFinish_3003);
			KNOWN_ELEMENT_TYPES.add(ActivityDecision_3004);
			KNOWN_ELEMENT_TYPES.add(ActivityFork_3005);
			KNOWN_ELEMENT_TYPES.add(ActivityJoin_3006);
			KNOWN_ELEMENT_TYPES.add(ActionPerformanceAnnotation_3007);
			KNOWN_ELEMENT_TYPES.add(CompositionControlFlow_4007);
			KNOWN_ELEMENT_TYPES.add(CompositionObjectFlow_4015);
			KNOWN_ELEMENT_TYPES.add(ActivityControlFlow_4011);
			KNOWN_ELEMENT_TYPES.add(ActivityObjectFlow_4012);
			KNOWN_ELEMENT_TYPES.add(ServiceActivityAnnotation_4014);
			KNOWN_ELEMENT_TYPES.add(ActivityActionAnnotation_4008);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return ServiceComposition_1000;
		case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return ServiceActivity_2022;
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
			return CompositionObjectNode_2031;
		case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID:
			return CompositionStart_2023;
		case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID:
			return CompositionFinish_2024;
		case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID:
			return CompositionDecision_2025;
		case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID:
			return CompositionFork_2026;
		case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID:
			return CompositionJoin_2027;
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return ActivityPerformanceAnnotation_2028;
		case serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID:
			return SwimlaneContainer_2030;
		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
			return ActivityAction_3001;
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
			return ActivityObjectNode_3008;
		case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
			return ActivityStart_3002;
		case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
			return ActivityFinish_3003;
		case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
			return ActivityDecision_3004;
		case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
			return ActivityFork_3005;
		case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
			return ActivityJoin_3006;
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
			return ActionPerformanceAnnotation_3007;
		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
			return CompositionControlFlow_4007;
		case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID:
			return CompositionObjectFlow_4015;
		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
			return ActivityControlFlow_4011;
		case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID:
			return ActivityObjectFlow_4012;
		case serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
			return ServiceActivityAnnotation_4014;
		case serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID:
			return ActivityActionAnnotation_4008;
		}
		return null;
	}

}
