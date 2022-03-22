/**
 */
package serviceComposition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.ControlFlow#getCondition <em>Condition</em>}</li>
 *   <li>{@link serviceComposition.ControlFlow#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getControlFlow()
 * @model annotation="gmf.link tool.name='Control Flow' label='condition,probability' label.view.pattern='[{0}] (p = {1})' label.edit.pattern='{0} : {1,number}' label.text=' ' label.parser='ControlFlowLabelParser' source.constraint='self <> oppositeEnd and not self.oclIsKindOf(ObjectNode) and not self.oclIsKindOf(PerformanceAnnotation)' target.constraint='self <> oppositeEnd and not self.oclIsKindOf(ObjectNode) and not self.oclIsKindOf(PerformanceAnnotation)'"
 * @generated
 */
public interface ControlFlow extends ActivityEdge
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
   * @see serviceComposition.ServiceCompositionPackage#getControlFlow_Condition()
   * @model default=""
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link serviceComposition.ControlFlow#getCondition <em>Condition</em>}' attribute.
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
   * @see #setProbability(double)
   * @see serviceComposition.ServiceCompositionPackage#getControlFlow_Probability()
   * @model default="1"
   * @generated
   */
  double getProbability();

  /**
   * Sets the value of the '{@link serviceComposition.ControlFlow#getProbability <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probability</em>' attribute.
   * @see #getProbability()
   * @generated
   */
  void setProbability(double value);

} // ControlFlow
