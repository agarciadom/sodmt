/*
 * 
 */
package serviceProcess.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class ServiceProcessModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof serviceProcess.diagram.edit.parts.ServiceProcessEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(10);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.PerformanceAnnotation_2009);
			return types;
		}
		if (editPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeSubnodesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017);
			return types;
		}
		if (editPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeSubnodesCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ActionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ActionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.Action2EditPart) {
			return ((serviceProcess.diagram.edit.parts.Action2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNode2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ActionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.Action2EditPart) {
			return ((serviceProcess.diagram.edit.parts.Action2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNode2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ActionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ActionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.Action2EditPart) {
			return ((serviceProcess.diagram.edit.parts.Action2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNode2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ActionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.Action2EditPart) {
			return ((serviceProcess.diagram.edit.parts.Action2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNode2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ActionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ActionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.InitialNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.FinalNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ForkNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.JoinNodeEditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.Action2EditPart) {
			return ((serviceProcess.diagram.edit.parts.Action2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) {
			return ((serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ObjectNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ObjectNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.InitialNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.InitialNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.FinalNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.FinalNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.DecisionNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.DecisionNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ForkNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.ForkNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.JoinNode2EditPart) {
			return ((serviceProcess.diagram.edit.parts.JoinNode2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(serviceProcess.diagram.part.Messages.ServiceProcessModelingAssistantProviderMessage);
		dialog.setTitle(serviceProcess.diagram.part.Messages.ServiceProcessModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
