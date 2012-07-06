/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.impl;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOutputImpl#getDecls <em>Decls</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOutputImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOutputImpl extends EObjectImpl implements TypeOutput
{
  /**
   * The cached value of the '{@link #getDecls() <em>Decls</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecls()
   * @generated
   * @ordered
   */
  protected TypeDecls decls;

  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected TypeTemplate template;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeOutputImpl()
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
    return MessageCatalogPackage.Literals.TYPE_OUTPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecls getDecls()
  {
    return decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecls(TypeDecls newDecls, NotificationChain msgs)
  {
    TypeDecls oldDecls = decls;
    decls = newDecls;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OUTPUT__DECLS, oldDecls, newDecls);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecls(TypeDecls newDecls)
  {
    if (newDecls != decls)
    {
      NotificationChain msgs = null;
      if (decls != null)
        msgs = ((InternalEObject)decls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessageCatalogPackage.TYPE_OUTPUT__DECLS, null, msgs);
      if (newDecls != null)
        msgs = ((InternalEObject)newDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessageCatalogPackage.TYPE_OUTPUT__DECLS, null, msgs);
      msgs = basicSetDecls(newDecls, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OUTPUT__DECLS, newDecls, newDecls));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTemplate getTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplate(TypeTemplate newTemplate, NotificationChain msgs)
  {
    TypeTemplate oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE, oldTemplate, newTemplate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(TypeTemplate newTemplate)
  {
    if (newTemplate != template)
    {
      NotificationChain msgs = null;
      if (template != null)
        msgs = ((InternalEObject)template).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE, null, msgs);
      if (newTemplate != null)
        msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE, null, msgs);
      msgs = basicSetTemplate(newTemplate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE, newTemplate, newTemplate));
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
      case MessageCatalogPackage.TYPE_OUTPUT__DECLS:
        return basicSetDecls(null, msgs);
      case MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE:
        return basicSetTemplate(null, msgs);
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
      case MessageCatalogPackage.TYPE_OUTPUT__DECLS:
        return getDecls();
      case MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE:
        return getTemplate();
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
      case MessageCatalogPackage.TYPE_OUTPUT__DECLS:
        setDecls((TypeDecls)newValue);
        return;
      case MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE:
        setTemplate((TypeTemplate)newValue);
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
      case MessageCatalogPackage.TYPE_OUTPUT__DECLS:
        setDecls((TypeDecls)null);
        return;
      case MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE:
        setTemplate((TypeTemplate)null);
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
      case MessageCatalogPackage.TYPE_OUTPUT__DECLS:
        return decls != null;
      case MessageCatalogPackage.TYPE_OUTPUT__TEMPLATE:
        return template != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeOutputImpl
