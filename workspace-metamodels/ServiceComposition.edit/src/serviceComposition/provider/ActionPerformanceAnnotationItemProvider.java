/**
 */
package serviceComposition.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import serviceComposition.ActionPerformanceAnnotation;
import serviceComposition.ServiceCompositionPackage;

/**
 * This is the item provider adapter for a {@link serviceComposition.ActionPerformanceAnnotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionPerformanceAnnotationItemProvider
  extends ActivityElementItemProvider
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
  public ActionPerformanceAnnotationItemProvider(AdapterFactory adapterFactory)
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

      addConcurrentUsersPropertyDescriptor(object);
      addSecsTimeLimitPropertyDescriptor(object);
      addMinimumTimePropertyDescriptor(object);
      addWeightPropertyDescriptor(object);
      addActionPropertyDescriptor(object);
      addManuallyAddedPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Concurrent Users feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addConcurrentUsersPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceAnnotation_concurrentUsers_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceAnnotation_concurrentUsers_feature", "_UI_PerformanceAnnotation_type"),
         ServiceCompositionPackage.Literals.PERFORMANCE_ANNOTATION__CONCURRENT_USERS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Secs Time Limit feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSecsTimeLimitPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceAnnotation_secsTimeLimit_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceAnnotation_secsTimeLimit_feature", "_UI_PerformanceAnnotation_type"),
         ServiceCompositionPackage.Literals.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Minimum Time feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMinimumTimePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LocalPerformanceAnnotation_minimumTime_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LocalPerformanceAnnotation_minimumTime_feature", "_UI_LocalPerformanceAnnotation_type"),
         ServiceCompositionPackage.Literals.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Weight feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addWeightPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LocalPerformanceAnnotation_weight_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LocalPerformanceAnnotation_weight_feature", "_UI_LocalPerformanceAnnotation_type"),
         ServiceCompositionPackage.Literals.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Action feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addActionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ActionPerformanceAnnotation_action_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ActionPerformanceAnnotation_action_feature", "_UI_ActionPerformanceAnnotation_type"),
         ServiceCompositionPackage.Literals.ACTION_PERFORMANCE_ANNOTATION__ACTION,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Manually Added feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addManuallyAddedPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ActionPerformanceAnnotation_manuallyAdded_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ActionPerformanceAnnotation_manuallyAdded_feature", "_UI_ActionPerformanceAnnotation_type"),
         ServiceCompositionPackage.Literals.ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns ActionPerformanceAnnotation.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ActionPerformanceAnnotation"));
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
    Double labelValue = ((ActionPerformanceAnnotation)object).getConcurrentUsers();
    String label = labelValue == null ? null : labelValue.toString();
    return label == null || label.length() == 0 ?
      getString("_UI_ActionPerformanceAnnotation_type") :
      getString("_UI_ActionPerformanceAnnotation_type") + " " + label;
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

    switch (notification.getFeatureID(ActionPerformanceAnnotation.class))
    {
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__WEIGHT:
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
  }

}
