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
  String eNS_URI = "www.uca.es/modeling/serviceProcess";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sp";

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
   * The feature id for the '<em><b>Activity Performance</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROCESS__ACTIVITY_PERFORMANCE = 2;

  /**
   * The feature id for the '<em><b>Process Performance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROCESS__PROCESS_PERFORMANCE = 3;

  /**
   * The number of structural features of the '<em>Service Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROCESS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link serviceProcess.impl.FlowEdgeImpl <em>Flow Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.FlowEdgeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getFlowEdge()
   * @generated
   */
  int FLOW_EDGE = 15;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_EDGE__TARGET = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_EDGE__SOURCE = 1;

  /**
   * The number of structural features of the '<em>Flow Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_EDGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessFlowEdgeImpl <em>Process Flow Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessFlowEdgeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessFlowEdge()
   * @generated
   */
  int PROCESS_FLOW_EDGE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FLOW_EDGE__TARGET = FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FLOW_EDGE__SOURCE = FLOW_EDGE__SOURCE;

  /**
   * The number of structural features of the '<em>Process Flow Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FLOW_EDGE_FEATURE_COUNT = FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.FlowNodeImpl <em>Flow Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.FlowNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getFlowNode()
   * @generated
   */
  int FLOW_NODE = 14;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_NODE__INCOMING = 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_NODE__OUTGOING = 1;

  /**
   * The number of structural features of the '<em>Flow Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_NODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessFlowNodeImpl <em>Process Flow Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessFlowNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessFlowNode()
   * @generated
   */
  int PROCESS_FLOW_NODE = 2;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FLOW_NODE__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FLOW_NODE__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Process Flow Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FLOW_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.PerformanceAnnotationImpl <em>Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.PerformanceAnnotationImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getPerformanceAnnotation()
   * @generated
   */
  int PERFORMANCE_ANNOTATION = 12;

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
  int LOCAL_PERFORMANCE_ANNOTATION = 13;

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
   * The feature id for the '<em><b>Minimum Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION__WEIGHT = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Performance Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PERFORMANCE_ANNOTATION_FEATURE_COUNT = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ActivityPerformanceAnnotationImpl <em>Activity Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ActivityPerformanceAnnotationImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getActivityPerformanceAnnotation()
   * @generated
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION = 3;

  /**
   * The feature id for the '<em><b>Concurrent Users</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__CONCURRENT_USERS = LOCAL_PERFORMANCE_ANNOTATION__CONCURRENT_USERS;

  /**
   * The feature id for the '<em><b>Secs Time Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT = LOCAL_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT;

  /**
   * The feature id for the '<em><b>Minimum Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__MINIMUM_TIME = LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__WEIGHT = LOCAL_PERFORMANCE_ANNOTATION__WEIGHT;

  /**
   * The feature id for the '<em><b>Exec Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE = LOCAL_PERFORMANCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Manually Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__MANUALLY_ADDED = LOCAL_PERFORMANCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Activity Performance Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION_FEATURE_COUNT = LOCAL_PERFORMANCE_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessPerformanceAnnotationImpl <em>Process Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessPerformanceAnnotationImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessPerformanceAnnotation()
   * @generated
   */
  int PROCESS_PERFORMANCE_ANNOTATION = 4;

  /**
   * The feature id for the '<em><b>Concurrent Users</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_PERFORMANCE_ANNOTATION__CONCURRENT_USERS = PERFORMANCE_ANNOTATION__CONCURRENT_USERS;

  /**
   * The feature id for the '<em><b>Secs Time Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT = PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT;

  /**
   * The number of structural features of the '<em>Process Performance Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_PERFORMANCE_ANNOTATION_FEATURE_COUNT = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessControlFlowImpl <em>Process Control Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessControlFlowImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessControlFlow()
   * @generated
   */
  int PROCESS_CONTROL_FLOW = 5;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_CONTROL_FLOW__TARGET = PROCESS_FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_CONTROL_FLOW__SOURCE = PROCESS_FLOW_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_CONTROL_FLOW__CONDITION = PROCESS_FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_CONTROL_FLOW__PROBABILITY = PROCESS_FLOW_EDGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Process Control Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_CONTROL_FLOW_FEATURE_COUNT = PROCESS_FLOW_EDGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ServiceActivityImpl <em>Service Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ServiceActivityImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getServiceActivity()
   * @generated
   */
  int SERVICE_ACTIVITY = 6;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__INCOMING = PROCESS_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__OUTGOING = PROCESS_FLOW_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__NAME = PROCESS_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__ANNOTATION = PROCESS_FLOW_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Service Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY_FEATURE_COUNT = PROCESS_FLOW_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessStartImpl <em>Process Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessStartImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessStart()
   * @generated
   */
  int PROCESS_START = 7;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_START__INCOMING = PROCESS_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_START__OUTGOING = PROCESS_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Process Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_START_FEATURE_COUNT = PROCESS_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessFinishImpl <em>Process Finish</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessFinishImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessFinish()
   * @generated
   */
  int PROCESS_FINISH = 8;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FINISH__INCOMING = PROCESS_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FINISH__OUTGOING = PROCESS_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Process Finish</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FINISH_FEATURE_COUNT = PROCESS_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessDecisionImpl <em>Process Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessDecisionImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessDecision()
   * @generated
   */
  int PROCESS_DECISION = 9;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECISION__INCOMING = PROCESS_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECISION__OUTGOING = PROCESS_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Process Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECISION_FEATURE_COUNT = PROCESS_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessForkImpl <em>Process Fork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessForkImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessFork()
   * @generated
   */
  int PROCESS_FORK = 10;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FORK__INCOMING = PROCESS_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FORK__OUTGOING = PROCESS_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Process Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FORK_FEATURE_COUNT = PROCESS_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ProcessJoinImpl <em>Process Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ProcessJoinImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessJoin()
   * @generated
   */
  int PROCESS_JOIN = 11;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_JOIN__INCOMING = PROCESS_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_JOIN__OUTGOING = PROCESS_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Process Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_JOIN_FEATURE_COUNT = PROCESS_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ControlFlowImpl <em>Control Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ControlFlowImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getControlFlow()
   * @generated
   */
  int CONTROL_FLOW = 16;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW__TARGET = FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW__SOURCE = FLOW_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW__CONDITION = FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW__PROBABILITY = FLOW_EDGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Control Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLOW_FEATURE_COUNT = FLOW_EDGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ObjectFlowImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getObjectFlow()
   * @generated
   */
  int OBJECT_FLOW = 17;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FLOW__TARGET = FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FLOW__SOURCE = FLOW_EDGE__SOURCE;

  /**
   * The number of structural features of the '<em>Object Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FLOW_FEATURE_COUNT = FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.NamedElementImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 18;

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
   * The meta object id for the '{@link serviceProcess.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ActivityImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 19;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ObjectNodeImpl <em>Object Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ObjectNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getObjectNode()
   * @generated
   */
  int OBJECT_NODE = 20;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE__NAME = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link serviceProcess.impl.InitialNodeImpl <em>Initial Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.InitialNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getInitialNode()
   * @generated
   */
  int INITIAL_NODE = 21;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_NODE__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_NODE__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Initial Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.FinalNodeImpl <em>Final Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.FinalNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getFinalNode()
   * @generated
   */
  int FINAL_NODE = 22;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_NODE__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_NODE__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Final Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.ForkNodeImpl <em>Fork Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.ForkNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getForkNode()
   * @generated
   */
  int FORK_NODE = 23;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_NODE__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_NODE__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Fork Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.JoinNodeImpl <em>Join Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.JoinNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getJoinNode()
   * @generated
   */
  int JOIN_NODE = 24;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_NODE__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_NODE__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Join Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.impl.DecisionNodeImpl
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getDecisionNode()
   * @generated
   */
  int DECISION_NODE = 25;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_NODE__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_NODE__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Decision Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceProcess.ExpressionLanguage <em>Expression Language</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.ExpressionLanguage
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getExpressionLanguage()
   * @generated
   */
  int EXPRESSION_LANGUAGE = 26;

  /**
   * The meta object id for the '{@link serviceProcess.VisitStatus <em>Visit Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.VisitStatus
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getVisitStatus()
   * @generated
   */
  int VISIT_STATUS = 27;

  /**
   * The meta object id for the '{@link serviceProcess.NodeSide <em>Node Side</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceProcess.NodeSide
   * @see serviceProcess.impl.ServiceProcessPackageImpl#getNodeSide()
   * @generated
   */
  int NODE_SIDE = 28;


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
   * Returns the meta object for the containment reference list '{@link serviceProcess.ServiceProcess#getActivityPerformance <em>Activity Performance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activity Performance</em>'.
   * @see serviceProcess.ServiceProcess#getActivityPerformance()
   * @see #getServiceProcess()
   * @generated
   */
  EReference getServiceProcess_ActivityPerformance();

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
   * Returns the meta object for class '{@link serviceProcess.ProcessFlowEdge <em>Process Flow Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Flow Edge</em>'.
   * @see serviceProcess.ProcessFlowEdge
   * @generated
   */
  EClass getProcessFlowEdge();

  /**
   * Returns the meta object for class '{@link serviceProcess.ProcessFlowNode <em>Process Flow Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Flow Node</em>'.
   * @see serviceProcess.ProcessFlowNode
   * @generated
   */
  EClass getProcessFlowNode();

  /**
   * Returns the meta object for class '{@link serviceProcess.ActivityPerformanceAnnotation <em>Activity Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Performance Annotation</em>'.
   * @see serviceProcess.ActivityPerformanceAnnotation
   * @generated
   */
  EClass getActivityPerformanceAnnotation();

  /**
   * Returns the meta object for the reference '{@link serviceProcess.ActivityPerformanceAnnotation#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exec Node</em>'.
   * @see serviceProcess.ActivityPerformanceAnnotation#getExecNode()
   * @see #getActivityPerformanceAnnotation()
   * @generated
   */
  EReference getActivityPerformanceAnnotation_ExecNode();

  /**
   * Returns the meta object for the attribute '{@link serviceProcess.ActivityPerformanceAnnotation#isManuallyAdded <em>Manually Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manually Added</em>'.
   * @see serviceProcess.ActivityPerformanceAnnotation#isManuallyAdded()
   * @see #getActivityPerformanceAnnotation()
   * @generated
   */
  EAttribute getActivityPerformanceAnnotation_ManuallyAdded();

  /**
   * Returns the meta object for class '{@link serviceProcess.ProcessPerformanceAnnotation <em>Process Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Performance Annotation</em>'.
   * @see serviceProcess.ProcessPerformanceAnnotation
   * @generated
   */
  EClass getProcessPerformanceAnnotation();

  /**
   * Returns the meta object for class '{@link serviceProcess.ProcessControlFlow <em>Process Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Control Flow</em>'.
   * @see serviceProcess.ProcessControlFlow
   * @generated
   */
  EClass getProcessControlFlow();

  /**
   * Returns the meta object for class '{@link serviceProcess.ServiceActivity <em>Service Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Activity</em>'.
   * @see serviceProcess.ServiceActivity
   * @generated
   */
  EClass getServiceActivity();

  /**
   * Returns the meta object for the reference '{@link serviceProcess.ServiceActivity#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Annotation</em>'.
   * @see serviceProcess.ServiceActivity#getAnnotation()
   * @see #getServiceActivity()
   * @generated
   */
  EReference getServiceActivity_Annotation();

  /**
   * Returns the meta object for class '{@link serviceProcess.ProcessStart <em>Process Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Start</em>'.
   * @see serviceProcess.ProcessStart
   * @generated
   */
  EClass getProcessStart();

  /**
   * Returns the meta object for class '{@link serviceProcess.ProcessFinish <em>Process Finish</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Finish</em>'.
   * @see serviceProcess.ProcessFinish
   * @generated
   */
  EClass getProcessFinish();

  /**
   * Returns the meta object for class '{@link serviceProcess.ProcessDecision <em>Process Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Decision</em>'.
   * @see serviceProcess.ProcessDecision
   * @generated
   */
  EClass getProcessDecision();

  /**
   * Returns the meta object for class '{@link serviceProcess.ProcessFork <em>Process Fork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Fork</em>'.
   * @see serviceProcess.ProcessFork
   * @generated
   */
  EClass getProcessFork();

  /**
   * Returns the meta object for class '{@link serviceProcess.ProcessJoin <em>Process Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Join</em>'.
   * @see serviceProcess.ProcessJoin
   * @generated
   */
  EClass getProcessJoin();

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
   * Returns the meta object for class '{@link serviceProcess.FlowNode <em>Flow Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Node</em>'.
   * @see serviceProcess.FlowNode
   * @generated
   */
  EClass getFlowNode();

  /**
   * Returns the meta object for the reference list '{@link serviceProcess.FlowNode#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming</em>'.
   * @see serviceProcess.FlowNode#getIncoming()
   * @see #getFlowNode()
   * @generated
   */
  EReference getFlowNode_Incoming();

  /**
   * Returns the meta object for the reference list '{@link serviceProcess.FlowNode#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see serviceProcess.FlowNode#getOutgoing()
   * @see #getFlowNode()
   * @generated
   */
  EReference getFlowNode_Outgoing();

  /**
   * Returns the meta object for class '{@link serviceProcess.FlowEdge <em>Flow Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Edge</em>'.
   * @see serviceProcess.FlowEdge
   * @generated
   */
  EClass getFlowEdge();

  /**
   * Returns the meta object for the reference '{@link serviceProcess.FlowEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see serviceProcess.FlowEdge#getTarget()
   * @see #getFlowEdge()
   * @generated
   */
  EReference getFlowEdge_Target();

  /**
   * Returns the meta object for the reference '{@link serviceProcess.FlowEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see serviceProcess.FlowEdge#getSource()
   * @see #getFlowEdge()
   * @generated
   */
  EReference getFlowEdge_Source();

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
   * Returns the meta object for class '{@link serviceProcess.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see serviceProcess.Activity
   * @generated
   */
  EClass getActivity();

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
   * Returns the meta object for class '{@link serviceProcess.DecisionNode <em>Decision Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Node</em>'.
   * @see serviceProcess.DecisionNode
   * @generated
   */
  EClass getDecisionNode();

  /**
   * Returns the meta object for enum '{@link serviceProcess.ExpressionLanguage <em>Expression Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Expression Language</em>'.
   * @see serviceProcess.ExpressionLanguage
   * @generated
   */
  EEnum getExpressionLanguage();

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
     * The meta object literal for the '<em><b>Activity Performance</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROCESS__ACTIVITY_PERFORMANCE = eINSTANCE.getServiceProcess_ActivityPerformance();

    /**
     * The meta object literal for the '<em><b>Process Performance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROCESS__PROCESS_PERFORMANCE = eINSTANCE.getServiceProcess_ProcessPerformance();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessFlowEdgeImpl <em>Process Flow Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessFlowEdgeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessFlowEdge()
     * @generated
     */
    EClass PROCESS_FLOW_EDGE = eINSTANCE.getProcessFlowEdge();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessFlowNodeImpl <em>Process Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessFlowNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessFlowNode()
     * @generated
     */
    EClass PROCESS_FLOW_NODE = eINSTANCE.getProcessFlowNode();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ActivityPerformanceAnnotationImpl <em>Activity Performance Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ActivityPerformanceAnnotationImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getActivityPerformanceAnnotation()
     * @generated
     */
    EClass ACTIVITY_PERFORMANCE_ANNOTATION = eINSTANCE.getActivityPerformanceAnnotation();

    /**
     * The meta object literal for the '<em><b>Exec Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE = eINSTANCE.getActivityPerformanceAnnotation_ExecNode();

    /**
     * The meta object literal for the '<em><b>Manually Added</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY_PERFORMANCE_ANNOTATION__MANUALLY_ADDED = eINSTANCE.getActivityPerformanceAnnotation_ManuallyAdded();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessPerformanceAnnotationImpl <em>Process Performance Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessPerformanceAnnotationImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessPerformanceAnnotation()
     * @generated
     */
    EClass PROCESS_PERFORMANCE_ANNOTATION = eINSTANCE.getProcessPerformanceAnnotation();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessControlFlowImpl <em>Process Control Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessControlFlowImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessControlFlow()
     * @generated
     */
    EClass PROCESS_CONTROL_FLOW = eINSTANCE.getProcessControlFlow();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ServiceActivityImpl <em>Service Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ServiceActivityImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getServiceActivity()
     * @generated
     */
    EClass SERVICE_ACTIVITY = eINSTANCE.getServiceActivity();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_ACTIVITY__ANNOTATION = eINSTANCE.getServiceActivity_Annotation();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessStartImpl <em>Process Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessStartImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessStart()
     * @generated
     */
    EClass PROCESS_START = eINSTANCE.getProcessStart();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessFinishImpl <em>Process Finish</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessFinishImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessFinish()
     * @generated
     */
    EClass PROCESS_FINISH = eINSTANCE.getProcessFinish();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessDecisionImpl <em>Process Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessDecisionImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessDecision()
     * @generated
     */
    EClass PROCESS_DECISION = eINSTANCE.getProcessDecision();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessForkImpl <em>Process Fork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessForkImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessFork()
     * @generated
     */
    EClass PROCESS_FORK = eINSTANCE.getProcessFork();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.ProcessJoinImpl <em>Process Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ProcessJoinImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getProcessJoin()
     * @generated
     */
    EClass PROCESS_JOIN = eINSTANCE.getProcessJoin();

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
     * The meta object literal for the '{@link serviceProcess.impl.FlowNodeImpl <em>Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.FlowNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getFlowNode()
     * @generated
     */
    EClass FLOW_NODE = eINSTANCE.getFlowNode();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_NODE__INCOMING = eINSTANCE.getFlowNode_Incoming();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_NODE__OUTGOING = eINSTANCE.getFlowNode_Outgoing();

    /**
     * The meta object literal for the '{@link serviceProcess.impl.FlowEdgeImpl <em>Flow Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.FlowEdgeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getFlowEdge()
     * @generated
     */
    EClass FLOW_EDGE = eINSTANCE.getFlowEdge();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_EDGE__TARGET = eINSTANCE.getFlowEdge_Target();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_EDGE__SOURCE = eINSTANCE.getFlowEdge_Source();

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
     * The meta object literal for the '{@link serviceProcess.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.ActivityImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

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
     * The meta object literal for the '{@link serviceProcess.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.impl.DecisionNodeImpl
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getDecisionNode()
     * @generated
     */
    EClass DECISION_NODE = eINSTANCE.getDecisionNode();

    /**
     * The meta object literal for the '{@link serviceProcess.ExpressionLanguage <em>Expression Language</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceProcess.ExpressionLanguage
     * @see serviceProcess.impl.ServiceProcessPackageImpl#getExpressionLanguage()
     * @generated
     */
    EEnum EXPRESSION_LANGUAGE = eINSTANCE.getExpressionLanguage();

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
