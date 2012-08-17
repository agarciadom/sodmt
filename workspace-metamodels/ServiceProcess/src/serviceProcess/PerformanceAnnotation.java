/**
 */
package serviceProcess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceProcess.PerformanceAnnotation#getConcurrentUsers <em>Concurrent Users</em>}</li>
 *   <li>{@link serviceProcess.PerformanceAnnotation#getSecsTimeLimit <em>Secs Time Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getPerformanceAnnotation()
 * @model abstract="true"
 *        annotation="gmf.node label='concurrentUsers' figure='rectangle'"
 * @generated
 */
public interface PerformanceAnnotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Concurrent Users</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concurrent Users</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concurrent Users</em>' attribute.
   * @see #setConcurrentUsers(Double)
   * @see serviceProcess.ServiceProcessPackage#getPerformanceAnnotation_ConcurrentUsers()
   * @model default="1"
   *        annotation="gmf.label foo='bar'"
   * @generated
   */
  Double getConcurrentUsers();

  /**
   * Sets the value of the '{@link serviceProcess.PerformanceAnnotation#getConcurrentUsers <em>Concurrent Users</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concurrent Users</em>' attribute.
   * @see #getConcurrentUsers()
   * @generated
   */
  void setConcurrentUsers(Double value);

  /**
   * Returns the value of the '<em><b>Secs Time Limit</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secs Time Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secs Time Limit</em>' attribute.
   * @see #setSecsTimeLimit(Double)
   * @see serviceProcess.ServiceProcessPackage#getPerformanceAnnotation_SecsTimeLimit()
   * @model default="0"
   *        annotation="gmf.label label.readOnly='true'"
   * @generated
   */
  Double getSecsTimeLimit();

  /**
   * Sets the value of the '{@link serviceProcess.PerformanceAnnotation#getSecsTimeLimit <em>Secs Time Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secs Time Limit</em>' attribute.
   * @see #getSecsTimeLimit()
   * @generated
   */
  void setSecsTimeLimit(Double value);

} // PerformanceAnnotation
