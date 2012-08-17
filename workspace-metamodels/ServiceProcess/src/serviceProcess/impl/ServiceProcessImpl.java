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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceProcess.ActivityPerformanceAnnotation;
import serviceProcess.ProcessFlowEdge;
import serviceProcess.ProcessFlowNode;
import serviceProcess.ProcessPerformanceAnnotation;
import serviceProcess.ServiceProcess;
import serviceProcess.ServiceProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceProcess.impl.ServiceProcessImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link serviceProcess.impl.ServiceProcessImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link serviceProcess.impl.ServiceProcessImpl#getActivityPerformance <em>Activity Performance</em>}</li>
 *   <li>{@link serviceProcess.impl.ServiceProcessImpl#getProcessPerformance <em>Process Performance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProcessImpl extends EObjectImpl implements ServiceProcess
{
  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<ProcessFlowNode> nodes;

  /**
   * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdges()
   * @generated
   * @ordered
   */
  protected EList<ProcessFlowEdge> edges;

  /**
   * The cached value of the '{@link #getActivityPerformance() <em>Activity Performance</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityPerformance()
   * @generated
   * @ordered
   */
  protected EList<ActivityPerformanceAnnotation> activityPerformance;

  /**
   * The cached value of the '{@link #getProcessPerformance() <em>Process Performance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessPerformance()
   * @generated
   * @ordered
   */
  protected ProcessPerformanceAnnotation processPerformance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceProcessImpl()
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
    return ServiceProcessPackage.Literals.SERVICE_PROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessFlowNode> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<ProcessFlowNode>(ProcessFlowNode.class, this, ServiceProcessPackage.SERVICE_PROCESS__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessFlowEdge> getEdges()
  {
    if (edges == null)
    {
      edges = new EObjectContainmentEList<ProcessFlowEdge>(ProcessFlowEdge.class, this, ServiceProcessPackage.SERVICE_PROCESS__EDGES);
    }
    return edges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityPerformanceAnnotation> getActivityPerformance()
  {
    if (activityPerformance == null)
    {
      activityPerformance = new EObjectContainmentEList<ActivityPerformanceAnnotation>(ActivityPerformanceAnnotation.class, this, ServiceProcessPackage.SERVICE_PROCESS__ACTIVITY_PERFORMANCE);
    }
    return activityPerformance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessPerformanceAnnotation getProcessPerformance()
  {
    return processPerformance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcessPerformance(ProcessPerformanceAnnotation newProcessPerformance, NotificationChain msgs)
  {
    ProcessPerformanceAnnotation oldProcessPerformance = processPerformance;
    processPerformance = newProcessPerformance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE, oldProcessPerformance, newProcessPerformance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessPerformance(ProcessPerformanceAnnotation newProcessPerformance)
  {
    if (newProcessPerformance != processPerformance)
    {
      NotificationChain msgs = null;
      if (processPerformance != null)
        msgs = ((InternalEObject)processPerformance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE, null, msgs);
      if (newProcessPerformance != null)
        msgs = ((InternalEObject)newProcessPerformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE, null, msgs);
      msgs = basicSetProcessPerformance(newProcessPerformance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE, newProcessPerformance, newProcessPerformance));
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
      case ServiceProcessPackage.SERVICE_PROCESS__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case ServiceProcessPackage.SERVICE_PROCESS__EDGES:
        return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
      case ServiceProcessPackage.SERVICE_PROCESS__ACTIVITY_PERFORMANCE:
        return ((InternalEList<?>)getActivityPerformance()).basicRemove(otherEnd, msgs);
      case ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE:
        return basicSetProcessPerformance(null, msgs);
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
      case ServiceProcessPackage.SERVICE_PROCESS__NODES:
        return getNodes();
      case ServiceProcessPackage.SERVICE_PROCESS__EDGES:
        return getEdges();
      case ServiceProcessPackage.SERVICE_PROCESS__ACTIVITY_PERFORMANCE:
        return getActivityPerformance();
      case ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE:
        return getProcessPerformance();
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
      case ServiceProcessPackage.SERVICE_PROCESS__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends ProcessFlowNode>)newValue);
        return;
      case ServiceProcessPackage.SERVICE_PROCESS__EDGES:
        getEdges().clear();
        getEdges().addAll((Collection<? extends ProcessFlowEdge>)newValue);
        return;
      case ServiceProcessPackage.SERVICE_PROCESS__ACTIVITY_PERFORMANCE:
        getActivityPerformance().clear();
        getActivityPerformance().addAll((Collection<? extends ActivityPerformanceAnnotation>)newValue);
        return;
      case ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE:
        setProcessPerformance((ProcessPerformanceAnnotation)newValue);
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
      case ServiceProcessPackage.SERVICE_PROCESS__NODES:
        getNodes().clear();
        return;
      case ServiceProcessPackage.SERVICE_PROCESS__EDGES:
        getEdges().clear();
        return;
      case ServiceProcessPackage.SERVICE_PROCESS__ACTIVITY_PERFORMANCE:
        getActivityPerformance().clear();
        return;
      case ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE:
        setProcessPerformance((ProcessPerformanceAnnotation)null);
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
      case ServiceProcessPackage.SERVICE_PROCESS__NODES:
        return nodes != null && !nodes.isEmpty();
      case ServiceProcessPackage.SERVICE_PROCESS__EDGES:
        return edges != null && !edges.isEmpty();
      case ServiceProcessPackage.SERVICE_PROCESS__ACTIVITY_PERFORMANCE:
        return activityPerformance != null && !activityPerformance.isEmpty();
      case ServiceProcessPackage.SERVICE_PROCESS__PROCESS_PERFORMANCE:
        return processPerformance != null;
    }
    return super.eIsSet(featureID);
  }

} //ServiceProcessImpl
