/**
 */
package serviceProcess.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import serviceProcess.ServiceProcess;
import serviceProcess.ServiceProcessFactory;
import serviceProcess.ServiceProcessPackage;

/**
 * This is the item provider adapter for a {@link serviceProcess.ServiceProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceProcessItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProcessItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

    }
    return itemPropertyDescriptors;
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES);
      childrenFeatures.add(ServiceProcessPackage.Literals.SERVICE_PROCESS__EDGES);
      childrenFeatures.add(ServiceProcessPackage.Literals.SERVICE_PROCESS__PROCESS_PERFORMANCE);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns ServiceProcess.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceProcess"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    return getString("_UI_ServiceProcess_type");
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(ServiceProcess.class))
    {
      case ServiceProcessPackage.SERVICE_PROCESS__NODES:
      case ServiceProcessPackage.SERVICE_PROCESS__EDGES:
      case ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES,
         ServiceProcessFactory.eINSTANCE.createLocalPerformanceAnnotation()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES,
         ServiceProcessFactory.eINSTANCE.createExecutableNode()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES,
         ServiceProcessFactory.eINSTANCE.createObjectNode()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES,
         ServiceProcessFactory.eINSTANCE.createInitialNode()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES,
         ServiceProcessFactory.eINSTANCE.createFinalNode()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES,
         ServiceProcessFactory.eINSTANCE.createDecisionNode()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES,
         ServiceProcessFactory.eINSTANCE.createForkNode()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES,
         ServiceProcessFactory.eINSTANCE.createJoinNode()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__EDGES,
         ServiceProcessFactory.eINSTANCE.createControlFlow()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__EDGES,
         ServiceProcessFactory.eINSTANCE.createObjectFlow()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__PROCESS_PERFORMANCE,
         ServiceProcessFactory.eINSTANCE.createPerformanceAnnotation()));

    newChildDescriptors.add
      (createChildParameter
        (ServiceProcessPackage.Literals.SERVICE_PROCESS__PROCESS_PERFORMANCE,
         ServiceProcessFactory.eINSTANCE.createLocalPerformanceAnnotation()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == ServiceProcessPackage.Literals.SERVICE_PROCESS__NODES ||
      childFeature == ServiceProcessPackage.Literals.SERVICE_PROCESS__PROCESS_PERFORMANCE;

    if (qualify)
    {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return ServiceProcessEditPlugin.INSTANCE;
  }

}
