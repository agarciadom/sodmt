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
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivity_2019);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessStart_2020);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFinish_2021);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessDecision_2022);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFork_2023);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessJoin_2024);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ActivityPerformanceAnnotation_2017);
			types.add(serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessPerformanceAnnotation_2018);
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
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceProcess.diagram.edit.parts.ServiceActivityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessStartEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessStartEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessFinishEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessFinishEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessForkEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessForkEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessJoinEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessJoinEditPart) sourceEditPart)
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
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceProcess.diagram.edit.parts.ServiceActivityEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessStartEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessStartEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessFinishEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessFinishEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessForkEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessForkEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessJoinEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessJoinEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart) {
			return ((serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart) targetEditPart)
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
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceProcess.diagram.edit.parts.ServiceActivityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessStartEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessStartEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessFinishEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessFinishEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessForkEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessForkEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessJoinEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessJoinEditPart) sourceEditPart)
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
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceProcess.diagram.edit.parts.ServiceActivityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessStartEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessStartEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessFinishEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessFinishEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessForkEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessForkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ProcessJoinEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessJoinEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart) {
			return ((serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart) targetEditPart)
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
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ServiceActivityEditPart) {
			return ((serviceProcess.diagram.edit.parts.ServiceActivityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessStartEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessStartEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessFinishEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessFinishEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessDecisionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessForkEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessForkEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof serviceProcess.diagram.edit.parts.ProcessJoinEditPart) {
			return ((serviceProcess.diagram.edit.parts.ProcessJoinEditPart) sourceEditPart)
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
