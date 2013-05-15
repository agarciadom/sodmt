/**
 */
package serviceComposition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see serviceComposition.ServiceCompositionFactory
 * @model kind="package"
 * @generated
 */
public interface ServiceCompositionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "serviceComposition";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "www.uca.es/modeling/performance/sodmt/scomp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServiceCompositionPackage eINSTANCE = serviceComposition.impl.ServiceCompositionPackageImpl.init();

  /**
   * The meta object id for the '{@link serviceComposition.impl.ServiceCompositionImpl <em>Service Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ServiceCompositionImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getServiceComposition()
   * @generated
   */
  int SERVICE_COMPOSITION = 0;

  /**
   * The feature id for the '<em><b>Partitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__PARTITIONS = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__NODES = 1;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__EDGES = 2;

  /**
   * The feature id for the '<em><b>Process Performance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__PROCESS_PERFORMANCE = 3;

  /**
   * The number of structural features of the '<em>Service Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link serviceComposition.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.NamedElementImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityPartitionImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityPartition()
   * @generated
   */
  int ACTIVITY_PARTITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PARTITION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PARTITION__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity Partition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PARTITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityEdgeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityEdge()
   * @generated
   */
  int ACTIVITY_EDGE = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_EDGE__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_EDGE__TARGET = 1;

  /**
   * The number of structural features of the '<em>Activity Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_EDGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityNode()
   * @generated
   */
  int ACTIVITY_NODE = 3;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_NODE__INCOMING = 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_NODE__OUTGOING = 1;

  /**
   * The number of structural features of the '<em>Activity Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_NODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.PerformanceAnnotationImpl <em>Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.PerformanceAnnotationImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getPerformanceAnnotation()
   * @generated
   */
  int PERFORMANCE_ANNOTATION = 4;

  /**
   * The feature id for the '<em><b>Concurrent Users</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_ANNOTATION__CONCURRENT_USERS = 0;

  /**
   * The feature id for the '<em><b>Secs Time Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT = 1;

  /**
   * The number of structural features of the '<em>Performance Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.LocalPerformanceAnnotationImpl <em>Local Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.LocalPerformanceAnnotationImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getLocalPerformanceAnnotation()
   * @generated
   */
  int LOCAL_PERFORMANCE_ANNOTATION = 5;

  /**
   * The feature id for the '<em><b>Concurrent Users</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__CONCURRENT_USERS = PERFORMANCE_ANNOTATION__CONCURRENT_USERS;

  /**
   * The feature id for the '<em><b>Secs Time Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT = PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__INCOMING = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__OUTGOING = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Minimum Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__WEIGHT = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Reps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__REPS = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Exec Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Local Performance Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION_FEATURE_COUNT = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ControlFlowImpl <em>Control Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ControlFlowImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getControlFlow()
   * @generated
   */
  int CONTROL_FLOW = 6;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW__CONDITION = ACTIVITY_EDGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW__PROBABILITY = ACTIVITY_EDGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Control Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ObjectFlowImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getObjectFlow()
   * @generated
   */
  int OBJECT_FLOW = 7;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

  /**
   * The number of structural features of the '<em>Object Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ExecutableNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getExecutableNode()
   * @generated
   */
  int EXECUTABLE_NODE = 9;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTABLE_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTABLE_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTABLE_NODE__NAME = ACTIVITY_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTABLE_NODE__ANNOTATION = ACTIVITY_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Executable Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActionImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getAction()
   * @generated
   */
  int ACTION = 10;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__INCOMING = EXECUTABLE_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__OUTGOING = EXECUTABLE_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = EXECUTABLE_NODE__NAME;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ANNOTATION = EXECUTABLE_NODE__ANNOTATION;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.StructuredActivityNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getStructuredActivityNode()
   * @generated
   */
  int STRUCTURED_ACTIVITY_NODE = 11;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_ACTIVITY_NODE__INCOMING = EXECUTABLE_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_ACTIVITY_NODE__OUTGOING = EXECUTABLE_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_ACTIVITY_NODE__NAME = EXECUTABLE_NODE__NAME;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_ACTIVITY_NODE__ANNOTATION = EXECUTABLE_NODE__ANNOTATION;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_ACTIVITY_NODE__NODES = EXECUTABLE_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Structured Activity Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ObjectNodeImpl <em>Object Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ObjectNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getObjectNode()
   * @generated
   */
  int OBJECT_NODE = 12;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE__NAME = ACTIVITY_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.InitialNodeImpl <em>Initial Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.InitialNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getInitialNode()
   * @generated
   */
  int INITIAL_NODE = 13;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Initial Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.FinalNodeImpl <em>Final Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.FinalNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getFinalNode()
   * @generated
   */
  int FINAL_NODE = 14;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Final Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.DecisionNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getDecisionNode()
   * @generated
   */
  int DECISION_NODE = 15;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Decision Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ForkNodeImpl <em>Fork Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ForkNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getForkNode()
   * @generated
   */
  int FORK_NODE = 16;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Fork Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.JoinNodeImpl <em>Join Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.JoinNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getJoinNode()
   * @generated
   */
  int JOIN_NODE = 17;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Join Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.VisitStatus <em>Visit Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.VisitStatus
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getVisitStatus()
   * @generated
   */
  int VISIT_STATUS = 18;

  /**
   * The meta object id for the '{@link serviceComposition.NodeSide <em>Node Side</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.NodeSide
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getNodeSide()
   * @generated
   */
  int NODE_SIDE = 19;


  /**
   * Returns the meta object for class '{@link serviceComposition.ServiceComposition <em>Service Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Composition</em>'.
   * @see serviceComposition.ServiceComposition
   * @generated
   */
  EClass getServiceComposition();

  /**
   * Returns the meta object for the containment reference list '{@link serviceComposition.ServiceComposition#getPartitions <em>Partitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Partitions</em>'.
   * @see serviceComposition.ServiceComposition#getPartitions()
   * @see #getServiceComposition()
   * @generated
   */
  EReference getServiceComposition_Partitions();

  /**
   * Returns the meta object for the containment reference list '{@link serviceComposition.ServiceComposition#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see serviceComposition.ServiceComposition#getNodes()
   * @see #getServiceComposition()
   * @generated
   */
  EReference getServiceComposition_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link serviceComposition.ServiceComposition#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see serviceComposition.ServiceComposition#getEdges()
   * @see #getServiceComposition()
   * @generated
   */
  EReference getServiceComposition_Edges();

  /**
   * Returns the meta object for the containment reference '{@link serviceComposition.ServiceComposition#getProcessPerformance <em>Process Performance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Process Performance</em>'.
   * @see serviceComposition.ServiceComposition#getProcessPerformance()
   * @see #getServiceComposition()
   * @generated
   */
  EReference getServiceComposition_ProcessPerformance();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityPartition <em>Activity Partition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Partition</em>'.
   * @see serviceComposition.ActivityPartition
   * @generated
   */
  EClass getActivityPartition();

  /**
   * Returns the meta object for the containment reference list '{@link serviceComposition.ActivityPartition#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see serviceComposition.ActivityPartition#getNodes()
   * @see #getActivityPartition()
   * @generated
   */
  EReference getActivityPartition_Nodes();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityEdge <em>Activity Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Edge</em>'.
   * @see serviceComposition.ActivityEdge
   * @generated
   */
  EClass getActivityEdge();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.ActivityEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see serviceComposition.ActivityEdge#getSource()
   * @see #getActivityEdge()
   * @generated
   */
  EReference getActivityEdge_Source();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.ActivityEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see serviceComposition.ActivityEdge#getTarget()
   * @see #getActivityEdge()
   * @generated
   */
  EReference getActivityEdge_Target();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityNode <em>Activity Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Node</em>'.
   * @see serviceComposition.ActivityNode
   * @generated
   */
  EClass getActivityNode();

  /**
   * Returns the meta object for the reference list '{@link serviceComposition.ActivityNode#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming</em>'.
   * @see serviceComposition.ActivityNode#getIncoming()
   * @see #getActivityNode()
   * @generated
   */
  EReference getActivityNode_Incoming();

  /**
   * Returns the meta object for the reference list '{@link serviceComposition.ActivityNode#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see serviceComposition.ActivityNode#getOutgoing()
   * @see #getActivityNode()
   * @generated
   */
  EReference getActivityNode_Outgoing();

  /**
   * Returns the meta object for class '{@link serviceComposition.PerformanceAnnotation <em>Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Performance Annotation</em>'.
   * @see serviceComposition.PerformanceAnnotation
   * @generated
   */
  EClass getPerformanceAnnotation();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.PerformanceAnnotation#getConcurrentUsers <em>Concurrent Users</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Concurrent Users</em>'.
   * @see serviceComposition.PerformanceAnnotation#getConcurrentUsers()
   * @see #getPerformanceAnnotation()
   * @generated
   */
  EAttribute getPerformanceAnnotation_ConcurrentUsers();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.PerformanceAnnotation#getSecsTimeLimit <em>Secs Time Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secs Time Limit</em>'.
   * @see serviceComposition.PerformanceAnnotation#getSecsTimeLimit()
   * @see #getPerformanceAnnotation()
   * @generated
   */
  EAttribute getPerformanceAnnotation_SecsTimeLimit();

  /**
   * Returns the meta object for class '{@link serviceComposition.LocalPerformanceAnnotation <em>Local Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Performance Annotation</em>'.
   * @see serviceComposition.LocalPerformanceAnnotation
   * @generated
   */
  EClass getLocalPerformanceAnnotation();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.LocalPerformanceAnnotation#getMinimumTime <em>Minimum Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minimum Time</em>'.
   * @see serviceComposition.LocalPerformanceAnnotation#getMinimumTime()
   * @see #getLocalPerformanceAnnotation()
   * @generated
   */
  EAttribute getLocalPerformanceAnnotation_MinimumTime();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.LocalPerformanceAnnotation#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see serviceComposition.LocalPerformanceAnnotation#getWeight()
   * @see #getLocalPerformanceAnnotation()
   * @generated
   */
  EAttribute getLocalPerformanceAnnotation_Weight();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.LocalPerformanceAnnotation#getReps <em>Reps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reps</em>'.
   * @see serviceComposition.LocalPerformanceAnnotation#getReps()
   * @see #getLocalPerformanceAnnotation()
   * @generated
   */
  EAttribute getLocalPerformanceAnnotation_Reps();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.LocalPerformanceAnnotation#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exec Node</em>'.
   * @see serviceComposition.LocalPerformanceAnnotation#getExecNode()
   * @see #getLocalPerformanceAnnotation()
   * @generated
   */
  EReference getLocalPerformanceAnnotation_ExecNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.ControlFlow <em>Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Flow</em>'.
   * @see serviceComposition.ControlFlow
   * @generated
   */
  EClass getControlFlow();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.ControlFlow#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see serviceComposition.ControlFlow#getCondition()
   * @see #getControlFlow()
   * @generated
   */
  EAttribute getControlFlow_Condition();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.ControlFlow#getProbability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Probability</em>'.
   * @see serviceComposition.ControlFlow#getProbability()
   * @see #getControlFlow()
   * @generated
   */
  EAttribute getControlFlow_Probability();

  /**
   * Returns the meta object for class '{@link serviceComposition.ObjectFlow <em>Object Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Flow</em>'.
   * @see serviceComposition.ObjectFlow
   * @generated
   */
  EClass getObjectFlow();

  /**
   * Returns the meta object for class '{@link serviceComposition.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see serviceComposition.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see serviceComposition.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link serviceComposition.ExecutableNode <em>Executable Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Executable Node</em>'.
   * @see serviceComposition.ExecutableNode
   * @generated
   */
  EClass getExecutableNode();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.ExecutableNode#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Annotation</em>'.
   * @see serviceComposition.ExecutableNode#getAnnotation()
   * @see #getExecutableNode()
   * @generated
   */
  EReference getExecutableNode_Annotation();

  /**
   * Returns the meta object for class '{@link serviceComposition.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see serviceComposition.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link serviceComposition.StructuredActivityNode <em>Structured Activity Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structured Activity Node</em>'.
   * @see serviceComposition.StructuredActivityNode
   * @generated
   */
  EClass getStructuredActivityNode();

  /**
   * Returns the meta object for the containment reference list '{@link serviceComposition.StructuredActivityNode#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see serviceComposition.StructuredActivityNode#getNodes()
   * @see #getStructuredActivityNode()
   * @generated
   */
  EReference getStructuredActivityNode_Nodes();

  /**
   * Returns the meta object for class '{@link serviceComposition.ObjectNode <em>Object Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Node</em>'.
   * @see serviceComposition.ObjectNode
   * @generated
   */
  EClass getObjectNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.InitialNode <em>Initial Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial Node</em>'.
   * @see serviceComposition.InitialNode
   * @generated
   */
  EClass getInitialNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.FinalNode <em>Final Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final Node</em>'.
   * @see serviceComposition.FinalNode
   * @generated
   */
  EClass getFinalNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.DecisionNode <em>Decision Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Node</em>'.
   * @see serviceComposition.DecisionNode
   * @generated
   */
  EClass getDecisionNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.ForkNode <em>Fork Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fork Node</em>'.
   * @see serviceComposition.ForkNode
   * @generated
   */
  EClass getForkNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.JoinNode <em>Join Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Node</em>'.
   * @see serviceComposition.JoinNode
   * @generated
   */
  EClass getJoinNode();

  /**
   * Returns the meta object for enum '{@link serviceComposition.VisitStatus <em>Visit Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visit Status</em>'.
   * @see serviceComposition.VisitStatus
   * @generated
   */
  EEnum getVisitStatus();

  /**
   * Returns the meta object for enum '{@link serviceComposition.NodeSide <em>Node Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Side</em>'.
   * @see serviceComposition.NodeSide
   * @generated
   */
  EEnum getNodeSide();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ServiceCompositionFactory getServiceCompositionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link serviceComposition.impl.ServiceCompositionImpl <em>Service Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ServiceCompositionImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getServiceComposition()
     * @generated
     */
    EClass SERVICE_COMPOSITION = eINSTANCE.getServiceComposition();

    /**
     * The meta object literal for the '<em><b>Partitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__PARTITIONS = eINSTANCE.getServiceComposition_Partitions();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__NODES = eINSTANCE.getServiceComposition_Nodes();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__EDGES = eINSTANCE.getServiceComposition_Edges();

    /**
     * The meta object literal for the '<em><b>Process Performance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__PROCESS_PERFORMANCE = eINSTANCE.getServiceComposition_ProcessPerformance();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityPartitionImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityPartition()
     * @generated
     */
    EClass ACTIVITY_PARTITION = eINSTANCE.getActivityPartition();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_PARTITION__NODES = eINSTANCE.getActivityPartition_Nodes();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityEdgeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityEdge()
     * @generated
     */
    EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityNode()
     * @generated
     */
    EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.PerformanceAnnotationImpl <em>Performance Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.PerformanceAnnotationImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getPerformanceAnnotation()
     * @generated
     */
    EClass PERFORMANCE_ANNOTATION = eINSTANCE.getPerformanceAnnotation();

    /**
     * The meta object literal for the '<em><b>Concurrent Users</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_ANNOTATION__CONCURRENT_USERS = eINSTANCE.getPerformanceAnnotation_ConcurrentUsers();

    /**
     * The meta object literal for the '<em><b>Secs Time Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT = eINSTANCE.getPerformanceAnnotation_SecsTimeLimit();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.LocalPerformanceAnnotationImpl <em>Local Performance Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.LocalPerformanceAnnotationImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getLocalPerformanceAnnotation()
     * @generated
     */
    EClass LOCAL_PERFORMANCE_ANNOTATION = eINSTANCE.getLocalPerformanceAnnotation();

    /**
     * The meta object literal for the '<em><b>Minimum Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME = eINSTANCE.getLocalPerformanceAnnotation_MinimumTime();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_PERFORMANCE_ANNOTATION__WEIGHT = eINSTANCE.getLocalPerformanceAnnotation_Weight();

    /**
     * The meta object literal for the '<em><b>Reps</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_PERFORMANCE_ANNOTATION__REPS = eINSTANCE.getLocalPerformanceAnnotation_Reps();

    /**
     * The meta object literal for the '<em><b>Exec Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_PERFORMANCE_ANNOTATION__EXEC_NODE = eINSTANCE.getLocalPerformanceAnnotation_ExecNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ControlFlowImpl <em>Control Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ControlFlowImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getControlFlow()
     * @generated
     */
    EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_FLOW__CONDITION = eINSTANCE.getControlFlow_Condition();

    /**
     * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_FLOW__PROBABILITY = eINSTANCE.getControlFlow_Probability();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ObjectFlowImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getObjectFlow()
     * @generated
     */
    EClass OBJECT_FLOW = eINSTANCE.getObjectFlow();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.NamedElementImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ExecutableNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getExecutableNode()
     * @generated
     */
    EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTABLE_NODE__ANNOTATION = eINSTANCE.getExecutableNode_Annotation();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActionImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.StructuredActivityNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getStructuredActivityNode()
     * @generated
     */
    EClass STRUCTURED_ACTIVITY_NODE = eINSTANCE.getStructuredActivityNode();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURED_ACTIVITY_NODE__NODES = eINSTANCE.getStructuredActivityNode_Nodes();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ObjectNodeImpl <em>Object Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ObjectNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getObjectNode()
     * @generated
     */
    EClass OBJECT_NODE = eINSTANCE.getObjectNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.InitialNodeImpl <em>Initial Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.InitialNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getInitialNode()
     * @generated
     */
    EClass INITIAL_NODE = eINSTANCE.getInitialNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.FinalNodeImpl <em>Final Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.FinalNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getFinalNode()
     * @generated
     */
    EClass FINAL_NODE = eINSTANCE.getFinalNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.DecisionNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getDecisionNode()
     * @generated
     */
    EClass DECISION_NODE = eINSTANCE.getDecisionNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ForkNodeImpl <em>Fork Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ForkNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getForkNode()
     * @generated
     */
    EClass FORK_NODE = eINSTANCE.getForkNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.JoinNodeImpl <em>Join Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.JoinNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getJoinNode()
     * @generated
     */
    EClass JOIN_NODE = eINSTANCE.getJoinNode();

    /**
     * The meta object literal for the '{@link serviceComposition.VisitStatus <em>Visit Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.VisitStatus
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getVisitStatus()
     * @generated
     */
    EEnum VISIT_STATUS = eINSTANCE.getVisitStatus();

    /**
     * The meta object literal for the '{@link serviceComposition.NodeSide <em>Node Side</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.NodeSide
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getNodeSide()
     * @generated
     */
    EEnum NODE_SIDE = eINSTANCE.getNodeSide();

  }

} //ServiceCompositionPackage
