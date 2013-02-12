/**
 */
package serviceProcess.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceProcess.ActivityNode;
import serviceProcess.ExecutableNode;
import serviceProcess.LocalPerformanceAnnotation;
import serviceProcess.NamedElement;
import serviceProcess.ServiceProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceProcess.impl.ExecutableNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link serviceProcess.impl.ExecutableNodeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link serviceProcess.impl.ExecutableNodeImpl#getSubnodes <em>Subnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutableNodeImpl extends ActivityNodeImpl implements ExecutableNode
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
  protected LocalPerformanceAnnotation annotation;

  /**
   * The cached value of the '{@link #getSubnodes() <em>Subnodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubnodes()
   * @generated
   * @ordered
   */
  protected EList<ActivityNode> subnodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecutableNodeImpl()
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
    return ServiceProcessPackage.Literals.EXECUTABLE_NODE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.EXECUTABLE_NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalPerformanceAnnotation getAnnotation()
  {
    if (annotation != null && annotation.eIsProxy())
    {
      InternalEObject oldAnnotation = (InternalEObject)annotation;
      annotation = (LocalPerformanceAnnotation)eResolveProxy(oldAnnotation);
      if (annotation != oldAnnotation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION, oldAnnotation, annotation));
      }
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalPerformanceAnnotation basicGetAnnotation()
  {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotation(LocalPerformanceAnnotation newAnnotation, NotificationChain msgs)
  {
    LocalPerformanceAnnotation oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(LocalPerformanceAnnotation newAnnotation)
  {
    if (newAnnotation != annotation)
    {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE, LocalPerformanceAnnotation.class, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE, LocalPerformanceAnnotation.class, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION, newAnnotation, newAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityNode> getSubnodes()
  {
    if (subnodes == null)
    {
      subnodes = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, ServiceProcessPackage.EXECUTABLE_NODE__SUBNODES);
    }
    return subnodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION:
        if (annotation != null)
          msgs = ((InternalEObject)annotation).eInverseRemove(this, ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE, LocalPerformanceAnnotation.class, msgs);
        return basicSetAnnotation((LocalPerformanceAnnotation)otherEnd, msgs);
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
      case ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION:
        return basicSetAnnotation(null, msgs);
      case ServiceProcessPackage.EXECUTABLE_NODE__SUBNODES:
        return ((InternalEList<?>)getSubnodes()).basicRemove(otherEnd, msgs);
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
      case ServiceProcessPackage.EXECUTABLE_NODE__NAME:
        return getName();
      case ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION:
        if (resolve) return getAnnotation();
        return basicGetAnnotation();
      case ServiceProcessPackage.EXECUTABLE_NODE__SUBNODES:
        return getSubnodes();
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
      case ServiceProcessPackage.EXECUTABLE_NODE__NAME:
        setName((String)newValue);
        return;
      case ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION:
        setAnnotation((LocalPerformanceAnnotation)newValue);
        return;
      case ServiceProcessPackage.EXECUTABLE_NODE__SUBNODES:
        getSubnodes().clear();
        getSubnodes().addAll((Collection<? extends ActivityNode>)newValue);
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
      case ServiceProcessPackage.EXECUTABLE_NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION:
        setAnnotation((LocalPerformanceAnnotation)null);
        return;
      case ServiceProcessPackage.EXECUTABLE_NODE__SUBNODES:
        getSubnodes().clear();
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
      case ServiceProcessPackage.EXECUTABLE_NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION:
        return annotation != null;
      case ServiceProcessPackage.EXECUTABLE_NODE__SUBNODES:
        return subnodes != null && !subnodes.isEmpty();
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
        case ServiceProcessPackage.EXECUTABLE_NODE__NAME: return ServiceProcessPackage.NAMED_ELEMENT__NAME;
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
        case ServiceProcessPackage.NAMED_ELEMENT__NAME: return ServiceProcessPackage.EXECUTABLE_NODE__NAME;
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

} //ExecutableNodeImpl
