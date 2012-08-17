/*
 * 
 */
package serviceProcess.diagram.providers;

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
public class ServiceProcessElementTypes {

	/**
	 * @generated
	 */
	private ServiceProcessElementTypes() {
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
	public static final IElementType ServiceProcess_1000 = getElementType("ServiceProcess.diagram.ServiceProcess_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceActivity_2019 = getElementType("ServiceProcess.diagram.ServiceActivity_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessStart_2020 = getElementType("ServiceProcess.diagram.ProcessStart_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessFinish_2021 = getElementType("ServiceProcess.diagram.ProcessFinish_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessDecision_2022 = getElementType("ServiceProcess.diagram.ProcessDecision_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessFork_2023 = getElementType("ServiceProcess.diagram.ProcessFork_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessJoin_2024 = getElementType("ServiceProcess.diagram.ProcessJoin_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityPerformanceAnnotation_2017 = getElementType("ServiceProcess.diagram.ActivityPerformanceAnnotation_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessPerformanceAnnotation_2018 = getElementType("ServiceProcess.diagram.ProcessPerformanceAnnotation_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessControlFlow_4005 = getElementType("ServiceProcess.diagram.ProcessControlFlow_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceActivityAnnotation_4008 = getElementType("ServiceProcess.diagram.ServiceActivityAnnotation_4008"); //$NON-NLS-1$

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
				return serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
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

			elements.put(ServiceProcess_1000,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getServiceProcess());

			elements.put(ServiceActivity_2019,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getServiceActivity());

			elements.put(ProcessStart_2020,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getProcessStart());

			elements.put(ProcessFinish_2021,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getProcessFinish());

			elements.put(ProcessDecision_2022,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getProcessDecision());

			elements.put(ProcessFork_2023,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getProcessFork());

			elements.put(ProcessJoin_2024,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getProcessJoin());

			elements.put(ActivityPerformanceAnnotation_2017,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getActivityPerformanceAnnotation());

			elements.put(ProcessPerformanceAnnotation_2018,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getProcessPerformanceAnnotation());

			elements.put(ProcessControlFlow_4005,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getProcessControlFlow());

			elements.put(ServiceActivityAnnotation_4008,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getServiceActivity_Annotation());
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
			KNOWN_ELEMENT_TYPES.add(ServiceProcess_1000);
			KNOWN_ELEMENT_TYPES.add(ServiceActivity_2019);
			KNOWN_ELEMENT_TYPES.add(ProcessStart_2020);
			KNOWN_ELEMENT_TYPES.add(ProcessFinish_2021);
			KNOWN_ELEMENT_TYPES.add(ProcessDecision_2022);
			KNOWN_ELEMENT_TYPES.add(ProcessFork_2023);
			KNOWN_ELEMENT_TYPES.add(ProcessJoin_2024);
			KNOWN_ELEMENT_TYPES.add(ActivityPerformanceAnnotation_2017);
			KNOWN_ELEMENT_TYPES.add(ProcessPerformanceAnnotation_2018);
			KNOWN_ELEMENT_TYPES.add(ProcessControlFlow_4005);
			KNOWN_ELEMENT_TYPES.add(ServiceActivityAnnotation_4008);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID:
			return ServiceProcess_1000;
		case serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return ServiceActivity_2019;
		case serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID:
			return ProcessStart_2020;
		case serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID:
			return ProcessFinish_2021;
		case serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID:
			return ProcessDecision_2022;
		case serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID:
			return ProcessFork_2023;
		case serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID:
			return ProcessJoin_2024;
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return ActivityPerformanceAnnotation_2017;
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID:
			return ProcessPerformanceAnnotation_2018;
		case serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID:
			return ProcessControlFlow_4005;
		case serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
			return ServiceActivityAnnotation_4008;
		}
		return null;
	}

}
