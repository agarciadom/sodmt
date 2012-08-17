/**
 */
package serviceProcess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceProcess.ActivityPerformanceAnnotation#getExecNode <em>Exec Node</em>}</li>
 *   <li>{@link serviceProcess.ActivityPerformanceAnnotation#isManuallyAdded <em>Manually Added</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getActivityPerformanceAnnotation()
 * @model annotation="gmf.node label.pattern='<<sapc>>' tool.name='Service Activity Performance Constraint'"
 * @generated
 */
public interface ActivityPerformanceAnnotation extends LocalPerformanceAnnotation
{
  /**
   * Returns the value of the '<em><b>Exec Node</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceProcess.ServiceActivity#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exec Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec Node</em>' reference.
   * @see #setExecNode(ServiceActivity)
   * @see serviceProcess.ServiceProcessPackage#getActivityPerformanceAnnotation_ExecNode()
   * @see serviceProcess.ServiceActivity#getAnnotation
   * @model opposite="annotation"
   * @generated
   */
  ServiceActivity getExecNode();

  /**
   * Sets the value of the '{@link serviceProcess.ActivityPerformanceAnnotation#getExecNode <em>Exec Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec Node</em>' reference.
   * @see #getExecNode()
   * @generated
   */
  void setExecNode(ServiceActivity value);

  /**
   * Returns the value of the '<em><b>Manually Added</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manually Added</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manually Added</em>' attribute.
   * @see #setManuallyAdded(boolean)
   * @see serviceProcess.ServiceProcessPackage#getActivityPerformanceAnnotation_ManuallyAdded()
   * @model default="true"
   *        annotation="gmf.label label.readOnly='true'"
   * @generated
   */
  boolean isManuallyAdded();

  /**
   * Sets the value of the '{@link serviceProcess.ActivityPerformanceAnnotation#isManuallyAdded <em>Manually Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manually Added</em>' attribute.
   * @see #isManuallyAdded()
   * @generated
   */
  void setManuallyAdded(boolean value);

} // ActivityPerformanceAnnotation
