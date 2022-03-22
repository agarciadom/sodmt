/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls#getTypedef <em>Typedef</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeDecls()
 * @model extendedMetaData="name='typeDecls' kind='elementOnly'"
 * @generated
 */
public interface TypeDecls extends EObject
{
  /**
   * Returns the value of the '<em><b>Typedef</b></em>' containment reference list.
   * The list contents are of type {@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedef</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedef</em>' containment reference list.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeDecls_Typedef()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='typedef' namespace='##targetNamespace'"
   * @generated
   */
  EList<TypeTypedef> getTypedef();

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeDecls_Variable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
   * @generated
   */
  EList<TypeVariable> getVariable();

} // TypeDecls
