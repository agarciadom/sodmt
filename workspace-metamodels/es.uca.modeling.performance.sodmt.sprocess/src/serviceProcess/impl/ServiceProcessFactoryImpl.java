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
      ServiceProcessFactory theServiceProcessFactory = (ServiceProcessFactory)EPackage.Registry.INSTANCE.getEFactory("www.uca.es/modeling/performance/sodmt"); 
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
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION: return createPerformanceAnnotation();
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION: return createLocalPerformanceAnnotation();
      case ServiceProcessPackage.CONTROL_FLOW: return createControlFlow();
      case ServiceProcessPackage.OBJECT_FLOW: return createObjectFlow();
      case ServiceProcessPackage.ACTION: return createAction();
      case ServiceProcessPackage.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
      case ServiceProcessPackage.OBJECT_NODE: return createObjectNode();
      case ServiceProcessPackage.INITIAL_NODE: return createInitialNode();
      case ServiceProcessPackage.FINAL_NODE: return createFinalNode();
      case ServiceProcessPackage.DECISION_NODE: return createDecisionNode();
      case ServiceProcessPackage.FORK_NODE: return createForkNode();
      case ServiceProcessPackage.JOIN_NODE: return createJoinNode();
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
  public PerformanceAnnotation createPerformanceAnnotation()
  {
    PerformanceAnnotationImpl performanceAnnotation = new PerformanceAnnotationImpl();
    return performanceAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalPerformanceAnnotation createLocalPerformanceAnnotation()
  {
    LocalPerformanceAnnotationImpl localPerformanceAnnotation = new LocalPerformanceAnnotationImpl();
    return localPerformanceAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFlow createControlFlow()
  {
    ControlFlowImpl controlFlow = new ControlFlowImpl();
    return controlFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectFlow createObjectFlow()
  {
    ObjectFlowImpl objectFlow = new ObjectFlowImpl();
    return objectFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuredActivityNode createStructuredActivityNode()
  {
    StructuredActivityNodeImpl structuredActivityNode = new StructuredActivityNodeImpl();
    return structuredActivityNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectNode createObjectNode()
  {
    ObjectNodeImpl objectNode = new ObjectNodeImpl();
    return objectNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialNode createInitialNode()
  {
    InitialNodeImpl initialNode = new InitialNodeImpl();
    return initialNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinalNode createFinalNode()
  {
    FinalNodeImpl finalNode = new FinalNodeImpl();
    return finalNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionNode createDecisionNode()
  {
    DecisionNodeImpl decisionNode = new DecisionNodeImpl();
    return decisionNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForkNode createForkNode()
  {
    ForkNodeImpl forkNode = new ForkNodeImpl();
    return forkNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinNode createJoinNode()
  {
    JoinNodeImpl joinNode = new JoinNodeImpl();
    return joinNode;
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
