/**
 */
package serviceComposition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link serviceComposition.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends EObject
{
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' reference list.
   * The list contents are of type {@link serviceComposition.ActivityEdge}.
   * It is bidirectional and its opposite is '{@link serviceComposition.ActivityEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' reference list.
   * @see serviceComposition.ServiceCompositionPackage#getActivityNode_Incoming()
   * @see serviceComposition.ActivityEdge#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<ActivityEdge> getIncoming();

  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
   * The list contents are of type {@link serviceComposition.ActivityEdge}.
   * It is bidirectional and its opposite is '{@link serviceComposition.ActivityEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' reference list.
   * @see serviceComposition.ServiceCompositionPackage#getActivityNode_Outgoing()
   * @see serviceComposition.ActivityEdge#getSource
   * @model opposite="source"
   * @generated
   */
  EList<ActivityEdge> getOutgoing();

} // ActivityNode
