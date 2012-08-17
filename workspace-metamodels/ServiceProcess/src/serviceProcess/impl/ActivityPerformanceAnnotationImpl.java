/**
 */
package serviceProcess.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import serviceProcess.ActivityPerformanceAnnotation;
import serviceProcess.ServiceActivity;
import serviceProcess.ServiceProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceProcess.impl.ActivityPerformanceAnnotationImpl#getExecNode <em>Exec Node</em>}</li>
 *   <li>{@link serviceProcess.impl.ActivityPerformanceAnnotationImpl#isManuallyAdded <em>Manually Added</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPerformanceAnnotationImpl extends LocalPerformanceAnnotationImpl implements ActivityPerformanceAnnotation
{
  /**
   * The cached value of the '{@link #getExecNode() <em>Exec Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecNode()
   * @generated
   * @ordered
   */
  protected ServiceActivity execNode;

  /**
   * The default value of the '{@link #isManuallyAdded() <em>Manually Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isManuallyAdded()
   * @generated
   * @ordered
   */
  protected static final boolean MANUALLY_ADDED_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isManuallyAdded() <em>Manually Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isManuallyAdded()
   * @generated
   * @ordered
   */
  protected boolean manuallyAdded = MANUALLY_ADDED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityPerformanceAnnotationImpl()
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
    return ServiceProcessPackage.Literals.ACTIVITY_PERFORMANCE_ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceActivity getExecNode()
  {
    if (execNode != null && execNode.eIsProxy())
    {
      InternalEObject oldExecNode = (InternalEObject)execNode;
      execNode = (ServiceActivity)eResolveProxy(oldExecNode);
      if (execNode != oldExecNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, oldExecNode, execNode));
      }
    }
    return execNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceActivity basicGetExecNode()
  {
    return execNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExecNode(ServiceActivity newExecNode, NotificationChain msgs)
  {
    ServiceActivity oldExecNode = execNode;
    execNode = newExecNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, oldExecNode, newExecNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecNode(ServiceActivity newExecNode)
  {
    if (newExecNode != execNode)
    {
      NotificationChain msgs = null;
      if (execNode != null)
        msgs = ((InternalEObject)execNode).eInverseRemove(this, ServiceProcessPackage.SERVICE_ACTIVITY__ANNOTATION, ServiceActivity.class, msgs);
      if (newExecNode != null)
        msgs = ((InternalEObject)newExecNode).eInverseAdd(this, ServiceProcessPackage.SERVICE_ACTIVITY__ANNOTATION, ServiceActivity.class, msgs);
      msgs = basicSetExecNode(newExecNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, newExecNode, newExecNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isManuallyAdded()
  {
    return manuallyAdded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManuallyAdded(boolean newManuallyAdded)
  {
    boolean oldManuallyAdded = manuallyAdded;
    manuallyAdded = newManuallyAdded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__MANUALLY_ADDED, oldManuallyAdded, manuallyAdded));
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
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        if (execNode != null)
          msgs = ((InternalEObject)execNode).eInverseRemove(this, ServiceProcessPackage.SERVICE_ACTIVITY__ANNOTATION, ServiceActivity.class, msgs);
        return basicSetExecNode((ServiceActivity)otherEnd, msgs);
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
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
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
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        if (resolve) return getExecNode();
        return basicGetExecNode();
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        return isManuallyAdded();
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
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        setExecNode((ServiceActivity)newValue);
        return;
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        setManuallyAdded((Boolean)newValue);
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
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        setExecNode((ServiceActivity)null);
        return;
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        setManuallyAdded(MANUALLY_ADDED_EDEFAULT);
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
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        return execNode != null;
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        return manuallyAdded != MANUALLY_ADDED_EDEFAULT;
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
    result.append(" (manuallyAdded: ");
    result.append(manuallyAdded);
    result.append(')');
    return result.toString();
  }

} //ActivityPerformanceAnnotationImpl
