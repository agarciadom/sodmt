/*
 * 
 */
package serviceComposition.diagram.navigator;

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
public class ServiceCompositionNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem
				&& !isOwnView(((serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) element)
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
		if (element instanceof serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup) {
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup group = (serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup) element;
			return serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) {
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem navigatorItem = (serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) element;
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
		switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getVisualID(view)) {
		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/serviceComposition?CompositionControlFlow", serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?CompositionFork", serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFork_2026); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/serviceComposition?ActivityControlFlow", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?CompositionJoin", serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionJoin_2027); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?CompositionFinish", serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionFinish_2024); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?CompositionStart", serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionStart_2023); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/serviceComposition?ActivityStart", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityStart_3002); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/serviceComposition?ActivityDecision", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityDecision_3004); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/serviceComposition?ActivityFork", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFork_3005); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?CompositionObjectNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectNode_2031); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?ActivityPerformanceAnnotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPerformanceAnnotation_2028); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?www.uca.es/modeling/serviceComposition?ServiceComposition", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceComposition_1000); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/serviceComposition?ActionPerformanceAnnotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActionPerformanceAnnotation_3007); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/serviceComposition?ActivityObjectNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectNode_3008); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/serviceComposition?ActivityObjectFlow", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectFlow_4012); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/serviceComposition?ActivityFinish", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityFinish_3003); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/serviceComposition?ActivityJoin", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityJoin_3006); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?ServiceActivity", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivity_2022); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?CompositionDecision", serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionDecision_2025); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/serviceComposition?SwimlaneContainer", serviceComposition.diagram.providers.ServiceCompositionElementTypes.SwimlaneContainer_2030); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/serviceComposition?ActivityAction?annotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityActionAnnotation_4008); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/serviceComposition?ServiceActivity?annotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivityAnnotation_4014); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/serviceComposition?ActivityAction", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityAction_3001); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/serviceComposition?CompositionObjectFlow", serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectFlow_4015); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& serviceComposition.diagram.providers.ServiceCompositionElementTypes
						.isKnownElementType(elementType)) {
			image = serviceComposition.diagram.providers.ServiceCompositionElementTypes
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
		if (element instanceof serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup) {
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup group = (serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) {
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem navigatorItem = (serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) element;
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
		switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getVisualID(view)) {
		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID:
			return getCompositionControlFlow_4007Text(view);
		case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID:
			return getCompositionFork_2026Text(view);
		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID:
			return getActivityControlFlow_4011Text(view);
		case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID:
			return getCompositionJoin_2027Text(view);
		case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID:
			return getCompositionFinish_2024Text(view);
		case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID:
			return getCompositionStart_2023Text(view);
		case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID:
			return getActivityStart_3002Text(view);
		case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID:
			return getActivityDecision_3004Text(view);
		case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID:
			return getActivityFork_3005Text(view);
		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID:
			return getCompositionObjectNode_2031Text(view);
		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID:
			return getActivityPerformanceAnnotation_2028Text(view);
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return getServiceComposition_1000Text(view);
		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID:
			return getActionPerformanceAnnotation_3007Text(view);
		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID:
			return getActivityObjectNode_3008Text(view);
		case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID:
			return getActivityObjectFlow_4012Text(view);
		case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID:
			return getActivityFinish_3003Text(view);
		case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID:
			return getActivityJoin_3006Text(view);
		case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID:
			return getServiceActivity_2022Text(view);
		case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID:
			return getCompositionDecision_2025Text(view);
		case serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID:
			return getSwimlaneContainer_2030Text(view);
		case serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID:
			return getActivityActionAnnotation_4008Text(view);
		case serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID:
			return getServiceActivityAnnotation_4014Text(view);
		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID:
			return getActivityAction_3001Text(view);
		case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID:
			return getCompositionObjectFlow_4015Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCompositionDecision_2025Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityDecision_3004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositionFork_2026Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositionStart_2023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityPerformanceAnnotation_2028Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPerformanceAnnotation_2028,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositionObjectFlow_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityObjectFlow_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositionJoin_2027Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getServiceActivity_2022Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceActivity_2022,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ServiceActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositionFinish_2024Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityFinish_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityJoin_3006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityActionAnnotation_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityObjectNode_3008Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityObjectNode_3008,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityControlFlow_4011Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityControlFlow_4011,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowConditionProbabilityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityFork_3005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getServiceComposition_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityStart_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwimlaneContainer_2030Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositionObjectNode_2031Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionObjectNode_2031,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositionControlFlow_4007Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.CompositionControlFlow_4007,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowConditionProbabilityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityAction_3001Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityAction_3001,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActivityActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionPerformanceAnnotation_3007Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActionPerformanceAnnotation_3007,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServiceActivityAnnotation_4014Text(View view) {
		return ""; //$NON-NLS-1$
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
		return serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID
				.equals(serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
						.getModelID(view));
	}

}
