/**
 */
package serviceComposition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import serviceComposition.ActivityPerformanceAnnotation;
import serviceComposition.ServiceActivity;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceComposition.impl.ActivityPerformanceAnnotationImpl#getExecNode <em>Exec Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPerformanceAnnotationImpl extends PerformanceAnnotationImpl implements ActivityPerformanceAnnotation
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
    return ServiceCompositionPackage.Literals.ACTIVITY_PERFORMANCE_ANNOTATION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, oldExecNode, execNode));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, oldExecNode, newExecNode);
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
        msgs = ((InternalEObject)execNode).eInverseRemove(this, ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION, ServiceActivity.class, msgs);
      if (newExecNode != null)
        msgs = ((InternalEObject)newExecNode).eInverseAdd(this, ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION, ServiceActivity.class, msgs);
      msgs = basicSetExecNode(newExecNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE, newExecNode, newExecNode));
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
      case ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        if (execNode != null)
          msgs = ((InternalEObject)execNode).eInverseRemove(this, ServiceCompositionPackage.SERVICE_ACTIVITY__ANNOTATION, ServiceActivity.class, msgs);
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
      case ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
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
      case ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
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
      case ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        setExecNode((ServiceActivity)newValue);
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
      case ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        setExecNode((ServiceActivity)null);
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
      case ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE:
        return execNode != null;
    }
    return super.eIsSet(featureID);
  }

} //ActivityPerformanceAnnotationImpl
