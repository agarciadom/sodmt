/**
 */
package serviceProcess.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceProcess.ActivityNode;
import serviceProcess.ServiceProcessPackage;
import serviceProcess.StructuredActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceProcess.impl.StructuredActivityNodeImpl#getSubnodes <em>Subnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ExecutableNodeImpl implements StructuredActivityNode
{
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
  protected StructuredActivityNodeImpl()
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
    return ServiceProcessPackage.Literals.STRUCTURED_ACTIVITY_NODE;
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
      subnodes = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, ServiceProcessPackage.STRUCTURED_ACTIVITY_NODE__SUBNODES);
    }
    return subnodes;
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
      case ServiceProcessPackage.STRUCTURED_ACTIVITY_NODE__SUBNODES:
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
      case ServiceProcessPackage.STRUCTURED_ACTIVITY_NODE__SUBNODES:
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
      case ServiceProcessPackage.STRUCTURED_ACTIVITY_NODE__SUBNODES:
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
      case ServiceProcessPackage.STRUCTURED_ACTIVITY_NODE__SUBNODES:
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
      case ServiceProcessPackage.STRUCTURED_ACTIVITY_NODE__SUBNODES:
        return subnodes != null && !subnodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StructuredActivityNodeImpl
