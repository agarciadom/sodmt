/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.provider;


import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeTypedefItemProvider
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
  public TypeTypedefItemProvider(AdapterFactory adapterFactory)
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

      addElementPropertyDescriptor(object);
      addFractionDigitsPropertyDescriptor(object);
      addMaxPropertyDescriptor(object);
      addMinPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addPatternPropertyDescriptor(object);
      addTotalDigitsPropertyDescriptor(object);
      addTypePropertyDescriptor(object);
      addValuesPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Element feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addElementPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_element_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_element_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__ELEMENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Fraction Digits feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFractionDigitsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_fractionDigits_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_fractionDigits_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__FRACTION_DIGITS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Max feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMaxPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_max_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_max_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__MAX,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Min feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMinPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_min_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_min_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__MIN,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_name_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Pattern feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPatternPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_pattern_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_pattern_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__PATTERN,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Total Digits feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTotalDigitsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_totalDigits_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_totalDigits_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__TOTAL_DIGITS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_type_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_type_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__TYPE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Values feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addValuesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeTypedef_values_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeTypedef_values_feature", "_UI_TypeTypedef_type"),
         MessageCatalogPackage.Literals.TYPE_TYPEDEF__VALUES,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns TypeTypedef.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeTypedef"));
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
    String label = ((TypeTypedef)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_TypeTypedef_type") :
      getString("_UI_TypeTypedef_type") + " " + label;
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

    switch (notification.getFeatureID(TypeTypedef.class))
    {
      case MessageCatalogPackage.TYPE_TYPEDEF__ELEMENT:
      case MessageCatalogPackage.TYPE_TYPEDEF__FRACTION_DIGITS:
      case MessageCatalogPackage.TYPE_TYPEDEF__MAX:
      case MessageCatalogPackage.TYPE_TYPEDEF__MIN:
      case MessageCatalogPackage.TYPE_TYPEDEF__NAME:
      case MessageCatalogPackage.TYPE_TYPEDEF__PATTERN:
      case MessageCatalogPackage.TYPE_TYPEDEF__TOTAL_DIGITS:
      case MessageCatalogPackage.TYPE_TYPEDEF__TYPE:
      case MessageCatalogPackage.TYPE_TYPEDEF__VALUES:
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

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return CatalogEditPlugin.INSTANCE;
  }

}
