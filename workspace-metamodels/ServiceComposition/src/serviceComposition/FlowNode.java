/**
 */
package serviceComposition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link serviceComposition.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends EObject
{
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' reference list.
   * The list contents are of type {@link serviceComposition.FlowEdge}.
   * It is bidirectional and its opposite is '{@link serviceComposition.FlowEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' reference list.
   * @see serviceComposition.ServiceCompositionPackage#getFlowNode_Incoming()
   * @see serviceComposition.FlowEdge#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<FlowEdge> getIncoming();

  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
   * The list contents are of type {@link serviceComposition.FlowEdge}.
   * It is bidirectional and its opposite is '{@link serviceComposition.FlowEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' reference list.
   * @see serviceComposition.ServiceCompositionPackage#getFlowNode_Outgoing()
   * @see serviceComposition.FlowEdge#getSource
   * @model opposite="source"
   * @generated
   */
  EList<FlowEdge> getOutgoing();

} // FlowNode
