/**
 */
package serviceProcess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceProcess.ExecutableNode#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link serviceProcess.ExecutableNode#getSubnodes <em>Subnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getExecutableNode()
 * @model annotation="gmf.node label.icon='false' tool.name='Executable Node'"
 * @generated
 */
public interface ExecutableNode extends ActivityNode, NamedElement
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' reference.
   * It is bidirectional and its opposite is '{@link serviceProcess.LocalPerformanceAnnotation#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' reference.
   * @see #setAnnotation(LocalPerformanceAnnotation)
   * @see serviceProcess.ServiceProcessPackage#getExecutableNode_Annotation()
   * @see serviceProcess.LocalPerformanceAnnotation#getExecNode
   * @model opposite="execNode"
   *        annotation="gmf.link incoming='true' style='dash' tool.name='Link Performance Annotation'"
   * @generated
   */
  LocalPerformanceAnnotation getAnnotation();

  /**
   * Sets the value of the '{@link serviceProcess.ExecutableNode#getAnnotation <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(LocalPerformanceAnnotation value);

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
   * @see serviceProcess.ServiceProcessPackage#getExecutableNode_Subnodes()
   * @model containment="true"
   * @generated
   */
  EList<ActivityNode> getSubnodes();

} // ExecutableNode
