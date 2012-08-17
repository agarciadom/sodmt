/**
 */
package serviceComposition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see serviceComposition.ServiceCompositionPackage
 * @generated
 */
public interface ServiceCompositionFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServiceCompositionFactory eINSTANCE = serviceComposition.impl.ServiceCompositionFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Service Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Composition</em>'.
   * @generated
   */
  ServiceComposition createServiceComposition();

  /**
   * Returns a new object of class '<em>Swimlane Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Swimlane Container</em>'.
   * @generated
   */
  SwimlaneContainer createSwimlaneContainer();

  /**
   * Returns a new object of class '<em>Activity Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Performance Annotation</em>'.
   * @generated
   */
  ActivityPerformanceAnnotation createActivityPerformanceAnnotation();

  /**
   * Returns a new object of class '<em>Action Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Performance Annotation</em>'.
   * @generated
   */
  ActionPerformanceAnnotation createActionPerformanceAnnotation();

  /**
   * Returns a new object of class '<em>Composition Control Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Control Flow</em>'.
   * @generated
   */
  CompositionControlFlow createCompositionControlFlow();

  /**
   * Returns a new object of class '<em>Composition Object Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Object Flow</em>'.
   * @generated
   */
  CompositionObjectFlow createCompositionObjectFlow();

  /**
   * Returns a new object of class '<em>Activity Control Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Control Flow</em>'.
   * @generated
   */
  ActivityControlFlow createActivityControlFlow();

  /**
   * Returns a new object of class '<em>Activity Object Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Object Flow</em>'.
   * @generated
   */
  ActivityObjectFlow createActivityObjectFlow();

  /**
   * Returns a new object of class '<em>Service Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Activity</em>'.
   * @generated
   */
  ServiceActivity createServiceActivity();

  /**
   * Returns a new object of class '<em>Composition Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Start</em>'.
   * @generated
   */
  CompositionStart createCompositionStart();

  /**
   * Returns a new object of class '<em>Composition Finish</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Finish</em>'.
   * @generated
   */
  CompositionFinish createCompositionFinish();

  /**
   * Returns a new object of class '<em>Composition Decision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Decision</em>'.
   * @generated
   */
  CompositionDecision createCompositionDecision();

  /**
   * Returns a new object of class '<em>Composition Fork</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Fork</em>'.
   * @generated
   */
  CompositionFork createCompositionFork();

  /**
   * Returns a new object of class '<em>Composition Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Join</em>'.
   * @generated
   */
  CompositionJoin createCompositionJoin();

  /**
   * Returns a new object of class '<em>Composition Object Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Object Node</em>'.
   * @generated
   */
  CompositionObjectNode createCompositionObjectNode();

  /**
   * Returns a new object of class '<em>Activity Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Action</em>'.
   * @generated
   */
  ActivityAction createActivityAction();

  /**
   * Returns a new object of class '<em>Activity Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Start</em>'.
   * @generated
   */
  ActivityStart createActivityStart();

  /**
   * Returns a new object of class '<em>Activity Finish</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Finish</em>'.
   * @generated
   */
  ActivityFinish createActivityFinish();

  /**
   * Returns a new object of class '<em>Activity Decision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Decision</em>'.
   * @generated
   */
  ActivityDecision createActivityDecision();

  /**
   * Returns a new object of class '<em>Activity Fork</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Fork</em>'.
   * @generated
   */
  ActivityFork createActivityFork();

  /**
   * Returns a new object of class '<em>Activity Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Join</em>'.
   * @generated
   */
  ActivityJoin createActivityJoin();

  /**
   * Returns a new object of class '<em>Activity Object Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Object Node</em>'.
   * @generated
   */
  ActivityObjectNode createActivityObjectNode();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ServiceCompositionPackage getServiceCompositionPackage();

} //ServiceCompositionFactory
