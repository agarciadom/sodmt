/**
 */
package serviceComposition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.ActivityElement#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getActivityElement()
 * @model abstract="true"
 * @generated
 */
public interface ActivityElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Activity</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link serviceComposition.ServiceActivity#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity</em>' container reference.
   * @see #setActivity(ServiceActivity)
   * @see serviceComposition.ServiceCompositionPackage#getActivityElement_Activity()
   * @see serviceComposition.ServiceActivity#getNodes
   * @model opposite="nodes" transient="false"
   * @generated
   */
  ServiceActivity getActivity();

  /**
   * Sets the value of the '{@link serviceComposition.ActivityElement#getActivity <em>Activity</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' container reference.
   * @see #getActivity()
   * @generated
   */
  void setActivity(ServiceActivity value);

} // ActivityElement
