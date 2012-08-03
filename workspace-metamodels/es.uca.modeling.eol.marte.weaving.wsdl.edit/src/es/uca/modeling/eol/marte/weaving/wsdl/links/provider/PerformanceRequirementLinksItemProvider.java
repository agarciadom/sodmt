/**
 */
package es.uca.modeling.eol.marte.weaving.wsdl.links.provider;


import es.uca.modeling.eol.marte.weaving.wsdl.links.LinksFactory;
import es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformanceRequirementLinksItemProvider
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
  public PerformanceRequirementLinksItemProvider(AdapterFactory adapterFactory)
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

      addBaseDirPropertyDescriptor(object);
      addProcessesPropertyDescriptor(object);
      addProcessIncrementPropertyDescriptor(object);
      addProcessIncrementIntervalPropertyDescriptor(object);
      addThreadsPerProcessPropertyDescriptor(object);
      addRunsPropertyDescriptor(object);
      addConsoleHostPropertyDescriptor(object);
      addUseConsolePropertyDescriptor(object);
      addUpdateInputsOnSpecChangedPropertyDescriptor(object);
      addNumberInputsOnSpecChangedPropertyDescriptor(object);
      addMavenGroupIdPropertyDescriptor(object);
      addMavenArtifactIdPropertyDescriptor(object);
      addMavenVersionPropertyDescriptor(object);
      addMavenHumanNamePropertyDescriptor(object);
      addMavenHumanDescriptionPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Base Dir feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBaseDirPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_baseDir_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_baseDir_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Processes feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProcessesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_processes_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_processes_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__PROCESSES,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Process Increment feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProcessIncrementPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_processIncrement_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_processIncrement_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Process Increment Interval feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProcessIncrementIntervalPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_processIncrementInterval_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_processIncrementInterval_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Threads Per Process feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addThreadsPerProcessPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_threadsPerProcess_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_threadsPerProcess_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Runs feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRunsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_runs_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_runs_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__RUNS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Console Host feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addConsoleHostPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_consoleHost_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_consoleHost_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Use Console feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUseConsolePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_useConsole_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_useConsole_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Update Inputs On Spec Changed feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUpdateInputsOnSpecChangedPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_updateInputsOnSpecChanged_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_updateInputsOnSpecChanged_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Number Inputs On Spec Changed feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNumberInputsOnSpecChangedPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_numberInputsOnSpecChanged_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_numberInputsOnSpecChanged_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Maven Group Id feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMavenGroupIdPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_mavenGroupId_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_mavenGroupId_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Maven Artifact Id feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMavenArtifactIdPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_mavenArtifactId_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_mavenArtifactId_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Maven Version feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMavenVersionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_mavenVersion_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_mavenVersion_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Maven Human Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMavenHumanNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_mavenHumanName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_mavenHumanName_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Maven Human Description feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMavenHumanDescriptionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLinks_mavenHumanDescription_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLinks_mavenHumanDescription_feature", "_UI_PerformanceRequirementLinks_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
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
      childrenFeatures.add(LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__LINKS);
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
   * This returns PerformanceRequirementLinks.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/PerformanceRequirementLinks"));
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
    String label = ((PerformanceRequirementLinks)object).getMavenHumanName();
    return label == null || label.length() == 0 ?
      getString("_UI_PerformanceRequirementLinks_type") :
      getString("_UI_PerformanceRequirementLinks_type") + " " + label;
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

    switch (notification.getFeatureID(PerformanceRequirementLinks.class))
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESSES:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__RUNS:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME:
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
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
        (LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS__LINKS,
         LinksFactory.eINSTANCE.createPerformanceRequirementLink()));
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
    return LinksEditPlugin.INSTANCE;
  }

}
