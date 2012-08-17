/**
 */
package serviceComposition.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import serviceComposition.*;

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
 * @see serviceComposition.ServiceCompositionPackage
 * @generated
 */
public class ServiceCompositionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ServiceCompositionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceCompositionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ServiceCompositionPackage.eINSTANCE;
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
      case ServiceCompositionPackage.SERVICE_COMPOSITION:
      {
        ServiceComposition serviceComposition = (ServiceComposition)theEObject;
        T result = caseServiceComposition(serviceComposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_ELEMENT:
      {
        ActivityElement activityElement = (ActivityElement)theEObject;
        T result = caseActivityElement(activityElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_FLOW_EDGE:
      {
        CompositionFlowEdge compositionFlowEdge = (CompositionFlowEdge)theEObject;
        T result = caseCompositionFlowEdge(compositionFlowEdge);
        if (result == null) result = caseFlowEdge(compositionFlowEdge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_FLOW_NODE:
      {
        CompositionFlowNode compositionFlowNode = (CompositionFlowNode)theEObject;
        T result = caseCompositionFlowNode(compositionFlowNode);
        if (result == null) result = caseFlowNode(compositionFlowNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_FLOW_EDGE:
      {
        ActivityFlowEdge activityFlowEdge = (ActivityFlowEdge)theEObject;
        T result = caseActivityFlowEdge(activityFlowEdge);
        if (result == null) result = caseFlowEdge(activityFlowEdge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_FLOW_NODE:
      {
        ActivityFlowNode activityFlowNode = (ActivityFlowNode)theEObject;
        T result = caseActivityFlowNode(activityFlowNode);
        if (result == null) result = caseActivityElement(activityFlowNode);
        if (result == null) result = caseFlowNode(activityFlowNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.SWIMLANE_CONTAINER:
      {
        SwimlaneContainer swimlaneContainer = (SwimlaneContainer)theEObject;
        T result = caseSwimlaneContainer(swimlaneContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_PERFORMANCE_ANNOTATION:
      {
        ActivityPerformanceAnnotation activityPerformanceAnnotation = (ActivityPerformanceAnnotation)theEObject;
        T result = caseActivityPerformanceAnnotation(activityPerformanceAnnotation);
        if (result == null) result = casePerformanceAnnotation(activityPerformanceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION:
      {
        ActionPerformanceAnnotation actionPerformanceAnnotation = (ActionPerformanceAnnotation)theEObject;
        T result = caseActionPerformanceAnnotation(actionPerformanceAnnotation);
        if (result == null) result = caseActivityElement(actionPerformanceAnnotation);
        if (result == null) result = caseLocalPerformanceAnnotation(actionPerformanceAnnotation);
        if (result == null) result = casePerformanceAnnotation(actionPerformanceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_CONTROL_FLOW:
      {
        CompositionControlFlow compositionControlFlow = (CompositionControlFlow)theEObject;
        T result = caseCompositionControlFlow(compositionControlFlow);
        if (result == null) result = caseCompositionFlowEdge(compositionControlFlow);
        if (result == null) result = caseControlFlow(compositionControlFlow);
        if (result == null) result = caseFlowEdge(compositionControlFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_OBJECT_FLOW:
      {
        CompositionObjectFlow compositionObjectFlow = (CompositionObjectFlow)theEObject;
        T result = caseCompositionObjectFlow(compositionObjectFlow);
        if (result == null) result = caseCompositionFlowEdge(compositionObjectFlow);
        if (result == null) result = caseObjectFlow(compositionObjectFlow);
        if (result == null) result = caseFlowEdge(compositionObjectFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_CONTROL_FLOW:
      {
        ActivityControlFlow activityControlFlow = (ActivityControlFlow)theEObject;
        T result = caseActivityControlFlow(activityControlFlow);
        if (result == null) result = caseActivityFlowEdge(activityControlFlow);
        if (result == null) result = caseControlFlow(activityControlFlow);
        if (result == null) result = caseFlowEdge(activityControlFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_OBJECT_FLOW:
      {
        ActivityObjectFlow activityObjectFlow = (ActivityObjectFlow)theEObject;
        T result = caseActivityObjectFlow(activityObjectFlow);
        if (result == null) result = caseActivityFlowEdge(activityObjectFlow);
        if (result == null) result = caseObjectFlow(activityObjectFlow);
        if (result == null) result = caseFlowEdge(activityObjectFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.SERVICE_ACTIVITY:
      {
        ServiceActivity serviceActivity = (ServiceActivity)theEObject;
        T result = caseServiceActivity(serviceActivity);
        if (result == null) result = caseCompositionFlowNode(serviceActivity);
        if (result == null) result = caseActivity(serviceActivity);
        if (result == null) result = caseFlowNode(serviceActivity);
        if (result == null) result = caseNamedElement(serviceActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_START:
      {
        CompositionStart compositionStart = (CompositionStart)theEObject;
        T result = caseCompositionStart(compositionStart);
        if (result == null) result = caseCompositionFlowNode(compositionStart);
        if (result == null) result = caseInitialNode(compositionStart);
        if (result == null) result = caseFlowNode(compositionStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_FINISH:
      {
        CompositionFinish compositionFinish = (CompositionFinish)theEObject;
        T result = caseCompositionFinish(compositionFinish);
        if (result == null) result = caseCompositionFlowNode(compositionFinish);
        if (result == null) result = caseFinalNode(compositionFinish);
        if (result == null) result = caseFlowNode(compositionFinish);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_DECISION:
      {
        CompositionDecision compositionDecision = (CompositionDecision)theEObject;
        T result = caseCompositionDecision(compositionDecision);
        if (result == null) result = caseCompositionFlowNode(compositionDecision);
        if (result == null) result = caseDecisionNode(compositionDecision);
        if (result == null) result = caseFlowNode(compositionDecision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_FORK:
      {
        CompositionFork compositionFork = (CompositionFork)theEObject;
        T result = caseCompositionFork(compositionFork);
        if (result == null) result = caseCompositionFlowNode(compositionFork);
        if (result == null) result = caseForkNode(compositionFork);
        if (result == null) result = caseFlowNode(compositionFork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_JOIN:
      {
        CompositionJoin compositionJoin = (CompositionJoin)theEObject;
        T result = caseCompositionJoin(compositionJoin);
        if (result == null) result = caseCompositionFlowNode(compositionJoin);
        if (result == null) result = caseJoinNode(compositionJoin);
        if (result == null) result = caseFlowNode(compositionJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.COMPOSITION_OBJECT_NODE:
      {
        CompositionObjectNode compositionObjectNode = (CompositionObjectNode)theEObject;
        T result = caseCompositionObjectNode(compositionObjectNode);
        if (result == null) result = caseCompositionFlowNode(compositionObjectNode);
        if (result == null) result = caseObjectNode(compositionObjectNode);
        if (result == null) result = caseFlowNode(compositionObjectNode);
        if (result == null) result = caseNamedElement(compositionObjectNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_ACTION:
      {
        ActivityAction activityAction = (ActivityAction)theEObject;
        T result = caseActivityAction(activityAction);
        if (result == null) result = caseActivityFlowNode(activityAction);
        if (result == null) result = caseActivity(activityAction);
        if (result == null) result = caseActivityElement(activityAction);
        if (result == null) result = caseFlowNode(activityAction);
        if (result == null) result = caseNamedElement(activityAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_START:
      {
        ActivityStart activityStart = (ActivityStart)theEObject;
        T result = caseActivityStart(activityStart);
        if (result == null) result = caseActivityFlowNode(activityStart);
        if (result == null) result = caseInitialNode(activityStart);
        if (result == null) result = caseActivityElement(activityStart);
        if (result == null) result = caseFlowNode(activityStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_FINISH:
      {
        ActivityFinish activityFinish = (ActivityFinish)theEObject;
        T result = caseActivityFinish(activityFinish);
        if (result == null) result = caseActivityFlowNode(activityFinish);
        if (result == null) result = caseFinalNode(activityFinish);
        if (result == null) result = caseActivityElement(activityFinish);
        if (result == null) result = caseFlowNode(activityFinish);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_DECISION:
      {
        ActivityDecision activityDecision = (ActivityDecision)theEObject;
        T result = caseActivityDecision(activityDecision);
        if (result == null) result = caseActivityFlowNode(activityDecision);
        if (result == null) result = caseDecisionNode(activityDecision);
        if (result == null) result = caseActivityElement(activityDecision);
        if (result == null) result = caseFlowNode(activityDecision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_FORK:
      {
        ActivityFork activityFork = (ActivityFork)theEObject;
        T result = caseActivityFork(activityFork);
        if (result == null) result = caseActivityFlowNode(activityFork);
        if (result == null) result = caseForkNode(activityFork);
        if (result == null) result = caseActivityElement(activityFork);
        if (result == null) result = caseFlowNode(activityFork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_JOIN:
      {
        ActivityJoin activityJoin = (ActivityJoin)theEObject;
        T result = caseActivityJoin(activityJoin);
        if (result == null) result = caseActivityFlowNode(activityJoin);
        if (result == null) result = caseJoinNode(activityJoin);
        if (result == null) result = caseActivityElement(activityJoin);
        if (result == null) result = caseFlowNode(activityJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY_OBJECT_NODE:
      {
        ActivityObjectNode activityObjectNode = (ActivityObjectNode)theEObject;
        T result = caseActivityObjectNode(activityObjectNode);
        if (result == null) result = caseActivityFlowNode(activityObjectNode);
        if (result == null) result = caseObjectNode(activityObjectNode);
        if (result == null) result = caseActivityElement(activityObjectNode);
        if (result == null) result = caseFlowNode(activityObjectNode);
        if (result == null) result = caseNamedElement(activityObjectNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.PERFORMANCE_ANNOTATION:
      {
        PerformanceAnnotation performanceAnnotation = (PerformanceAnnotation)theEObject;
        T result = casePerformanceAnnotation(performanceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION:
      {
        LocalPerformanceAnnotation localPerformanceAnnotation = (LocalPerformanceAnnotation)theEObject;
        T result = caseLocalPerformanceAnnotation(localPerformanceAnnotation);
        if (result == null) result = casePerformanceAnnotation(localPerformanceAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.FLOW_NODE:
      {
        FlowNode flowNode = (FlowNode)theEObject;
        T result = caseFlowNode(flowNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.FLOW_EDGE:
      {
        FlowEdge flowEdge = (FlowEdge)theEObject;
        T result = caseFlowEdge(flowEdge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.CONTROL_FLOW:
      {
        ControlFlow controlFlow = (ControlFlow)theEObject;
        T result = caseControlFlow(controlFlow);
        if (result == null) result = caseFlowEdge(controlFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.OBJECT_FLOW:
      {
        ObjectFlow objectFlow = (ObjectFlow)theEObject;
        T result = caseObjectFlow(objectFlow);
        if (result == null) result = caseFlowEdge(objectFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.ACTIVITY:
      {
        Activity activity = (Activity)theEObject;
        T result = caseActivity(activity);
        if (result == null) result = caseFlowNode(activity);
        if (result == null) result = caseNamedElement(activity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.OBJECT_NODE:
      {
        ObjectNode objectNode = (ObjectNode)theEObject;
        T result = caseObjectNode(objectNode);
        if (result == null) result = caseFlowNode(objectNode);
        if (result == null) result = caseNamedElement(objectNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.INITIAL_NODE:
      {
        InitialNode initialNode = (InitialNode)theEObject;
        T result = caseInitialNode(initialNode);
        if (result == null) result = caseFlowNode(initialNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.FINAL_NODE:
      {
        FinalNode finalNode = (FinalNode)theEObject;
        T result = caseFinalNode(finalNode);
        if (result == null) result = caseFlowNode(finalNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.FORK_NODE:
      {
        ForkNode forkNode = (ForkNode)theEObject;
        T result = caseForkNode(forkNode);
        if (result == null) result = caseFlowNode(forkNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.JOIN_NODE:
      {
        JoinNode joinNode = (JoinNode)theEObject;
        T result = caseJoinNode(joinNode);
        if (result == null) result = caseFlowNode(joinNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServiceCompositionPackage.DECISION_NODE:
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
   * Returns the result of interpreting the object as an instance of '<em>Service Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceComposition(ServiceComposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityElement(ActivityElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Flow Edge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Flow Edge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionFlowEdge(CompositionFlowEdge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Flow Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Flow Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionFlowNode(CompositionFlowNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Flow Edge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Flow Edge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityFlowEdge(ActivityFlowEdge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Flow Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Flow Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityFlowNode(ActivityFlowNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Swimlane Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Swimlane Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwimlaneContainer(SwimlaneContainer object)
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
   * Returns the result of interpreting the object as an instance of '<em>Action Performance Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Performance Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionPerformanceAnnotation(ActionPerformanceAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Control Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Control Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionControlFlow(CompositionControlFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Object Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Object Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionObjectFlow(CompositionObjectFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Control Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Control Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityControlFlow(ActivityControlFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Object Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Object Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityObjectFlow(ActivityObjectFlow object)
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
   * Returns the result of interpreting the object as an instance of '<em>Composition Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionStart(CompositionStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Finish</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Finish</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionFinish(CompositionFinish object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Decision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Decision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionDecision(CompositionDecision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Fork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Fork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionFork(CompositionFork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionJoin(CompositionJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Object Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Object Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionObjectNode(CompositionObjectNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityAction(ActivityAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityStart(ActivityStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Finish</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Finish</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityFinish(ActivityFinish object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Decision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Decision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityDecision(ActivityDecision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Fork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Fork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityFork(ActivityFork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityJoin(ActivityJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Object Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Object Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityObjectNode(ActivityObjectNode object)
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

} //ServiceCompositionSwitch
