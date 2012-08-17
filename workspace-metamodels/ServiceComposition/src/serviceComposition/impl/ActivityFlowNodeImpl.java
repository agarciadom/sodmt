/**
 */
package serviceComposition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceComposition.ActivityFlowNode;
import serviceComposition.FlowEdge;
import serviceComposition.FlowNode;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceComposition.impl.ActivityFlowNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link serviceComposition.impl.ActivityFlowNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityFlowNodeImpl extends ActivityElementImpl implements ActivityFlowNode
{
  /**
   * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncoming()
   * @generated
   * @ordered
   */
  protected EList<FlowEdge> incoming;

  /**
   * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoing()
   * @generated
   * @ordered
   */
  protected EList<FlowEdge> outgoing;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityFlowNodeImpl()
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
    return ServiceCompositionPackage.Literals.ACTIVITY_FLOW_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FlowEdge> getIncoming()
  {
    if (incoming == null)
    {
      incoming = new EObjectWithInverseResolvingEList<FlowEdge>(FlowEdge.class, this, ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING, ServiceCompositionPackage.FLOW_EDGE__TARGET);
    }
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FlowEdge> getOutgoing()
  {
    if (outgoing == null)
    {
      outgoing = new EObjectWithInverseResolvingEList<FlowEdge>(FlowEdge.class, this, ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING, ServiceCompositionPackage.FLOW_EDGE__SOURCE);
    }
    return outgoing;
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
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
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
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING:
        return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING:
        return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING:
        return getIncoming();
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING:
        return getOutgoing();
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
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING:
        getIncoming().clear();
        getIncoming().addAll((Collection<? extends FlowEdge>)newValue);
        return;
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING:
        getOutgoing().clear();
        getOutgoing().addAll((Collection<? extends FlowEdge>)newValue);
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
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING:
        getIncoming().clear();
        return;
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING:
        getOutgoing().clear();
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
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING:
        return incoming != null && !incoming.isEmpty();
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING:
        return outgoing != null && !outgoing.isEmpty();
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
    if (baseClass == FlowNode.class)
    {
      switch (derivedFeatureID)
      {
        case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING: return ServiceCompositionPackage.FLOW_NODE__INCOMING;
        case ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING: return ServiceCompositionPackage.FLOW_NODE__OUTGOING;
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
    if (baseClass == FlowNode.class)
    {
      switch (baseFeatureID)
      {
        case ServiceCompositionPackage.FLOW_NODE__INCOMING: return ServiceCompositionPackage.ACTIVITY_FLOW_NODE__INCOMING;
        case ServiceCompositionPackage.FLOW_NODE__OUTGOING: return ServiceCompositionPackage.ACTIVITY_FLOW_NODE__OUTGOING;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ActivityFlowNodeImpl
