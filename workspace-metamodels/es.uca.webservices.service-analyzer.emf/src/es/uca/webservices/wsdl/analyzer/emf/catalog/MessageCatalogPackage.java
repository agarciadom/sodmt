/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogFactory
 * @model kind="package"
 * @generated
 */
public interface MessageCatalogPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "catalog";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://serviceAnalyzer/messageCatalog";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "catalog";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MessageCatalogPackage eINSTANCE = es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl.init();

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.DocumentRootImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SERVICES = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.ServicesTypeImpl <em>Services Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.ServicesTypeImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getServicesType()
   * @generated
   */
  int SERVICES_TYPE = 1;

  /**
   * The feature id for the '<em><b>Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICES_TYPE__SERVICE = 0;

  /**
   * The number of structural features of the '<em>Services Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICES_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeDeclsImpl <em>Type Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeDeclsImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeDecls()
   * @generated
   */
  int TYPE_DECLS = 2;

  /**
   * The feature id for the '<em><b>Typedef</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLS__TYPEDEF = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLS__VARIABLE = 1;

  /**
   * The number of structural features of the '<em>Type Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeFaultImpl <em>Type Fault</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeFaultImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeFault()
   * @generated
   */
  int TYPE_FAULT = 3;

  /**
   * The feature id for the '<em><b>Decls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FAULT__DECLS = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FAULT__TEMPLATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FAULT__NAME = 2;

  /**
   * The number of structural features of the '<em>Type Fault</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FAULT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeInputImpl <em>Type Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeInputImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeInput()
   * @generated
   */
  int TYPE_INPUT = 4;

  /**
   * The feature id for the '<em><b>Decls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INPUT__DECLS = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INPUT__TEMPLATE = 1;

  /**
   * The number of structural features of the '<em>Type Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOperationImpl <em>Type Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOperationImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeOperation()
   * @generated
   */
  int TYPE_OPERATION = 5;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION__INPUT = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION__OUTPUT = 1;

  /**
   * The feature id for the '<em><b>Fault</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION__FAULT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION__NAME = 3;

  /**
   * The number of structural features of the '<em>Type Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOutputImpl <em>Type Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOutputImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeOutput()
   * @generated
   */
  int TYPE_OUTPUT = 6;

  /**
   * The feature id for the '<em><b>Decls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OUTPUT__DECLS = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OUTPUT__TEMPLATE = 1;

  /**
   * The number of structural features of the '<em>Type Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OUTPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypePortImpl <em>Type Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypePortImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypePort()
   * @generated
   */
  int TYPE_PORT = 7;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PORT__OPERATION = 0;

  /**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PORT__ADDRESS = 1;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPE_PORT__NAME = 2;

  /**
   * The number of structural features of the '<em>Type Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPE_PORT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeServiceImpl <em>Type Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeServiceImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeService()
   * @generated
   */
  int TYPE_SERVICE = 8;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SERVICE__PORT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SERVICE__NAME = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SERVICE__URI = 2;

  /**
   * The number of structural features of the '<em>Type Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SERVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTemplateImpl <em>Type Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTemplateImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeTemplate()
   * @generated
   */
  int TYPE_TEMPLATE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TEMPLATE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Type Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TEMPLATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl <em>Type Typedef</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeTypedef()
   * @generated
   */
  int TYPE_TYPEDEF = 10;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__FRACTION_DIGITS = 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__MAX = 2;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__MIN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__NAME = 4;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__PATTERN = 5;

  /**
   * The feature id for the '<em><b>Total Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__TOTAL_DIGITS = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__TYPE = 7;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF__VALUES = 8;

  /**
   * The number of structural features of the '<em>Type Typedef</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TYPEDEF_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeVariableImpl <em>Type Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeVariableImpl
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeVariable()
   * @generated
   */
  int TYPE_VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_VARIABLE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Type Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA <em>Type GA</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeGA()
   * @generated
   */
  int TYPE_GA = 12;

  /**
   * The meta object id for the '<em>Type GA Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeGAObject()
   * @generated
   */
  int TYPE_GA_OBJECT = 13;


  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Services</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot#getServices()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Services();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType <em>Services Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Services Type</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType
   * @generated
   */
  EClass getServicesType();

  /**
   * Returns the meta object for the containment reference list '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType#getService()
   * @see #getServicesType()
   * @generated
   */
  EReference getServicesType_Service();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls <em>Type Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Decls</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls
   * @generated
   */
  EClass getTypeDecls();

  /**
   * Returns the meta object for the containment reference list '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls#getTypedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typedef</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls#getTypedef()
   * @see #getTypeDecls()
   * @generated
   */
  EReference getTypeDecls_Typedef();

  /**
   * Returns the meta object for the containment reference list '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls#getVariable()
   * @see #getTypeDecls()
   * @generated
   */
  EReference getTypeDecls_Variable();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault <em>Type Fault</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Fault</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault
   * @generated
   */
  EClass getTypeFault();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getDecls <em>Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decls</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getDecls()
   * @see #getTypeFault()
   * @generated
   */
  EReference getTypeFault_Decls();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getTemplate()
   * @see #getTypeFault()
   * @generated
   */
  EReference getTypeFault_Template();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault#getName()
   * @see #getTypeFault()
   * @generated
   */
  EAttribute getTypeFault_Name();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput <em>Type Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Input</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput
   * @generated
   */
  EClass getTypeInput();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput#getDecls <em>Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decls</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput#getDecls()
   * @see #getTypeInput()
   * @generated
   */
  EReference getTypeInput_Decls();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput#getTemplate()
   * @see #getTypeInput()
   * @generated
   */
  EReference getTypeInput_Template();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation <em>Type Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Operation</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation
   * @generated
   */
  EClass getTypeOperation();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation#getInput()
   * @see #getTypeOperation()
   * @generated
   */
  EReference getTypeOperation_Input();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation#getOutput()
   * @see #getTypeOperation()
   * @generated
   */
  EReference getTypeOperation_Output();

  /**
   * Returns the meta object for the containment reference list '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation#getFault <em>Fault</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fault</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation#getFault()
   * @see #getTypeOperation()
   * @generated
   */
  EReference getTypeOperation_Fault();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation#getName()
   * @see #getTypeOperation()
   * @generated
   */
  EAttribute getTypeOperation_Name();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput <em>Type Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Output</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput
   * @generated
   */
  EClass getTypeOutput();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput#getDecls <em>Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decls</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput#getDecls()
   * @see #getTypeOutput()
   * @generated
   */
  EReference getTypeOutput_Decls();

  /**
   * Returns the meta object for the containment reference '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput#getTemplate()
   * @see #getTypeOutput()
   * @generated
   */
  EReference getTypeOutput_Template();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort <em>Type Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Port</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort
   * @generated
   */
  EClass getTypePort();

  /**
   * Returns the meta object for the containment reference list '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort#getOperation()
   * @see #getTypePort()
   * @generated
   */
  EReference getTypePort_Operation();

  /**
	 * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort#getAddress()
	 * @see #getTypePort()
	 * @generated
	 */
	EAttribute getTypePort_Address();

	/**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort#getName()
   * @see #getTypePort()
   * @generated
   */
  EAttribute getTypePort_Name();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService <em>Type Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Service</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService
   * @generated
   */
  EClass getTypeService();

  /**
   * Returns the meta object for the containment reference list '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Port</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService#getPort()
   * @see #getTypeService()
   * @generated
   */
  EReference getTypeService_Port();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService#getName()
   * @see #getTypeService()
   * @generated
   */
  EAttribute getTypeService_Name();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService#getUri()
   * @see #getTypeService()
   * @generated
   */
  EAttribute getTypeService_Uri();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate <em>Type Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Template</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate
   * @generated
   */
  EClass getTypeTemplate();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate#getValue()
   * @see #getTypeTemplate()
   * @generated
   */
  EAttribute getTypeTemplate_Value();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef <em>Type Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Typedef</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef
   * @generated
   */
  EClass getTypeTypedef();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getElement()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_Element();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getFractionDigits <em>Fraction Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fraction Digits</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getFractionDigits()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_FractionDigits();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getMax()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_Max();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getMin()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_Min();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getName()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_Name();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getPattern()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_Pattern();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getTotalDigits <em>Total Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Total Digits</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getTotalDigits()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_TotalDigits();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getType()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_Type();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Values</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getValues()
   * @see #getTypeTypedef()
   * @generated
   */
  EAttribute getTypeTypedef_Values();

  /**
   * Returns the meta object for class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable <em>Type Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Variable</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable
   * @generated
   */
  EClass getTypeVariable();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable#getName()
   * @see #getTypeVariable()
   * @generated
   */
  EAttribute getTypeVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable#getType()
   * @see #getTypeVariable()
   * @generated
   */
  EAttribute getTypeVariable_Type();

  /**
   * Returns the meta object for enum '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA <em>Type GA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type GA</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA
   * @generated
   */
  EEnum getTypeGA();

  /**
   * Returns the meta object for data type '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA <em>Type GA Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Type GA Object</em>'.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA
   * @model instanceClass="es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA"
   *        extendedMetaData="name='typeGA:Object' baseType='typeGA'"
   * @generated
   */
  EDataType getTypeGAObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MessageCatalogFactory getMessageCatalogFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.DocumentRootImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getDocumentRoot()
     * @generated
     */
    EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SERVICES = eINSTANCE.getDocumentRoot_Services();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.ServicesTypeImpl <em>Services Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.ServicesTypeImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getServicesType()
     * @generated
     */
    EClass SERVICES_TYPE = eINSTANCE.getServicesType();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICES_TYPE__SERVICE = eINSTANCE.getServicesType_Service();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeDeclsImpl <em>Type Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeDeclsImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeDecls()
     * @generated
     */
    EClass TYPE_DECLS = eINSTANCE.getTypeDecls();

    /**
     * The meta object literal for the '<em><b>Typedef</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLS__TYPEDEF = eINSTANCE.getTypeDecls_Typedef();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLS__VARIABLE = eINSTANCE.getTypeDecls_Variable();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeFaultImpl <em>Type Fault</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeFaultImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeFault()
     * @generated
     */
    EClass TYPE_FAULT = eINSTANCE.getTypeFault();

    /**
     * The meta object literal for the '<em><b>Decls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_FAULT__DECLS = eINSTANCE.getTypeFault_Decls();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_FAULT__TEMPLATE = eINSTANCE.getTypeFault_Template();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FAULT__NAME = eINSTANCE.getTypeFault_Name();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeInputImpl <em>Type Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeInputImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeInput()
     * @generated
     */
    EClass TYPE_INPUT = eINSTANCE.getTypeInput();

    /**
     * The meta object literal for the '<em><b>Decls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_INPUT__DECLS = eINSTANCE.getTypeInput_Decls();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_INPUT__TEMPLATE = eINSTANCE.getTypeInput_Template();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOperationImpl <em>Type Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOperationImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeOperation()
     * @generated
     */
    EClass TYPE_OPERATION = eINSTANCE.getTypeOperation();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_OPERATION__INPUT = eINSTANCE.getTypeOperation_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_OPERATION__OUTPUT = eINSTANCE.getTypeOperation_Output();

    /**
     * The meta object literal for the '<em><b>Fault</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_OPERATION__FAULT = eINSTANCE.getTypeOperation_Fault();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_OPERATION__NAME = eINSTANCE.getTypeOperation_Name();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOutputImpl <em>Type Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeOutputImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeOutput()
     * @generated
     */
    EClass TYPE_OUTPUT = eINSTANCE.getTypeOutput();

    /**
     * The meta object literal for the '<em><b>Decls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_OUTPUT__DECLS = eINSTANCE.getTypeOutput_Decls();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_OUTPUT__TEMPLATE = eINSTANCE.getTypeOutput_Template();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypePortImpl <em>Type Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypePortImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypePort()
     * @generated
     */
    EClass TYPE_PORT = eINSTANCE.getTypePort();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PORT__OPERATION = eINSTANCE.getTypePort_Operation();

    /**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_PORT__ADDRESS = eINSTANCE.getTypePort_Address();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_PORT__NAME = eINSTANCE.getTypePort_Name();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeServiceImpl <em>Type Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeServiceImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeService()
     * @generated
     */
    EClass TYPE_SERVICE = eINSTANCE.getTypeService();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SERVICE__PORT = eINSTANCE.getTypeService_Port();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SERVICE__NAME = eINSTANCE.getTypeService_Name();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SERVICE__URI = eINSTANCE.getTypeService_Uri();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTemplateImpl <em>Type Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTemplateImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeTemplate()
     * @generated
     */
    EClass TYPE_TEMPLATE = eINSTANCE.getTypeTemplate();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TEMPLATE__VALUE = eINSTANCE.getTypeTemplate_Value();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl <em>Type Typedef</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeTypedef()
     * @generated
     */
    EClass TYPE_TYPEDEF = eINSTANCE.getTypeTypedef();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__ELEMENT = eINSTANCE.getTypeTypedef_Element();

    /**
     * The meta object literal for the '<em><b>Fraction Digits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__FRACTION_DIGITS = eINSTANCE.getTypeTypedef_FractionDigits();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__MAX = eINSTANCE.getTypeTypedef_Max();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__MIN = eINSTANCE.getTypeTypedef_Min();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__NAME = eINSTANCE.getTypeTypedef_Name();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__PATTERN = eINSTANCE.getTypeTypedef_Pattern();

    /**
     * The meta object literal for the '<em><b>Total Digits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__TOTAL_DIGITS = eINSTANCE.getTypeTypedef_TotalDigits();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__TYPE = eINSTANCE.getTypeTypedef_Type();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TYPEDEF__VALUES = eINSTANCE.getTypeTypedef_Values();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeVariableImpl <em>Type Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeVariableImpl
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeVariable()
     * @generated
     */
    EClass TYPE_VARIABLE = eINSTANCE.getTypeVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_VARIABLE__NAME = eINSTANCE.getTypeVariable_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_VARIABLE__TYPE = eINSTANCE.getTypeVariable_Type();

    /**
     * The meta object literal for the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA <em>Type GA</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeGA()
     * @generated
     */
    EEnum TYPE_GA = eINSTANCE.getTypeGA();

    /**
     * The meta object literal for the '<em>Type GA Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA
     * @see es.uca.webservices.wsdl.analyzer.emf.catalog.impl.MessageCatalogPackageImpl#getTypeGAObject()
     * @generated
     */
    EDataType TYPE_GA_OBJECT = eINSTANCE.getTypeGAObject();

  }

} //MessageCatalogPackage
