/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput#getDecls <em>Decls</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeOutput()
 * @model extendedMetaData="name='typeOutput' kind='elementOnly'"
 * @generated
 */
public interface TypeOutput extends EObject
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
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeOutput_Decls()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='decls' namespace='##targetNamespace'"
   * @generated
   */
  TypeDecls getDecls();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput#getDecls <em>Decls</em>}' containment reference.
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
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeOutput_Template()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace'"
   * @generated
   */
  TypeTemplate getTemplate();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput#getTemplate <em>Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' containment reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(TypeTemplate value);

} // TypeOutput
