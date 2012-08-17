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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceComposition.ActivityFlowEdge;
import serviceComposition.ActivityPerformanceAnnotation;
import serviceComposition.CompositionFlowEdge;
import serviceComposition.CompositionFlowNode;
import serviceComposition.ServiceComposition;
import serviceComposition.ServiceCompositionPackage;
import serviceComposition.SwimlaneContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceComposition.impl.ServiceCompositionImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link serviceComposition.impl.ServiceCompositionImpl#getCompositionEdges <em>Composition Edges</em>}</li>
 *   <li>{@link serviceComposition.impl.ServiceCompositionImpl#getActivityEdges <em>Activity Edges</em>}</li>
 *   <li>{@link serviceComposition.impl.ServiceCompositionImpl#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link serviceComposition.impl.ServiceCompositionImpl#getActivityPerformance <em>Activity Performance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceCompositionImpl extends EObjectImpl implements ServiceComposition
{
  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<CompositionFlowNode> nodes;

  /**
   * The cached value of the '{@link #getCompositionEdges() <em>Composition Edges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompositionEdges()
   * @generated
   * @ordered
   */
  protected EList<CompositionFlowEdge> compositionEdges;

  /**
   * The cached value of the '{@link #getActivityEdges() <em>Activity Edges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityEdges()
   * @generated
   * @ordered
   */
  protected EList<ActivityFlowEdge> activityEdges;

  /**
   * The cached value of the '{@link #getSwimlanes() <em>Swimlanes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwimlanes()
   * @generated
   * @ordered
   */
  protected SwimlaneContainer swimlanes;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceCompositionImpl()
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
    return ServiceCompositionPackage.Literals.SERVICE_COMPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompositionFlowNode> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<CompositionFlowNode>(CompositionFlowNode.class, this, ServiceCompositionPackage.SERVICE_COMPOSITION__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompositionFlowEdge> getCompositionEdges()
  {
    if (compositionEdges == null)
    {
      compositionEdges = new EObjectContainmentEList<CompositionFlowEdge>(CompositionFlowEdge.class, this, ServiceCompositionPackage.SERVICE_COMPOSITION__COMPOSITION_EDGES);
    }
    return compositionEdges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityFlowEdge> getActivityEdges()
  {
    if (activityEdges == null)
    {
      activityEdges = new EObjectContainmentEList<ActivityFlowEdge>(ActivityFlowEdge.class, this, ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_EDGES);
    }
    return activityEdges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwimlaneContainer getSwimlanes()
  {
    return swimlanes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwimlanes(SwimlaneContainer newSwimlanes, NotificationChain msgs)
  {
    SwimlaneContainer oldSwimlanes = swimlanes;
    swimlanes = newSwimlanes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES, oldSwimlanes, newSwimlanes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwimlanes(SwimlaneContainer newSwimlanes)
  {
    if (newSwimlanes != swimlanes)
    {
      NotificationChain msgs = null;
      if (swimlanes != null)
        msgs = ((InternalEObject)swimlanes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES, null, msgs);
      if (newSwimlanes != null)
        msgs = ((InternalEObject)newSwimlanes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES, null, msgs);
      msgs = basicSetSwimlanes(newSwimlanes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES, newSwimlanes, newSwimlanes));
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
      activityPerformance = new EObjectContainmentEList<ActivityPerformanceAnnotation>(ActivityPerformanceAnnotation.class, this, ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE);
    }
    return activityPerformance;
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
      case ServiceCompositionPackage.SERVICE_COMPOSITION__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case ServiceCompositionPackage.SERVICE_COMPOSITION__COMPOSITION_EDGES:
        return ((InternalEList<?>)getCompositionEdges()).basicRemove(otherEnd, msgs);
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_EDGES:
        return ((InternalEList<?>)getActivityEdges()).basicRemove(otherEnd, msgs);
      case ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES:
        return basicSetSwimlanes(null, msgs);
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE:
        return ((InternalEList<?>)getActivityPerformance()).basicRemove(otherEnd, msgs);
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
      case ServiceCompositionPackage.SERVICE_COMPOSITION__NODES:
        return getNodes();
      case ServiceCompositionPackage.SERVICE_COMPOSITION__COMPOSITION_EDGES:
        return getCompositionEdges();
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_EDGES:
        return getActivityEdges();
      case ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES:
        return getSwimlanes();
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE:
        return getActivityPerformance();
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
      case ServiceCompositionPackage.SERVICE_COMPOSITION__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends CompositionFlowNode>)newValue);
        return;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__COMPOSITION_EDGES:
        getCompositionEdges().clear();
        getCompositionEdges().addAll((Collection<? extends CompositionFlowEdge>)newValue);
        return;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_EDGES:
        getActivityEdges().clear();
        getActivityEdges().addAll((Collection<? extends ActivityFlowEdge>)newValue);
        return;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES:
        setSwimlanes((SwimlaneContainer)newValue);
        return;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE:
        getActivityPerformance().clear();
        getActivityPerformance().addAll((Collection<? extends ActivityPerformanceAnnotation>)newValue);
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
      case ServiceCompositionPackage.SERVICE_COMPOSITION__NODES:
        getNodes().clear();
        return;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__COMPOSITION_EDGES:
        getCompositionEdges().clear();
        return;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_EDGES:
        getActivityEdges().clear();
        return;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES:
        setSwimlanes((SwimlaneContainer)null);
        return;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE:
        getActivityPerformance().clear();
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
      case ServiceCompositionPackage.SERVICE_COMPOSITION__NODES:
        return nodes != null && !nodes.isEmpty();
      case ServiceCompositionPackage.SERVICE_COMPOSITION__COMPOSITION_EDGES:
        return compositionEdges != null && !compositionEdges.isEmpty();
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_EDGES:
        return activityEdges != null && !activityEdges.isEmpty();
      case ServiceCompositionPackage.SERVICE_COMPOSITION__SWIMLANES:
        return swimlanes != null;
      case ServiceCompositionPackage.SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE:
        return activityPerformance != null && !activityPerformance.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ServiceCompositionImpl
