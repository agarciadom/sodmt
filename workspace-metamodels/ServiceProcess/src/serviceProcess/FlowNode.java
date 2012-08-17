/**
 */
package serviceProcess;

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
 *   <li>{@link serviceProcess.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link serviceProcess.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends EObject
{
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' reference list.
   * The list contents are of type {@link serviceProcess.FlowEdge}.
   * It is bidirectional and its opposite is '{@link serviceProcess.FlowEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' reference list.
   * @see serviceProcess.ServiceProcessPackage#getFlowNode_Incoming()
   * @see serviceProcess.FlowEdge#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<FlowEdge> getIncoming();

  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
   * The list contents are of type {@link serviceProcess.FlowEdge}.
   * It is bidirectional and its opposite is '{@link serviceProcess.FlowEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' reference list.
   * @see serviceProcess.ServiceProcessPackage#getFlowNode_Outgoing()
   * @see serviceProcess.FlowEdge#getSource
   * @model opposite="source"
   * @generated
   */
  EList<FlowEdge> getOutgoing();

} // FlowNode
