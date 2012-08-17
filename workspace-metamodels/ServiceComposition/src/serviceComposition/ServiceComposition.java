/**
 */
package serviceComposition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.ServiceComposition#getNodes <em>Nodes</em>}</li>
 *   <li>{@link serviceComposition.ServiceComposition#getCompositionEdges <em>Composition Edges</em>}</li>
 *   <li>{@link serviceComposition.ServiceComposition#getActivityEdges <em>Activity Edges</em>}</li>
 *   <li>{@link serviceComposition.ServiceComposition#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link serviceComposition.ServiceComposition#getActivityPerformance <em>Activity Performance</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getServiceComposition()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface ServiceComposition extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link serviceComposition.CompositionFlowNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see serviceComposition.ServiceCompositionPackage#getServiceComposition_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<CompositionFlowNode> getNodes();

  /**
   * Returns the value of the '<em><b>Composition Edges</b></em>' containment reference list.
   * The list contents are of type {@link serviceComposition.CompositionFlowEdge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composition Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition Edges</em>' containment reference list.
   * @see serviceComposition.ServiceCompositionPackage#getServiceComposition_CompositionEdges()
   * @model containment="true"
   * @generated
   */
  EList<CompositionFlowEdge> getCompositionEdges();

  /**
   * Returns the value of the '<em><b>Activity Edges</b></em>' containment reference list.
   * The list contents are of type {@link serviceComposition.ActivityFlowEdge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity Edges</em>' containment reference list.
   * @see serviceComposition.ServiceCompositionPackage#getServiceComposition_ActivityEdges()
   * @model containment="true"
   * @generated
   */
  EList<ActivityFlowEdge> getActivityEdges();

  /**
   * Returns the value of the '<em><b>Swimlanes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Swimlanes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Swimlanes</em>' containment reference.
   * @see #setSwimlanes(SwimlaneContainer)
   * @see serviceComposition.ServiceCompositionPackage#getServiceComposition_Swimlanes()
   * @model containment="true"
   * @generated
   */
  SwimlaneContainer getSwimlanes();

  /**
   * Sets the value of the '{@link serviceComposition.ServiceComposition#getSwimlanes <em>Swimlanes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Swimlanes</em>' containment reference.
   * @see #getSwimlanes()
   * @generated
   */
  void setSwimlanes(SwimlaneContainer value);

  /**
   * Returns the value of the '<em><b>Activity Performance</b></em>' containment reference list.
   * The list contents are of type {@link serviceComposition.ActivityPerformanceAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity Performance</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity Performance</em>' containment reference list.
   * @see serviceComposition.ServiceCompositionPackage#getServiceComposition_ActivityPerformance()
   * @model containment="true"
   * @generated
   */
  EList<ActivityPerformanceAnnotation> getActivityPerformance();

} // ServiceComposition
