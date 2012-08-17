/**
 */
package serviceComposition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.ActivityPerformanceAnnotation#getExecNode <em>Exec Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getActivityPerformanceAnnotation()
 * @model annotation="gmf.node label.pattern='<<sapc>>' tool.name='Service Activity Performance Constraint'"
 * @generated
 */
public interface ActivityPerformanceAnnotation extends PerformanceAnnotation
{
  /**
   * Returns the value of the '<em><b>Exec Node</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceComposition.ServiceActivity#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exec Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec Node</em>' reference.
   * @see #setExecNode(ServiceActivity)
   * @see serviceComposition.ServiceCompositionPackage#getActivityPerformanceAnnotation_ExecNode()
   * @see serviceComposition.ServiceActivity#getAnnotation
   * @model opposite="annotation"
   * @generated
   */
  ServiceActivity getExecNode();

  /**
   * Sets the value of the '{@link serviceComposition.ActivityPerformanceAnnotation#getExecNode <em>Exec Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec Node</em>' reference.
   * @see #getExecNode()
   * @generated
   */
  void setExecNode(ServiceActivity value);

} // ActivityPerformanceAnnotation
