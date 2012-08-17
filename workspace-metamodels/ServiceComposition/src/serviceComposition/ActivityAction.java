/**
 */
package serviceComposition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.ActivityAction#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getActivityAction()
 * @model annotation="gmf.node tool.name='Activity Action'"
 * @generated
 */
public interface ActivityAction extends ActivityFlowNode, Activity
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceComposition.ActionPerformanceAnnotation#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' reference.
   * @see #setAnnotation(ActionPerformanceAnnotation)
   * @see serviceComposition.ServiceCompositionPackage#getActivityAction_Annotation()
   * @see serviceComposition.ActionPerformanceAnnotation#getAction
   * @model opposite="action"
   *        annotation="gmf.link label='performance' style='dash' tool.name='Link Action Performance Annotation'"
   * @generated
   */
  ActionPerformanceAnnotation getAnnotation();

  /**
   * Sets the value of the '{@link serviceComposition.ActivityAction#getAnnotation <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(ActionPerformanceAnnotation value);

} // ActivityAction
