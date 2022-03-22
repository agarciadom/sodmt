/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage
 * @generated
 */
public interface MessageCatalogFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MessageCatalogFactory eINSTANCE = es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Services Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Services Type</em>'.
   * @generated
   */
  ServicesType createServicesType();

  /**
   * Returns a new object of class '<em>Type Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Decls</em>'.
   * @generated
   */
  TypeDecls createTypeDecls();

  /**
   * Returns a new object of class '<em>Type Fault</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Fault</em>'.
   * @generated
   */
  TypeFault createTypeFault();

  /**
   * Returns a new object of class '<em>Type Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Input</em>'.
   * @generated
   */
  TypeInput createTypeInput();

  /**
   * Returns a new object of class '<em>Type Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Operation</em>'.
   * @generated
   */
  TypeOperation createTypeOperation();

  /**
   * Returns a new object of class '<em>Type Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Output</em>'.
   * @generated
   */
  TypeOutput createTypeOutput();

  /**
   * Returns a new object of class '<em>Type Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Port</em>'.
   * @generated
   */
  TypePort createTypePort();

  /**
   * Returns a new object of class '<em>Type Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Service</em>'.
   * @generated
   */
  TypeService createTypeService();

  /**
   * Returns a new object of class '<em>Type Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Template</em>'.
   * @generated
   */
  TypeTemplate createTypeTemplate();

  /**
   * Returns a new object of class '<em>Type Typedef</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Typedef</em>'.
   * @generated
   */
  TypeTypedef createTypeTypedef();

  /**
   * Returns a new object of class '<em>Type Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Variable</em>'.
   * @generated
   */
  TypeVariable createTypeVariable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MessageCatalogPackage getMessageCatalogPackage();

} //MessageCatalogFactory
