/**
 */
package serviceProcess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceProcess.ServiceActivity#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getServiceActivity()
 * @model annotation="gmf.node tool.name='Service Activity'"
 * @generated
 */
public interface ServiceActivity extends ProcessFlowNode, Activity
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceProcess.ActivityPerformanceAnnotation#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' reference.
   * @see #setAnnotation(ActivityPerformanceAnnotation)
   * @see serviceProcess.ServiceProcessPackage#getServiceActivity_Annotation()
   * @see serviceProcess.ActivityPerformanceAnnotation#getExecNode
   * @model opposite="execNode"
   *        annotation="gmf.link label='performance' style='dash' tool.name='Link Performance Annotation'"
   * @generated
   */
  ActivityPerformanceAnnotation getAnnotation();

  /**
   * Sets the value of the '{@link serviceProcess.ServiceActivity#getAnnotation <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(ActivityPerformanceAnnotation value);

} // ServiceActivity
