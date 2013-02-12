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
 * <ul>
 *   <li>{@link serviceProcess.StructuredActivityNode#getSubnodes <em>Subnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getStructuredActivityNode()
 * @model annotation="gmf.node border.style='dash' label.view.pattern='\253structured\273 {0}' label.edit.pattern='{0}' tool.name='Structured Activity Node'"
 * @generated
 */
public interface StructuredActivityNode extends ExecutableNode
{
  /**
   * Returns the value of the '<em><b>Subnodes</b></em>' containment reference list.
   * The list contents are of type {@link serviceProcess.ActivityNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subnodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subnodes</em>' containment reference list.
   * @see serviceProcess.ServiceProcessPackage#getStructuredActivityNode_Subnodes()
   * @model containment="true"
   * @generated
   */
  EList<ActivityNode> getSubnodes();

} // StructuredActivityNode
