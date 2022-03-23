/**
 */
package serviceProcess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceProcess.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link serviceProcess.ActivityEdge#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see serviceProcess.ServiceProcessPackage#getActivityEdge()
 * @model abstract="true"
 *        annotation="gmf.link source='source' target='target' width='3' target.decoration='arrow'"
 * @generated
 */
public interface ActivityEdge extends EObject
{
  /**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link serviceProcess.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see serviceProcess.ServiceProcessPackage#getActivityEdge_Source()
	 * @see serviceProcess.ActivityNode#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
  ActivityNode getSource();

  /**
	 * Sets the value of the '{@link serviceProcess.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
  void setSource(ActivityNode value);

  /**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link serviceProcess.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see serviceProcess.ServiceProcessPackage#getActivityEdge_Target()
	 * @see serviceProcess.ActivityNode#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
  ActivityNode getTarget();

  /**
	 * Sets the value of the '{@link serviceProcess.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
  void setTarget(ActivityNode value);

} // ActivityEdge
