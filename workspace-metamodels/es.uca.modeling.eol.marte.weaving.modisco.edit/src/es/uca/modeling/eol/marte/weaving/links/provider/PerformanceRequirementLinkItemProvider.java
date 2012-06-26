/**
 */
package es.uca.modeling.eol.marte.weaving.links.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Type;

import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;

/**
 * This is the item provider adapter for a {@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformanceRequirementLinkItemProvider
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
  public PerformanceRequirementLinkItemProvider(AdapterFactory adapterFactory)
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

      addMetricPropertyDescriptor(object);
      addExecNodePropertyDescriptor(object);
      addKlazzPropertyDescriptor(object);
      addTestMethodsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Metric feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMetricPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLink_metric_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLink_metric_feature", "_UI_PerformanceRequirementLink_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINK__METRIC,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Exec Node feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addExecNodePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLink_execNode_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLink_execNode_feature", "_UI_PerformanceRequirementLink_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Klazz feature.
   * <!-- begin-user-doc -->
   * Only classes containing at least one JUnit 4 test case may be selected.
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected void addKlazzPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLink_klazz_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLink_klazz_feature", "_UI_PerformanceRequirementLink_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINK__KLAZZ,
         true,
         false,
         true,
         null,
         null,
         null) {
			@SuppressWarnings("unchecked")
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				final Collection<ClassDeclaration> choices = (Collection<ClassDeclaration>)super.getChoiceOfValues(object);
				for (Iterator<ClassDeclaration> it = choices.iterator(); it.hasNext(); ) {
					final ClassDeclaration c = it.next();
					if (!hasJUnit4Test(c)) {
						it.remove();
					}
				}
				return choices;
			}
      });
  }

  /**
   * This adds a property descriptor for the Test Methods feature.
   * <!-- begin-user-doc -->
   * A subset of the methods of the class in the Klazz feature can be selected here. Only these
   * tests will be reused as performance tests. The methods must have the JUnit 4 <code>@Test</code>
   * annotation.
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected void addTestMethodsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PerformanceRequirementLink_testMethods_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PerformanceRequirementLink_testMethods_feature", "_UI_PerformanceRequirementLink_type"),
         LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS,
         true,
         false,
         true,
         null,
         null,
         null) {
			@SuppressWarnings("unchecked")
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				final PerformanceRequirementLink link = (PerformanceRequirementLink)object;
				if (!link.eIsSet(LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINK__KLAZZ)) {
					// No suite set: can't show any methods
					return new ArrayList<MethodDeclaration>();
				}

				final Collection<MethodDeclaration> originalChoices
					= (Collection<MethodDeclaration>)super.getChoiceOfValues(object);

				for (Iterator<MethodDeclaration> it = originalChoices.iterator(); it.hasNext(); ) {
					final MethodDeclaration m = it.next();
					if (!link.getKlazz().equals(m.getAbstractTypeDeclaration()) || !isJUnit4Test(m)) {
						it.remove();
					}
				}
				return originalChoices;
			}

      });
  }

  /**
   * This returns PerformanceRequirementLink.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/PerformanceRequirementLink"));
  }

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		PerformanceRequirementLink link = (PerformanceRequirementLink) object;
		return String.format("Suite '%s' -> node '%s'",
			link.getKlazz() != null ? link.getKlazz().getName()	: "?",
			link.getExecNode() != null ? link.getExecNode().getName() : "?");
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

    switch (notification.getFeatureID(PerformanceRequirementLink.class))
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__METRIC:
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
    return LinksEditPlugin.INSTANCE;
  }

	private boolean isJUnit4Test(MethodDeclaration m) {
		for (Annotation ann : m.getAnnotations()) {
			Type type = ann.getType().getType();
			if ("Test".equals(type.getName())) {
				return true;
			}
		}
		return false;
	}

	private boolean hasJUnit4Test(ClassDeclaration c) {
		if (c != null) {
			for (BodyDeclaration bd : c.getBodyDeclarations()) {
				if (bd instanceof MethodDeclaration
						&& isJUnit4Test((MethodDeclaration) bd)) {
					return true;
				}
			}
		}
		return false;
	}

}
