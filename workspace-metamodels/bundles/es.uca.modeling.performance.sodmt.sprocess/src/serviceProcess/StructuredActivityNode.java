/**
 */
package serviceProcess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceProcess.StructuredActivityNode#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see serviceProcess.ServiceProcessPackage#getStructuredActivityNode()
 * @model annotation="gmf.node border.style='dash' label.view.pattern='\253structured\273 {0}' label.edit.pattern='{0}' tool.name='Structured Activity Node'"
 * @generated
 */
public interface StructuredActivityNode extends ExecutableNode
{
  /**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link serviceProcess.ActivityNode}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see serviceProcess.ServiceProcessPackage#getStructuredActivityNode_Nodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
  EList<ActivityNode> getNodes();

} // StructuredActivityNode
