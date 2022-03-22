/**
 */
package es.uca.modeling.eol.marte.weaving.links.impl;

import es.uca.modeling.eol.marte.weaving.links.LinksFactory;
import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks;
import es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.modisco.java.emf.JavaPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinksPackageImpl extends EPackageImpl implements LinksPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeLimitMetricEEnum = null;

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
	private LinksPackageImpl() {
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
	public static LinksPackage init() {
		if (isInited) return (LinksPackage)EPackage.Registry.INSTANCE.getEPackage(LinksPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLinksPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LinksPackageImpl theLinksPackage = registeredLinksPackage instanceof LinksPackageImpl ? (LinksPackageImpl)registeredLinksPackage : new LinksPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		JavaPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

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
	@Override
	public EClass getPerformanceRequirementLinks() {
		return performanceRequirementLinksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceRequirementLinks_SamplesPerTest() {
		return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceRequirementLinks_Threads() {
		return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceRequirementLinks_BaseDir() {
		return (EAttribute)performanceRequirementLinksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceRequirementLinks_Links() {
		return (EReference)performanceRequirementLinksEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceRequirementLink() {
		return performanceRequirementLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceRequirementLink_Metric() {
		return (EAttribute)performanceRequirementLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceRequirementLink_ExecNode() {
		return (EReference)performanceRequirementLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceRequirementLink_Klazz() {
		return (EReference)performanceRequirementLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceRequirementLink_TestMethods() {
		return (EReference)performanceRequirementLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeLimitMetric() {
		return timeLimitMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinksFactory getLinksFactory() {
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		performanceRequirementLinksEClass = createEClass(PERFORMANCE_REQUIREMENT_LINKS);
		createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__SAMPLES_PER_TEST);
		createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__THREADS);
		createEAttribute(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR);
		createEReference(performanceRequirementLinksEClass, PERFORMANCE_REQUIREMENT_LINKS__LINKS);

		performanceRequirementLinkEClass = createEClass(PERFORMANCE_REQUIREMENT_LINK);
		createEAttribute(performanceRequirementLinkEClass, PERFORMANCE_REQUIREMENT_LINK__METRIC);
		createEReference(performanceRequirementLinkEClass, PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE);
		createEReference(performanceRequirementLinkEClass, PERFORMANCE_REQUIREMENT_LINK__KLAZZ);
		createEReference(performanceRequirementLinkEClass, PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS);

		// Create enums
		timeLimitMetricEEnum = createEEnum(TIME_LIMIT_METRIC);
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
	public void initializePackageContents() {
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
		initEAttribute(getPerformanceRequirementLinks_SamplesPerTest(), ecorePackage.getEIntegerObject(), "samplesPerTest", "1000", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceRequirementLinks_Threads(), ecorePackage.getEIntegerObject(), "threads", "5", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceRequirementLinks_BaseDir(), ecorePackage.getEString(), "baseDir", "src", 0, 1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceRequirementLinks_Links(), this.getPerformanceRequirementLink(), null, "links", null, 0, -1, PerformanceRequirementLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceRequirementLinkEClass, PerformanceRequirementLink.class, "PerformanceRequirementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceRequirementLink_Metric(), this.getTimeLimitMetric(), "metric", "0", 0, 1, PerformanceRequirementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceRequirementLink_ExecNode(), theUMLPackage.getExecutableNode(), null, "execNode", null, 0, 1, PerformanceRequirementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceRequirementLink_Klazz(), theJavaPackage.getClassDeclaration(), null, "klazz", null, 0, 1, PerformanceRequirementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceRequirementLink_TestMethods(), theJavaPackage.getMethodDeclaration(), null, "testMethods", null, 0, -1, PerformanceRequirementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeLimitMetricEEnum, TimeLimitMetric.class, "TimeLimitMetric");
		addEEnumLiteral(timeLimitMetricEEnum, TimeLimitMetric.MAX);
		addEEnumLiteral(timeLimitMetricEEnum, TimeLimitMetric.AVERAGE);
		addEEnumLiteral(timeLimitMetricEEnum, TimeLimitMetric.PERCENTILE_90);
		addEEnumLiteral(timeLimitMetricEEnum, TimeLimitMetric.PERCENTILE_95);
		addEEnumLiteral(timeLimitMetricEEnum, TimeLimitMetric.PERCENTILE_99);
		addEEnumLiteral(timeLimitMetricEEnum, TimeLimitMetric.MEDIAN);

		// Create resource
		createResource(eNS_URI);
	}

} //LinksPackageImpl
