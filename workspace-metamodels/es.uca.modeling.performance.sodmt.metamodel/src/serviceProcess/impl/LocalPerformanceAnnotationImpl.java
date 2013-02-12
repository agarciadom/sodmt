/**
 */
package serviceProcess.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import serviceProcess.ExecutableNode;
import serviceProcess.LocalPerformanceAnnotation;
import serviceProcess.ServiceProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceProcess.impl.LocalPerformanceAnnotationImpl#getMinimumTime <em>Minimum Time</em>}</li>
 *   <li>{@link serviceProcess.impl.LocalPerformanceAnnotationImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link serviceProcess.impl.LocalPerformanceAnnotationImpl#getExecNode <em>Exec Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalPerformanceAnnotationImpl extends PerformanceAnnotationImpl implements LocalPerformanceAnnotation
{
  /**
   * The default value of the '{@link #getMinimumTime() <em>Minimum Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumTime()
   * @generated
   * @ordered
   */
  protected static final Double MINIMUM_TIME_EDEFAULT = new Double(0.0);

  /**
   * The cached value of the '{@link #getMinimumTime() <em>Minimum Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumTime()
   * @generated
   * @ordered
   */
  protected Double minimumTime = MINIMUM_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final Double WEIGHT_EDEFAULT = new Double(1.0);

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected Double weight = WEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getExecNode() <em>Exec Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecNode()
   * @generated
   * @ordered
   */
  protected ExecutableNode execNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalPerformanceAnnotationImpl()
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
    return ServiceProcessPackage.Literals.LOCAL_PERFORMANCE_ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getMinimumTime()
  {
    return minimumTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinimumTime(Double newMinimumTime)
  {
    Double oldMinimumTime = minimumTime;
    minimumTime = newMinimumTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME, oldMinimumTime, minimumTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(Double newWeight)
  {
    Double oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutableNode getExecNode()
  {
    if (execNode != null && execNode.eIsProxy())
    {
      InternalEObject oldExecNode = (InternalEObject)execNode;
      execNode = (ExecutableNode)eResolveProxy(oldExecNode);
      if (execNode != oldExecNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE, oldExecNode, execNode));
      }
    }
    return execNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutableNode basicGetExecNode()
  {
    return execNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExecNode(ExecutableNode newExecNode, NotificationChain msgs)
  {
    ExecutableNode oldExecNode = execNode;
    execNode = newExecNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE, oldExecNode, newExecNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecNode(ExecutableNode newExecNode)
  {
    if (newExecNode != execNode)
    {
      NotificationChain msgs = null;
      if (execNode != null)
        msgs = ((InternalEObject)execNode).eInverseRemove(this, ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION, ExecutableNode.class, msgs);
      if (newExecNode != null)
        msgs = ((InternalEObject)newExecNode).eInverseAdd(this, ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION, ExecutableNode.class, msgs);
      msgs = basicSetExecNode(newExecNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE, newExecNode, newExecNode));
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
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE:
        if (execNode != null)
          msgs = ((InternalEObject)execNode).eInverseRemove(this, ServiceProcessPackage.EXECUTABLE_NODE__ANNOTATION, ExecutableNode.class, msgs);
        return basicSetExecNode((ExecutableNode)otherEnd, msgs);
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
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE:
        return basicSetExecNode(null, msgs);
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
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        return getMinimumTime();
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT:
        return getWeight();
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE:
        if (resolve) return getExecNode();
        return basicGetExecNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        setMinimumTime((Double)newValue);
        return;
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT:
        setWeight((Double)newValue);
        return;
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE:
        setExecNode((ExecutableNode)newValue);
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
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        setMinimumTime(MINIMUM_TIME_EDEFAULT);
        return;
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE:
        setExecNode((ExecutableNode)null);
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
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        return MINIMUM_TIME_EDEFAULT == null ? minimumTime != null : !MINIMUM_TIME_EDEFAULT.equals(minimumTime);
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT:
        return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE:
        return execNode != null;
    }
    return super.eIsSet(featureID);
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
    result.append(" (minimumTime: ");
    result.append(minimumTime);
    result.append(", weight: ");
    result.append(weight);
    result.append(')');
    return result.toString();
  }

} //LocalPerformanceAnnotationImpl
