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
      case ServiceProcessPackage.PROCESS_FLOW_EDGE:
      {
        ProcessFlowEdge processFlowEdge = (ProcessFlowEdge)theEObject;
        T result = caseProcessFlowEdge(processFlowEdge);
        if (result == null) result = caseFlowEdge(processFlowEdge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PROCESS_FLOW_NODE:
      {
        ProcessFlowNode processFlowNode = (ProcessFlowNode)theEObject;
        T result = caseProcessFlowNode(processFlowNode);
        if (result == null) result = caseFlowNode(processFlowNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.ACTIVITY_PERFORMANCE_ANNOTATION:
      {
        ActivityPerformanceAnnotation activityPerformanceAnnotation = (ActivityPerformanceAnnotation)theEObject;
        T result = caseActivityPerformanceAnnotation(activityPerformanceAnnotation);
        if (result == null) result = caseLocalPerformanceAnnotation(activityPerformanceAnnotation);
        if (result == null) result = casePerformanceAnnotation(activityPerformanceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PROCESS_PERFORMANCE_ANNOTATION:
      {
        ProcessPerformanceAnnotation processPerformanceAnnotation = (ProcessPerformanceAnnotation)theEObject;
        T result = caseProcessPerformanceAnnotation(processPerformanceAnnotation);
        if (result == null) result = casePerformanceAnnotation(processPerformanceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PROCESS_CONTROL_FLOW:
      {
        ProcessControlFlow processControlFlow = (ProcessControlFlow)theEObject;
        T result = caseProcessControlFlow(processControlFlow);
        if (result == null) result = caseProcessFlowEdge(processControlFlow);
        if (result == null) result = caseControlFlow(processControlFlow);
        if (result == null) result = caseFlowEdge(processControlFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.SERVICE_ACTIVITY:
      {
        ServiceActivity serviceActivity = (ServiceActivity)theEObject;
        T result = caseServiceActivity(serviceActivity);
        if (result == null) result = caseProcessFlowNode(serviceActivity);
        if (result == null) result = caseActivity(serviceActivity);
        if (result == null) result = caseFlowNode(serviceActivity);
        if (result == null) result = caseNamedElement(serviceActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PROCESS_START:
      {
        ProcessStart processStart = (ProcessStart)theEObject;
        T result = caseProcessStart(processStart);
        if (result == null) result = caseProcessFlowNode(processStart);
        if (result == null) result = caseInitialNode(processStart);
        if (result == null) result = caseFlowNode(processStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PROCESS_FINISH:
      {
        ProcessFinish processFinish = (ProcessFinish)theEObject;
        T result = caseProcessFinish(processFinish);
        if (result == null) result = caseProcessFlowNode(processFinish);
        if (result == null) result = caseFinalNode(processFinish);
        if (result == null) result = caseFlowNode(processFinish);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PROCESS_DECISION:
      {
        ProcessDecision processDecision = (ProcessDecision)theEObject;
        T result = caseProcessDecision(processDecision);
        if (result == null) result = caseProcessFlowNode(processDecision);
        if (result == null) result = caseDecisionNode(processDecision);
        if (result == null) result = caseFlowNode(processDecision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PROCESS_FORK:
      {
        ProcessFork processFork = (ProcessFork)theEObject;
        T result = caseProcessFork(processFork);
        if (result == null) result = caseProcessFlowNode(processFork);
        if (result == null) result = caseForkNode(processFork);
        if (result == null) result = caseFlowNode(processFork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.PROCESS_JOIN:
      {
        ProcessJoin processJoin = (ProcessJoin)theEObject;
        T result = caseProcessJoin(processJoin);
        if (result == null) result = caseProcessFlowNode(processJoin);
        if (result == null) result = caseJoinNode(processJoin);
        if (result == null) result = caseFlowNode(processJoin);
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.FLOW_NODE:
      {
        FlowNode flowNode = (FlowNode)theEObject;
        T result = caseFlowNode(flowNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.FLOW_EDGE:
      {
        FlowEdge flowEdge = (FlowEdge)theEObject;
        T result = caseFlowEdge(flowEdge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.CONTROL_FLOW:
      {
        ControlFlow controlFlow = (ControlFlow)theEObject;
        T result = caseControlFlow(controlFlow);
        if (result == null) result = caseFlowEdge(controlFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.OBJECT_FLOW:
      {
        ObjectFlow objectFlow = (ObjectFlow)theEObject;
        T result = caseObjectFlow(objectFlow);
        if (result == null) result = caseFlowEdge(objectFlow);
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
      case ServiceProcessPackage.ACTIVITY:
      {
        Activity activity = (Activity)theEObject;
        T result = caseActivity(activity);
        if (result == null) result = caseFlowNode(activity);
        if (result == null) result = caseNamedElement(activity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.OBJECT_NODE:
      {
        ObjectNode objectNode = (ObjectNode)theEObject;
        T result = caseObjectNode(objectNode);
        if (result == null) result = caseFlowNode(objectNode);
        if (result == null) result = caseNamedElement(objectNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.INITIAL_NODE:
      {
        InitialNode initialNode = (InitialNode)theEObject;
        T result = caseInitialNode(initialNode);
        if (result == null) result = caseFlowNode(initialNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.FINAL_NODE:
      {
        FinalNode finalNode = (FinalNode)theEObject;
        T result = caseFinalNode(finalNode);
        if (result == null) result = caseFlowNode(finalNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.FORK_NODE:
      {
        ForkNode forkNode = (ForkNode)theEObject;
        T result = caseForkNode(forkNode);
        if (result == null) result = caseFlowNode(forkNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.JOIN_NODE:
      {
        JoinNode joinNode = (JoinNode)theEObject;
        T result = caseJoinNode(joinNode);
        if (result == null) result = caseFlowNode(joinNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceProcessPackage.DECISION_NODE:
      {
        DecisionNode decisionNode = (DecisionNode)theEObject;
        T result = caseDecisionNode(decisionNode);
        if (result == null) result = caseFlowNode(decisionNode);
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
   * Returns the result of interpreting the object as an instance of '<em>Process Flow Edge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Flow Edge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessFlowEdge(ProcessFlowEdge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Flow Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Flow Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessFlowNode(ProcessFlowNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Performance Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityPerformanceAnnotation(ActivityPerformanceAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Performance Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessPerformanceAnnotation(ProcessPerformanceAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Control Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Control Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessControlFlow(ProcessControlFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceActivity(ServiceActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessStart(ProcessStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Finish</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Finish</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessFinish(ProcessFinish object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Decision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Decision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessDecision(ProcessDecision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Fork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Fork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessFork(ProcessFork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessJoin(ProcessJoin object)
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
   * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowNode(FlowNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Edge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Edge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowEdge(FlowEdge object)
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
   * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivity(Activity object)
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
