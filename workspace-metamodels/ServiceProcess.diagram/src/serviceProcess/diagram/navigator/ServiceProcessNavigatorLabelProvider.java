/*
 * 
 */
package serviceProcess.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ServiceProcessNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof serviceProcess.diagram.navigator.ServiceProcessNavigatorItem
				&& !isOwnView(((serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup) {
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup group = (serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup) element;
			return serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) {
			serviceProcess.diagram.navigator.ServiceProcessNavigatorItem navigatorItem = (serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
				.getVisualID(view)) {
		case serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/serviceProcess?ServiceActivity?annotation", serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivityAnnotation_4008); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceProcess?ActivityPerformanceAnnotation", serviceProcess.diagram.providers.ServiceProcessElementTypes.ActivityPerformanceAnnotation_2017); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceProcess?ProcessJoin", serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessJoin_2024); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceProcess?ProcessStart", serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessStart_2020); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?www.uca.es/modeling/serviceProcess?ServiceProcess", serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceProcess_1000); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceProcess?ProcessPerformanceAnnotation", serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessPerformanceAnnotation_2018); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceProcess?ServiceActivity", serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivity_2019); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceProcess?ProcessFinish", serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFinish_2021); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceProcess?ProcessDecision", serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessDecision_2022); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/serviceProcess?ProcessControlFlow", serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessControlFlow_4005); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceProcess?ProcessFork", serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessFork_2023); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& serviceProcess.diagram.providers.ServiceProcessElementTypes
						.isKnownElementType(elementType)) {
			image = serviceProcess.diagram.providers.ServiceProcessElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup) {
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup group = (serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) {
			serviceProcess.diagram.navigator.ServiceProcessNavigatorItem navigatorItem = (serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
				.getVisualID(view)) {
		case serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
			return getServiceActivityAnnotation_4008Text(view);
		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotation_2017Text(view);
		case serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID:
			return getProcessJoin_2024Text(view);
		case serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID:
			return getProcessStart_2020Text(view);
		case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID:
			return getServiceProcess_1000Text(view);
		case serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID:
			return getProcessPerformanceAnnotation_2018Text(view);
		case serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getServiceActivity_2019Text(view);
		case serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID:
			return getProcessFinish_2021Text(view);
		case serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID:
			return getProcessDecision_2022Text(view);
		case serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID:
			return getProcessControlFlow_4005Text(view);
		case serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID:
			return getProcessFork_2023Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProcessControlFlow_4005Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessControlFlow_4005,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowConditionProbabilityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessJoin_2024Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcessPerformanceAnnotation_2018Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ProcessPerformanceAnnotation_2018,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServiceProcess_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcessFork_2023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcessDecision_2022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityPerformanceAnnotation_2017Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ActivityPerformanceAnnotation_2017,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessStart_2020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcessFinish_2021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getServiceActivityAnnotation_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getServiceActivity_2019Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceActivity_2019,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ServiceActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return serviceProcess.diagram.edit.parts.ServiceProcessEditPart.MODEL_ID
				.equals(serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
						.getModelID(view));
	}

}
