/**
 */
package serviceProcess;

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
 * @see serviceProcess.ServiceProcessFactory
 * @model kind="package"
 * @generated
 */
public interface ServiceProcessPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "serviceProcess";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "www.uca.es/modeling/performance/sodmt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "perf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServiceProcessPackage eINSTANCE = serviceProcess.impl.ServiceProcessPackageImpl.init();

  /**
   * The meta object id for the '{@link serviceProcess.impl.ServiceProcessImpl <em>Service Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ServiceProcessImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getServiceProcess()
   * @generated
   */
  int SERVICE_PROCESS = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROCESS__NODES = 0;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROCESS__EDGES = 1;

  /**
   * The feature id for the '<em><b>Process Performance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROCESS__PROCESS_PERFORMANCE = 2;

  /**
   * The number of structural features of the '<em>Service Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROCESS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ActivityEdgeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getActivityEdge()
   * @generated
   */
  int ACTIVITY_EDGE = 1;

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
   * The meta object id for the '{@link serviceProcess.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ActivityNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getActivityNode()
   * @generated
   */
  int ACTIVITY_NODE = 2;

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
   * The meta object id for the '{@link serviceProcess.impl.PerformanceAnnotationImpl <em>Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.PerformanceAnnotationImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getPerformanceAnnotation()
   * @generated
   */
  int PERFORMANCE_ANNOTATION = 3;

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
   * The meta object id for the '{@link serviceProcess.impl.LocalPerformanceAnnotationImpl <em>Local Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.LocalPerformanceAnnotationImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getLocalPerformanceAnnotation()
   * @generated
   */
  int LOCAL_PERFORMANCE_ANNOTATION = 4;

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
   * The meta object id for the '{@link serviceProcess.impl.ControlFlowImpl <em>Control Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ControlFlowImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getControlFlow()
   * @generated
   */
  int CONTROL_FLOW = 5;

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
   * The meta object id for the '{@link serviceProcess.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ObjectFlowImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getObjectFlow()
   * @generated
   */
  int OBJECT_FLOW = 6;

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
   * The meta object id for the '{@link serviceProcess.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.NamedElementImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 7;

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
   * The meta object id for the '{@link serviceProcess.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ExecutableNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getExecutableNode()
   * @generated
   */
  int EXECUTABLE_NODE = 8;

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
   * The meta object id for the '{@link serviceProcess.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ActionImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getAction()
   * @generated
   */
  int ACTION = 9;

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
   * The meta object id for the '{@link serviceProcess.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.StructuredActivityNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getStructuredActivityNode()
   * @generated
   */
  int STRUCTURED_ACTIVITY_NODE = 10;

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
   * The meta object id for the '{@link serviceProcess.impl.ObjectNodeImpl <em>Object Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ObjectNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getObjectNode()
   * @generated
   */
  int OBJECT_NODE = 11;

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
   * The meta object id for the '{@link serviceProcess.impl.InitialNodeImpl <em>Initial Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.InitialNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getInitialNode()
   * @generated
   */
  int INITIAL_NODE = 12;

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
   * The meta object id for the '{@link serviceProcess.impl.FinalNodeImpl <em>Final Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.FinalNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getFinalNode()
   * @generated
   */
  int FINAL_NODE = 13;

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
   * The meta object id for the '{@link serviceProcess.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.DecisionNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getDecisionNode()
   * @generated
   */
  int DECISION_NODE = 14;

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
   * The meta object id for the '{@link serviceProcess.impl.ForkNodeImpl <em>Fork Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ForkNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getForkNode()
   * @generated
   */
  int FORK_NODE = 15;

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
   * The meta object id for the '{@link serviceProcess.impl.JoinNodeImpl <em>Join Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.JoinNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getJoinNode()
   * @generated
   */
  int JOIN_NODE = 16;

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
   * The meta object id for the '{@link serviceProcess.impl.MergeNodeImpl <em>Merge Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.MergeNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getMergeNode()
   * @generated
   */
  int MERGE_NODE = 17;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Merge Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.VisitStatus <em>Visit Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.VisitStatus
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getVisitStatus()
   * @generated
   */
  int VISIT_STATUS = 18;

  /**
   * The meta object id for the '{@link serviceProcess.NodeSide <em>Node Side</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.NodeSide
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getNodeSide()
   * @generated
   */
  int NODE_SIDE = 19;


  /**
   * Returns the meta object for class '{@link serviceProcess.ServiceProcess <em>Service Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Process</em>'.
   * @see serviceProcess.ServiceProcess
   * @generated
   */
  EClass getServiceProcess();

  /**
   * Returns the meta object for the containment reference list '{@link serviceProcess.ServiceProcess#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see serviceProcess.ServiceProcess#getNodes()
   * @see #getServiceProcess()
   * @generated
   */
  EReference getServiceProcess_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link serviceProcess.ServiceProcess#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see serviceProcess.ServiceProcess#getEdges()
   * @see #getServiceProcess()
   * @generated
   */
  EReference getServiceProcess_Edges();

  /**
   * Returns the meta object for the containment reference '{@link serviceProcess.ServiceProcess#getProcessPerformance <em>Process Performance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Process Performance</em>'.
   * @see serviceProcess.ServiceProcess#getProcessPerformance()
   * @see #getServiceProcess()
   * @generated
   */
  EReference getServiceProcess_ProcessPerformance();

  /**
   * Returns the meta object for class '{@link serviceProcess.ActivityEdge <em>Activity Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Edge</em>'.
   * @see serviceProcess.ActivityEdge
   * @generated
   */
  EClass getActivityEdge();

  /**
   * Returns the meta object for the reference '{@link serviceProcess.ActivityEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see serviceProcess.ActivityEdge#getSource()
   * @see #getActivityEdge()
   * @generated
   */
  EReference getActivityEdge_Source();

  /**
   * Returns the meta object for the reference '{@link serviceProcess.ActivityEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see serviceProcess.ActivityEdge#getTarget()
   * @see #getActivityEdge()
   * @generated
   */
  EReference getActivityEdge_Target();

  /**
   * Returns the meta object for class '{@link serviceProcess.ActivityNode <em>Activity Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Node</em>'.
   * @see serviceProcess.ActivityNode
   * @generated
   */
  EClass getActivityNode();

  /**
   * Returns the meta object for the reference list '{@link serviceProcess.ActivityNode#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming</em>'.
   * @see serviceProcess.ActivityNode#getIncoming()
   * @see #getActivityNode()
   * @generated
   */
  EReference getActivityNode_Incoming();

  /**
   * Returns the meta object for the reference list '{@link serviceProcess.ActivityNode#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see serviceProcess.ActivityNode#getOutgoing()
   * @see #getActivityNode()
   * @generated
   */
  EReference getActivityNode_Outgoing();

  /**
   * Returns the meta object for class '{@link serviceProcess.PerformanceAnnotation <em>Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Performance Annotation</em>'.
   * @see serviceProcess.PerformanceAnnotation
   * @generated
   */
  EClass getPerformanceAnnotation();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.PerformanceAnnotation#getConcurrentUsers <em>Concurrent Users</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Concurrent Users</em>'.
   * @see serviceProcess.PerformanceAnnotation#getConcurrentUsers()
   * @see #getPerformanceAnnotation()
   * @generated
   */
  EAttribute getPerformanceAnnotation_ConcurrentUsers();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.PerformanceAnnotation#getSecsTimeLimit <em>Secs Time Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secs Time Limit</em>'.
   * @see serviceProcess.PerformanceAnnotation#getSecsTimeLimit()
   * @see #getPerformanceAnnotation()
   * @generated
   */
  EAttribute getPerformanceAnnotation_SecsTimeLimit();

  /**
   * Returns the meta object for class '{@link serviceProcess.LocalPerformanceAnnotation <em>Local Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Performance Annotation</em>'.
   * @see serviceProcess.LocalPerformanceAnnotation
   * @generated
   */
  EClass getLocalPerformanceAnnotation();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.LocalPerformanceAnnotation#getMinimumTime <em>Minimum Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minimum Time</em>'.
   * @see serviceProcess.LocalPerformanceAnnotation#getMinimumTime()
   * @see #getLocalPerformanceAnnotation()
   * @generated
   */
  EAttribute getLocalPerformanceAnnotation_MinimumTime();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.LocalPerformanceAnnotation#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see serviceProcess.LocalPerformanceAnnotation#getWeight()
   * @see #getLocalPerformanceAnnotation()
   * @generated
   */
  EAttribute getLocalPerformanceAnnotation_Weight();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.LocalPerformanceAnnotation#getReps <em>Reps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reps</em>'.
   * @see serviceProcess.LocalPerformanceAnnotation#getReps()
   * @see #getLocalPerformanceAnnotation()
   * @generated
   */
  EAttribute getLocalPerformanceAnnotation_Reps();

  /**
   * Returns the meta object for the reference '{@link serviceProcess.LocalPerformanceAnnotation#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exec Node</em>'.
   * @see serviceProcess.LocalPerformanceAnnotation#getExecNode()
   * @see #getLocalPerformanceAnnotation()
   * @generated
   */
  EReference getLocalPerformanceAnnotation_ExecNode();

  /**
   * Returns the meta object for class '{@link serviceProcess.ControlFlow <em>Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Flow</em>'.
   * @see serviceProcess.ControlFlow
   * @generated
   */
  EClass getControlFlow();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.ControlFlow#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see serviceProcess.ControlFlow#getCondition()
   * @see #getControlFlow()
   * @generated
   */
  EAttribute getControlFlow_Condition();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.ControlFlow#getProbability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Probability</em>'.
   * @see serviceProcess.ControlFlow#getProbability()
   * @see #getControlFlow()
   * @generated
   */
  EAttribute getControlFlow_Probability();

  /**
   * Returns the meta object for class '{@link serviceProcess.ObjectFlow <em>Object Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Flow</em>'.
   * @see serviceProcess.ObjectFlow
   * @generated
   */
  EClass getObjectFlow();

  /**
   * Returns the meta object for class '{@link serviceProcess.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see serviceProcess.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see serviceProcess.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link serviceProcess.ExecutableNode <em>Executable Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Executable Node</em>'.
   * @see serviceProcess.ExecutableNode
   * @generated
   */
  EClass getExecutableNode();

  /**
   * Returns the meta object for the reference '{@link serviceProcess.ExecutableNode#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Annotation</em>'.
   * @see serviceProcess.ExecutableNode#getAnnotation()
   * @see #getExecutableNode()
   * @generated
   */
  EReference getExecutableNode_Annotation();

  /**
   * Returns the meta object for class '{@link serviceProcess.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see serviceProcess.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link serviceProcess.StructuredActivityNode <em>Structured Activity Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structured Activity Node</em>'.
   * @see serviceProcess.StructuredActivityNode
   * @generated
   */
  EClass getStructuredActivityNode();

  /**
   * Returns the meta object for the containment reference list '{@link serviceProcess.StructuredActivityNode#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see serviceProcess.StructuredActivityNode#getNodes()
   * @see #getStructuredActivityNode()
   * @generated
   */
  EReference getStructuredActivityNode_Nodes();

  /**
   * Returns the meta object for class '{@link serviceProcess.ObjectNode <em>Object Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Node</em>'.
   * @see serviceProcess.ObjectNode
   * @generated
   */
  EClass getObjectNode();

  /**
   * Returns the meta object for class '{@link serviceProcess.InitialNode <em>Initial Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial Node</em>'.
   * @see serviceProcess.InitialNode
   * @generated
   */
  EClass getInitialNode();

  /**
   * Returns the meta object for class '{@link serviceProcess.FinalNode <em>Final Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final Node</em>'.
   * @see serviceProcess.FinalNode
   * @generated
   */
  EClass getFinalNode();

  /**
   * Returns the meta object for class '{@link serviceProcess.DecisionNode <em>Decision Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Node</em>'.
   * @see serviceProcess.DecisionNode
   * @generated
   */
  EClass getDecisionNode();

  /**
   * Returns the meta object for class '{@link serviceProcess.ForkNode <em>Fork Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fork Node</em>'.
   * @see serviceProcess.ForkNode
   * @generated
   */
  EClass getForkNode();

  /**
   * Returns the meta object for class '{@link serviceProcess.JoinNode <em>Join Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Node</em>'.
   * @see serviceProcess.JoinNode
   * @generated
   */
  EClass getJoinNode();

  /**
   * Returns the meta object for class '{@link serviceProcess.MergeNode <em>Merge Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Merge Node</em>'.
   * @see serviceProcess.MergeNode
   * @generated
   */
  EClass getMergeNode();

  /**
   * Returns the meta object for enum '{@link serviceProcess.VisitStatus <em>Visit Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visit Status</em>'.
   * @see serviceProcess.VisitStatus
   * @generated
   */
  EEnum getVisitStatus();

  /**
   * Returns the meta object for enum '{@link serviceProcess.NodeSide <em>Node Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Side</em>'.
   * @see serviceProcess.NodeSide
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
  ServiceProcessFactory getServiceProcessFactory();

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
     * The meta object literal for the '{@link serviceProcess.impl.ServiceProcessImpl <em>Service Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ServiceProcessImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getServiceProcess()
     * @generated
     */
    EClass SERVICE_PROCESS = eINSTANCE.getServiceProcess();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROCESS__NODES = eINSTANCE.getServiceProcess_Nodes();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROCESS__EDGES = eINSTANCE.getServiceProcess_Edges();

    /**
     * The meta object literal for the '<em><b>Process Performance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROCESS__PROCESS_PERFORMANCE = eINSTANCE.getServiceProcess_ProcessPerformance();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ActivityEdgeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getActivityEdge()
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
     * The meta object literal for the '{@link serviceProcess.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ActivityNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getActivityNode()
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
     * The meta object literal for the '{@link serviceProcess.impl.PerformanceAnnotationImpl <em>Performance Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.PerformanceAnnotationImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getPerformanceAnnotation()
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
     * The meta object literal for the '{@link serviceProcess.impl.LocalPerformanceAnnotationImpl <em>Local Performance Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.LocalPerformanceAnnotationImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getLocalPerformanceAnnotation()
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
     * The meta object literal for the '{@link serviceProcess.impl.ControlFlowImpl <em>Control Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ControlFlowImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getControlFlow()
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
     * The meta object literal for the '{@link serviceProcess.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ObjectFlowImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getObjectFlow()
     * @generated
     */
    EClass OBJECT_FLOW = eINSTANCE.getObjectFlow();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.NamedElementImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getNamedElement()
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
     * The meta object literal for the '{@link serviceProcess.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ExecutableNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getExecutableNode()
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
     * The meta object literal for the '{@link serviceProcess.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ActionImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.StructuredActivityNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getStructuredActivityNode()
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
     * The meta object literal for the '{@link serviceProcess.impl.ObjectNodeImpl <em>Object Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ObjectNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getObjectNode()
     * @generated
     */
    EClass OBJECT_NODE = eINSTANCE.getObjectNode();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.InitialNodeImpl <em>Initial Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.InitialNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getInitialNode()
     * @generated
     */
    EClass INITIAL_NODE = eINSTANCE.getInitialNode();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.FinalNodeImpl <em>Final Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.FinalNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getFinalNode()
     * @generated
     */
    EClass FINAL_NODE = eINSTANCE.getFinalNode();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.DecisionNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getDecisionNode()
     * @generated
     */
    EClass DECISION_NODE = eINSTANCE.getDecisionNode();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ForkNodeImpl <em>Fork Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ForkNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getForkNode()
     * @generated
     */
    EClass FORK_NODE = eINSTANCE.getForkNode();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.JoinNodeImpl <em>Join Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.JoinNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getJoinNode()
     * @generated
     */
    EClass JOIN_NODE = eINSTANCE.getJoinNode();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.MergeNodeImpl <em>Merge Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.MergeNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getMergeNode()
     * @generated
     */
    EClass MERGE_NODE = eINSTANCE.getMergeNode();

    /**
     * The meta object literal for the '{@link serviceProcess.VisitStatus <em>Visit Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.VisitStatus
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getVisitStatus()
     * @generated
     */
    EEnum VISIT_STATUS = eINSTANCE.getVisitStatus();

    /**
     * The meta object literal for the '{@link serviceProcess.NodeSide <em>Node Side</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.NodeSide
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getNodeSide()
     * @generated
     */
    EEnum NODE_SIDE = eINSTANCE.getNodeSide();

  }

} //ServiceProcessPackage
