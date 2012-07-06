/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.impl;

import es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot;
import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogFactory;
import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;
import es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageCatalogPackageImpl extends EPackageImpl implements MessageCatalogPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass servicesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeFaultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typePortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeTemplateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeTypedefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeGAEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType typeGAObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MessageCatalogPackageImpl()
  {
    super(eNS_URI, MessageCatalogFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MessageCatalogPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MessageCatalogPackage init()
  {
    if (isInited) return (MessageCatalogPackage)EPackage.Registry.INSTANCE.getEPackage(MessageCatalogPackage.eNS_URI);

    // Obtain or create and register package
    MessageCatalogPackageImpl theMessageCatalogPackage = (MessageCatalogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MessageCatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MessageCatalogPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theMessageCatalogPackage.createPackageContents();

    // Initialize created meta-data
    theMessageCatalogPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMessageCatalogPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MessageCatalogPackage.eNS_URI, theMessageCatalogPackage);
    return theMessageCatalogPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Services()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServicesType()
  {
    return servicesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServicesType_Service()
  {
    return (EReference)servicesTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDecls()
  {
    return typeDeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDecls_Typedef()
  {
    return (EReference)typeDeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDecls_Variable()
  {
    return (EReference)typeDeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeFault()
  {
    return typeFaultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeFault_Decls()
  {
    return (EReference)typeFaultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeFault_Template()
  {
    return (EReference)typeFaultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFault_Name()
  {
    return (EAttribute)typeFaultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeInput()
  {
    return typeInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInput_Decls()
  {
    return (EReference)typeInputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInput_Template()
  {
    return (EReference)typeInputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeOperation()
  {
    return typeOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeOperation_Input()
  {
    return (EReference)typeOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeOperation_Output()
  {
    return (EReference)typeOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeOperation_Fault()
  {
    return (EReference)typeOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeOperation_Name()
  {
    return (EAttribute)typeOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeOutput()
  {
    return typeOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeOutput_Decls()
  {
    return (EReference)typeOutputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeOutput_Template()
  {
    return (EReference)typeOutputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypePort()
  {
    return typePortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePort_Operation()
  {
    return (EReference)typePortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePort_Name()
  {
    return (EAttribute)typePortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeService()
  {
    return typeServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeService_Port()
  {
    return (EReference)typeServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeService_Name()
  {
    return (EAttribute)typeServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeService_Uri()
  {
    return (EAttribute)typeServiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeTemplate()
  {
    return typeTemplateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTemplate_Value()
  {
    return (EAttribute)typeTemplateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeTypedef()
  {
    return typeTypedefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_Element()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_FractionDigits()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_Max()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_Min()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_Name()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_Pattern()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_TotalDigits()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_Type()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTypedef_Values()
  {
    return (EAttribute)typeTypedefEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeVariable()
  {
    return typeVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeVariable_Name()
  {
    return (EAttribute)typeVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeVariable_Type()
  {
    return (EAttribute)typeVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeGA()
  {
    return typeGAEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTypeGAObject()
  {
    return typeGAObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageCatalogFactory getMessageCatalogFactory()
  {
    return (MessageCatalogFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICES);

    servicesTypeEClass = createEClass(SERVICES_TYPE);
    createEReference(servicesTypeEClass, SERVICES_TYPE__SERVICE);

    typeDeclsEClass = createEClass(TYPE_DECLS);
    createEReference(typeDeclsEClass, TYPE_DECLS__TYPEDEF);
    createEReference(typeDeclsEClass, TYPE_DECLS__VARIABLE);

    typeFaultEClass = createEClass(TYPE_FAULT);
    createEReference(typeFaultEClass, TYPE_FAULT__DECLS);
    createEReference(typeFaultEClass, TYPE_FAULT__TEMPLATE);
    createEAttribute(typeFaultEClass, TYPE_FAULT__NAME);

    typeInputEClass = createEClass(TYPE_INPUT);
    createEReference(typeInputEClass, TYPE_INPUT__DECLS);
    createEReference(typeInputEClass, TYPE_INPUT__TEMPLATE);

    typeOperationEClass = createEClass(TYPE_OPERATION);
    createEReference(typeOperationEClass, TYPE_OPERATION__INPUT);
    createEReference(typeOperationEClass, TYPE_OPERATION__OUTPUT);
    createEReference(typeOperationEClass, TYPE_OPERATION__FAULT);
    createEAttribute(typeOperationEClass, TYPE_OPERATION__NAME);

    typeOutputEClass = createEClass(TYPE_OUTPUT);
    createEReference(typeOutputEClass, TYPE_OUTPUT__DECLS);
    createEReference(typeOutputEClass, TYPE_OUTPUT__TEMPLATE);

    typePortEClass = createEClass(TYPE_PORT);
    createEReference(typePortEClass, TYPE_PORT__OPERATION);
    createEAttribute(typePortEClass, TYPE_PORT__NAME);

    typeServiceEClass = createEClass(TYPE_SERVICE);
    createEReference(typeServiceEClass, TYPE_SERVICE__PORT);
    createEAttribute(typeServiceEClass, TYPE_SERVICE__NAME);
    createEAttribute(typeServiceEClass, TYPE_SERVICE__URI);

    typeTemplateEClass = createEClass(TYPE_TEMPLATE);
    createEAttribute(typeTemplateEClass, TYPE_TEMPLATE__VALUE);

    typeTypedefEClass = createEClass(TYPE_TYPEDEF);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__ELEMENT);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__FRACTION_DIGITS);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__MAX);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__MIN);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__NAME);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__PATTERN);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__TOTAL_DIGITS);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__TYPE);
    createEAttribute(typeTypedefEClass, TYPE_TYPEDEF__VALUES);

    typeVariableEClass = createEClass(TYPE_VARIABLE);
    createEAttribute(typeVariableEClass, TYPE_VARIABLE__NAME);
    createEAttribute(typeVariableEClass, TYPE_VARIABLE__TYPE);

    // Create enums
    typeGAEEnum = createEEnum(TYPE_GA);

    // Create data types
    typeGAObjectEDataType = createEDataType(TYPE_GA_OBJECT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Services(), this.getServicesType(), null, "services", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(servicesTypeEClass, ServicesType.class, "ServicesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServicesType_Service(), this.getTypeService(), null, "service", null, 1, -1, ServicesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclsEClass, TypeDecls.class, "TypeDecls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDecls_Typedef(), this.getTypeTypedef(), null, "typedef", null, 0, -1, TypeDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDecls_Variable(), this.getTypeVariable(), null, "variable", null, 0, -1, TypeDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeFaultEClass, TypeFault.class, "TypeFault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeFault_Decls(), this.getTypeDecls(), null, "decls", null, 1, 1, TypeFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeFault_Template(), this.getTypeTemplate(), null, "template", null, 1, 1, TypeFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFault_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TypeFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeInputEClass, TypeInput.class, "TypeInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeInput_Decls(), this.getTypeDecls(), null, "decls", null, 1, 1, TypeInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeInput_Template(), this.getTypeTemplate(), null, "template", null, 1, 1, TypeInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeOperationEClass, TypeOperation.class, "TypeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeOperation_Input(), this.getTypeInput(), null, "input", null, 0, 1, TypeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeOperation_Output(), this.getTypeOutput(), null, "output", null, 0, 1, TypeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeOperation_Fault(), this.getTypeFault(), null, "fault", null, 0, -1, TypeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeOperation_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TypeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeOutputEClass, TypeOutput.class, "TypeOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeOutput_Decls(), this.getTypeDecls(), null, "decls", null, 1, 1, TypeOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeOutput_Template(), this.getTypeTemplate(), null, "template", null, 1, 1, TypeOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typePortEClass, TypePort.class, "TypePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypePort_Operation(), this.getTypeOperation(), null, "operation", null, 0, -1, TypePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypePort_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TypePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeServiceEClass, TypeService.class, "TypeService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeService_Port(), this.getTypePort(), null, "port", null, 1, -1, TypeService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeService_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TypeService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeService_Uri(), theXMLTypePackage.getString(), "uri", null, 1, 1, TypeService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeTemplateEClass, TypeTemplate.class, "TypeTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeTemplate_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TypeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeTypedefEClass, TypeTypedef.class, "TypeTypedef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeTypedef_Element(), theXMLTypePackage.getString(), "element", null, 0, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeTypedef_FractionDigits(), theXMLTypePackage.getNonNegativeInteger(), "fractionDigits", null, 0, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeTypedef_Max(), theXMLTypePackage.getString(), "max", null, 0, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeTypedef_Min(), theXMLTypePackage.getString(), "min", null, 0, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeTypedef_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeTypedef_Pattern(), theXMLTypePackage.getString(), "pattern", null, 0, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeTypedef_TotalDigits(), theXMLTypePackage.getPositiveInteger(), "totalDigits", null, 0, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeTypedef_Type(), this.getTypeGA(), "type", null, 1, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeTypedef_Values(), theXMLTypePackage.getString(), "values", null, 0, 1, TypeTypedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeVariableEClass, TypeVariable.class, "TypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeVariable_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TypeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeVariable_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, TypeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeGAEEnum, TypeGA.class, "TypeGA");
    addEEnumLiteral(typeGAEEnum, TypeGA.STRING);
    addEEnumLiteral(typeGAEEnum, TypeGA.INT);
    addEEnumLiteral(typeGAEEnum, TypeGA.FLOAT);
    addEEnumLiteral(typeGAEEnum, TypeGA.LIST);
    addEEnumLiteral(typeGAEEnum, TypeGA.TUPLE);
    addEEnumLiteral(typeGAEEnum, TypeGA.DATE);
    addEEnumLiteral(typeGAEEnum, TypeGA.DATE_TIME);
    addEEnumLiteral(typeGAEEnum, TypeGA.TIME);
    addEEnumLiteral(typeGAEEnum, TypeGA.DURATION);

    // Initialize data types
    initEDataType(typeGAObjectEDataType, TypeGA.class, "TypeGAObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });		
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });		
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });		
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });		
    addAnnotation
      (getDocumentRoot_Services(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "services",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (servicesTypeEClass, 
       source, 
       new String[] 
       {
       "name", "services_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getServicesType_Service(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "service",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (typeDeclsEClass, 
       source, 
       new String[] 
       {
       "name", "typeDecls",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getTypeDecls_Typedef(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "typedef",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeDecls_Variable(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "variable",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (typeFaultEClass, 
       source, 
       new String[] 
       {
       "name", "typeFault",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getTypeFault_Decls(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "decls",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeFault_Template(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "template",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeFault_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });		
    addAnnotation
      (typeGAEEnum, 
       source, 
       new String[] 
       {
       "name", "typeGA"
       });		
    addAnnotation
      (typeGAObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "typeGA:Object",
       "baseType", "typeGA"
       });		
    addAnnotation
      (typeInputEClass, 
       source, 
       new String[] 
       {
       "name", "typeInput",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getTypeInput_Decls(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "decls",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeInput_Template(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "template",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (typeOperationEClass, 
       source, 
       new String[] 
       {
       "name", "typeOperation",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getTypeOperation_Input(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "input",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeOperation_Output(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "output",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeOperation_Fault(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fault",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeOperation_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });		
    addAnnotation
      (typeOutputEClass, 
       source, 
       new String[] 
       {
       "name", "typeOutput",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getTypeOutput_Decls(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "decls",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeOutput_Template(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "template",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (typePortEClass, 
       source, 
       new String[] 
       {
       "name", "typePort",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getTypePort_Operation(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "operation",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypePort_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });		
    addAnnotation
      (typeServiceEClass, 
       source, 
       new String[] 
       {
       "name", "typeService",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getTypeService_Port(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "port",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTypeService_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });		
    addAnnotation
      (getTypeService_Uri(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "uri"
       });		
    addAnnotation
      (typeTemplateEClass, 
       source, 
       new String[] 
       {
       "name", "typeTemplate",
       "kind", "simple"
       });		
    addAnnotation
      (getTypeTemplate_Value(), 
       source, 
       new String[] 
       {
       "name", ":0",
       "kind", "simple"
       });		
    addAnnotation
      (typeTypedefEClass, 
       source, 
       new String[] 
       {
       "name", "typeTypedef",
       "kind", "empty"
       });		
    addAnnotation
      (getTypeTypedef_Element(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "element"
       });		
    addAnnotation
      (getTypeTypedef_FractionDigits(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "fractionDigits"
       });		
    addAnnotation
      (getTypeTypedef_Max(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "max"
       });		
    addAnnotation
      (getTypeTypedef_Min(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "min"
       });		
    addAnnotation
      (getTypeTypedef_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });		
    addAnnotation
      (getTypeTypedef_Pattern(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "pattern"
       });		
    addAnnotation
      (getTypeTypedef_TotalDigits(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "totalDigits"
       });		
    addAnnotation
      (getTypeTypedef_Type(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "type"
       });		
    addAnnotation
      (getTypeTypedef_Values(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "values"
       });		
    addAnnotation
      (typeVariableEClass, 
       source, 
       new String[] 
       {
       "name", "typeVariable",
       "kind", "empty"
       });		
    addAnnotation
      (getTypeVariable_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });		
    addAnnotation
      (getTypeVariable_Type(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "type"
       });
  }

} //MessageCatalogPackageImpl
