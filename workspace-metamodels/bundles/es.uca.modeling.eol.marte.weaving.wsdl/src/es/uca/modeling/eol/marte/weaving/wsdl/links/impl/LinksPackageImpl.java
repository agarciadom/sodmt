/**
 */
package es.uca.modeling.eol.marte.weaving.wsdl.links.impl;

import es.uca.modeling.eol.marte.weaving.wsdl.links.LinksFactory;
import es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinksPackageImpl extends EPackageImpl implements LinksPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass performanceRequirementLinksEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass performanceRequirementLinkEClass = null;

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
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LinksPackageImpl()
  {
    super(eNS_URI, LinksFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link LinksPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LinksPackage init()
  {
    if (isInited) return (LinksPackage)EPackage.Registry.INSTANCE.getEPackage(LinksPackage.eNS_URI);

    // Obtain or create and register package
    LinksPackageImpl theLinksPackage = (LinksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LinksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LinksPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    MessageCatalogPackage.eINSTANCE.eClass();
    UMLPackage.eINSTANCE.eClass();
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theLinksPackage.createPackageContents();

    // Initialize created meta-data
    theLinksPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLinksPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LinksPackage.eNS_URI, theLinksPackage);
    return theLinksPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerformanceRequirementLinks()
  {
    return performanceRequirementLinksEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPerformanceRequirementLinks_Links()
  {
    return (EReference)performanceRequirementLinksEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_EclipseProjectName()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_Processes()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_ProcessIncrement()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_ProcessIncrementInterval()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_ThreadsPerProcess()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_Runs()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_ConsoleHost()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_UseConsole()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_UpdateInputsOnSpecChanged()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_NumberInputsOnSpecChanged()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_MavenGroupId()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_MavenArtifactId()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_MavenVersion()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_MavenHumanName()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceRequirementLinks_MavenHumanDescription()
  {
    return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerformanceRequirementLink()
  {
    return performanceRequirementLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPerformanceRequirementLink_ExecNode()
  {
    return (EReference)performanceRequirementLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPerformanceRequirementLink_Operation()
  {
    return (EReference)performanceRequirementLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinksFactory getLinksFactory()
  {
    return (LinksFactory)getEFactoryInstance();
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
    performanceRequirementLinksEClass = createEClass(PERFORMANCE_REQUIREMENT_LINKS);
    createEReference(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__LINKS);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__ECLIPSE_PROJECT_NAME);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__PROCESSES);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__RUNS);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME);
    createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION);

    performanceRequirementLinkEClass = createEClass(PERFORMANCE_REQUIREMENT_LINK);
    createEReference(performanceRequirementLinkEClass, PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE);
    createEReference(performanceRequirementLinkEClass, PERFORMANCE_REQUIREMENT_LINK__OPERATION);
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
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
    MessageCatalogPackage theMessageCatalogPackage = (MessageCatalogPackage)EPackage.Registry.INSTANCE.getEPackage(MessageCatalogPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(performanceRequirementLinksEClass, PerformanceRequirementLinks.class, "PerformanceRequirementLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPerformanceRequirementLinks_Links(), this.getPerformanceRequirementLink(), null, "links", null, 0, -1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_EclipseProjectName(), ecorePackage.getEString(), "eclipseProjectName", "performance.tests", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_Processes(), ecorePackage.getEInt(), "processes", "1", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_ProcessIncrement(), ecorePackage.getEInt(), "processIncrement", "1", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_ProcessIncrementInterval(), ecorePackage.getEInt(), "processIncrementInterval", "1000", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_ThreadsPerProcess(), ecorePackage.getEInt(), "threadsPerProcess", "5", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_Runs(), ecorePackage.getEInt(), "runs", "2", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_ConsoleHost(), ecorePackage.getEString(), "consoleHost", "127.0.0.1", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_UseConsole(), ecorePackage.getEBoolean(), "useConsole", "false", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_UpdateInputsOnSpecChanged(), ecorePackage.getEBoolean(), "updateInputsOnSpecChanged", "true", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_NumberInputsOnSpecChanged(), ecorePackage.getEInt(), "numberInputsOnSpecChanged", "5", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_MavenGroupId(), ecorePackage.getEString(), "mavenGroupId", "com.example", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_MavenArtifactId(), ecorePackage.getEString(), "mavenArtifactId", "grinder", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_MavenVersion(), ecorePackage.getEString(), "mavenVersion", "1.0-SNAPSHOT", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_MavenHumanName(), ecorePackage.getEString(), "mavenHumanName", "Performance Tests", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceRequirementLinks_MavenHumanDescription(), ecorePackage.getEString(), "mavenHumanDescription", "Grinder-based performance tests for our web services", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(performanceRequirementLinkEClass, PerformanceRequirementLink.class, "PerformanceRequirementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPerformanceRequirementLink_ExecNode(), theUMLPackage.getExecutableNode(), null, "execNode", null, 0, 1, PerformanceRequirementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerformanceRequirementLink_Operation(), theMessageCatalogPackage.getTypeOperation(), null, "operation", null, 0, 1, PerformanceRequirementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LinksPackageImpl
