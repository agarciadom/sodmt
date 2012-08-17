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
  String eNS_URI = "www.uca.es/modeling/serviceComposition";

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
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__NODES = 0;

  /**
   * The feature id for the '<em><b>Composition Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__COMPOSITION_EDGES = 1;

  /**
   * The feature id for the '<em><b>Activity Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__ACTIVITY_EDGES = 2;

  /**
   * The feature id for the '<em><b>Swimlanes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__SWIMLANES = 3;

  /**
   * The feature id for the '<em><b>Activity Performance</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE = 4;

  /**
   * The number of structural features of the '<em>Service Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_COMPOSITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityElementImpl <em>Activity Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityElementImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityElement()
   * @generated
   */
  int ACTIVITY_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT__ACTIVITY = 0;

  /**
   * The number of structural features of the '<em>Activity Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.FlowEdgeImpl <em>Flow Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.FlowEdgeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getFlowEdge()
   * @generated
   */
  int FLOW_EDGE = 30;

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
   * The meta object id for the '{@link serviceComposition.impl.CompositionFlowEdgeImpl <em>Composition Flow Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionFlowEdgeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionFlowEdge()
   * @generated
   */
  int COMPOSITION_FLOW_EDGE = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FLOW_EDGE__TARGET = FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FLOW_EDGE__SOURCE = FLOW_EDGE__SOURCE;

  /**
   * The number of structural features of the '<em>Composition Flow Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FLOW_EDGE_FEATURE_COUNT = FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.FlowNodeImpl <em>Flow Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.FlowNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getFlowNode()
   * @generated
   */
  int FLOW_NODE = 29;

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
   * The meta object id for the '{@link serviceComposition.impl.CompositionFlowNodeImpl <em>Composition Flow Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionFlowNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionFlowNode()
   * @generated
   */
  int COMPOSITION_FLOW_NODE = 3;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FLOW_NODE__INCOMING = FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FLOW_NODE__OUTGOING = FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Composition Flow Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FLOW_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityFlowEdgeImpl <em>Activity Flow Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityFlowEdgeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityFlowEdge()
   * @generated
   */
  int ACTIVITY_FLOW_EDGE = 4;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FLOW_EDGE__TARGET = FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FLOW_EDGE__SOURCE = FLOW_EDGE__SOURCE;

  /**
   * The number of structural features of the '<em>Activity Flow Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FLOW_EDGE_FEATURE_COUNT = FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityFlowNodeImpl <em>Activity Flow Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityFlowNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityFlowNode()
   * @generated
   */
  int ACTIVITY_FLOW_NODE = 5;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FLOW_NODE__ACTIVITY = ACTIVITY_ELEMENT__ACTIVITY;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FLOW_NODE__INCOMING = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FLOW_NODE__OUTGOING = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Activity Flow Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FLOW_NODE_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.SwimlaneContainerImpl <em>Swimlane Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.SwimlaneContainerImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getSwimlaneContainer()
   * @generated
   */
  int SWIMLANE_CONTAINER = 6;

  /**
   * The feature id for the '<em><b>Swimlane Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIMLANE_CONTAINER__SWIMLANE_NAMES = 0;

  /**
   * The number of structural features of the '<em>Swimlane Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIMLANE_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.PerformanceAnnotationImpl <em>Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.PerformanceAnnotationImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getPerformanceAnnotation()
   * @generated
   */
  int PERFORMANCE_ANNOTATION = 27;

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
   * The meta object id for the '{@link serviceComposition.impl.ActivityPerformanceAnnotationImpl <em>Activity Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityPerformanceAnnotationImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityPerformanceAnnotation()
   * @generated
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION = 7;

  /**
   * The feature id for the '<em><b>Concurrent Users</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__CONCURRENT_USERS = PERFORMANCE_ANNOTATION__CONCURRENT_USERS;

  /**
   * The feature id for the '<em><b>Secs Time Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT = PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT;

  /**
   * The feature id for the '<em><b>Exec Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION__EXEC_NODE = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity Performance Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PERFORMANCE_ANNOTATION_FEATURE_COUNT = PERFORMANCE_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActionPerformanceAnnotationImpl <em>Action Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActionPerformanceAnnotationImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActionPerformanceAnnotation()
   * @generated
   */
  int ACTION_PERFORMANCE_ANNOTATION = 8;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PERFORMANCE_ANNOTATION__ACTIVITY = ACTIVITY_ELEMENT__ACTIVITY;

  /**
   * The feature id for the '<em><b>Concurrent Users</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Secs Time Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Minimum Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME = ACTIVITY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PERFORMANCE_ANNOTATION__WEIGHT = ACTIVITY_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PERFORMANCE_ANNOTATION__ACTION = ACTIVITY_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Manually Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED = ACTIVITY_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Action Performance Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PERFORMANCE_ANNOTATION_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link serviceComposition.impl.CompositionControlFlowImpl <em>Composition Control Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionControlFlowImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionControlFlow()
   * @generated
   */
  int COMPOSITION_CONTROL_FLOW = 9;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_CONTROL_FLOW__TARGET = COMPOSITION_FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_CONTROL_FLOW__SOURCE = COMPOSITION_FLOW_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_CONTROL_FLOW__CONDITION = COMPOSITION_FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_CONTROL_FLOW__PROBABILITY = COMPOSITION_FLOW_EDGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Composition Control Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_CONTROL_FLOW_FEATURE_COUNT = COMPOSITION_FLOW_EDGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.CompositionObjectFlowImpl <em>Composition Object Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionObjectFlowImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionObjectFlow()
   * @generated
   */
  int COMPOSITION_OBJECT_FLOW = 10;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_OBJECT_FLOW__TARGET = COMPOSITION_FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_OBJECT_FLOW__SOURCE = COMPOSITION_FLOW_EDGE__SOURCE;

  /**
   * The number of structural features of the '<em>Composition Object Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_OBJECT_FLOW_FEATURE_COUNT = COMPOSITION_FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityControlFlowImpl <em>Activity Control Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityControlFlowImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityControlFlow()
   * @generated
   */
  int ACTIVITY_CONTROL_FLOW = 11;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_CONTROL_FLOW__TARGET = ACTIVITY_FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_CONTROL_FLOW__SOURCE = ACTIVITY_FLOW_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_CONTROL_FLOW__CONDITION = ACTIVITY_FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_CONTROL_FLOW__PROBABILITY = ACTIVITY_FLOW_EDGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Activity Control Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_FLOW_EDGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityObjectFlowImpl <em>Activity Object Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityObjectFlowImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityObjectFlow()
   * @generated
   */
  int ACTIVITY_OBJECT_FLOW = 12;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_OBJECT_FLOW__TARGET = ACTIVITY_FLOW_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_OBJECT_FLOW__SOURCE = ACTIVITY_FLOW_EDGE__SOURCE;

  /**
   * The number of structural features of the '<em>Activity Object Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_OBJECT_FLOW_FEATURE_COUNT = ACTIVITY_FLOW_EDGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ServiceActivityImpl <em>Service Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ServiceActivityImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getServiceActivity()
   * @generated
   */
  int SERVICE_ACTIVITY = 13;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__INCOMING = COMPOSITION_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__OUTGOING = COMPOSITION_FLOW_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__NAME = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__ANNOTATION = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY__NODES = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Service Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ACTIVITY_FEATURE_COUNT = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link serviceComposition.impl.CompositionStartImpl <em>Composition Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionStartImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionStart()
   * @generated
   */
  int COMPOSITION_START = 14;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_START__INCOMING = COMPOSITION_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_START__OUTGOING = COMPOSITION_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Composition Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_START_FEATURE_COUNT = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.CompositionFinishImpl <em>Composition Finish</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionFinishImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionFinish()
   * @generated
   */
  int COMPOSITION_FINISH = 15;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FINISH__INCOMING = COMPOSITION_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FINISH__OUTGOING = COMPOSITION_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Composition Finish</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FINISH_FEATURE_COUNT = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.CompositionDecisionImpl <em>Composition Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionDecisionImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionDecision()
   * @generated
   */
  int COMPOSITION_DECISION = 16;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_DECISION__INCOMING = COMPOSITION_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_DECISION__OUTGOING = COMPOSITION_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Composition Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_DECISION_FEATURE_COUNT = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.CompositionForkImpl <em>Composition Fork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionForkImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionFork()
   * @generated
   */
  int COMPOSITION_FORK = 17;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FORK__INCOMING = COMPOSITION_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FORK__OUTGOING = COMPOSITION_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Composition Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FORK_FEATURE_COUNT = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.CompositionJoinImpl <em>Composition Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionJoinImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionJoin()
   * @generated
   */
  int COMPOSITION_JOIN = 18;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_JOIN__INCOMING = COMPOSITION_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_JOIN__OUTGOING = COMPOSITION_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Composition Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_JOIN_FEATURE_COUNT = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.CompositionObjectNodeImpl <em>Composition Object Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.CompositionObjectNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionObjectNode()
   * @generated
   */
  int COMPOSITION_OBJECT_NODE = 19;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_OBJECT_NODE__INCOMING = COMPOSITION_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_OBJECT_NODE__OUTGOING = COMPOSITION_FLOW_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_OBJECT_NODE__NAME = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composition Object Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_OBJECT_NODE_FEATURE_COUNT = COMPOSITION_FLOW_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityActionImpl <em>Activity Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityActionImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityAction()
   * @generated
   */
  int ACTIVITY_ACTION = 20;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ACTION__ACTIVITY = ACTIVITY_FLOW_NODE__ACTIVITY;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ACTION__INCOMING = ACTIVITY_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ACTION__OUTGOING = ACTIVITY_FLOW_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ACTION__NAME = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ACTION__ANNOTATION = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Activity Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ACTION_FEATURE_COUNT = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityStartImpl <em>Activity Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityStartImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityStart()
   * @generated
   */
  int ACTIVITY_START = 21;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START__ACTIVITY = ACTIVITY_FLOW_NODE__ACTIVITY;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START__INCOMING = ACTIVITY_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START__OUTGOING = ACTIVITY_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Activity Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_START_FEATURE_COUNT = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityFinishImpl <em>Activity Finish</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityFinishImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityFinish()
   * @generated
   */
  int ACTIVITY_FINISH = 22;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FINISH__ACTIVITY = ACTIVITY_FLOW_NODE__ACTIVITY;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FINISH__INCOMING = ACTIVITY_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FINISH__OUTGOING = ACTIVITY_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Activity Finish</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FINISH_FEATURE_COUNT = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityDecisionImpl <em>Activity Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityDecisionImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityDecision()
   * @generated
   */
  int ACTIVITY_DECISION = 23;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECISION__ACTIVITY = ACTIVITY_FLOW_NODE__ACTIVITY;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECISION__INCOMING = ACTIVITY_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECISION__OUTGOING = ACTIVITY_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Activity Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECISION_FEATURE_COUNT = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityForkImpl <em>Activity Fork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityForkImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityFork()
   * @generated
   */
  int ACTIVITY_FORK = 24;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FORK__ACTIVITY = ACTIVITY_FLOW_NODE__ACTIVITY;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FORK__INCOMING = ACTIVITY_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FORK__OUTGOING = ACTIVITY_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Activity Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FORK_FEATURE_COUNT = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityJoinImpl <em>Activity Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityJoinImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityJoin()
   * @generated
   */
  int ACTIVITY_JOIN = 25;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_JOIN__ACTIVITY = ACTIVITY_FLOW_NODE__ACTIVITY;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_JOIN__INCOMING = ACTIVITY_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_JOIN__OUTGOING = ACTIVITY_FLOW_NODE__OUTGOING;

  /**
   * The number of structural features of the '<em>Activity Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_JOIN_FEATURE_COUNT = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link serviceComposition.impl.ActivityObjectNodeImpl <em>Activity Object Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityObjectNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityObjectNode()
   * @generated
   */
  int ACTIVITY_OBJECT_NODE = 26;

  /**
   * The feature id for the '<em><b>Activity</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_OBJECT_NODE__ACTIVITY = ACTIVITY_FLOW_NODE__ACTIVITY;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_OBJECT_NODE__INCOMING = ACTIVITY_FLOW_NODE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_OBJECT_NODE__OUTGOING = ACTIVITY_FLOW_NODE__OUTGOING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_OBJECT_NODE__NAME = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity Object Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_OBJECT_NODE_FEATURE_COUNT = ACTIVITY_FLOW_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link serviceComposition.impl.LocalPerformanceAnnotationImpl <em>Local Performance Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.LocalPerformanceAnnotationImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getLocalPerformanceAnnotation()
   * @generated
   */
  int LOCAL_PERFORMANCE_ANNOTATION = 28;

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
   * The meta object id for the '{@link serviceComposition.impl.ControlFlowImpl <em>Control Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ControlFlowImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getControlFlow()
   * @generated
   */
  int CONTROL_FLOW = 31;

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
   * The meta object id for the '{@link serviceComposition.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ObjectFlowImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getObjectFlow()
   * @generated
   */
  int OBJECT_FLOW = 32;

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
   * The meta object id for the '{@link serviceComposition.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.NamedElementImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 33;

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
   * The meta object id for the '{@link serviceComposition.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ActivityImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 34;

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
   * The meta object id for the '{@link serviceComposition.impl.ObjectNodeImpl <em>Object Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ObjectNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getObjectNode()
   * @generated
   */
  int OBJECT_NODE = 35;

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
   * The meta object id for the '{@link serviceComposition.impl.InitialNodeImpl <em>Initial Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.InitialNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getInitialNode()
   * @generated
   */
  int INITIAL_NODE = 36;

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
   * The meta object id for the '{@link serviceComposition.impl.FinalNodeImpl <em>Final Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.FinalNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getFinalNode()
   * @generated
   */
  int FINAL_NODE = 37;

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
   * The meta object id for the '{@link serviceComposition.impl.ForkNodeImpl <em>Fork Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.ForkNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getForkNode()
   * @generated
   */
  int FORK_NODE = 38;

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
   * The meta object id for the '{@link serviceComposition.impl.JoinNodeImpl <em>Join Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.JoinNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getJoinNode()
   * @generated
   */
  int JOIN_NODE = 39;

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
   * The meta object id for the '{@link serviceComposition.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.impl.DecisionNodeImpl
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getDecisionNode()
   * @generated
   */
  int DECISION_NODE = 40;

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
   * The meta object id for the '{@link serviceComposition.ExpressionLanguage <em>Expression Language</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.ExpressionLanguage
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getExpressionLanguage()
   * @generated
   */
  int EXPRESSION_LANGUAGE = 41;

  /**
   * The meta object id for the '{@link serviceComposition.VisitStatus <em>Visit Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.VisitStatus
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getVisitStatus()
   * @generated
   */
  int VISIT_STATUS = 42;

  /**
   * The meta object id for the '{@link serviceComposition.NodeSide <em>Node Side</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see serviceComposition.NodeSide
   * @see serviceComposition.impl.ServiceCompositionPackageImpl#getNodeSide()
   * @generated
   */
  int NODE_SIDE = 43;


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
   * Returns the meta object for the containment reference list '{@link serviceComposition.ServiceComposition#getCompositionEdges <em>Composition Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Composition Edges</em>'.
   * @see serviceComposition.ServiceComposition#getCompositionEdges()
   * @see #getServiceComposition()
   * @generated
   */
  EReference getServiceComposition_CompositionEdges();

  /**
   * Returns the meta object for the containment reference list '{@link serviceComposition.ServiceComposition#getActivityEdges <em>Activity Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activity Edges</em>'.
   * @see serviceComposition.ServiceComposition#getActivityEdges()
   * @see #getServiceComposition()
   * @generated
   */
  EReference getServiceComposition_ActivityEdges();

  /**
   * Returns the meta object for the containment reference '{@link serviceComposition.ServiceComposition#getSwimlanes <em>Swimlanes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Swimlanes</em>'.
   * @see serviceComposition.ServiceComposition#getSwimlanes()
   * @see #getServiceComposition()
   * @generated
   */
  EReference getServiceComposition_Swimlanes();

  /**
   * Returns the meta object for the containment reference list '{@link serviceComposition.ServiceComposition#getActivityPerformance <em>Activity Performance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activity Performance</em>'.
   * @see serviceComposition.ServiceComposition#getActivityPerformance()
   * @see #getServiceComposition()
   * @generated
   */
  EReference getServiceComposition_ActivityPerformance();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityElement <em>Activity Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Element</em>'.
   * @see serviceComposition.ActivityElement
   * @generated
   */
  EClass getActivityElement();

  /**
   * Returns the meta object for the container reference '{@link serviceComposition.ActivityElement#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Activity</em>'.
   * @see serviceComposition.ActivityElement#getActivity()
   * @see #getActivityElement()
   * @generated
   */
  EReference getActivityElement_Activity();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionFlowEdge <em>Composition Flow Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Flow Edge</em>'.
   * @see serviceComposition.CompositionFlowEdge
   * @generated
   */
  EClass getCompositionFlowEdge();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionFlowNode <em>Composition Flow Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Flow Node</em>'.
   * @see serviceComposition.CompositionFlowNode
   * @generated
   */
  EClass getCompositionFlowNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityFlowEdge <em>Activity Flow Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Flow Edge</em>'.
   * @see serviceComposition.ActivityFlowEdge
   * @generated
   */
  EClass getActivityFlowEdge();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityFlowNode <em>Activity Flow Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Flow Node</em>'.
   * @see serviceComposition.ActivityFlowNode
   * @generated
   */
  EClass getActivityFlowNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.SwimlaneContainer <em>Swimlane Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Swimlane Container</em>'.
   * @see serviceComposition.SwimlaneContainer
   * @generated
   */
  EClass getSwimlaneContainer();

  /**
   * Returns the meta object for the attribute list '{@link serviceComposition.SwimlaneContainer#getSwimlaneNames <em>Swimlane Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Swimlane Names</em>'.
   * @see serviceComposition.SwimlaneContainer#getSwimlaneNames()
   * @see #getSwimlaneContainer()
   * @generated
   */
  EAttribute getSwimlaneContainer_SwimlaneNames();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityPerformanceAnnotation <em>Activity Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Performance Annotation</em>'.
   * @see serviceComposition.ActivityPerformanceAnnotation
   * @generated
   */
  EClass getActivityPerformanceAnnotation();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.ActivityPerformanceAnnotation#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exec Node</em>'.
   * @see serviceComposition.ActivityPerformanceAnnotation#getExecNode()
   * @see #getActivityPerformanceAnnotation()
   * @generated
   */
  EReference getActivityPerformanceAnnotation_ExecNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActionPerformanceAnnotation <em>Action Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Performance Annotation</em>'.
   * @see serviceComposition.ActionPerformanceAnnotation
   * @generated
   */
  EClass getActionPerformanceAnnotation();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.ActionPerformanceAnnotation#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see serviceComposition.ActionPerformanceAnnotation#getAction()
   * @see #getActionPerformanceAnnotation()
   * @generated
   */
  EReference getActionPerformanceAnnotation_Action();

  /**
   * Returns the meta object for the attribute '{@link serviceComposition.ActionPerformanceAnnotation#isManuallyAdded <em>Manually Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manually Added</em>'.
   * @see serviceComposition.ActionPerformanceAnnotation#isManuallyAdded()
   * @see #getActionPerformanceAnnotation()
   * @generated
   */
  EAttribute getActionPerformanceAnnotation_ManuallyAdded();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionControlFlow <em>Composition Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Control Flow</em>'.
   * @see serviceComposition.CompositionControlFlow
   * @generated
   */
  EClass getCompositionControlFlow();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionObjectFlow <em>Composition Object Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Object Flow</em>'.
   * @see serviceComposition.CompositionObjectFlow
   * @generated
   */
  EClass getCompositionObjectFlow();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityControlFlow <em>Activity Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Control Flow</em>'.
   * @see serviceComposition.ActivityControlFlow
   * @generated
   */
  EClass getActivityControlFlow();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityObjectFlow <em>Activity Object Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Object Flow</em>'.
   * @see serviceComposition.ActivityObjectFlow
   * @generated
   */
  EClass getActivityObjectFlow();

  /**
   * Returns the meta object for class '{@link serviceComposition.ServiceActivity <em>Service Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Activity</em>'.
   * @see serviceComposition.ServiceActivity
   * @generated
   */
  EClass getServiceActivity();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.ServiceActivity#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Annotation</em>'.
   * @see serviceComposition.ServiceActivity#getAnnotation()
   * @see #getServiceActivity()
   * @generated
   */
  EReference getServiceActivity_Annotation();

  /**
   * Returns the meta object for the containment reference list '{@link serviceComposition.ServiceActivity#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see serviceComposition.ServiceActivity#getNodes()
   * @see #getServiceActivity()
   * @generated
   */
  EReference getServiceActivity_Nodes();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionStart <em>Composition Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Start</em>'.
   * @see serviceComposition.CompositionStart
   * @generated
   */
  EClass getCompositionStart();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionFinish <em>Composition Finish</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Finish</em>'.
   * @see serviceComposition.CompositionFinish
   * @generated
   */
  EClass getCompositionFinish();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionDecision <em>Composition Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Decision</em>'.
   * @see serviceComposition.CompositionDecision
   * @generated
   */
  EClass getCompositionDecision();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionFork <em>Composition Fork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Fork</em>'.
   * @see serviceComposition.CompositionFork
   * @generated
   */
  EClass getCompositionFork();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionJoin <em>Composition Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Join</em>'.
   * @see serviceComposition.CompositionJoin
   * @generated
   */
  EClass getCompositionJoin();

  /**
   * Returns the meta object for class '{@link serviceComposition.CompositionObjectNode <em>Composition Object Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Object Node</em>'.
   * @see serviceComposition.CompositionObjectNode
   * @generated
   */
  EClass getCompositionObjectNode();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityAction <em>Activity Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Action</em>'.
   * @see serviceComposition.ActivityAction
   * @generated
   */
  EClass getActivityAction();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.ActivityAction#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Annotation</em>'.
   * @see serviceComposition.ActivityAction#getAnnotation()
   * @see #getActivityAction()
   * @generated
   */
  EReference getActivityAction_Annotation();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityStart <em>Activity Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Start</em>'.
   * @see serviceComposition.ActivityStart
   * @generated
   */
  EClass getActivityStart();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityFinish <em>Activity Finish</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Finish</em>'.
   * @see serviceComposition.ActivityFinish
   * @generated
   */
  EClass getActivityFinish();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityDecision <em>Activity Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Decision</em>'.
   * @see serviceComposition.ActivityDecision
   * @generated
   */
  EClass getActivityDecision();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityFork <em>Activity Fork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Fork</em>'.
   * @see serviceComposition.ActivityFork
   * @generated
   */
  EClass getActivityFork();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityJoin <em>Activity Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Join</em>'.
   * @see serviceComposition.ActivityJoin
   * @generated
   */
  EClass getActivityJoin();

  /**
   * Returns the meta object for class '{@link serviceComposition.ActivityObjectNode <em>Activity Object Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Object Node</em>'.
   * @see serviceComposition.ActivityObjectNode
   * @generated
   */
  EClass getActivityObjectNode();

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
   * Returns the meta object for class '{@link serviceComposition.FlowNode <em>Flow Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Node</em>'.
   * @see serviceComposition.FlowNode
   * @generated
   */
  EClass getFlowNode();

  /**
   * Returns the meta object for the reference list '{@link serviceComposition.FlowNode#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming</em>'.
   * @see serviceComposition.FlowNode#getIncoming()
   * @see #getFlowNode()
   * @generated
   */
  EReference getFlowNode_Incoming();

  /**
   * Returns the meta object for the reference list '{@link serviceComposition.FlowNode#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see serviceComposition.FlowNode#getOutgoing()
   * @see #getFlowNode()
   * @generated
   */
  EReference getFlowNode_Outgoing();

  /**
   * Returns the meta object for class '{@link serviceComposition.FlowEdge <em>Flow Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Edge</em>'.
   * @see serviceComposition.FlowEdge
   * @generated
   */
  EClass getFlowEdge();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.FlowEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see serviceComposition.FlowEdge#getTarget()
   * @see #getFlowEdge()
   * @generated
   */
  EReference getFlowEdge_Target();

  /**
   * Returns the meta object for the reference '{@link serviceComposition.FlowEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see serviceComposition.FlowEdge#getSource()
   * @see #getFlowEdge()
   * @generated
   */
  EReference getFlowEdge_Source();

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
   * Returns the meta object for class '{@link serviceComposition.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see serviceComposition.Activity
   * @generated
   */
  EClass getActivity();

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
   * Returns the meta object for class '{@link serviceComposition.DecisionNode <em>Decision Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Node</em>'.
   * @see serviceComposition.DecisionNode
   * @generated
   */
  EClass getDecisionNode();

  /**
   * Returns the meta object for enum '{@link serviceComposition.ExpressionLanguage <em>Expression Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Expression Language</em>'.
   * @see serviceComposition.ExpressionLanguage
   * @generated
   */
  EEnum getExpressionLanguage();

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
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__NODES = eINSTANCE.getServiceComposition_Nodes();

    /**
     * The meta object literal for the '<em><b>Composition Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__COMPOSITION_EDGES = eINSTANCE.getServiceComposition_CompositionEdges();

    /**
     * The meta object literal for the '<em><b>Activity Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__ACTIVITY_EDGES = eINSTANCE.getServiceComposition_ActivityEdges();

    /**
     * The meta object literal for the '<em><b>Swimlanes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__SWIMLANES = eINSTANCE.getServiceComposition_Swimlanes();

    /**
     * The meta object literal for the '<em><b>Activity Performance</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_COMPOSITION__ACTIVITY_PERFORMANCE = eINSTANCE.getServiceComposition_ActivityPerformance();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityElementImpl <em>Activity Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityElementImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityElement()
     * @generated
     */
    EClass ACTIVITY_ELEMENT = eINSTANCE.getActivityElement();

    /**
     * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_ELEMENT__ACTIVITY = eINSTANCE.getActivityElement_Activity();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionFlowEdgeImpl <em>Composition Flow Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionFlowEdgeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionFlowEdge()
     * @generated
     */
    EClass COMPOSITION_FLOW_EDGE = eINSTANCE.getCompositionFlowEdge();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionFlowNodeImpl <em>Composition Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionFlowNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionFlowNode()
     * @generated
     */
    EClass COMPOSITION_FLOW_NODE = eINSTANCE.getCompositionFlowNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityFlowEdgeImpl <em>Activity Flow Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityFlowEdgeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityFlowEdge()
     * @generated
     */
    EClass ACTIVITY_FLOW_EDGE = eINSTANCE.getActivityFlowEdge();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityFlowNodeImpl <em>Activity Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityFlowNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityFlowNode()
     * @generated
     */
    EClass ACTIVITY_FLOW_NODE = eINSTANCE.getActivityFlowNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.SwimlaneContainerImpl <em>Swimlane Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.SwimlaneContainerImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getSwimlaneContainer()
     * @generated
     */
    EClass SWIMLANE_CONTAINER = eINSTANCE.getSwimlaneContainer();

    /**
     * The meta object literal for the '<em><b>Swimlane Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWIMLANE_CONTAINER__SWIMLANE_NAMES = eINSTANCE.getSwimlaneContainer_SwimlaneNames();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityPerformanceAnnotationImpl <em>Activity Performance Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityPerformanceAnnotationImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityPerformanceAnnotation()
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
     * The meta object literal for the '{@link serviceComposition.impl.ActionPerformanceAnnotationImpl <em>Action Performance Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActionPerformanceAnnotationImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActionPerformanceAnnotation()
     * @generated
     */
    EClass ACTION_PERFORMANCE_ANNOTATION = eINSTANCE.getActionPerformanceAnnotation();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PERFORMANCE_ANNOTATION__ACTION = eINSTANCE.getActionPerformanceAnnotation_Action();

    /**
     * The meta object literal for the '<em><b>Manually Added</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED = eINSTANCE.getActionPerformanceAnnotation_ManuallyAdded();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionControlFlowImpl <em>Composition Control Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionControlFlowImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionControlFlow()
     * @generated
     */
    EClass COMPOSITION_CONTROL_FLOW = eINSTANCE.getCompositionControlFlow();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionObjectFlowImpl <em>Composition Object Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionObjectFlowImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionObjectFlow()
     * @generated
     */
    EClass COMPOSITION_OBJECT_FLOW = eINSTANCE.getCompositionObjectFlow();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityControlFlowImpl <em>Activity Control Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityControlFlowImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityControlFlow()
     * @generated
     */
    EClass ACTIVITY_CONTROL_FLOW = eINSTANCE.getActivityControlFlow();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityObjectFlowImpl <em>Activity Object Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityObjectFlowImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityObjectFlow()
     * @generated
     */
    EClass ACTIVITY_OBJECT_FLOW = eINSTANCE.getActivityObjectFlow();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ServiceActivityImpl <em>Service Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ServiceActivityImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getServiceActivity()
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
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_ACTIVITY__NODES = eINSTANCE.getServiceActivity_Nodes();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionStartImpl <em>Composition Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionStartImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionStart()
     * @generated
     */
    EClass COMPOSITION_START = eINSTANCE.getCompositionStart();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionFinishImpl <em>Composition Finish</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionFinishImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionFinish()
     * @generated
     */
    EClass COMPOSITION_FINISH = eINSTANCE.getCompositionFinish();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionDecisionImpl <em>Composition Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionDecisionImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionDecision()
     * @generated
     */
    EClass COMPOSITION_DECISION = eINSTANCE.getCompositionDecision();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionForkImpl <em>Composition Fork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionForkImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionFork()
     * @generated
     */
    EClass COMPOSITION_FORK = eINSTANCE.getCompositionFork();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionJoinImpl <em>Composition Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionJoinImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionJoin()
     * @generated
     */
    EClass COMPOSITION_JOIN = eINSTANCE.getCompositionJoin();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.CompositionObjectNodeImpl <em>Composition Object Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.CompositionObjectNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getCompositionObjectNode()
     * @generated
     */
    EClass COMPOSITION_OBJECT_NODE = eINSTANCE.getCompositionObjectNode();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityActionImpl <em>Activity Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityActionImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityAction()
     * @generated
     */
    EClass ACTIVITY_ACTION = eINSTANCE.getActivityAction();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_ACTION__ANNOTATION = eINSTANCE.getActivityAction_Annotation();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityStartImpl <em>Activity Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityStartImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityStart()
     * @generated
     */
    EClass ACTIVITY_START = eINSTANCE.getActivityStart();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityFinishImpl <em>Activity Finish</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityFinishImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityFinish()
     * @generated
     */
    EClass ACTIVITY_FINISH = eINSTANCE.getActivityFinish();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityDecisionImpl <em>Activity Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityDecisionImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityDecision()
     * @generated
     */
    EClass ACTIVITY_DECISION = eINSTANCE.getActivityDecision();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityForkImpl <em>Activity Fork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityForkImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityFork()
     * @generated
     */
    EClass ACTIVITY_FORK = eINSTANCE.getActivityFork();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityJoinImpl <em>Activity Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityJoinImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityJoin()
     * @generated
     */
    EClass ACTIVITY_JOIN = eINSTANCE.getActivityJoin();

    /**
     * The meta object literal for the '{@link serviceComposition.impl.ActivityObjectNodeImpl <em>Activity Object Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityObjectNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivityObjectNode()
     * @generated
     */
    EClass ACTIVITY_OBJECT_NODE = eINSTANCE.getActivityObjectNode();

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
     * The meta object literal for the '{@link serviceComposition.impl.FlowNodeImpl <em>Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.FlowNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getFlowNode()
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
     * The meta object literal for the '{@link serviceComposition.impl.FlowEdgeImpl <em>Flow Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.FlowEdgeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getFlowEdge()
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
     * The meta object literal for the '{@link serviceComposition.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.ActivityImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

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
     * The meta object literal for the '{@link serviceComposition.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.impl.DecisionNodeImpl
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getDecisionNode()
     * @generated
     */
    EClass DECISION_NODE = eINSTANCE.getDecisionNode();

    /**
     * The meta object literal for the '{@link serviceComposition.ExpressionLanguage <em>Expression Language</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see serviceComposition.ExpressionLanguage
     * @see serviceComposition.impl.ServiceCompositionPackageImpl#getExpressionLanguage()
     * @generated
     */
    EEnum EXPRESSION_LANGUAGE = eINSTANCE.getExpressionLanguage();

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
