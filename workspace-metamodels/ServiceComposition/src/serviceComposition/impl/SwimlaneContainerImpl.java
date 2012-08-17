/**
 */
package serviceComposition.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import serviceComposition.ServiceCompositionPackage;
import serviceComposition.SwimlaneContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swimlane Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceComposition.impl.SwimlaneContainerImpl#getSwimlaneNames <em>Swimlane Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwimlaneContainerImpl extends EObjectImpl implements SwimlaneContainer
{
  /**
   * The cached value of the '{@link #getSwimlaneNames() <em>Swimlane Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwimlaneNames()
   * @generated
   * @ordered
   */
  protected EList<String> swimlaneNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwimlaneContainerImpl()
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
    return ServiceCompositionPackage.Literals.SWIMLANE_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSwimlaneNames()
  {
    if (swimlaneNames == null)
    {
      swimlaneNames = new EDataTypeUniqueEList<String>(String.class, this, ServiceCompositionPackage.SWIMLANE_CONTAINER__SWIMLANE_NAMES);
    }
    return swimlaneNames;
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
      case ServiceCompositionPackage.SWIMLANE_CONTAINER__SWIMLANE_NAMES:
        return getSwimlaneNames();
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
      case ServiceCompositionPackage.SWIMLANE_CONTAINER__SWIMLANE_NAMES:
        getSwimlaneNames().clear();
        getSwimlaneNames().addAll((Collection<? extends String>)newValue);
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
      case ServiceCompositionPackage.SWIMLANE_CONTAINER__SWIMLANE_NAMES:
        getSwimlaneNames().clear();
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
      case ServiceCompositionPackage.SWIMLANE_CONTAINER__SWIMLANE_NAMES:
        return swimlaneNames != null && !swimlaneNames.isEmpty();
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
    result.append(" (swimlaneNames: ");
    result.append(swimlaneNames);
    result.append(')');
    return result.toString();
  }

} //SwimlaneContainerImpl
