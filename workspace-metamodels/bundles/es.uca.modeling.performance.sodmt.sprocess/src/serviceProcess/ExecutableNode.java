/**
 */
package serviceProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceProcess.ExecutableNode#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see serviceProcess.ServiceProcessPackage#getExecutableNode()
 * @model abstract="true"
 *        annotation="gmf.node label.icon='false'"
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

} // ExecutableNode
