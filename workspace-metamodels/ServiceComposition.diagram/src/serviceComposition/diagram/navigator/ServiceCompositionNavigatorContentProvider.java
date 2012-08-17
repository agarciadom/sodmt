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

		case serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionControlFlow_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionControlFlow_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionFork_2026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionFork_2026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityControlFlow_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityControlFlow_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionJoin_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionJoin_2027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionFinish_2024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionFinish_2024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionStart_2023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionStart_2023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityStart_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityStart_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityDecision_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityDecision_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityFork_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityFork_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionObjectNode_2031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionObjectNode_2031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityPerformanceAnnotation_2028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
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
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.SwimlaneContainerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActionPerformanceAnnotation_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityObjectNode_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityObjectNode_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityObjectFlow_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityObjectFlow_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityFinish_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityFinish_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityJoin_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityJoin_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ServiceActivity_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ServiceActivity_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityServiceActivityNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionDecision_2025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionDecision_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityActionAnnotation_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityActionAnnotation_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActionPerformanceAnnotationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ServiceActivityAnnotationEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ServiceActivityAnnotation_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ServiceActivityAnnotation_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityPerformanceAnnotationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Node sv = (Node) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup incominglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityAction_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup outgoinglinks = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_ActivityAction_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionAnnotationEditPart.VISUAL_ID));
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

		case serviceComposition.diagram.edit.parts.CompositionObjectFlowEditPart.VISUAL_ID: {
			LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem> result = new LinkedList<serviceComposition.diagram.navigator.ServiceCompositionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup target = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionObjectFlow_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup source = new serviceComposition.diagram.navigator.ServiceCompositionNavigatorGroup(
					serviceComposition.diagram.part.Messages.NavigatorGroupName_CompositionObjectFlow_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ServiceActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.CompositionJoinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityObjectNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityStartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityFinishEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityForkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
							.getType(serviceComposition.diagram.edit.parts.ActivityJoinEditPart.VISUAL_ID));
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
