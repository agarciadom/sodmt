/**
 */
package serviceComposition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import serviceComposition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCompositionFactoryImpl extends EFactoryImpl implements ServiceCompositionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServiceCompositionFactory init()
  {
    try
    {
      ServiceCompositionFactory theServiceCompositionFactory = (ServiceCompositionFactory)EPackage.Registry.INSTANCE.getEFactory("www.uca.es/modeling/serviceComposition"); 
      if (theServiceCompositionFactory != null)
      {
        return theServiceCompositionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ServiceCompositionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceCompositionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ServiceCompositionPackage.SERVICE_COMPOSITION: return createServiceComposition();
      case ServiceCompositionPackage.SWIMLANE_CONTAINER: return createSwimlaneContainer();
      case ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION: return createActivityPerformanceAnnotation();
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION: return createActionPerformanceAnnotation();
      case ServiceCompositionPackage.COMPOSITION_CONTROL_FLOW: return createCompositionControlFlow();
      case ServiceCompositionPackage.COMPOSITION_OBJECT_FLOW: return createCompositionObjectFlow();
      case ServiceCompositionPackage.ACTIVITY_CONTROL_FLOW: return createActivityControlFlow();
      case ServiceCompositionPackage.ACTIVITY_OBJECT_FLOW: return createActivityObjectFlow();
      case ServiceCompositionPackage.SERVICE_ACTIVITY: return createServiceActivity();
      case ServiceCompositionPackage.COMPOSITION_START: return createCompositionStart();
      case ServiceCompositionPackage.COMPOSITION_FINISH: return createCompositionFinish();
      case ServiceCompositionPackage.COMPOSITION_DECISION: return createCompositionDecision();
      case ServiceCompositionPackage.COMPOSITION_FORK: return createCompositionFork();
      case ServiceCompositionPackage.COMPOSITION_JOIN: return createCompositionJoin();
      case ServiceCompositionPackage.COMPOSITION_OBJECT_NODE: return createCompositionObjectNode();
      case ServiceCompositionPackage.ACTIVITY_ACTION: return createActivityAction();
      case ServiceCompositionPackage.ACTIVITY_START: return createActivityStart();
      case ServiceCompositionPackage.ACTIVITY_FINISH: return createActivityFinish();
      case ServiceCompositionPackage.ACTIVITY_DECISION: return createActivityDecision();
      case ServiceCompositionPackage.ACTIVITY_FORK: return createActivityFork();
      case ServiceCompositionPackage.ACTIVITY_JOIN: return createActivityJoin();
      case ServiceCompositionPackage.ACTIVITY_OBJECT_NODE: return createActivityObjectNode();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ServiceCompositionPackage.EXPRESSION_LANGUAGE:
        return createExpressionLanguageFromString(eDataType, initialValue);
      case ServiceCompositionPackage.VISIT_STATUS:
        return createVisitStatusFromString(eDataType, initialValue);
      case ServiceCompositionPackage.NODE_SIDE:
        return createNodeSideFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ServiceCompositionPackage.EXPRESSION_LANGUAGE:
        return convertExpressionLanguageToString(eDataType, instanceValue);
      case ServiceCompositionPackage.VISIT_STATUS:
        return convertVisitStatusToString(eDataType, instanceValue);
      case ServiceCompositionPackage.NODE_SIDE:
        return convertNodeSideToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceComposition createServiceComposition()
  {
    ServiceCompositionImpl serviceComposition = new ServiceCompositionImpl();
    return serviceComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwimlaneContainer createSwimlaneContainer()
  {
    SwimlaneContainerImpl swimlaneContainer = new SwimlaneContainerImpl();
    return swimlaneContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityPerformanceAnnotation createActivityPerformanceAnnotation()
  {
    ActivityPerformanceAnnotationImpl activityPerformanceAnnotation = new ActivityPerformanceAnnotationImpl();
    return activityPerformanceAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionPerformanceAnnotation createActionPerformanceAnnotation()
  {
    ActionPerformanceAnnotationImpl actionPerformanceAnnotation = new ActionPerformanceAnnotationImpl();
    return actionPerformanceAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionControlFlow createCompositionControlFlow()
  {
    CompositionControlFlowImpl compositionControlFlow = new CompositionControlFlowImpl();
    return compositionControlFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionObjectFlow createCompositionObjectFlow()
  {
    CompositionObjectFlowImpl compositionObjectFlow = new CompositionObjectFlowImpl();
    return compositionObjectFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityControlFlow createActivityControlFlow()
  {
    ActivityControlFlowImpl activityControlFlow = new ActivityControlFlowImpl();
    return activityControlFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityObjectFlow createActivityObjectFlow()
  {
    ActivityObjectFlowImpl activityObjectFlow = new ActivityObjectFlowImpl();
    return activityObjectFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceActivity createServiceActivity()
  {
    ServiceActivityImpl serviceActivity = new ServiceActivityImpl();
    return serviceActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionStart createCompositionStart()
  {
    CompositionStartImpl compositionStart = new CompositionStartImpl();
    return compositionStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionFinish createCompositionFinish()
  {
    CompositionFinishImpl compositionFinish = new CompositionFinishImpl();
    return compositionFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionDecision createCompositionDecision()
  {
    CompositionDecisionImpl compositionDecision = new CompositionDecisionImpl();
    return compositionDecision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionFork createCompositionFork()
  {
    CompositionForkImpl compositionFork = new CompositionForkImpl();
    return compositionFork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionJoin createCompositionJoin()
  {
    CompositionJoinImpl compositionJoin = new CompositionJoinImpl();
    return compositionJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionObjectNode createCompositionObjectNode()
  {
    CompositionObjectNodeImpl compositionObjectNode = new CompositionObjectNodeImpl();
    return compositionObjectNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityAction createActivityAction()
  {
    ActivityActionImpl activityAction = new ActivityActionImpl();
    return activityAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityStart createActivityStart()
  {
    ActivityStartImpl activityStart = new ActivityStartImpl();
    return activityStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityFinish createActivityFinish()
  {
    ActivityFinishImpl activityFinish = new ActivityFinishImpl();
    return activityFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityDecision createActivityDecision()
  {
    ActivityDecisionImpl activityDecision = new ActivityDecisionImpl();
    return activityDecision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityFork createActivityFork()
  {
    ActivityForkImpl activityFork = new ActivityForkImpl();
    return activityFork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityJoin createActivityJoin()
  {
    ActivityJoinImpl activityJoin = new ActivityJoinImpl();
    return activityJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityObjectNode createActivityObjectNode()
  {
    ActivityObjectNodeImpl activityObjectNode = new ActivityObjectNodeImpl();
    return activityObjectNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionLanguage createExpressionLanguageFromString(EDataType eDataType, String initialValue)
  {
    ExpressionLanguage result = ExpressionLanguage.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertExpressionLanguageToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisitStatus createVisitStatusFromString(EDataType eDataType, String initialValue)
  {
    VisitStatus result = VisitStatus.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisitStatusToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeSide createNodeSideFromString(EDataType eDataType, String initialValue)
  {
    NodeSide result = NodeSide.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNodeSideToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceCompositionPackage getServiceCompositionPackage()
  {
    return (ServiceCompositionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ServiceCompositionPackage getPackage()
  {
    return ServiceCompositionPackage.eINSTANCE;
  }

} //ServiceCompositionFactoryImpl
