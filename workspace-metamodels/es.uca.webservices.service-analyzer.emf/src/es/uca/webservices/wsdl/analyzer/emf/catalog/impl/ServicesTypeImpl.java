/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.impl;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;
import es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService;

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
 * An implementation of the model object '<em><b>Services Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.ServicesTypeImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServicesTypeImpl extends EObjectImpl implements ServicesType
{
  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected EList<TypeService> service;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServicesTypeImpl()
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
    return MessageCatalogPackage.Literals.SERVICES_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeService> getService()
  {
    if (service == null)
    {
      service = new EObjectContainmentEList<TypeService>(TypeService.class, this, MessageCatalogPackage.SERVICES_TYPE__SERVICE);
    }
    return service;
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
      case MessageCatalogPackage.SERVICES_TYPE__SERVICE:
        return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
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
      case MessageCatalogPackage.SERVICES_TYPE__SERVICE:
        return getService();
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
      case MessageCatalogPackage.SERVICES_TYPE__SERVICE:
        getService().clear();
        getService().addAll((Collection<? extends TypeService>)newValue);
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
      case MessageCatalogPackage.SERVICES_TYPE__SERVICE:
        getService().clear();
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
      case MessageCatalogPackage.SERVICES_TYPE__SERVICE:
        return service != null && !service.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ServicesTypeImpl
