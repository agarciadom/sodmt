/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.util;

import es.uca.webservices.wsdl.analyzer.emf.catalog.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage
 * @generated
 */
public class MessageCatalogSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MessageCatalogPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageCatalogSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MessageCatalogPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MessageCatalogPackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.SERVICES_TYPE:
      {
        ServicesType servicesType = (ServicesType)theEObject;
        T result = caseServicesType(servicesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_DECLS:
      {
        TypeDecls typeDecls = (TypeDecls)theEObject;
        T result = caseTypeDecls(typeDecls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_FAULT:
      {
        TypeFault typeFault = (TypeFault)theEObject;
        T result = caseTypeFault(typeFault);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_INPUT:
      {
        TypeInput typeInput = (TypeInput)theEObject;
        T result = caseTypeInput(typeInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_OPERATION:
      {
        TypeOperation typeOperation = (TypeOperation)theEObject;
        T result = caseTypeOperation(typeOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_OUTPUT:
      {
        TypeOutput typeOutput = (TypeOutput)theEObject;
        T result = caseTypeOutput(typeOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_PORT:
      {
        TypePort typePort = (TypePort)theEObject;
        T result = caseTypePort(typePort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_SERVICE:
      {
        TypeService typeService = (TypeService)theEObject;
        T result = caseTypeService(typeService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_TEMPLATE:
      {
        TypeTemplate typeTemplate = (TypeTemplate)theEObject;
        T result = caseTypeTemplate(typeTemplate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_TYPEDEF:
      {
        TypeTypedef typeTypedef = (TypeTypedef)theEObject;
        T result = caseTypeTypedef(typeTypedef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MessageCatalogPackage.TYPE_VARIABLE:
      {
        TypeVariable typeVariable = (TypeVariable)theEObject;
        T result = caseTypeVariable(typeVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Services Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Services Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServicesType(ServicesType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDecls(TypeDecls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Fault</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Fault</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeFault(TypeFault object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeInput(TypeInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeOperation(TypeOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeOutput(TypeOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypePort(TypePort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeService(TypeService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeTemplate(TypeTemplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Typedef</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Typedef</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeTypedef(TypeTypedef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeVariable(TypeVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MessageCatalogSwitch
