/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getServicesType()
 * @model extendedMetaData="name='services_._type' kind='elementOnly'"
 * @generated
 */
public interface ServicesType extends EObject
{
  /**
   * Returns the value of the '<em><b>Service</b></em>' containment reference list.
   * The list contents are of type {@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' containment reference list.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getServicesType_Service()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
   * @generated
   */
  EList<TypeService> getService();

} // ServicesType
