/*
 * 
 */
package serviceProcess.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
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
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?FinalNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_3014); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?DecisionNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_2006); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?InitialNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_3013); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?InitialNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.InitialNode_2004); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/performance/sodmt?ExecutableNode?annotation", serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?PerformanceAnnotation", serviceProcess.diagram.providers.ServiceProcessElementTypes.PerformanceAnnotation_2009); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?Action", serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/performance/sodmt?ControlFlow", serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?JoinNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_3017); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?ObjectNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/performance/sodmt?ObjectFlow", serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectFlow_4002); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?ObjectNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?FinalNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.FinalNode_2005); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?ForkNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_2007); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?LocalPerformanceAnnotation", serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?ForkNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.ForkNode_3016); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?StructuredActivityNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?Action", serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt?JoinNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.JoinNode_2008); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?LocalPerformanceAnnotation", serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?DecisionNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.DecisionNode_3015); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?www.uca.es/modeling/performance/sodmt?ServiceProcess", serviceProcess.diagram.providers.ServiceProcessElementTypes.ServiceProcess_1000); //$NON-NLS-1$
		case serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt?StructuredActivityNode", serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010); //$NON-NLS-1$
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
		case serviceProcess.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3014Text(view);
		case serviceProcess.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2006Text(view);
		case serviceProcess.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3013Text(view);
		case serviceProcess.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004Text(view);
		case serviceProcess.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
			return getExecutableNodeAnnotation_4003Text(view);
		case serviceProcess.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2009Text(view);
		case serviceProcess.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2010Text(view);
		case serviceProcess.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001Text(view);
		case serviceProcess.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3017Text(view);
		case serviceProcess.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getObjectNode_2003Text(view);
		case serviceProcess.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002Text(view);
		case serviceProcess.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3012Text(view);
		case serviceProcess.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2005Text(view);
		case serviceProcess.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2007Text(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2001Text(view);
		case serviceProcess.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3016Text(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_2011Text(view);
		case serviceProcess.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getAction_3009Text(view);
		case serviceProcess.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2008Text(view);
		case serviceProcess.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3011Text(view);
		case serviceProcess.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015Text(view);
		case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID:
			return getServiceProcess_1000Text(view);
		case serviceProcess.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3010Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getExecutableNodeAnnotation_4003Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ExecutableNodeAnnotation_4003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
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
	private String getInitialNode_3013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStructuredActivityNode_2011Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_2011,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.StructuredActivityNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFinalNode_2005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectFlow_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAction_3009Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_3009,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJoinNode_2008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLocalPerformanceAnnotation_3011Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_3011,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJoinNode_3017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStructuredActivityNode_3010Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.StructuredActivityNode_3010,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.StructuredActivityNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAction_2010Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.Action_2010,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectNode_3012Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_3012,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ObjectNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerformanceAnnotation_2009Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.PerformanceAnnotation_2009,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForkNode_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInitialNode_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDecisionNode_3015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLocalPerformanceAnnotation_2001Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.LocalPerformanceAnnotation_2001,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecisionNode_2006Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getFinalNode_3014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectNode_2003Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ObjectNode_2003,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlFlow_4001Text(View view) {
		IParser parser = serviceProcess.diagram.providers.ServiceProcessParserProvider
				.getParser(
						serviceProcess.diagram.providers.ServiceProcessElementTypes.ControlFlow_4001,
						view.getElement() != null ? view.getElement() : view,
						serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
								.getType(serviceProcess.diagram.edit.parts.ControlFlowConditionProbabilityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForkNode_2007Text(View view) {
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
		return serviceProcess.diagram.edit.parts.ServiceProcessEditPart.MODEL_ID
				.equals(serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
						.getModelID(view));
	}

}
