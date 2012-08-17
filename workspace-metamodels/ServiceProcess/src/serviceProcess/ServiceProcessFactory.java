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
   * Returns a new object of class '<em>Activity Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Performance Annotation</em>'.
   * @generated
   */
  ActivityPerformanceAnnotation createActivityPerformanceAnnotation();

  /**
   * Returns a new object of class '<em>Process Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Performance Annotation</em>'.
   * @generated
   */
  ProcessPerformanceAnnotation createProcessPerformanceAnnotation();

  /**
   * Returns a new object of class '<em>Process Control Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Control Flow</em>'.
   * @generated
   */
  ProcessControlFlow createProcessControlFlow();

  /**
   * Returns a new object of class '<em>Service Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Activity</em>'.
   * @generated
   */
  ServiceActivity createServiceActivity();

  /**
   * Returns a new object of class '<em>Process Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Start</em>'.
   * @generated
   */
  ProcessStart createProcessStart();

  /**
   * Returns a new object of class '<em>Process Finish</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Finish</em>'.
   * @generated
   */
  ProcessFinish createProcessFinish();

  /**
   * Returns a new object of class '<em>Process Decision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Decision</em>'.
   * @generated
   */
  ProcessDecision createProcessDecision();

  /**
   * Returns a new object of class '<em>Process Fork</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Fork</em>'.
   * @generated
   */
  ProcessFork createProcessFork();

  /**
   * Returns a new object of class '<em>Process Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Join</em>'.
   * @generated
   */
  ProcessJoin createProcessJoin();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ServiceProcessPackage getServiceProcessPackage();

} //ServiceProcessFactory
