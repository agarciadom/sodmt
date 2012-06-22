/**
 */
package es.uca.modeling.eol.marte.weaving.links.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;

import es.uca.modeling.eol.marte.weaving.links.LinksFactory;
import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks;

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
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#eNS_URI
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
    JavaPackage.eINSTANCE.eClass();
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
  public EReference getPerformanceRequirementLink_TestMethod()
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

    performanceRequirementLinkEClass = createEClass(PERFORMANCE_REQUIREMENT_LINK);
    createEReference(performanceRequirementLinkEClass, PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE);
    createEReference(performanceRequirementLinkEClass, PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD);
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
    JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(performanceRequirementLinksEClass, PerformanceRequirementLinks.class, "PerformanceRequirementLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPerformanceRequirementLinks_Links(), this.getPerformanceRequirementLink(), null, "links", null, 0, -1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(performanceRequirementLinkEClass, PerformanceRequirementLink.class, "PerformanceRequirementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPerformanceRequirementLink_ExecNode(), theUMLPackage.getExecutableNode(), null, "execNode", null, 0, 1, PerformanceRequirementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerformanceRequirementLink_TestMethod(), theJavaPackage.getMethodDeclaration(), null, "testMethod", null, 0, 1, PerformanceRequirementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // exeed
    createExeedAnnotations();
  }

  /**
   * Initializes the annotations for <b>exeed</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExeedAnnotations()
  {
    String source = "exeed";		
    addAnnotation
      (performanceRequirementLinkEClass, 
       source, 
       new String[] 
       {
       "label", "return Sequence { self.testMethod.abstractTypeDeclaration.package }.closure(p | p.package).invert.collect(p|p.name).concat(\'.\') + \'.\' + self.testMethod.abstractTypeDeclaration.name + \'#\' + self.testMethod.name;"
       });
  }

} //LinksPackageImpl
