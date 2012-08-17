/**
 */
package serviceProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceProcess.ServiceProcess#getNodes <em>Nodes</em>}</li>
 *   <li>{@link serviceProcess.ServiceProcess#getEdges <em>Edges</em>}</li>
 *   <li>{@link serviceProcess.ServiceProcess#getActivityPerformance <em>Activity Performance</em>}</li>
 *   <li>{@link serviceProcess.ServiceProcess#getProcessPerformance <em>Process Performance</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceProcess.ServiceProcessPackage#getServiceProcess()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface ServiceProcess extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link serviceProcess.ProcessFlowNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see serviceProcess.ServiceProcessPackage#getServiceProcess_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<ProcessFlowNode> getNodes();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link serviceProcess.ProcessFlowEdge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see serviceProcess.ServiceProcessPackage#getServiceProcess_Edges()
   * @model containment="true"
   * @generated
   */
  EList<ProcessFlowEdge> getEdges();

  /**
   * Returns the value of the '<em><b>Activity Performance</b></em>' containment reference list.
   * The list contents are of type {@link serviceProcess.ActivityPerformanceAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity Performance</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity Performance</em>' containment reference list.
   * @see serviceProcess.ServiceProcessPackage#getServiceProcess_ActivityPerformance()
   * @model containment="true"
   * @generated
   */
  EList<ActivityPerformanceAnnotation> getActivityPerformance();

  /**
   * Returns the value of the '<em><b>Process Performance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Performance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Performance</em>' containment reference.
   * @see #setProcessPerformance(ProcessPerformanceAnnotation)
   * @see serviceProcess.ServiceProcessPackage#getServiceProcess_ProcessPerformance()
   * @model containment="true"
   * @generated
   */
  ProcessPerformanceAnnotation getProcessPerformance();

  /**
   * Sets the value of the '{@link serviceProcess.ServiceProcess#getProcessPerformance <em>Process Performance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Performance</em>' containment reference.
   * @see #getProcessPerformance()
   * @generated
   */
  void setProcessPerformance(ProcessPerformanceAnnotation value);

} // ServiceProcess
