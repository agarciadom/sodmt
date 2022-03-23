/**
 */
package serviceComposition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceComposition.PerformanceAnnotation#getConcurrentUsers <em>Concurrent Users</em>}</li>
 *   <li>{@link serviceComposition.PerformanceAnnotation#getSecsTimeLimit <em>Secs Time Limit</em>}</li>
 * </ul>
 *
 * @see serviceComposition.ServiceCompositionPackage#getPerformanceAnnotation()
 * @model annotation="gmf.node figure='rectangle' label='concurrentUsers' label.pattern='\253gpc\273' label.readOnly='true' tool.name='Global Performance Constraint'"
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
	 * @see #setConcurrentUsers(double)
	 * @see serviceComposition.ServiceCompositionPackage#getPerformanceAnnotation_ConcurrentUsers()
	 * @model default="1"
	 *        annotation="gmf.label label.view.pattern='users = {0}' label.edit.pattern='{0, number}'"
	 * @generated
	 */
  double getConcurrentUsers();

  /**
	 * Sets the value of the '{@link serviceComposition.PerformanceAnnotation#getConcurrentUsers <em>Concurrent Users</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrent Users</em>' attribute.
	 * @see #getConcurrentUsers()
	 * @generated
	 */
  void setConcurrentUsers(double value);

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
	 * @see #setSecsTimeLimit(double)
	 * @see serviceComposition.ServiceCompositionPackage#getPerformanceAnnotation_SecsTimeLimit()
	 * @model default="0"
	 *        annotation="gmf.label label.view.pattern='timeLimit = {0}' label.edit.pattern='{0, number}'"
	 * @generated
	 */
  double getSecsTimeLimit();

  /**
	 * Sets the value of the '{@link serviceComposition.PerformanceAnnotation#getSecsTimeLimit <em>Secs Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secs Time Limit</em>' attribute.
	 * @see #getSecsTimeLimit()
	 * @generated
	 */
  void setSecsTimeLimit(double value);

} // PerformanceAnnotation
