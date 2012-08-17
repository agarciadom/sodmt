/**
 */
package serviceComposition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.ActionPerformanceAnnotation#getAction <em>Action</em>}</li>
 *   <li>{@link serviceComposition.ActionPerformanceAnnotation#isManuallyAdded <em>Manually Added</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getActionPerformanceAnnotation()
 * @model annotation="gmf.node label.pattern='<<apc>>' tool.name='Action Performance Constraint'"
 * @generated
 */
public interface ActionPerformanceAnnotation extends ActivityElement, LocalPerformanceAnnotation
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceComposition.ActivityAction#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(ActivityAction)
   * @see serviceComposition.ServiceCompositionPackage#getActionPerformanceAnnotation_Action()
   * @see serviceComposition.ActivityAction#getAnnotation
   * @model opposite="annotation"
   * @generated
   */
  ActivityAction getAction();

  /**
   * Sets the value of the '{@link serviceComposition.ActionPerformanceAnnotation#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ActivityAction value);

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
   * @see serviceComposition.ServiceCompositionPackage#getActionPerformanceAnnotation_ManuallyAdded()
   * @model default="true"
   *        annotation="gmf.label label.readOnly='true'"
   * @generated
   */
  boolean isManuallyAdded();

  /**
   * Sets the value of the '{@link serviceComposition.ActionPerformanceAnnotation#isManuallyAdded <em>Manually Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manually Added</em>' attribute.
   * @see #isManuallyAdded()
   * @generated
   */
  void setManuallyAdded(boolean value);

} // ActionPerformanceAnnotation
