/**
 */
package serviceProcess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceProcess.ControlFlow#getCondition <em>Condition</em>}</li>
 *   <li>{@link serviceProcess.ControlFlow#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getControlFlow()
 * @model abstract="true"
 *        annotation="gmf.link target.decoration='arrow' tool.name='Control Flow' label='condition,probability'"
 * @generated
 */
public interface ControlFlow extends FlowEdge
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see serviceProcess.ServiceProcessPackage#getControlFlow_Condition()
   * @model default=""
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link serviceProcess.ControlFlow#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Probability</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probability</em>' attribute.
   * @see #setProbability(Double)
   * @see serviceProcess.ServiceProcessPackage#getControlFlow_Probability()
   * @model default="1"
   * @generated
   */
  Double getProbability();

  /**
   * Sets the value of the '{@link serviceProcess.ControlFlow#getProbability <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probability</em>' attribute.
   * @see #getProbability()
   * @generated
   */
  void setProbability(Double value);

} // ControlFlow
