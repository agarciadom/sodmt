/**
 */
package serviceProcess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see serviceProcess.ServiceProcessPackage
 * @generated
 */
public interface ServiceProcessFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ServiceProcessFactory eINSTANCE = serviceProcess.impl.ServiceProcessFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Service Process</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Process</em>'.
	 * @generated
	 */
  ServiceProcess createServiceProcess();

  /**
	 * Returns a new object of class '<em>Performance Annotation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Annotation</em>'.
	 * @generated
	 */
  PerformanceAnnotation createPerformanceAnnotation();

  /**
	 * Returns a new object of class '<em>Local Performance Annotation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Performance Annotation</em>'.
	 * @generated
	 */
  LocalPerformanceAnnotation createLocalPerformanceAnnotation();

  /**
	 * Returns a new object of class '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow</em>'.
	 * @generated
	 */
  ControlFlow createControlFlow();

  /**
	 * Returns a new object of class '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Flow</em>'.
	 * @generated
	 */
  ObjectFlow createObjectFlow();

  /**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
  Action createAction();

  /**
	 * Returns a new object of class '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Activity Node</em>'.
	 * @generated
	 */
  StructuredActivityNode createStructuredActivityNode();

  /**
	 * Returns a new object of class '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Node</em>'.
	 * @generated
	 */
  ObjectNode createObjectNode();

  /**
	 * Returns a new object of class '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Node</em>'.
	 * @generated
	 */
  InitialNode createInitialNode();

  /**
	 * Returns a new object of class '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Node</em>'.
	 * @generated
	 */
  FinalNode createFinalNode();

  /**
	 * Returns a new object of class '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Node</em>'.
	 * @generated
	 */
  DecisionNode createDecisionNode();

  /**
	 * Returns a new object of class '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Node</em>'.
	 * @generated
	 */
  ForkNode createForkNode();

  /**
	 * Returns a new object of class '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Node</em>'.
	 * @generated
	 */
  JoinNode createJoinNode();

  /**
	 * Returns a new object of class '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node</em>'.
	 * @generated
	 */
  MergeNode createMergeNode();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ServiceProcessPackage getServiceProcessPackage();

} //ServiceProcessFactory
