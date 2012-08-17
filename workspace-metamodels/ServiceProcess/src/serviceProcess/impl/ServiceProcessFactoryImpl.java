/**
 */
package serviceProcess.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import serviceProcess.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceProcessFactoryImpl extends EFactoryImpl implements ServiceProcessFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServiceProcessFactory init()
  {
    try
    {
      ServiceProcessFactory theServiceProcessFactory = (ServiceProcessFactory)EPackage.Registry.INSTANCE.getEFactory("www.uca.es/modeling/serviceProcess"); 
      if (theServiceProcessFactory != null)
      {
        return theServiceProcessFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ServiceProcessFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProcessFactoryImpl()
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
      case ServiceProcessPackage.SERVICE_PROCESS: return createServiceProcess();
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION: return createActivityPerformanceAnnotation();
      case ServiceProcessPackage.PROCESS_PERFORMANCE_ANNOTATION: return createProcessPerformanceAnnotation();
      case ServiceProcessPackage.PROCESS_CONTROL_FLOW: return createProcessControlFlow();
      case ServiceProcessPackage.SERVICE_ACTIVITY: return createServiceActivity();
      case ServiceProcessPackage.PROCESS_START: return createProcessStart();
      case ServiceProcessPackage.PROCESS_FINISH: return createProcessFinish();
      case ServiceProcessPackage.PROCESS_DECISION: return createProcessDecision();
      case ServiceProcessPackage.PROCESS_FORK: return createProcessFork();
      case ServiceProcessPackage.PROCESS_JOIN: return createProcessJoin();
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
      case ServiceProcessPackage.EXPRESSION_LANGUAGE:
        return createExpressionLanguageFromString(eDataType, initialValue);
      case ServiceProcessPackage.VISIT_STATUS:
        return createVisitStatusFromString(eDataType, initialValue);
      case ServiceProcessPackage.NODE_SIDE:
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
      case ServiceProcessPackage.EXPRESSION_LANGUAGE:
        return convertExpressionLanguageToString(eDataType, instanceValue);
      case ServiceProcessPackage.VISIT_STATUS:
        return convertVisitStatusToString(eDataType, instanceValue);
      case ServiceProcessPackage.NODE_SIDE:
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
  public ServiceProcess createServiceProcess()
  {
    ServiceProcessImpl serviceProcess = new ServiceProcessImpl();
    return serviceProcess;
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
  public ProcessPerformanceAnnotation createProcessPerformanceAnnotation()
  {
    ProcessPerformanceAnnotationImpl processPerformanceAnnotation = new ProcessPerformanceAnnotationImpl();
    return processPerformanceAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessControlFlow createProcessControlFlow()
  {
    ProcessControlFlowImpl processControlFlow = new ProcessControlFlowImpl();
    return processControlFlow;
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
  public ProcessStart createProcessStart()
  {
    ProcessStartImpl processStart = new ProcessStartImpl();
    return processStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessFinish createProcessFinish()
  {
    ProcessFinishImpl processFinish = new ProcessFinishImpl();
    return processFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessDecision createProcessDecision()
  {
    ProcessDecisionImpl processDecision = new ProcessDecisionImpl();
    return processDecision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessFork createProcessFork()
  {
    ProcessForkImpl processFork = new ProcessForkImpl();
    return processFork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessJoin createProcessJoin()
  {
    ProcessJoinImpl processJoin = new ProcessJoinImpl();
    return processJoin;
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
  public ServiceProcessPackage getServiceProcessPackage()
  {
    return (ServiceProcessPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ServiceProcessPackage getPackage()
  {
    return ServiceProcessPackage.eINSTANCE;
  }

} //ServiceProcessFactoryImpl
