/**
 */
package serviceComposition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.FlowEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link serviceComposition.FlowEdge#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getFlowEdge()
 * @model abstract="true"
 *        annotation="gmf.link source='source' target='target' width='3'"
 * @generated
 */
public interface FlowEdge extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceComposition.FlowNode#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(FlowNode)
   * @see serviceComposition.ServiceCompositionPackage#getFlowEdge_Target()
   * @see serviceComposition.FlowNode#getIncoming
   * @model opposite="incoming"
   * @generated
   */
  FlowNode getTarget();

  /**
   * Sets the value of the '{@link serviceComposition.FlowEdge#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(FlowNode value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceComposition.FlowNode#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(FlowNode)
   * @see serviceComposition.ServiceCompositionPackage#getFlowEdge_Source()
   * @see serviceComposition.FlowNode#getOutgoing
   * @model opposite="outgoing"
   * @generated
   */
  FlowNode getSource();

  /**
   * Sets the value of the '{@link serviceComposition.FlowEdge#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(FlowNode value);

} // FlowEdge
