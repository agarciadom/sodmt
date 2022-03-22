/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.impl;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOperationImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOperationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOperationImpl extends EObjectImpl implements TypeOperation
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected TypeInput input;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected TypeOutput output;

  /**
   * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFault()
   * @generated
   * @ordered
   */
  protected EList<TypeFault> fault;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeOperationImpl()
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
    return MessageCatalogPackage.Literals.TYPE_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInput getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(TypeInput newInput, NotificationChain msgs)
  {
    TypeInput oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OPERATION__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(TypeInput newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessageCatalogPackage.TYPE_OPERATION__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessageCatalogPackage.TYPE_OPERATION__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OPERATION__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeOutput getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(TypeOutput newOutput, NotificationChain msgs)
  {
    TypeOutput oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OPERATION__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(TypeOutput newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessageCatalogPackage.TYPE_OPERATION__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessageCatalogPackage.TYPE_OPERATION__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OPERATION__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeFault> getFault()
  {
    if (fault == null)
    {
      fault = new EObjectContainmentEList<TypeFault>(TypeFault.class, this, MessageCatalogPackage.TYPE_OPERATION__FAULT);
    }
    return fault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_OPERATION__NAME, oldName, name));
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
      case MessageCatalogPackage.TYPE_OPERATION__INPUT:
        return basicSetInput(null, msgs);
      case MessageCatalogPackage.TYPE_OPERATION__OUTPUT:
        return basicSetOutput(null, msgs);
      case MessageCatalogPackage.TYPE_OPERATION__FAULT:
        return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
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
      case MessageCatalogPackage.TYPE_OPERATION__INPUT:
        return getInput();
      case MessageCatalogPackage.TYPE_OPERATION__OUTPUT:
        return getOutput();
      case MessageCatalogPackage.TYPE_OPERATION__FAULT:
        return getFault();
      case MessageCatalogPackage.TYPE_OPERATION__NAME:
        return getName();
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
      case MessageCatalogPackage.TYPE_OPERATION__INPUT:
        setInput((TypeInput)newValue);
        return;
      case MessageCatalogPackage.TYPE_OPERATION__OUTPUT:
        setOutput((TypeOutput)newValue);
        return;
      case MessageCatalogPackage.TYPE_OPERATION__FAULT:
        getFault().clear();
        getFault().addAll((Collection<? extends TypeFault>)newValue);
        return;
      case MessageCatalogPackage.TYPE_OPERATION__NAME:
        setName((String)newValue);
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
      case MessageCatalogPackage.TYPE_OPERATION__INPUT:
        setInput((TypeInput)null);
        return;
      case MessageCatalogPackage.TYPE_OPERATION__OUTPUT:
        setOutput((TypeOutput)null);
        return;
      case MessageCatalogPackage.TYPE_OPERATION__FAULT:
        getFault().clear();
        return;
      case MessageCatalogPackage.TYPE_OPERATION__NAME:
        setName(NAME_EDEFAULT);
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
      case MessageCatalogPackage.TYPE_OPERATION__INPUT:
        return input != null;
      case MessageCatalogPackage.TYPE_OPERATION__OUTPUT:
        return output != null;
      case MessageCatalogPackage.TYPE_OPERATION__FAULT:
        return fault != null && !fault.isEmpty();
      case MessageCatalogPackage.TYPE_OPERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TypeOperationImpl
