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
	public static final IElementType ServiceComposition_1000 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ServiceComposition_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_2001 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.Action_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredActivityNode_2002 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.StructuredActivityNode_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocalPerformanceAnnotation_2003 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.LocalPerformanceAnnotation_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectNode_2004 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ObjectNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityPartition_2005 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ActivityPartition_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_2006 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.InitialNode_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FinalNode_2007 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.FinalNode_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_2008 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.DecisionNode_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForkNode_2009 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ForkNode_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JoinNode_2010 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.JoinNode_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MergeNode_2012 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.MergeNode_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PerformanceAnnotation_2011 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.PerformanceAnnotation_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_3001 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.Action_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredActivityNode_3002 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.StructuredActivityNode_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocalPerformanceAnnotation_3003 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.LocalPerformanceAnnotation_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectNode_3004 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ObjectNode_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_3005 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.InitialNode_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FinalNode_3006 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.FinalNode_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_3007 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.DecisionNode_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForkNode_3008 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ForkNode_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JoinNode_3009 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.JoinNode_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MergeNode_3019 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.MergeNode_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Action_3010 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.Action_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StructuredActivityNode_3011 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.StructuredActivityNode_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocalPerformanceAnnotation_3012 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.LocalPerformanceAnnotation_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectNode_3013 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ObjectNode_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialNode_3014 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.InitialNode_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FinalNode_3015 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.FinalNode_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_3016 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.DecisionNode_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForkNode_3017 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ForkNode_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JoinNode_3018 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.JoinNode_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MergeNode_3020 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.MergeNode_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ControlFlow_4001 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ControlFlow_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectFlow_4002 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ObjectFlow_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExecutableNodeAnnotation_4003 = getElementType("es.uca.modeling.performance.sodmt.scomp.diagram.ExecutableNodeAnnotation_4003"); //$NON-NLS-1$

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

			elements.put(Action_2001,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getAction());

			elements.put(StructuredActivityNode_2002,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getStructuredActivityNode());

			elements.put(LocalPerformanceAnnotation_2003,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getLocalPerformanceAnnotation());

			elements.put(ObjectNode_2004,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getObjectNode());

			elements.put(ActivityPartition_2005,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getActivityPartition());

			elements.put(InitialNode_2006,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getInitialNode());

			elements.put(FinalNode_2007,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getFinalNode());

			elements.put(DecisionNode_2008,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getDecisionNode());

			elements.put(ForkNode_2009,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getForkNode());

			elements.put(JoinNode_2010,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getJoinNode());

			elements.put(MergeNode_2012,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getMergeNode());

			elements.put(PerformanceAnnotation_2011,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getPerformanceAnnotation());

			elements.put(Action_3001,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getAction());

			elements.put(StructuredActivityNode_3002,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getStructuredActivityNode());

			elements.put(LocalPerformanceAnnotation_3003,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getLocalPerformanceAnnotation());

			elements.put(ObjectNode_3004,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getObjectNode());

			elements.put(InitialNode_3005,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getInitialNode());

			elements.put(FinalNode_3006,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getFinalNode());

			elements.put(DecisionNode_3007,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getDecisionNode());

			elements.put(ForkNode_3008,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getForkNode());

			elements.put(JoinNode_3009,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getJoinNode());

			elements.put(MergeNode_3019,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getMergeNode());

			elements.put(Action_3010,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getAction());

			elements.put(StructuredActivityNode_3011,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getStructuredActivityNode());

			elements.put(LocalPerformanceAnnotation_3012,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getLocalPerformanceAnnotation());

			elements.put(ObjectNode_3013,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getObjectNode());

			elements.put(InitialNode_3014,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getInitialNode());

			elements.put(FinalNode_3015,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getFinalNode());

			elements.put(DecisionNode_3016,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getDecisionNode());

			elements.put(ForkNode_3017,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getForkNode());

			elements.put(JoinNode_3018,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getJoinNode());

			elements.put(MergeNode_3020,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getMergeNode());

			elements.put(ControlFlow_4001,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getControlFlow());

			elements.put(ObjectFlow_4002,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
							.getObjectFlow());

			elements.put(ExecutableNodeAnnotation_4003,
					serviceComposition.ServiceCompositionPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(ServiceComposition_1000);
			KNOWN_ELEMENT_TYPES.add(Action_2001);
			KNOWN_ELEMENT_TYPES.add(StructuredActivityNode_2002);
			KNOWN_ELEMENT_TYPES.add(LocalPerformanceAnnotation_2003);
			KNOWN_ELEMENT_TYPES.add(ObjectNode_2004);
			KNOWN_ELEMENT_TYPES.add(ActivityPartition_2005);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2006);
			KNOWN_ELEMENT_TYPES.add(FinalNode_2007);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_2008);
			KNOWN_ELEMENT_TYPES.add(ForkNode_2009);
			KNOWN_ELEMENT_TYPES.add(JoinNode_2010);
			KNOWN_ELEMENT_TYPES.add(MergeNode_2012);
			KNOWN_ELEMENT_TYPES.add(PerformanceAnnotation_2011);
			KNOWN_ELEMENT_TYPES.add(Action_3001);
			KNOWN_ELEMENT_TYPES.add(StructuredActivityNode_3002);
			KNOWN_ELEMENT_TYPES.add(LocalPerformanceAnnotation_3003);
			KNOWN_ELEMENT_TYPES.add(ObjectNode_3004);
			KNOWN_ELEMENT_TYPES.add(InitialNode_3005);
			KNOWN_ELEMENT_TYPES.add(FinalNode_3006);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_3007);
			KNOWN_ELEMENT_TYPES.add(ForkNode_3008);
			KNOWN_ELEMENT_TYPES.add(JoinNode_3009);
			KNOWN_ELEMENT_TYPES.add(MergeNode_3019);
			KNOWN_ELEMENT_TYPES.add(Action_3010);
			KNOWN_ELEMENT_TYPES.add(StructuredActivityNode_3011);
			KNOWN_ELEMENT_TYPES.add(LocalPerformanceAnnotation_3012);
			KNOWN_ELEMENT_TYPES.add(ObjectNode_3013);
			KNOWN_ELEMENT_TYPES.add(InitialNode_3014);
			KNOWN_ELEMENT_TYPES.add(FinalNode_3015);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_3016);
			KNOWN_ELEMENT_TYPES.add(ForkNode_3017);
			KNOWN_ELEMENT_TYPES.add(JoinNode_3018);
			KNOWN_ELEMENT_TYPES.add(MergeNode_3020);
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
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return ServiceComposition_1000;
		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return Action_2001;
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_2002;
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return LocalPerformanceAnnotation_2003;
		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return ObjectNode_2004;
		case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return ActivityPartition_2005;
		case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2006;
		case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return FinalNode_2007;
		case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return DecisionNode_2008;
		case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return ForkNode_2009;
		case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return JoinNode_2010;
		case serviceComposition.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return MergeNode_2012;
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return PerformanceAnnotation_2011;
		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return Action_3001;
		case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return StructuredActivityNode_3002;
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return LocalPerformanceAnnotation_3003;
		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return ObjectNode_3004;
		case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return InitialNode_3005;
		case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return FinalNode_3006;
		case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return DecisionNode_3007;
		case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return ForkNode_3008;
		case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return JoinNode_3009;
		case serviceComposition.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return MergeNode_3019;
		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
			return Action_3010;
		case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID:
			return StructuredActivityNode_3011;
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
			return LocalPerformanceAnnotation_3012;
		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
			return ObjectNode_3013;
		case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID:
			return InitialNode_3014;
		case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID:
			return FinalNode_3015;
		case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID:
			return DecisionNode_3016;
		case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID:
			return ForkNode_3017;
		case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID:
			return JoinNode_3018;
		case serviceComposition.diagram.edit.parts.MergeNode3EditPart.VISUAL_ID:
			return MergeNode_3020;
		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return ControlFlow_4001;
		case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return ObjectFlow_4002;
		case serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
			return ExecutableNodeAnnotation_4003;
		}
		return null;
	}

}
