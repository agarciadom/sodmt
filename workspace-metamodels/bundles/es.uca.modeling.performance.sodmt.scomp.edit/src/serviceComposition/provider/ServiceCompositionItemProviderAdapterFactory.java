/**
 */
package serviceComposition.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import serviceComposition.util.ServiceCompositionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCompositionItemProviderAdapterFactory extends ServiceCompositionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServiceCompositionItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.ServiceComposition} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ServiceCompositionItemProvider serviceCompositionItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.ServiceComposition}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createServiceCompositionAdapter()
  {
		if (serviceCompositionItemProvider == null) {
			serviceCompositionItemProvider = new ServiceCompositionItemProvider(this);
		}

		return serviceCompositionItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.ActivityPartition} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ActivityPartitionItemProvider activityPartitionItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.ActivityPartition}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createActivityPartitionAdapter()
  {
		if (activityPartitionItemProvider == null) {
			activityPartitionItemProvider = new ActivityPartitionItemProvider(this);
		}

		return activityPartitionItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.PerformanceAnnotation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PerformanceAnnotationItemProvider performanceAnnotationItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.PerformanceAnnotation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createPerformanceAnnotationAdapter()
  {
		if (performanceAnnotationItemProvider == null) {
			performanceAnnotationItemProvider = new PerformanceAnnotationItemProvider(this);
		}

		return performanceAnnotationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.LocalPerformanceAnnotation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LocalPerformanceAnnotationItemProvider localPerformanceAnnotationItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.LocalPerformanceAnnotation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createLocalPerformanceAnnotationAdapter()
  {
		if (localPerformanceAnnotationItemProvider == null) {
			localPerformanceAnnotationItemProvider = new LocalPerformanceAnnotationItemProvider(this);
		}

		return localPerformanceAnnotationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.ControlFlow} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ControlFlowItemProvider controlFlowItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.ControlFlow}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createControlFlowAdapter()
  {
		if (controlFlowItemProvider == null) {
			controlFlowItemProvider = new ControlFlowItemProvider(this);
		}

		return controlFlowItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.ObjectFlow} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ObjectFlowItemProvider objectFlowItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.ObjectFlow}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createObjectFlowAdapter()
  {
		if (objectFlowItemProvider == null) {
			objectFlowItemProvider = new ObjectFlowItemProvider(this);
		}

		return objectFlowItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.Action} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ActionItemProvider actionItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.Action}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createActionAdapter()
  {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.StructuredActivityNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StructuredActivityNodeItemProvider structuredActivityNodeItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.StructuredActivityNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createStructuredActivityNodeAdapter()
  {
		if (structuredActivityNodeItemProvider == null) {
			structuredActivityNodeItemProvider = new StructuredActivityNodeItemProvider(this);
		}

		return structuredActivityNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.ObjectNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ObjectNodeItemProvider objectNodeItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.ObjectNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createObjectNodeAdapter()
  {
		if (objectNodeItemProvider == null) {
			objectNodeItemProvider = new ObjectNodeItemProvider(this);
		}

		return objectNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.InitialNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InitialNodeItemProvider initialNodeItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.InitialNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createInitialNodeAdapter()
  {
		if (initialNodeItemProvider == null) {
			initialNodeItemProvider = new InitialNodeItemProvider(this);
		}

		return initialNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.FinalNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FinalNodeItemProvider finalNodeItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.FinalNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createFinalNodeAdapter()
  {
		if (finalNodeItemProvider == null) {
			finalNodeItemProvider = new FinalNodeItemProvider(this);
		}

		return finalNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.DecisionNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DecisionNodeItemProvider decisionNodeItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.DecisionNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createDecisionNodeAdapter()
  {
		if (decisionNodeItemProvider == null) {
			decisionNodeItemProvider = new DecisionNodeItemProvider(this);
		}

		return decisionNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.ForkNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ForkNodeItemProvider forkNodeItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.ForkNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createForkNodeAdapter()
  {
		if (forkNodeItemProvider == null) {
			forkNodeItemProvider = new ForkNodeItemProvider(this);
		}

		return forkNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.JoinNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected JoinNodeItemProvider joinNodeItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.JoinNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createJoinNodeAdapter()
  {
		if (joinNodeItemProvider == null) {
			joinNodeItemProvider = new JoinNodeItemProvider(this);
		}

		return joinNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link serviceComposition.MergeNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MergeNodeItemProvider mergeNodeItemProvider;

  /**
	 * This creates an adapter for a {@link serviceComposition.MergeNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createMergeNodeAdapter()
  {
		if (mergeNodeItemProvider == null) {
			mergeNodeItemProvider = new MergeNodeItemProvider(this);
		}

		return mergeNodeItemProvider;
	}

  /**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ComposeableAdapterFactory getRootAdapterFactory()
  {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

  /**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
		this.parentAdapterFactory = parentAdapterFactory;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object type)
  {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

  /**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
		return super.adapt(notifier, this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object adapt(Object object, Object type)
  {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

  /**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void addListener(INotifyChangedListener notifyChangedListener)
  {
		changeNotifier.addListener(notifyChangedListener);
	}

  /**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void removeListener(INotifyChangedListener notifyChangedListener)
  {
		changeNotifier.removeListener(notifyChangedListener);
	}

  /**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void fireNotifyChanged(Notification notification)
  {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

  /**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void dispose()
  {
		if (serviceCompositionItemProvider != null) serviceCompositionItemProvider.dispose();
		if (activityPartitionItemProvider != null) activityPartitionItemProvider.dispose();
		if (performanceAnnotationItemProvider != null) performanceAnnotationItemProvider.dispose();
		if (localPerformanceAnnotationItemProvider != null) localPerformanceAnnotationItemProvider.dispose();
		if (controlFlowItemProvider != null) controlFlowItemProvider.dispose();
		if (objectFlowItemProvider != null) objectFlowItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (structuredActivityNodeItemProvider != null) structuredActivityNodeItemProvider.dispose();
		if (objectNodeItemProvider != null) objectNodeItemProvider.dispose();
		if (initialNodeItemProvider != null) initialNodeItemProvider.dispose();
		if (finalNodeItemProvider != null) finalNodeItemProvider.dispose();
		if (decisionNodeItemProvider != null) decisionNodeItemProvider.dispose();
		if (forkNodeItemProvider != null) forkNodeItemProvider.dispose();
		if (joinNodeItemProvider != null) joinNodeItemProvider.dispose();
		if (mergeNodeItemProvider != null) mergeNodeItemProvider.dispose();
	}

}
