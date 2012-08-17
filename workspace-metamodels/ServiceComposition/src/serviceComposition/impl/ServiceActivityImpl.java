/**
 */
package serviceComposition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceComposition.Activity;
import serviceComposition.ActivityElement;
import serviceComposition.ActivityPerformanceAnnotation;
import serviceComposition.NamedElement;
import serviceComposition.ServiceActivity;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceComposition.impl.ServiceActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link serviceComposition.impl.ServiceActivityImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link serviceComposition.impl.ServiceActivityImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceActivityImpl extends CompositionFlowNodeImpl implements ServiceActivity
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected ActivityPerformanceAnnotation annotation;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<ActivityElement> nodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceActivityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ServiceCompositionPackage.Literals.SERVICE_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.SERVICE_ACTIVITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityPerformanceAnnotation getAnnotation()
  {
    if (annotation != null && annotation.eIsProxy())
    {
      InternalEObject oldAnnotation = (InternalEObject)annotation;
      annotation = (ActivityPerformanceAnnotation)eResolveProxy(oldAnnotation);
      if (annotation != oldAnnotation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION, oldAnnotation, annotation));
      }
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityPerformanceAnnotation basicGetAnnotation()
  {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotation(ActivityPerformanceAnnotation newAnnotation, NotificationChain msgs)
  {
    ActivityPerformanceAnnotation oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(ActivityPerformanceAnnotation newAnnotation)
  {
    if (newAnnotation != annotation)
    {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, ActivityPerformanceAnnotation.class, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, ActivityPerformanceAnnotation.class, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION, newAnnotation, newAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityElement> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentWithInverseEList<ActivityElement>(ActivityElement.class, this, ServiceCompositionPackage.SERVICE_ACTIVITY__NODES, ServiceCompositionPackage.ACTIVITY_ELEMENT__ACTIVITY);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION:
        if (annotation != null)
          msgs = ((InternalEObject)annotation).eInverseRemove(this, ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, ActivityPerformanceAnnotation.class, msgs);
        return basicSetAnnotation((ActivityPerformanceAnnotation)otherEnd, msgs);
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NODES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION:
        return basicSetAnnotation(null, msgs);
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NAME:
        return getName();
      case ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION:
        if (resolve) return getAnnotation();
        return basicGetAnnotation();
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NODES:
        return getNodes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NAME:
        setName((String)newValue);
        return;
      case ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION:
        setAnnotation((ActivityPerformanceAnnotation)newValue);
        return;
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends ActivityElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION:
        setAnnotation((ActivityPerformanceAnnotation)null);
        return;
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NODES:
        getNodes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION:
        return annotation != null;
      case ServiceCompositionPackage.SERVICE_ACTIVITY__NODES:
        return nodes != null && !nodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == NamedElement.class)
    {
      switch (derivedFeatureID)
      {
        case ServiceCompositionPackage.SERVICE_ACTIVITY__NAME: return ServiceCompositionPackage.NAMED_ELEMENT__NAME;
        default: return -1;
      }
    }
    if (baseClass == Activity.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case ServiceCompositionPackage.NAMED_ELEMENT__NAME: return ServiceCompositionPackage.SERVICE_ACTIVITY__NAME;
        default: return -1;
      }
    }
    if (baseClass == Activity.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ServiceActivityImpl
