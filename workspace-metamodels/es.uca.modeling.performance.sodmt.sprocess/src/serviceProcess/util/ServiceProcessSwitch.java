/**
 */
package serviceProcess.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import serviceProcess.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see serviceProcess.ServiceProcessPackage
 * @generated
 */
public class ServiceProcessSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ServiceProcessPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProcessSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ServiceProcessPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ServiceProcessPackage.SERVICE_PROCESS:
      {
        ServiceProcess serviceProcess = (ServiceProcess)theEObject;
        T result = caseServiceProcess(serviceProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.ACTIVITY_EDGE:
      {
        ActivityEdge activityEdge = (ActivityEdge)theEObject;
        T result = caseActivityEdge(activityEdge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.ACTIVITY_NODE:
      {
        ActivityNode activityNode = (ActivityNode)theEObject;
        T result = caseActivityNode(activityNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION:
      {
        PerformanceAnnotation performanceAnnotation = (PerformanceAnnotation)theEObject;
        T result = casePerformanceAnnotation(performanceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.LOCAL_PERFORMANCE_ANNOTATION:
      {
        LocalPerformanceAnnotation localPerformanceAnnotation = (LocalPerformanceAnnotation)theEObject;
        T result = caseLocalPerformanceAnnotation(localPerformanceAnnotation);
        if (result == null) result = casePerformanceAnnotation(localPerformanceAnnotation);
        if (result == null) result = caseActivityNode(localPerformanceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.CONTROL_FLOW:
      {
        ControlFlow controlFlow = (ControlFlow)theEObject;
        T result = caseControlFlow(controlFlow);
        if (result == null) result = caseActivityEdge(controlFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.OBJECT_FLOW:
      {
        ObjectFlow objectFlow = (ObjectFlow)theEObject;
        T result = caseObjectFlow(objectFlow);
        if (result == null) result = caseActivityEdge(objectFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.EXECUTABLE_NODE:
      {
        ExecutableNode executableNode = (ExecutableNode)theEObject;
        T result = caseExecutableNode(executableNode);
        if (result == null) result = caseActivityNode(executableNode);
        if (result == null) result = caseNamedElement(executableNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = caseExecutableNode(action);
        if (result == null) result = caseActivityNode(action);
        if (result == null) result = caseNamedElement(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.STRUCTURED_ACTIVITY_NODE:
      {
        StructuredActivityNode structuredActivityNode = (StructuredActivityNode)theEObject;
        T result = caseStructuredActivityNode(structuredActivityNode);
        if (result == null) result = caseExecutableNode(structuredActivityNode);
        if (result == null) result = caseActivityNode(structuredActivityNode);
        if (result == null) result = caseNamedElement(structuredActivityNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.OBJECT_NODE:
      {
        ObjectNode objectNode = (ObjectNode)theEObject;
        T result = caseObjectNode(objectNode);
        if (result == null) result = caseActivityNode(objectNode);
        if (result == null) result = caseNamedElement(objectNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.INITIAL_NODE:
      {
        InitialNode initialNode = (InitialNode)theEObject;
        T result = caseInitialNode(initialNode);
        if (result == null) result = caseActivityNode(initialNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.FINAL_NODE:
      {
        FinalNode finalNode = (FinalNode)theEObject;
        T result = caseFinalNode(finalNode);
        if (result == null) result = caseActivityNode(finalNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.DECISION_NODE:
      {
        DecisionNode decisionNode = (DecisionNode)theEObject;
        T result = caseDecisionNode(decisionNode);
        if (result == null) result = caseActivityNode(decisionNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.FORK_NODE:
      {
        ForkNode forkNode = (ForkNode)theEObject;
        T result = caseForkNode(forkNode);
        if (result == null) result = caseActivityNode(forkNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.JOIN_NODE:
      {
        JoinNode joinNode = (JoinNode)theEObject;
        T result = caseJoinNode(joinNode);
        if (result == null) result = caseActivityNode(joinNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.MERGE_NODE:
      {
        MergeNode mergeNode = (MergeNode)theEObject;
        T result = caseMergeNode(mergeNode);
        if (result == null) result = caseActivityNode(mergeNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceProcess(ServiceProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityEdge(ActivityEdge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityNode(ActivityNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Performance Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerformanceAnnotation(PerformanceAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Performance Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalPerformanceAnnotation(LocalPerformanceAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlFlow(ControlFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectFlow(ObjectFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecutableNode(ExecutableNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructuredActivityNode(StructuredActivityNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectNode(ObjectNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialNode(InitialNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinalNode(FinalNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionNode(DecisionNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForkNode(ForkNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinNode(JoinNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMergeNode(MergeNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ServiceProcessSwitch
