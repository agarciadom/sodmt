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
	public static final IElementType ServiceProcess_1000 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ServiceProcess_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocalPerformanceAnnotation_2001 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.LocalPerformanceAnnotation_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExecutableNode_2002 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ExecutableNode_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectNode_2003 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ObjectNode_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_2004 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.InitialNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FinalNode_2005 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.FinalNode_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_2006 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.DecisionNode_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForkNode_2007 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ForkNode_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JoinNode_2008 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.JoinNode_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PerformanceAnnotation_2009 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.PerformanceAnnotation_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocalPerformanceAnnotation_3001 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.LocalPerformanceAnnotation_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExecutableNode_3002 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ExecutableNode_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectNode_3003 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ObjectNode_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_3004 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.InitialNode_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FinalNode_3005 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.FinalNode_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_3006 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.DecisionNode_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForkNode_3007 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ForkNode_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JoinNode_3008 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.JoinNode_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlFlow_4001 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ControlFlow_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectFlow_4002 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ObjectFlow_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExecutableNodeAnnotation_4003 = getElementType("es.uca.modeling.performance.sodmt.metamodel.diagram.ExecutableNodeAnnotation_4003"); //$NON-NLS-1$

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

			elements.put(LocalPerformanceAnnotation_2001,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getLocalPerformanceAnnotation());

			elements.put(ExecutableNode_2002,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getExecutableNode());

			elements.put(ObjectNode_2003,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getObjectNode());

			elements.put(InitialNode_2004,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getInitialNode());

			elements.put(FinalNode_2005,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getFinalNode());

			elements.put(DecisionNode_2006,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getDecisionNode());

			elements.put(ForkNode_2007,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getForkNode());

			elements.put(JoinNode_2008,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getJoinNode());

			elements.put(PerformanceAnnotation_2009,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getPerformanceAnnotation());

			elements.put(LocalPerformanceAnnotation_3001,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getLocalPerformanceAnnotation());

			elements.put(ExecutableNode_3002,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getExecutableNode());

			elements.put(ObjectNode_3003,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getObjectNode());

			elements.put(InitialNode_3004,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getInitialNode());

			elements.put(FinalNode_3005,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getFinalNode());

			elements.put(DecisionNode_3006,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getDecisionNode());

			elements.put(ForkNode_3007,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getForkNode());

			elements.put(JoinNode_3008,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getJoinNode());

			elements.put(ControlFlow_4001,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getControlFlow());

			elements.put(ObjectFlow_4002,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getObjectFlow());

			elements.put(ExecutableNodeAnnotation_4003,
					serviceProcess.ServiceProcessPackage.eINSTANCE
							.getExecutableNode_Annotation());
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
			KNOWN_ELEMENT_TYPES.add(LocalPerformanceAnnotation_2001);
			KNOWN_ELEMENT_TYPES.add(ExecutableNode_2002);
			KNOWN_ELEMENT_TYPES.add(ObjectNode_2003);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2004);
			KNOWN_ELEMENT_TYPES.add(FinalNode_2005);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_2006);
			KNOWN_ELEMENT_TYPES.add(ForkNode_2007);
			KNOWN_ELEMENT_TYPES.add(JoinNode_2008);
			KNOWN_ELEMENT_TYPES.add(PerformanceAnnotation_2009);
			KNOWN_ELEMENT_TYPES.add(LocalPerformanceAnnotation_3001);
			KNOWN_ELEMENT_TYPES.add(ExecutableNode_3002);
			KNOWN_ELEMENT_TYPES.add(ObjectNode_3003);
			KNOWN_ELEMENT_TYPES.add(InitialNode_3004);
			KNOWN_ELEMENT_TYPES.add(FinalNode_3005);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_3006);
			KNOWN_ELEMENT_TYPES.add(ForkNode_3007);
			KNOWN_ELEMENT_TYPES.add(JoinNode_3008);
			KNOWN_ELEMENT_TYPES.add(ControlFlow_4001);
			KNOWN_ELEMENT_TYPES.add(ObjectFlow_4002);
			KNOWN_ELEMENT_TYPES.add(ExecutableNodeAnnotation_4003);
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
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return LocalPerformanceAnnotation_2001;
		case serviceProcess.diagram.edit.parts.ExecutableNodeEditPart.VISUAL_ID:
			return ExecutableNode_2002;
		case serviceProcess.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return ObjectNode_2003;
		case serviceProcess.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2004;
		case serviceProcess.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return FinalNode_2005;
		case serviceProcess.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return DecisionNode_2006;
		case serviceProcess.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return ForkNode_2007;
		case serviceProcess.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return JoinNode_2008;
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return PerformanceAnnotation_2009;
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return LocalPerformanceAnnotation_3001;
		case serviceProcess.diagram.edit.parts.ExecutableNode2EditPart.VISUAL_ID:
			return ExecutableNode_3002;
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return ObjectNode_3003;
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return InitialNode_3004;
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return FinalNode_3005;
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return DecisionNode_3006;
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return ForkNode_3007;
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return JoinNode_3008;
		case serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return ControlFlow_4001;
		case serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return ObjectFlow_4002;
		case serviceProcess.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
			return ExecutableNodeAnnotation_4003;
		}
		return null;
	}

}
