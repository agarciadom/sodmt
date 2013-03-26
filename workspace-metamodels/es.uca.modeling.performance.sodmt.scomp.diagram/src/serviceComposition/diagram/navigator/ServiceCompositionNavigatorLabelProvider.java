/*
 * 
 */
package serviceComposition.diagram.navigator;

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
		case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?FinalNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3015); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?ForkNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_2009); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?InitialNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3014); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?DecisionNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_2008); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?FinalNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_2007); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?www.uca.es/modeling/performance/sodmt/scomp?ServiceComposition", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ServiceComposition_1000); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?ObjectNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3013); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/performance/sodmt/scomp?ControlFlow", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?StructuredActivityNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/performance/sodmt/scomp?ObjectFlow", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectFlow_4002); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?JoinNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3018); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?ForkNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3017); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?JoinNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_2010); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?ActivityPartition", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPartition_2005); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?InitialNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_3005); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?StructuredActivityNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?DecisionNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3007); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?Action", serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3001); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?FinalNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.FinalNode_3006); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?ObjectNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?Action", serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3010); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?StructuredActivityNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3002); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?Action", serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?DecisionNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.DecisionNode_3016); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?www.uca.es/modeling/performance/sodmt/scomp?ExecutableNode?annotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ExecutableNodeAnnotation_4003); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?LocalPerformanceAnnotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?ForkNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ForkNode_3008); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?LocalPerformanceAnnotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?InitialNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.InitialNode_2006); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?JoinNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.JoinNode_3009); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?ObjectNode", serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?www.uca.es/modeling/performance/sodmt/scomp?PerformanceAnnotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.PerformanceAnnotation_2011); //$NON-NLS-1$
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?www.uca.es/modeling/performance/sodmt/scomp?LocalPerformanceAnnotation", serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3012); //$NON-NLS-1$
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
		case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID:
			return getFinalNode_3015Text(view);
		case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2009Text(view);
		case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID:
			return getInitialNode_3014Text(view);
		case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2008Text(view);
		case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2007Text(view);
		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID:
			return getServiceComposition_1000Text(view);
		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID:
			return getObjectNode_3013Text(view);
		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001Text(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID:
			return getStructuredActivityNode_3011Text(view);
		case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002Text(view);
		case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID:
			return getJoinNode_3018Text(view);
		case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID:
			return getForkNode_3017Text(view);
		case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2010Text(view);
		case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2005Text(view);
		case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3005Text(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_2002Text(view);
		case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3007Text(view);
		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID:
			return getAction_3001Text(view);
		case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3006Text(view);
		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID:
			return getObjectNode_2004Text(view);
		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID:
			return getAction_3010Text(view);
		case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3002Text(view);
		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2001Text(view);
		case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID:
			return getDecisionNode_3016Text(view);
		case serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID:
			return getExecutableNodeAnnotation_4003Text(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_2003Text(view);
		case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3008Text(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3003Text(view);
		case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2006Text(view);
		case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3009Text(view);
		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID:
			return getObjectNode_3004Text(view);
		case serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID:
			return getPerformanceAnnotation_2011Text(view);
		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID:
			return getLocalPerformanceAnnotation_3012Text(view);
		}
		return getUnknownElementText(view);
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
	private String getStructuredActivityNode_2002Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_2002,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecisionNode_2008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getJoinNode_3018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getForkNode_2009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getControlFlow_4001Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ControlFlow_4001,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ControlFlowConditionProbabilityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAction_3010Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3010,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_3014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFinalNode_3015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFinalNode_3006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getJoinNode_3009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFinalNode_2007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectNode_3004Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3004,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ObjectNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerformanceAnnotation_2011Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.PerformanceAnnotation_2011,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.PerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJoinNode_2010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStructuredActivityNode_3011Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3011,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredActivityNode_3002Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.StructuredActivityNode_3002,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_2006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectNode_3013Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_3013,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ObjectNodeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityPartition_2005Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ActivityPartition_2005,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExecutableNodeAnnotation_4003Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ExecutableNodeAnnotation_4003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecisionNode_3007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLocalPerformanceAnnotation_3003Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3003,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectNode_2004Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.ObjectNode_2004,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ObjectNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAction_2001Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_2001,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecisionNode_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLocalPerformanceAnnotation_3012Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_3012,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsers5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_3005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAction_3001Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.Action_3001,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.ActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocalPerformanceAnnotation_2003Text(View view) {
		IParser parser = serviceComposition.diagram.providers.ServiceCompositionParserProvider
				.getParser(
						serviceComposition.diagram.providers.ServiceCompositionElementTypes.LocalPerformanceAnnotation_2003,
						view.getElement() != null ? view.getElement() : view,
						serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
								.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationConcurrentUsersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForkNode_3008Text(View view) {
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
	private String getForkNode_3017Text(View view) {
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
