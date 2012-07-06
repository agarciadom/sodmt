/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getDecls <em>Decls</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getTemplate <em>Template</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeFault()
 * @model extendedMetaData="name='typeFault' kind='elementOnly'"
 * @generated
 */
public interface TypeFault extends EObject
{
  /**
   * Returns the value of the '<em><b>Decls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decls</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decls</em>' containment reference.
   * @see #setDecls(TypeDecls)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeFault_Decls()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='decls' namespace='##targetNamespace'"
   * @generated
   */
  TypeDecls getDecls();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getDecls <em>Decls</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decls</em>' containment reference.
   * @see #getDecls()
   * @generated
   */
  void setDecls(TypeDecls value);

  /**
   * Returns the value of the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' containment reference.
   * @see #setTemplate(TypeTemplate)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeFault_Template()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace'"
   * @generated
   */
  TypeTemplate getTemplate();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getTemplate <em>Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' containment reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(TypeTemplate value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeFault_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // TypeFault
