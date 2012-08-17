/**
 */
package serviceComposition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import serviceComposition.ActionPerformanceAnnotation;
import serviceComposition.Activity;
import serviceComposition.ActivityAction;
import serviceComposition.ActivityControlFlow;
import serviceComposition.ActivityDecision;
import serviceComposition.ActivityElement;
import serviceComposition.ActivityFinish;
import serviceComposition.ActivityFlowEdge;
import serviceComposition.ActivityFlowNode;
import serviceComposition.ActivityFork;
import serviceComposition.ActivityJoin;
import serviceComposition.ActivityObjectFlow;
import serviceComposition.ActivityObjectNode;
import serviceComposition.ActivityPerformanceAnnotation;
import serviceComposition.ActivityStart;
import serviceComposition.CompositionControlFlow;
import serviceComposition.CompositionDecision;
import serviceComposition.CompositionFinish;
import serviceComposition.CompositionFlowEdge;
import serviceComposition.CompositionFlowNode;
import serviceComposition.CompositionFork;
import serviceComposition.CompositionJoin;
import serviceComposition.CompositionObjectFlow;
import serviceComposition.CompositionObjectNode;
import serviceComposition.CompositionStart;
import serviceComposition.ControlFlow;
import serviceComposition.DecisionNode;
import serviceComposition.ExpressionLanguage;
import serviceComposition.FinalNode;
import serviceComposition.FlowEdge;
import serviceComposition.FlowNode;
import serviceComposition.ForkNode;
import serviceComposition.InitialNode;
import serviceComposition.JoinNode;
import serviceComposition.LocalPerformanceAnnotation;
import serviceComposition.NamedElement;
import serviceComposition.NodeSide;
import serviceComposition.ObjectFlow;
import serviceComposition.ObjectNode;
import serviceComposition.PerformanceAnnotation;
import serviceComposition.ServiceActivity;
import serviceComposition.ServiceComposition;
import serviceComposition.ServiceCompositionFactory;
import serviceComposition.ServiceCompositionPackage;
import serviceComposition.SwimlaneContainer;
import serviceComposition.VisitStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCompositionPackageImpl extends EPackageImpl implements ServiceCompositionPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceCompositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionFlowEdgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionFlowNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityFlowEdgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityFlowNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass swimlaneContainerEClass = null;

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
  private EClass actionPerformanceAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionControlFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionObjectFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityControlFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityObjectFlowEClass = null;

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
  private EClass compositionStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionFinishEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionDecisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionForkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionObjectNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityFinishEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityDecisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityForkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityObjectNodeEClass = null;

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
   * @see serviceComposition.ServiceCompositionPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ServiceCompositionPackageImpl()
  {
    super(eNS_URI, ServiceCompositionFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ServiceCompositionPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ServiceCompositionPackage init()
  {
    if (isInited) return (ServiceCompositionPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceCompositionPackage.eNS_URI);

    // Obtain or create and register package
    ServiceCompositionPackageImpl theServiceCompositionPackage = (ServiceCompositionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServiceCompositionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServiceCompositionPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theServiceCompositionPackage.createPackageContents();

    // Initialize created meta-data
    theServiceCompositionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theServiceCompositionPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ServiceCompositionPackage.eNS_URI, theServiceCompositionPackage);
    return theServiceCompositionPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceComposition()
  {
    return serviceCompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceComposition_Nodes()
  {
    return (EReference)serviceCompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceComposition_CompositionEdges()
  {
    return (EReference)serviceCompositionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceComposition_ActivityEdges()
  {
    return (EReference)serviceCompositionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceComposition_Swimlanes()
  {
    return (EReference)serviceCompositionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceComposition_ActivityPerformance()
  {
    return (EReference)serviceCompositionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityElement()
  {
    return activityElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityElement_Activity()
  {
    return (EReference)activityElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionFlowEdge()
  {
    return compositionFlowEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionFlowNode()
  {
    return compositionFlowNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityFlowEdge()
  {
    return activityFlowEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityFlowNode()
  {
    return activityFlowNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwimlaneContainer()
  {
    return swimlaneContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwimlaneContainer_SwimlaneNames()
  {
    return (EAttribute)swimlaneContainerEClass.getEStructuralFeatures().get(0);
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
  public EClass getActionPerformanceAnnotation()
  {
    return actionPerformanceAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionPerformanceAnnotation_Action()
  {
    return (EReference)actionPerformanceAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionPerformanceAnnotation_ManuallyAdded()
  {
    return (EAttribute)actionPerformanceAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionControlFlow()
  {
    return compositionControlFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionObjectFlow()
  {
    return compositionObjectFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityControlFlow()
  {
    return activityControlFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityObjectFlow()
  {
    return activityObjectFlowEClass;
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
  public EReference getServiceActivity_Nodes()
  {
    return (EReference)serviceActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionStart()
  {
    return compositionStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionFinish()
  {
    return compositionFinishEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionDecision()
  {
    return compositionDecisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionFork()
  {
    return compositionForkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionJoin()
  {
    return compositionJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositionObjectNode()
  {
    return compositionObjectNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityAction()
  {
    return activityActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityAction_Annotation()
  {
    return (EReference)activityActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityStart()
  {
    return activityStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityFinish()
  {
    return activityFinishEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityDecision()
  {
    return activityDecisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityFork()
  {
    return activityForkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityJoin()
  {
    return activityJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityObjectNode()
  {
    return activityObjectNodeEClass;
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
  public ServiceCompositionFactory getServiceCompositionFactory()
  {
    return (ServiceCompositionFactory)getEFactoryInstance();
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
    serviceCompositionEClass = createEClass(SERVICE_COMPOSITION);
    createEReference(serviceCompositionEClass, SERVICE_COMPOSITION__NODES);
    createEReference(serviceCompositionEClass, SERVICE_COMPOSITION__COMPOSITION_EDGES);
    createEReference(serviceCompositionEClass, SERVICE_COMPOSITION__ACTIVITY_EDGES);
    createEReference(serviceCompositionEClass, SERVICE_COMPOSITION__SWIMLANES);
    createEReference(serviceCompositionEClass, SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE);

    activityElementEClass = createEClass(ACTIVITY_ELEMENT);
    createEReference(activityElementEClass, ACTIVITY_ELEMENT__ACTIVITY);

    compositionFlowEdgeEClass = createEClass(COMPOSITION_FLOW_EDGE);

    compositionFlowNodeEClass = createEClass(COMPOSITION_FLOW_NODE);

    activityFlowEdgeEClass = createEClass(ACTIVITY_FLOW_EDGE);

    activityFlowNodeEClass = createEClass(ACTIVITY_FLOW_NODE);

    swimlaneContainerEClass = createEClass(SWIMLANE_CONTAINER);
    createEAttribute(swimlaneContainerEClass, SWIMLANE_CONTAINER__SWIMLANE_NAMES);

    activityPerformanceAnnotationEClass = createEClass(ACTIVITY_PERFORMANCE_ANNOTATION);
    createEReference(activityPerformanceAnnotationEClass, ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE);

    actionPerformanceAnnotationEClass = createEClass(ACTION_PERFORMANCE_ANNOTATION);
    createEReference(actionPerformanceAnnotationEClass, ACTION_PERFORMANCE_ANNOTATION__ACTION);
    createEAttribute(actionPerformanceAnnotationEClass, ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED);

    compositionControlFlowEClass = createEClass(COMPOSITION_CONTROL_FLOW);

    compositionObjectFlowEClass = createEClass(COMPOSITION_OBJECT_FLOW);

    activityControlFlowEClass = createEClass(ACTIVITY_CONTROL_FLOW);

    activityObjectFlowEClass = createEClass(ACTIVITY_OBJECT_FLOW);

    serviceActivityEClass = createEClass(SERVICE_ACTIVITY);
    createEReference(serviceActivityEClass, SERVICE_ACTIVITY__ANNOTATION);
    createEReference(serviceActivityEClass, SERVICE_ACTIVITY__NODES);

    compositionStartEClass = createEClass(COMPOSITION_START);

    compositionFinishEClass = createEClass(COMPOSITION_FINISH);

    compositionDecisionEClass = createEClass(COMPOSITION_DECISION);

    compositionForkEClass = createEClass(COMPOSITION_FORK);

    compositionJoinEClass = createEClass(COMPOSITION_JOIN);

    compositionObjectNodeEClass = createEClass(COMPOSITION_OBJECT_NODE);

    activityActionEClass = createEClass(ACTIVITY_ACTION);
    createEReference(activityActionEClass, ACTIVITY_ACTION__ANNOTATION);

    activityStartEClass = createEClass(ACTIVITY_START);

    activityFinishEClass = createEClass(ACTIVITY_FINISH);

    activityDecisionEClass = createEClass(ACTIVITY_DECISION);

    activityForkEClass = createEClass(ACTIVITY_FORK);

    activityJoinEClass = createEClass(ACTIVITY_JOIN);

    activityObjectNodeEClass = createEClass(ACTIVITY_OBJECT_NODE);

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
    compositionFlowEdgeEClass.getESuperTypes().add(this.getFlowEdge());
    compositionFlowNodeEClass.getESuperTypes().add(this.getFlowNode());
    activityFlowEdgeEClass.getESuperTypes().add(this.getFlowEdge());
    activityFlowNodeEClass.getESuperTypes().add(this.getActivityElement());
    activityFlowNodeEClass.getESuperTypes().add(this.getFlowNode());
    activityPerformanceAnnotationEClass.getESuperTypes().add(this.getPerformanceAnnotation());
    actionPerformanceAnnotationEClass.getESuperTypes().add(this.getActivityElement());
    actionPerformanceAnnotationEClass.getESuperTypes().add(this.getLocalPerformanceAnnotation());
    compositionControlFlowEClass.getESuperTypes().add(this.getCompositionFlowEdge());
    compositionControlFlowEClass.getESuperTypes().add(this.getControlFlow());
    compositionObjectFlowEClass.getESuperTypes().add(this.getCompositionFlowEdge());
    compositionObjectFlowEClass.getESuperTypes().add(this.getObjectFlow());
    activityControlFlowEClass.getESuperTypes().add(this.getActivityFlowEdge());
    activityControlFlowEClass.getESuperTypes().add(this.getControlFlow());
    activityObjectFlowEClass.getESuperTypes().add(this.getActivityFlowEdge());
    activityObjectFlowEClass.getESuperTypes().add(this.getObjectFlow());
    serviceActivityEClass.getESuperTypes().add(this.getCompositionFlowNode());
    serviceActivityEClass.getESuperTypes().add(this.getActivity());
    compositionStartEClass.getESuperTypes().add(this.getCompositionFlowNode());
    compositionStartEClass.getESuperTypes().add(this.getInitialNode());
    compositionFinishEClass.getESuperTypes().add(this.getCompositionFlowNode());
    compositionFinishEClass.getESuperTypes().add(this.getFinalNode());
    compositionDecisionEClass.getESuperTypes().add(this.getCompositionFlowNode());
    compositionDecisionEClass.getESuperTypes().add(this.getDecisionNode());
    compositionForkEClass.getESuperTypes().add(this.getCompositionFlowNode());
    compositionForkEClass.getESuperTypes().add(this.getForkNode());
    compositionJoinEClass.getESuperTypes().add(this.getCompositionFlowNode());
    compositionJoinEClass.getESuperTypes().add(this.getJoinNode());
    compositionObjectNodeEClass.getESuperTypes().add(this.getCompositionFlowNode());
    compositionObjectNodeEClass.getESuperTypes().add(this.getObjectNode());
    activityActionEClass.getESuperTypes().add(this.getActivityFlowNode());
    activityActionEClass.getESuperTypes().add(this.getActivity());
    activityStartEClass.getESuperTypes().add(this.getActivityFlowNode());
    activityStartEClass.getESuperTypes().add(this.getInitialNode());
    activityFinishEClass.getESuperTypes().add(this.getActivityFlowNode());
    activityFinishEClass.getESuperTypes().add(this.getFinalNode());
    activityDecisionEClass.getESuperTypes().add(this.getActivityFlowNode());
    activityDecisionEClass.getESuperTypes().add(this.getDecisionNode());
    activityForkEClass.getESuperTypes().add(this.getActivityFlowNode());
    activityForkEClass.getESuperTypes().add(this.getForkNode());
    activityJoinEClass.getESuperTypes().add(this.getActivityFlowNode());
    activityJoinEClass.getESuperTypes().add(this.getJoinNode());
    activityObjectNodeEClass.getESuperTypes().add(this.getActivityFlowNode());
    activityObjectNodeEClass.getESuperTypes().add(this.getObjectNode());
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
    initEClass(serviceCompositionEClass, ServiceComposition.class, "ServiceComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceComposition_Nodes(), this.getCompositionFlowNode(), null, "nodes", null, 0, -1, ServiceComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceComposition_CompositionEdges(), this.getCompositionFlowEdge(), null, "compositionEdges", null, 0, -1, ServiceComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceComposition_ActivityEdges(), this.getActivityFlowEdge(), null, "activityEdges", null, 0, -1, ServiceComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceComposition_Swimlanes(), this.getSwimlaneContainer(), null, "swimlanes", null, 0, 1, ServiceComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceComposition_ActivityPerformance(), this.getActivityPerformanceAnnotation(), null, "activityPerformance", null, 0, -1, ServiceComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityElementEClass, ActivityElement.class, "ActivityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityElement_Activity(), this.getServiceActivity(), this.getServiceActivity_Nodes(), "activity", null, 0, 1, ActivityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositionFlowEdgeEClass, CompositionFlowEdge.class, "CompositionFlowEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionFlowNodeEClass, CompositionFlowNode.class, "CompositionFlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityFlowEdgeEClass, ActivityFlowEdge.class, "ActivityFlowEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityFlowNodeEClass, ActivityFlowNode.class, "ActivityFlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(swimlaneContainerEClass, SwimlaneContainer.class, "SwimlaneContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwimlaneContainer_SwimlaneNames(), ecorePackage.getEString(), "swimlaneNames", null, 0, -1, SwimlaneContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityPerformanceAnnotationEClass, ActivityPerformanceAnnotation.class, "ActivityPerformanceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityPerformanceAnnotation_ExecNode(), this.getServiceActivity(), this.getServiceActivity_Annotation(), "execNode", null, 0, 1, ActivityPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionPerformanceAnnotationEClass, ActionPerformanceAnnotation.class, "ActionPerformanceAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionPerformanceAnnotation_Action(), this.getActivityAction(), this.getActivityAction_Annotation(), "action", null, 0, 1, ActionPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionPerformanceAnnotation_ManuallyAdded(), ecorePackage.getEBoolean(), "manuallyAdded", "true", 0, 1, ActionPerformanceAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositionControlFlowEClass, CompositionControlFlow.class, "CompositionControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionObjectFlowEClass, CompositionObjectFlow.class, "CompositionObjectFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityControlFlowEClass, ActivityControlFlow.class, "ActivityControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityObjectFlowEClass, ActivityObjectFlow.class, "ActivityObjectFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serviceActivityEClass, ServiceActivity.class, "ServiceActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceActivity_Annotation(), this.getActivityPerformanceAnnotation(), this.getActivityPerformanceAnnotation_ExecNode(), "annotation", null, 0, 1, ServiceActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceActivity_Nodes(), this.getActivityElement(), this.getActivityElement_Activity(), "nodes", null, 0, -1, ServiceActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositionStartEClass, CompositionStart.class, "CompositionStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionFinishEClass, CompositionFinish.class, "CompositionFinish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionDecisionEClass, CompositionDecision.class, "CompositionDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionForkEClass, CompositionFork.class, "CompositionFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionJoinEClass, CompositionJoin.class, "CompositionJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionObjectNodeEClass, CompositionObjectNode.class, "CompositionObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityActionEClass, ActivityAction.class, "ActivityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityAction_Annotation(), this.getActionPerformanceAnnotation(), this.getActionPerformanceAnnotation_Action(), "annotation", null, 0, 1, ActivityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityStartEClass, ActivityStart.class, "ActivityStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityFinishEClass, ActivityFinish.class, "ActivityFinish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityDecisionEClass, ActivityDecision.class, "ActivityDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityForkEClass, ActivityFork.class, "ActivityFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityJoinEClass, ActivityJoin.class, "ActivityJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityObjectNodeEClass, ActivityObjectNode.class, "ActivityObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
    // gmf.node
    createGmf_1Annotations();
    // gmf.label
    createGmf_2Annotations();
    // gmf.link
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
      (serviceCompositionEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																																									
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.node";			
    addAnnotation
      (swimlaneContainerEClass, 
       source, 
       new String[] 
       {
       "label", "swimlanes",
       "figure", "es.uca.modeling.figures.SwimlanesFigure",
       "tool.name", "Swimlanes",
       "size", "600,300"
       });		
    addAnnotation
      (activityPerformanceAnnotationEClass, 
       source, 
       new String[] 
       {
       "label.pattern", "<<sapc>>",
       "tool.name", "Service Activity Performance Constraint"
       });		
    addAnnotation
      (actionPerformanceAnnotationEClass, 
       source, 
       new String[] 
       {
       "label.pattern", "<<apc>>",
       "tool.name", "Action Performance Constraint"
       });							
    addAnnotation
      (serviceActivityEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Service Activity",
       "figure", "rounded"
       });				
    addAnnotation
      (compositionStartEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Composition Start"
       });		
    addAnnotation
      (compositionFinishEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Composition Finish"
       });		
    addAnnotation
      (compositionDecisionEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Composition Decision"
       });		
    addAnnotation
      (compositionForkEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Composition Fork"
       });		
    addAnnotation
      (compositionJoinEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Composition Join"
       });		
    addAnnotation
      (compositionObjectNodeEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Composition Object Node"
       });		
    addAnnotation
      (activityActionEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Action"
       });			
    addAnnotation
      (activityStartEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Start"
       });		
    addAnnotation
      (activityFinishEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Finish"
       });		
    addAnnotation
      (activityDecisionEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Decision"
       });		
    addAnnotation
      (activityForkEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Fork"
       });		
    addAnnotation
      (activityJoinEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Join"
       });		
    addAnnotation
      (activityObjectNodeEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Object Node"
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
  protected void createGmf_2Annotations()
  {
    String source = "gmf.label";						
    addAnnotation
      (getActionPerformanceAnnotation_ManuallyAdded(), 
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

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.link";							
    addAnnotation
      (compositionControlFlowEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Composition Control Flow"
       });		
    addAnnotation
      (compositionObjectFlowEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Composition Object Flow"
       });		
    addAnnotation
      (activityControlFlowEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Control Flow"
       });		
    addAnnotation
      (activityObjectFlowEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Activity Object Flow"
       });			
    addAnnotation
      (getServiceActivity_Annotation(), 
       source, 
       new String[] 
       {
       "label", "performance",
       "style", "dash",
       "tool.name", "Link Activity Performance Annotation"
       });										
    addAnnotation
      (getActivityAction_Annotation(), 
       source, 
       new String[] 
       {
       "label", "performance",
       "style", "dash",
       "tool.name", "Link Action Performance Annotation"
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
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.compartment";													
    addAnnotation
      (getServiceActivity_Nodes(), 
       source, 
       new String[] 
       {
       "layout", "free"
       });																														
  }

} //ServiceCompositionPackageImpl
