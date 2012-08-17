/*
 * 
 */
package serviceComposition.diagram.providers;

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
public class ServiceCompositionModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof serviceComposition.diagram.edit.parts.ServiceCompositionEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivity_2022);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectNode_2031);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionStart_2023);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFinish_2024);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionDecision_2025);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFork_2026);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionJoin_2027);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPerformanceAnnotation_2028);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.SwimlaneContainer_2030);
			return types;
		}
		if (editPart instanceof serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityAction_3001);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectNode_3008);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityStart_3002);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFinish_3003);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityDecision_3004);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFork_3005);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityJoin_3006);
			types.add(serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActionPerformanceAnnotation_3007);
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
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceComposition.diagram.edit.parts.ServiceActivityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionStartEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionFinishEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionForkEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionJoinEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityActionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityStartEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityFinishEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityForkEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityJoinEditPart) sourceEditPart)
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
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceComposition.diagram.edit.parts.ServiceActivityEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionStartEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionFinishEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionForkEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionJoinEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityStartEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityFinishEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityForkEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityJoinEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart) targetEditPart)
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
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceComposition.diagram.edit.parts.ServiceActivityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionStartEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionFinishEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionForkEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionJoinEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityActionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityStartEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityFinishEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityForkEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityJoinEditPart) sourceEditPart)
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
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceComposition.diagram.edit.parts.ServiceActivityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionStartEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionFinishEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionForkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.CompositionJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionJoinEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityStartEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityFinishEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityForkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActivityJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityJoinEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart) targetEditPart)
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
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceComposition.diagram.edit.parts.ServiceActivityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionStartEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionFinishEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionDecisionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionForkEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.CompositionJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.CompositionJoinEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityActionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityActionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityStartEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityStartEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityFinishEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityFinishEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityDecisionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityForkEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityForkEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceComposition.diagram.edit.parts.ActivityJoinEditPart) {
			return ((serviceComposition.diagram.edit.parts.ActivityJoinEditPart) sourceEditPart)
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
				serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(serviceComposition.diagram.part.Messages.ServiceCompositionModelingAssistantProviderMessage);
		dialog.setTitle(serviceComposition.diagram.part.Messages.ServiceCompositionModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
