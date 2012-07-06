/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTemplate()
 * @model extendedMetaData="name='typeTemplate' kind='simple'"
 * @generated
 */
public interface TypeTemplate extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTemplate_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="name=':0' kind='simple'"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // TypeTemplate
