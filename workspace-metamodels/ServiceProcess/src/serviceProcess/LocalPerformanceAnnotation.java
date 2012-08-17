/**
 */
package serviceProcess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceProcess.LocalPerformanceAnnotation#getMinimumTime <em>Minimum Time</em>}</li>
 *   <li>{@link serviceProcess.LocalPerformanceAnnotation#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getLocalPerformanceAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface LocalPerformanceAnnotation extends PerformanceAnnotation
{
  /**
   * Returns the value of the '<em><b>Minimum Time</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minimum Time</em>' attribute.
   * @see #setMinimumTime(Double)
   * @see serviceProcess.ServiceProcessPackage#getLocalPerformanceAnnotation_MinimumTime()
   * @model default="0"
   *        annotation="gmf.label foo='bar'"
   * @generated
   */
  Double getMinimumTime();

  /**
   * Sets the value of the '{@link serviceProcess.LocalPerformanceAnnotation#getMinimumTime <em>Minimum Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minimum Time</em>' attribute.
   * @see #getMinimumTime()
   * @generated
   */
  void setMinimumTime(Double value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(Double)
   * @see serviceProcess.ServiceProcessPackage#getLocalPerformanceAnnotation_Weight()
   * @model default="1"
   *        annotation="gmf.label foo='bar'"
   * @generated
   */
  Double getWeight();

  /**
   * Sets the value of the '{@link serviceProcess.LocalPerformanceAnnotation#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(Double value);

} // LocalPerformanceAnnotation
