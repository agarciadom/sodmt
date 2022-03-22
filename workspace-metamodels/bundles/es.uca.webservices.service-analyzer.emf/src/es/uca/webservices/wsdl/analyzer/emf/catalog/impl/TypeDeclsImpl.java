/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.impl;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable;

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
 * An implementation of the model object '<em><b>Type Decls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeDeclsImpl#getTypedef <em>Typedef</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeDeclsImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeclsImpl extends EObjectImpl implements TypeDecls
{
  /**
   * The cached value of the '{@link #getTypedef() <em>Typedef</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedef()
   * @generated
   * @ordered
   */
  protected EList<TypeTypedef> typedef;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<TypeVariable> variable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDeclsImpl()
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
    return MessageCatalogPackage.Literals.TYPE_DECLS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeTypedef> getTypedef()
  {
    if (typedef == null)
    {
      typedef = new EObjectContainmentEList<TypeTypedef>(TypeTypedef.class, this, MessageCatalogPackage.TYPE_DECLS__TYPEDEF);
    }
    return typedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeVariable> getVariable()
  {
    if (variable == null)
    {
      variable = new EObjectContainmentEList<TypeVariable>(TypeVariable.class, this, MessageCatalogPackage.TYPE_DECLS__VARIABLE);
    }
    return variable;
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
      case MessageCatalogPackage.TYPE_DECLS__TYPEDEF:
        return ((InternalEList<?>)getTypedef()).basicRemove(otherEnd, msgs);
      case MessageCatalogPackage.TYPE_DECLS__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
      case MessageCatalogPackage.TYPE_DECLS__TYPEDEF:
        return getTypedef();
      case MessageCatalogPackage.TYPE_DECLS__VARIABLE:
        return getVariable();
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
      case MessageCatalogPackage.TYPE_DECLS__TYPEDEF:
        getTypedef().clear();
        getTypedef().addAll((Collection<? extends TypeTypedef>)newValue);
        return;
      case MessageCatalogPackage.TYPE_DECLS__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends TypeVariable>)newValue);
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
      case MessageCatalogPackage.TYPE_DECLS__TYPEDEF:
        getTypedef().clear();
        return;
      case MessageCatalogPackage.TYPE_DECLS__VARIABLE:
        getVariable().clear();
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
      case MessageCatalogPackage.TYPE_DECLS__TYPEDEF:
        return typedef != null && !typedef.isEmpty();
      case MessageCatalogPackage.TYPE_DECLS__VARIABLE:
        return variable != null && !variable.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeDeclsImpl
