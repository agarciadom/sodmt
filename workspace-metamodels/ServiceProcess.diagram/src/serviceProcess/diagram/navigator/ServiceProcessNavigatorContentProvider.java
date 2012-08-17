/*
 * 
 */
package serviceProcess.diagram.navigator;

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
public class ServiceProcessNavigatorContentProvider implements
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
	public ServiceProcessNavigatorContentProvider() {
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
			ArrayList<serviceProcess.diagram.navigator.ServiceProcessNavigatorItem> result = new ArrayList<serviceProcess.diagram.navigator.ServiceProcessNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup) {
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup group = (serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) {
			serviceProcess.diagram.navigator.ServiceProcessNavigatorItem navigatorItem = (serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) parentElement;
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
		switch (serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
				.getVisualID(view)) {

		case serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup target = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ServiceActivityAnnotation_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup source = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ServiceActivityAnnotation_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
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

		case serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup incominglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ActivityPerformanceAnnotation_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup incominglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessJoin_2024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup outgoinglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessJoin_2024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
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

		case serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup incominglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessStart_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup outgoinglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessStart_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
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

		case serviceProcess.diagram.edit.parts.ServiceProcessEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup links = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ServiceProcess_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessPerformanceAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup incominglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ServiceActivity_2019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup outgoinglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ServiceActivity_2019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
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

		case serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup incominglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessFinish_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup outgoinglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessFinish_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
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

		case serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup incominglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessDecision_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup outgoinglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessDecision_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
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

		case serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup target = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessControlFlow_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup source = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessControlFlow_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessJoinEditPart.VISUAL_ID));
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

		case serviceProcess.diagram.edit.parts.ProcessForkEditPart.VISUAL_ID: {
			LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem> result = new LinkedList<serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup incominglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessFork_2023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup outgoinglinks = new serviceProcess.diagram.navigator.ServiceProcessNavigatorGroup(
					serviceProcess.diagram.part.Messages.NavigatorGroupName_ProcessFork_2023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
							.getType(serviceProcess.diagram.edit.parts.ProcessControlFlowEditPart.VISUAL_ID));
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
		return serviceProcess.diagram.edit.parts.ServiceProcessEditPart.MODEL_ID
				.equals(serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<serviceProcess.diagram.navigator.ServiceProcessNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<serviceProcess.diagram.navigator.ServiceProcessNavigatorItem> result = new ArrayList<serviceProcess.diagram.navigator.ServiceProcessNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new serviceProcess.diagram.navigator.ServiceProcessNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<serviceProcess.diagram.navigator.ServiceProcessNavigatorItem> getForeignShortcuts(
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
		if (element instanceof serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem) {
			serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem abstractNavigatorItem = (serviceProcess.diagram.navigator.ServiceProcessAbstractNavigatorItem) element;
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
