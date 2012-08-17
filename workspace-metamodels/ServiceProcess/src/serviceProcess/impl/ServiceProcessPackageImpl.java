/**
 */
package serviceProcess.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import serviceProcess.Activity;
import serviceProcess.ActivityPerformanceAnnotation;
import serviceProcess.ControlFlow;
import serviceProcess.DecisionNode;
import serviceProcess.ExpressionLanguage;
import serviceProcess.FinalNode;
import serviceProcess.FlowEdge;
import serviceProcess.FlowNode;
import serviceProcess.ForkNode;
import serviceProcess.InitialNode;
import serviceProcess.JoinNode;
import serviceProcess.LocalPerformanceAnnotation;
import serviceProcess.NamedElement;
import serviceProcess.NodeSide;
import serviceProcess.ObjectFlow;
import serviceProcess.ObjectNode;
import serviceProcess.PerformanceAnnotation;
import serviceProcess.ProcessControlFlow;
import serviceProcess.ProcessDecision;
import serviceProcess.ProcessFinish;
import serviceProcess.ProcessFlowEdge;
import serviceProcess.ProcessFlowNode;
import serviceProcess.ProcessFork;
import serviceProcess.ProcessJoin;
import serviceProcess.ProcessPerformanceAnnotation;
import serviceProcess.ProcessStart;
import serviceProcess.ServiceActivity;
import serviceProcess.ServiceProcess;
import serviceProcess.ServiceProcessFactory;
import serviceProcess.ServiceProcessPackage;
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
  private EClass processFlowEdgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processFlowNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityPerformanceAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processPerformanceAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processControlFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processFinishEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processDecisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processForkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processJoinEClass = null;

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
  private EClass flowNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowEdgeEClass = null;

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
  private EClass activityEClass = null;

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
  private EClass decisionNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum expressionLanguageEEnum = null;

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
  public EReference getServiceProcess_ActivityPerformance()
  {
    return (EReference)serviceProcessEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProcess_ProcessPerformance()
  {
    return (EReference)serviceProcessEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessFlowEdge()
  {
    return processFlowEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessFlowNode()
  {
    return processFlowNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityPerformanceAnnotation()
  {
    return activityPerformanceAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityPerformanceAnnotation_ExecNode()
  {
    return (EReference)activityPerformanceAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivityPerformanceAnnotation_ManuallyAdded()
  {
    return (EAttribute)activityPerformanceAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessPerformanceAnnotation()
  {
    return processPerformanceAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessControlFlow()
  {
    return processControlFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceActivity()
  {
    return serviceActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceActivity_Annotation()
  {
    return (EReference)serviceActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessStart()
  {
    return processStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessFinish()
  {
    return processFinishEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessDecision()
  {
    return processDecisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessFork()
  {
    return processForkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessJoin()
  {
    return processJoinEClass;
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
  public EClass getFlowNode()
  {
    return flowNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowNode_Incoming()
  {
    return (EReference)flowNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowNode_Outgoing()
  {
    return (EReference)flowNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowEdge()
  {
    return flowEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowEdge_Target()
  {
    return (EReference)flowEdgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowEdge_Source()
  {
    return (EReference)flowEdgeEClass.getEStructuralFeatures().get(1);
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
  public EClass getActivity()
  {
    return activityEClass;
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
  public EClass getDecisionNode()
  {
    return decisionNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getExpressionLanguage()
  {
    return expressionLanguageEEnum;
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
    createEReference(serviceProcessEClass, SERVICE_PROCESS__ACTIVITY_PERFORMANCE);
    createEReference(serviceProcessEClass, SERVICE_PROCESS__PROCESS_PERFORMANCE);

    processFlowEdgeEClass = createEClass(PROCESS_FLOW_EDGE);

    processFlowNodeEClass = createEClass(PROCESS_FLOW_NODE);

    activityPerformanceAnnotationEClass = createEClass(ACTIVITY_PERFORMANCE_ANNOTATION);
    createEReference(activityPerformanceAnnotationEClass, ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE);
    createEAttribute(activityPerformanceAnnotationEClass, ACTIVITY_PERFORMANCE_ANNOTATION__MANUALLY_ADDED);

    processPerformanceAnnotationEClass = createEClass(PROCESS_PERFORMANCE_ANNOTATION);

    processControlFlowEClass = createEClass(PROCESS_CONTROL_FLOW);

    serviceActivityEClass = createEClass(SERVICE_ACTIVITY);
    createEReference(serviceActivityEClass, SERVICE_ACTIVITY__ANNOTATION);

    processStartEClass = createEClass(PROCESS_START);

    processFinishEClass = createEClass(PROCESS_FINISH);

    processDecisionEClass = createEClass(PROCESS_DECISION);

    processForkEClass = createEClass(PROCESS_FORK);

    processJoinEClass = createEClass(PROCESS_JOIN);

    performanceAnnotationEClass = createEClass(PERFORMANCE_ANNOTATION);
    createEAttribute(performanceAnnotationEClass, PERFORMANCE_ANNOTATION__CONCURRENT_USERS);
    createEAttribute(performanceAnnotationEClass, PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT);

    localPerformanceAnnotationEClass = createEClass(LOCAL_PERFORMANCE_ANNOTATION);
    createEAttribute(localPerformanceAnnotationEClass, LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME);
    createEAttribute(localPerformanceAnnotationEClass, LOCAL_PERFORMANCE_ANNOTATION__WEIGHT);

    flowNodeEClass = createEClass(FLOW_NODE);
    createEReference(flowNodeEClass, FLOW_NODE__INCOMING);
    createEReference(flowNodeEClass, FLOW_NODE__OUTGOING);

    flowEdgeEClass = createEClass(FLOW_EDGE);
    createEReference(flowEdgeEClass, FLOW_EDGE__TARGET);
    createEReference(flowEdgeEClass, FLOW_EDGE__SOURCE);

    controlFlowEClass = createEClass(CONTROL_FLOW);
    createEAttribute(controlFlowEClass, CONTROL_FLOW__CONDITION);
    createEAttribute(controlFlowEClass, CONTROL_FLOW__PROBABILITY);

    objectFlowEClass = createEClass(OBJECT_FLOW);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    activityEClass = createEClass(ACTIVITY);

    objectNodeEClass = createEClass(OBJECT_NODE);

    initialNodeEClass = createEClass(INITIAL_NODE);

    finalNodeEClass = createEClass(FINAL_NODE);

    forkNodeEClass = createEClass(FORK_NODE);

    joinNodeEClass = createEClass(JOIN_NODE);

    decisionNodeEClass = createEClass(DECISION_NODE);

    // Create enums
    expressionLanguageEEnum = createEEnum(EXPRESSION_LANGUAGE);
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
    processFlowEdgeEClass.getESuperTypes().add(this.getFlowEdge());
    processFlowNodeEClass.getESuperTypes().add(this.getFlowNode());
    activityPerformanceAnnotationEClass.getESuperTypes().add(this.getLocalPerformanceAnnotation());
    processPerformanceAnnotationEClass.getESuperTypes().add(this.getPerformanceAnnotation());
    processControlFlowEClass.getESuperTypes().add(this.getProcessFlowEdge());
    processControlFlowEClass.getESuperTypes().add(this.getControlFlow());
    serviceActivityEClass.getESuperTypes().add(this.getProcessFlowNode());
    serviceActivityEClass.getESuperTypes().add(this.getActivity());
    processStartEClass.getESuperTypes().add(this.getProcessFlowNode());
    processStartEClass.getESuperTypes().add(this.getInitialNode());
    processFinishEClass.getESuperTypes().add(this.getProcessFlowNode());
    processFinishEClass.getESuperTypes().add(this.getFinalNode());
    processDecisionEClass.getESuperTypes().add(this.getProcessFlowNode());
    processDecisionEClass.getESuperTypes().add(this.getDecisionNode());
    processForkEClass.getESuperTypes().add(this.getProcessFlowNode());
    processForkEClass.getESuperTypes().add(this.getForkNode());
    processJoinEClass.getESuperTypes().add(this.getProcessFlowNode());
    processJoinEClass.getESuperTypes().add(this.getJoinNode());
    localPerformanceAnnotationEClass.getESuperTypes().add(this.getPerformanceAnnotation());
    controlFlowEClass.getESuperTypes().add(this.getFlowEdge());
    objectFlowEClass.getESuperTypes().add(this.getFlowEdge());
    activityEClass.getESuperTypes().add(this.getFlowNode());
    activityEClass.getESuperTypes().add(this.getNamedElement());
    objectNodeEClass.getESuperTypes().add(this.getFlowNode());
    objectNodeEClass.getESuperTypes().add(this.getNamedElement());
    initialNodeEClass.getESuperTypes().add(this.getFlowNode());
    finalNodeEClass.getESuperTypes().add(this.getFlowNode());
    forkNodeEClass.getESuperTypes().add(this.getFlowNode());
    joinNodeEClass.getESuperTypes().add(this.getFlowNode());
    decisionNodeEClass.getESuperTypes().add(this.getFlowNode());

    // Initialize classes and features; add operations and parameters
    initEClass(serviceProcessEClass, ServiceProcess.class, "ServiceProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceProcess_Nodes(), this.getProcessFlowNode(), null, "nodes", null, 0, -1, ServiceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProcess_Edges(), this.getProcessFlowEdge(), null, "edges", null, 0, -1, ServiceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProcess_ActivityPerformance(), this.getActivityPerformanceAnnotation(), null, "activityPerformance", null, 0, -1, ServiceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProcess_ProcessPerformance(), this.getProcessPerformanceAnnotation(), null, "processPerformance", null, 0, 1, ServiceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processFlowEdgeEClass, ProcessFlowEdge.class, "ProcessFlowEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processFlowNodeEClass, ProcessFlowNode.class, "ProcessFlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityPerformanceAnnotationEClass, ActivityPerformanceAnnotation.class, "ActivityPerformanceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityPerformanceAnnotation_ExecNode(), this.getServiceActivity(), this.getServiceActivity_Annotation(), "execNode", null, 0, 1, ActivityPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivityPerformanceAnnotation_ManuallyAdded(), ecorePackage.getEBoolean(), "manuallyAdded", "true", 0, 1, ActivityPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processPerformanceAnnotationEClass, ProcessPerformanceAnnotation.class, "ProcessPerformanceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processControlFlowEClass, ProcessControlFlow.class, "ProcessControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serviceActivityEClass, ServiceActivity.class, "ServiceActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceActivity_Annotation(), this.getActivityPerformanceAnnotation(), this.getActivityPerformanceAnnotation_ExecNode(), "annotation", null, 0, 1, ServiceActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processStartEClass, ProcessStart.class, "ProcessStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processFinishEClass, ProcessFinish.class, "ProcessFinish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processDecisionEClass, ProcessDecision.class, "ProcessDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processForkEClass, ProcessFork.class, "ProcessFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processJoinEClass, ProcessJoin.class, "ProcessJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(performanceAnnotationEClass, PerformanceAnnotation.class, "PerformanceAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerformanceAnnotation_ConcurrentUsers(), ecorePackage.getEDoubleObject(), "concurrentUsers", "1", 0, 1, PerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceAnnotation_SecsTimeLimit(), ecorePackage.getEDoubleObject(), "secsTimeLimit", "0", 0, 1, PerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localPerformanceAnnotationEClass, LocalPerformanceAnnotation.class, "LocalPerformanceAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalPerformanceAnnotation_MinimumTime(), ecorePackage.getEDoubleObject(), "minimumTime", "0", 0, 1, LocalPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocalPerformanceAnnotation_Weight(), ecorePackage.getEDoubleObject(), "weight", "1", 0, 1, LocalPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowNodeEClass, FlowNode.class, "FlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlowNode_Incoming(), this.getFlowEdge(), this.getFlowEdge_Target(), "incoming", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowNode_Outgoing(), this.getFlowEdge(), this.getFlowEdge_Source(), "outgoing", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowEdgeEClass, FlowEdge.class, "FlowEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlowEdge_Target(), this.getFlowNode(), this.getFlowNode_Incoming(), "target", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowEdge_Source(), this.getFlowNode(), this.getFlowNode_Outgoing(), "source", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControlFlow_Condition(), ecorePackage.getEString(), "condition", "", 0, 1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getControlFlow_Probability(), ecorePackage.getEDoubleObject(), "probability", "1", 0, 1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(initialNodeEClass, InitialNode.class, "InitialNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forkNodeEClass, ForkNode.class, "ForkNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(joinNodeEClass, JoinNode.class, "JoinNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(expressionLanguageEEnum, ExpressionLanguage.class, "ExpressionLanguage");
    addEEnumLiteral(expressionLanguageEEnum, ExpressionLanguage.OCL);
    addEEnumLiteral(expressionLanguageEEnum, ExpressionLanguage.JML);

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
       "foo", "bar"
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
      (processFlowEdgeEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "width", "3"
       });						
    addAnnotation
      (getServiceActivity_Annotation(), 
       source, 
       new String[] 
       {
       "label", "performance",
       "style", "dash",
       "tool.name", "Link Performance Annotation"
       });							
    addAnnotation
      (flowEdgeEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "width", "3"
       });		
    addAnnotation
      (controlFlowEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "tool.name", "Control Flow",
       "label", "condition,probability"
       });		
    addAnnotation
      (objectFlowEClass, 
       source, 
       new String[] 
       {
       "style", "dash",
       "target.decoration", "arrow",
       "tool.name", "Object Flow"
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
      (activityPerformanceAnnotationEClass, 
       source, 
       new String[] 
       {
       "label.pattern", "<<sapc>>",
       "tool.name", "Service Activity Performance Constraint"
       });			
    addAnnotation
      (processPerformanceAnnotationEClass, 
       source, 
       new String[] 
       {
       "label.pattern", "<<sppc>>",
       "tool.name", "Service Process Performance Constraint"
       });		
    addAnnotation
      (serviceActivityEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Service Activity"
       });			
    addAnnotation
      (performanceAnnotationEClass, 
       source, 
       new String[] 
       {
       "label", "concurrentUsers",
       "figure", "rectangle"
       });									
    addAnnotation
      (namedElementEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (activityEClass, 
       source, 
       new String[] 
       {
       "figure", "es.uca.modeling.figures.CapsuleFigure",
       "label.icon", "false",
       "tool.name", "Executable Node"
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
       "figure", "es.uca.modeling.figures.FgFilledCircleFigure",
       "border.color", "0,0,0",
       "size", "30,30",
       "tool.name", "Start"
       });		
    addAnnotation
      (finalNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "es.uca.modeling.figures.FgBgFilledCircleFigure",
       "border.color", "0,0,0",
       "size", "30,30",
       "tool.name", "Finish"
       });		
    addAnnotation
      (forkNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "es.uca.modeling.figures.FgFilledRectangleFigure",
       "border.color", "0,0,0",
       "size", "15,30",
       "tool.name", "Fork"
       });		
    addAnnotation
      (joinNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "es.uca.modeling.figures.FgFilledRectangleFigure",
       "border.color", "0,0,0",
       "size", "15,30",
       "tool.name", "Join"
       });		
    addAnnotation
      (decisionNodeEClass, 
       source, 
       new String[] 
       {
       "figure", "es.uca.modeling.figures.DiamondFigure",
       "border.color", "0,0,0",
       "size", "30,30",
       "tool.name", "Decision"
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
      (getActivityPerformanceAnnotation_ManuallyAdded(), 
       source, 
       new String[] 
       {
       "label.readOnly", "true"
       });						
    addAnnotation
      (getPerformanceAnnotation_ConcurrentUsers(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getPerformanceAnnotation_SecsTimeLimit(), 
       source, 
       new String[] 
       {
       "label.readOnly", "true"
       });		
    addAnnotation
      (getLocalPerformanceAnnotation_MinimumTime(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getLocalPerformanceAnnotation_Weight(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });											
  }

} //ServiceProcessPackageImpl
