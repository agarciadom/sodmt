/**
 */
package es.uca.modeling.eol.marte.weaving.links.impl;

import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirement Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceRequirementLinksImpl extends EObjectImpl implements PerformanceRequirementLinks
{
  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<PerformanceRequirementLink> links;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerformanceRequirementLinksImpl()
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
    return LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PerformanceRequirementLink> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<PerformanceRequirementLink>(PerformanceRequirementLink.class, this, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS);
    }
    return links;
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        return getLinks();
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends PerformanceRequirementLink>)newValue);
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        getLinks().clear();
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        return links != null && !links.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PerformanceRequirementLinksImpl
