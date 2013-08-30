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
      ServiceCompositionFactory theServiceCompositionFactory = (ServiceCompositionFactory)EPackage.Registry.INSTANCE.getEFactory("www.uca.es/modeling/performance/sodmt/scomp"); 
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
      case ServiceCompositionPackage.ACTIVITY_PARTITION: return createActivityPartition();
      case ServiceCompositionPackage.PERFORMANCE_ANNOTATION: return createPerformanceAnnotation();
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION: return createLocalPerformanceAnnotation();
      case ServiceCompositionPackage.CONTROL_FLOW: return createControlFlow();
      case ServiceCompositionPackage.OBJECT_FLOW: return createObjectFlow();
      case ServiceCompositionPackage.ACTION: return createAction();
      case ServiceCompositionPackage.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
      case ServiceCompositionPackage.OBJECT_NODE: return createObjectNode();
      case ServiceCompositionPackage.INITIAL_NODE: return createInitialNode();
      case ServiceCompositionPackage.FINAL_NODE: return createFinalNode();
      case ServiceCompositionPackage.DECISION_NODE: return createDecisionNode();
      case ServiceCompositionPackage.FORK_NODE: return createForkNode();
      case ServiceCompositionPackage.JOIN_NODE: return createJoinNode();
      case ServiceCompositionPackage.MERGE_NODE: return createMergeNode();
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
  public ActivityPartition createActivityPartition()
  {
    ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
    return activityPartition;
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
  public MergeNode createMergeNode()
  {
    MergeNodeImpl mergeNode = new MergeNodeImpl();
    return mergeNode;
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
