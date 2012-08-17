/**
 */
package serviceComposition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.ServiceActivity#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link serviceComposition.ServiceActivity#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getServiceActivity()
 * @model annotation="gmf.node tool.name='Service Activity' figure='rounded'"
 * @generated
 */
public interface ServiceActivity extends CompositionFlowNode, Activity
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceComposition.ActivityPerformanceAnnotation#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' reference.
   * @see #setAnnotation(ActivityPerformanceAnnotation)
   * @see serviceComposition.ServiceCompositionPackage#getServiceActivity_Annotation()
   * @see serviceComposition.ActivityPerformanceAnnotation#getExecNode
   * @model opposite="execNode"
   *        annotation="gmf.link label='performance' style='dash' tool.name='Link Activity Performance Annotation'"
   * @generated
   */
  ActivityPerformanceAnnotation getAnnotation();

  /**
   * Sets the value of the '{@link serviceComposition.ServiceActivity#getAnnotation <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(ActivityPerformanceAnnotation value);

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link serviceComposition.ActivityElement}.
   * It is bidirectional and its opposite is '{@link serviceComposition.ActivityElement#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see serviceComposition.ServiceCompositionPackage#getServiceActivity_Nodes()
   * @see serviceComposition.ActivityElement#getActivity
   * @model opposite="activity" containment="true"
   *        annotation="gmf.compartment layout='free'"
   * @generated
   */
  EList<ActivityElement> getNodes();

} // ServiceActivity
