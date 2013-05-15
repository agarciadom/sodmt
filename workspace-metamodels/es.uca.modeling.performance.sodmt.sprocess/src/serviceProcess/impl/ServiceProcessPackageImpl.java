/**
 */
package serviceProcess.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import serviceProcess.Action;
import serviceProcess.ActivityEdge;
import serviceProcess.ActivityNode;
import serviceProcess.ControlFlow;
import serviceProcess.DecisionNode;
import serviceProcess.ExecutableNode;
import serviceProcess.ExpressionLanguage;
import serviceProcess.FinalNode;
import serviceProcess.ForkNode;
import serviceProcess.InitialNode;
import serviceProcess.JoinNode;
import serviceProcess.LocalPerformanceAnnotation;
import serviceProcess.NamedElement;
import serviceProcess.NodeSide;
import serviceProcess.ObjectFlow;
import serviceProcess.ObjectNode;
import serviceProcess.PerformanceAnnotation;
import serviceProcess.ServiceProcess;
import serviceProcess.ServiceProcessFactory;
import serviceProcess.ServiceProcessPackage;
import serviceProcess.StructuredActivityNode;
import serviceProcess.VisitStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceProcessPackageImpl extends EPackageImpl implements ServiceProcessPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceProcessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityEdgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass performanceAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localPerformanceAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executableNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structuredActivityNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass finalNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decisionNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forkNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visitStatusEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nodeSideEEnum = null;

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
   * @see serviceProcess.ServiceProcessPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ServiceProcessPackageImpl()
  {
    super(eNS_URI, ServiceProcessFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ServiceProcessPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ServiceProcessPackage init()
  {
    if (isInited) return (ServiceProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceProcessPackage.eNS_URI);

    // Obtain or create and register package
    ServiceProcessPackageImpl theServiceProcessPackage = (ServiceProcessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServiceProcessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServiceProcessPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theServiceProcessPackage.createPackageContents();

    // Initialize created meta-data
    theServiceProcessPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theServiceProcessPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ServiceProcessPackage.eNS_URI, theServiceProcessPackage);
    return theServiceProcessPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceProcess()
  {
    return serviceProcessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProcess_Nodes()
  {
    return (EReference)serviceProcessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProcess_Edges()
  {
    return (EReference)serviceProcessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProcess_ProcessPerformance()
  {
    return (EReference)serviceProcessEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityEdge()
  {
    return activityEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityEdge_Source()
  {
    return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityEdge_Target()
  {
    return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityNode()
  {
    return activityNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityNode_Incoming()
  {
    return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityNode_Outgoing()
  {
    return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerformanceAnnotation()
  {
    return performanceAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceAnnotation_ConcurrentUsers()
  {
    return (EAttribute)performanceAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceAnnotation_SecsTimeLimit()
  {
    return (EAttribute)performanceAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalPerformanceAnnotation()
  {
    return localPerformanceAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalPerformanceAnnotation_MinimumTime()
  {
    return (EAttribute)localPerformanceAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalPerformanceAnnotation_Weight()
  {
    return (EAttribute)localPerformanceAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalPerformanceAnnotation_Reps()
  {
    return (EAttribute)localPerformanceAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalPerformanceAnnotation_ExecNode()
  {
    return (EReference)localPerformanceAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControlFlow()
  {
    return controlFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControlFlow_Condition()
  {
    return (EAttribute)controlFlowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControlFlow_Probability()
  {
    return (EAttribute)controlFlowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectFlow()
  {
    return objectFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecutableNode()
  {
    return executableNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecutableNode_Annotation()
  {
    return (EReference)executableNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructuredActivityNode()
  {
    return structuredActivityNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructuredActivityNode_Nodes()
  {
    return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectNode()
  {
    return objectNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitialNode()
  {
    return initialNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFinalNode()
  {
    return finalNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecisionNode()
  {
    return decisionNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForkNode()
  {
    return forkNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinNode()
  {
    return joinNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisitStatus()
  {
    return visitStatusEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNodeSide()
  {
    return nodeSideEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProcessFactory getServiceProcessFactory()
  {
    return (ServiceProcessFactory)getEFactoryInstance();
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
    serviceProcessEClass = createEClass(SERVICE_PROCESS);
    createEReference(serviceProcessEClass, SERVICE_PROCESS__NODES);
    createEReference(serviceProcessEClass, SERVICE_PROCESS__EDGES);
    createEReference(serviceProcessEClass, SERVICE_PROCESS__PROCESS_PERFORMANCE);

    activityEdgeEClass = createEClass(ACTIVITY_EDGE);
    createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
    createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);

    activityNodeEClass = createEClass(ACTIVITY_NODE);
    createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
    createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);

    performanceAnnotationEClass = createEClass(PERFORMANCE_ANNOTATION);
    createEAttribute(performanceAnnotationEClass, PERFORMANCE_ANNOTATION__CONCURRENT_USERS);
    createEAttribute(performanceAnnotationEClass, PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT);

    localPerformanceAnnotationEClass = createEClass(LOCAL_PERFORMANCE_ANNOTATION);
    createEAttribute(localPerformanceAnnotationEClass, LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME);
    createEAttribute(localPerformanceAnnotationEClass, LOCAL_PERFORMANCE_ANNOTATION__WEIGHT);
    createEAttribute(localPerformanceAnnotationEClass, LOCAL_PERFORMANCE_ANNOTATION__REPS);
    createEReference(localPerformanceAnnotationEClass, LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE);

    controlFlowEClass = createEClass(CONTROL_FLOW);
    createEAttribute(controlFlowEClass, CONTROL_FLOW__CONDITION);
    createEAttribute(controlFlowEClass, CONTROL_FLOW__PROBABILITY);

    objectFlowEClass = createEClass(OBJECT_FLOW);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    executableNodeEClass = createEClass(EXECUTABLE_NODE);
    createEReference(executableNodeEClass, EXECUTABLE_NODE__ANNOTATION);

    actionEClass = createEClass(ACTION);

    structuredActivityNodeEClass = createEClass(STRUCTURED_ACTIVITY_NODE);
    createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__NODES);

    objectNodeEClass = createEClass(OBJECT_NODE);

    initialNodeEClass = createEClass(INITIAL_NODE);

    finalNodeEClass = createEClass(FINAL_NODE);

    decisionNodeEClass = createEClass(DECISION_NODE);

    forkNodeEClass = createEClass(FORK_NODE);

    joinNodeEClass = createEClass(JOIN_NODE);

    // Create enums
    visitStatusEEnum = createEEnum(VISIT_STATUS);
    nodeSideEEnum = createEEnum(NODE_SIDE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    localPerformanceAnnotationEClass.getESuperTypes().add(this.getPerformanceAnnotation());
    localPerformanceAnnotationEClass.getESuperTypes().add(this.getActivityNode());
    controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
    objectFlowEClass.getESuperTypes().add(this.getActivityEdge());
    executableNodeEClass.getESuperTypes().add(this.getActivityNode());
    executableNodeEClass.getESuperTypes().add(this.getNamedElement());
    actionEClass.getESuperTypes().add(this.getExecutableNode());
    structuredActivityNodeEClass.getESuperTypes().add(this.getExecutableNode());
    objectNodeEClass.getESuperTypes().add(this.getActivityNode());
    objectNodeEClass.getESuperTypes().add(this.getNamedElement());
    initialNodeEClass.getESuperTypes().add(this.getActivityNode());
    finalNodeEClass.getESuperTypes().add(this.getActivityNode());
    decisionNodeEClass.getESuperTypes().add(this.getActivityNode());
    forkNodeEClass.getESuperTypes().add(this.getActivityNode());
    joinNodeEClass.getESuperTypes().add(this.getActivityNode());

    // Initialize classes and features; add operations and parameters
    initEClass(serviceProcessEClass, ServiceProcess.class, "ServiceProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceProcess_Nodes(), this.getActivityNode(), null, "nodes", null, 0, -1, ServiceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProcess_Edges(), this.getActivityEdge(), null, "edges", null, 0, -1, ServiceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProcess_ProcessPerformance(), this.getPerformanceAnnotation(), null, "processPerformance", null, 0, 1, ServiceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(performanceAnnotationEClass, PerformanceAnnotation.class, "PerformanceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerformanceAnnotation_ConcurrentUsers(), ecorePackage.getEDouble(), "concurrentUsers", "1", 0, 1, PerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceAnnotation_SecsTimeLimit(), ecorePackage.getEDouble(), "secsTimeLimit", "0", 0, 1, PerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localPerformanceAnnotationEClass, LocalPerformanceAnnotation.class, "LocalPerformanceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalPerformanceAnnotation_MinimumTime(), ecorePackage.getEDouble(), "minimumTime", "0", 0, 1, LocalPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocalPerformanceAnnotation_Weight(), ecorePackage.getEDouble(), "weight", "1", 0, 1, LocalPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocalPerformanceAnnotation_Reps(), ecorePackage.getEDouble(), "reps", "1", 0, 1, LocalPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalPerformanceAnnotation_ExecNode(), this.getExecutableNode(), this.getExecutableNode_Annotation(), "execNode", null, 0, 1, LocalPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControlFlow_Condition(), ecorePackage.getEString(), "condition", "", 0, 1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getControlFlow_Probability(), ecorePackage.getEDouble(), "probability", "1", 0, 1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecutableNode_Annotation(), this.getLocalPerformanceAnnotation(), this.getLocalPerformanceAnnotation_ExecNode(), "annotation", null, 0, 1, ExecutableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structuredActivityNodeEClass, StructuredActivityNode.class, "StructuredActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructuredActivityNode_Nodes(), this.getActivityNode(), null, "nodes", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(finalNodeEClass, FinalNode.class, "FinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(visitStatusEEnum, VisitStatus.class, "VisitStatus");
    addEEnumLiteral(visitStatusEEnum, VisitStatus.NOT_VISITED);
    addEEnumLiteral(visitStatusEEnum, VisitStatus.VISITING);
    addEEnumLiteral(visitStatusEEnum, VisitStatus.VISITED);

    initEEnum(nodeSideEEnum, NodeSide.class, "NodeSide");
    addEEnumLiteral(nodeSideEEnum, NodeSide.INCOMING);
    addEEnumLiteral(nodeSideEEnum, NodeSide.OUTGOING);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf.diagram
    createGmfAnnotations();
    // gmf.link
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.label
    createGmf_3Annotations();
    // gmf.compartment
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";		
    addAnnotation
      (serviceProcessEClass, 
       source, 
       new String[] 
       {
       "model.extension", "sp",
       "diagram.extension", "spdiag"
       });																					
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.link";			
    addAnnotation
      (activityEdgeEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "width", "3",
       "target.decoration", "arrow"
       });									
    addAnnotation
      (controlFlowEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Control Flow",
       "label", "condition,probability",
       "label.view.pattern", "[{0}] (p = {1})",
       "label.edit.pattern", "{0} : {1,number}",
       "label.text", " ",
       "label.parser", "ControlFlowLabelParser",
       "source.constraint", "self <> oppositeEnd and not self.oclIsKindOf(ObjectNode) and not self.oclIsKindOf(PerformanceAnnotation)",
       "target.constraint", "self <> oppositeEnd and not self.oclIsKindOf(ObjectNode) and not self.oclIsKindOf(PerformanceAnnotation)"
       });		
    addAnnotation
      (objectFlowEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Object Flow",
       "style", "dash",
       "source.constraint", "not self.oclIsKindOf(PerformanceAnnotation)",
       "target.constraint", "(self.oclIsKindOf(ObjectNode) xor oppositeEnd.oclIsKindOf(ObjectNode)) and not self.oclIsKindOf(PerformanceAnnotation)"
       });				
    addAnnotation
      (getExecutableNode_Annotation(), 
       source, 
       new String[] 
       {
       "incoming", "true",
       "style", "dash",
       "tool.name", "Link Performance Annotation"
       });								
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (performanceAnnotationEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "label", "concurrentUsers",
       "label.pattern", "\u00abgpc\u00bb",
       "label.readOnly", "true",
       "tool.name", "Global Performance Constraint"
       });				
    addAnnotation
      (localPerformanceAnnotationEClass, 
       source, 
       new String[] 
       {
       "label.pattern", "\u00ablpc\u00bb",
       "tool.name", "Local Performance Constraint"
       });							
    addAnnotation
      (namedElementEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (executableNodeEClass, 
       source, 
       new String[] 
       {
       "label.icon", "false"
       });			
    addAnnotation
      (structuredActivityNodeEClass, 
       source, 
       new String[] 
       {
       "border.style", "dash",
       "label.view.pattern", "\u00abstructured\u00bb {0}",
       "label.edit.pattern", "{0}",
       "tool.name", "Structured Activity Node"
       });			
    addAnnotation
      (objectNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "label.icon", "false",
       "tool.name", "Object Node"
       });		
    addAnnotation
      (initialNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.performance.sodmt.sprocess/svg/initial.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Initial Node"
       });		
    addAnnotation
      (finalNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.performance.sodmt.sprocess/svg/flow-final.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Final Node"
       });		
    addAnnotation
      (decisionNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "polygon",
       "polygon.x", "0 15 30 15",
       "polygon.y", "15 30 15 0",
       "border.color", "0,0,0",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "tool.name", "Decision"
       });		
    addAnnotation
      (forkNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "polygon",
       "polygon.x", "0 10 10 0",
       "polygon.y", "0 0 30 30",
       "color", "0,0,0",
       "label.placement", "none",
       "size", "10,30",
       "resizable", "false",
       "tool.name", "Fork"
       });		
    addAnnotation
      (joinNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "polygon",
       "polygon.x", "0 10 10 0",
       "polygon.y", "0 0 30 30",
       "color", "0,0,0",
       "label.placement", "none",
       "size", "10,30",
       "resizable", "false",
       "tool.name", "Join"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.label</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.label";					
    addAnnotation
      (getPerformanceAnnotation_ConcurrentUsers(), 
       source, 
       new String[] 
       {
       "label.view.pattern", "users = {0}",
       "label.edit.pattern", "{0, number}"
       });		
    addAnnotation
      (getPerformanceAnnotation_SecsTimeLimit(), 
       source, 
       new String[] 
       {
       "label.view.pattern", "timeLimit = {0}",
       "label.edit.pattern", "{0, number}"
       });			
    addAnnotation
      (getLocalPerformanceAnnotation_MinimumTime(), 
       source, 
       new String[] 
       {
       "label.view.pattern", "minimum = {0}",
       "label.edit.pattern", "{0, number}"
       });		
    addAnnotation
      (getLocalPerformanceAnnotation_Weight(), 
       source, 
       new String[] 
       {
       "label.view.pattern", "weight = {0}",
       "label.edit.pattern", "{0, number}"
       });		
    addAnnotation
      (getLocalPerformanceAnnotation_Reps(), 
       source, 
       new String[] 
       {
       "label.view.pattern", "reps = {0}",
       "label.edit.pattern", "{0, number}"
       });													
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.compartment";																	
    addAnnotation
      (getStructuredActivityNode_Nodes(), 
       source, 
       new String[] 
       {
       });						
  }

} //ServiceProcessPackageImpl
