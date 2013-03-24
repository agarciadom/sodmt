/*
 * 
 */
package serviceComposition.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class ServiceCompositionNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ServiceCompositionNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem> result = new ArrayList<serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup) {
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup group = (serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) {
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem navigatorItem = (serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
				.getVisualID(view)) {

		case serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_DecisionNode_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_DecisionNode_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_Action_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_Action_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_FinalNode_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_FinalNode_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_StructuredActivityNode_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_StructuredActivityNode_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_Action_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_Action_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ControlFlow_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ControlFlow_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_InitialNode_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_InitialNode_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ExecutableNodeAnnotation_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ExecutableNodeAnnotation_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup links = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ServiceComposition_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.PerformanceAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_StructuredActivityNode_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_StructuredActivityNode_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_FinalNode_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_FinalNode_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_LocalPerformanceAnnotation_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_LocalPerformanceAnnotation_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_JoinNode_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_JoinNode_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_InitialNode_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_InitialNode_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ObjectNode_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ObjectNode_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_FinalNode_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_FinalNode_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ObjectFlow_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ObjectFlow_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_JoinNode_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_JoinNode_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_StructuredActivityNode_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_StructuredActivityNode_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNodeStructuredActivityNodeNodesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ObjectNode_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ObjectNode_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.StructuredActivityNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.FinalNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.DecisionNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPartitionActivityPartitionNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.InitialNode3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_InitialNode_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_InitialNode_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_LocalPerformanceAnnotation_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_LocalPerformanceAnnotation_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ForkNode_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ForkNode_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.LocalPerformanceAnnotation2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_LocalPerformanceAnnotation_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_LocalPerformanceAnnotation_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.Action3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_Action_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_Action_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ExecutableNodeAnnotationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_DecisionNode_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_DecisionNode_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.JoinNode3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_JoinNode_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_JoinNode_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ForkNode3EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ForkNode_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ForkNode_3017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ObjectNode2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ObjectNode_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ObjectNode_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ForkNode_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ForkNode_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_DecisionNode_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_DecisionNode_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return serviceComposition.diagram.edit.parts.ServiceCompositionEditPart.MODEL_ID
				.equals(serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem> result = new ArrayList<serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem) {
			serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem abstractNavigatorItem = (serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
