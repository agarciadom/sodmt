/**
 */
package serviceComposition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceComposition.ActivityPartition#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see serviceComposition.ServiceCompositionPackage#getActivityPartition()
 * @model annotation="gmf.node label='name' label.icon='false'"
 * @generated
 */
public interface ActivityPartition extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link serviceComposition.ActivityNode}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see serviceComposition.ServiceCompositionPackage#getActivityPartition_Nodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
  EList<ActivityNode> getNodes();

} // ActivityPartition
