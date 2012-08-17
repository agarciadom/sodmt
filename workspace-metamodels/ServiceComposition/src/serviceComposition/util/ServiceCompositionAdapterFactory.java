/**
 */
package serviceComposition.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import serviceComposition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see serviceComposition.ServiceCompositionPackage
 * @generated
 */
public class ServiceCompositionAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ServiceCompositionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceCompositionAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ServiceCompositionPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceCompositionSwitch<Adapter> modelSwitch =
    new ServiceCompositionSwitch<Adapter>()
    {
      @Override
      public Adapter caseServiceComposition(ServiceComposition object)
      {
        return createServiceCompositionAdapter();
      }
      @Override
      public Adapter caseActivityElement(ActivityElement object)
      {
        return createActivityElementAdapter();
      }
      @Override
      public Adapter caseCompositionFlowEdge(CompositionFlowEdge object)
      {
        return createCompositionFlowEdgeAdapter();
      }
      @Override
      public Adapter caseCompositionFlowNode(CompositionFlowNode object)
      {
        return createCompositionFlowNodeAdapter();
      }
      @Override
      public Adapter caseActivityFlowEdge(ActivityFlowEdge object)
      {
        return createActivityFlowEdgeAdapter();
      }
      @Override
      public Adapter caseActivityFlowNode(ActivityFlowNode object)
      {
        return createActivityFlowNodeAdapter();
      }
      @Override
      public Adapter caseSwimlaneContainer(SwimlaneContainer object)
      {
        return createSwimlaneContainerAdapter();
      }
      @Override
      public Adapter caseActivityPerformanceAnnotation(ActivityPerformanceAnnotation object)
      {
        return createActivityPerformanceAnnotationAdapter();
      }
      @Override
      public Adapter caseActionPerformanceAnnotation(ActionPerformanceAnnotation object)
      {
        return createActionPerformanceAnnotationAdapter();
      }
      @Override
      public Adapter caseCompositionControlFlow(CompositionControlFlow object)
      {
        return createCompositionControlFlowAdapter();
      }
      @Override
      public Adapter caseCompositionObjectFlow(CompositionObjectFlow object)
      {
        return createCompositionObjectFlowAdapter();
      }
      @Override
      public Adapter caseActivityControlFlow(ActivityControlFlow object)
      {
        return createActivityControlFlowAdapter();
      }
      @Override
      public Adapter caseActivityObjectFlow(ActivityObjectFlow object)
      {
        return createActivityObjectFlowAdapter();
      }
      @Override
      public Adapter caseServiceActivity(ServiceActivity object)
      {
        return createServiceActivityAdapter();
      }
      @Override
      public Adapter caseCompositionStart(CompositionStart object)
      {
        return createCompositionStartAdapter();
      }
      @Override
      public Adapter caseCompositionFinish(CompositionFinish object)
      {
        return createCompositionFinishAdapter();
      }
      @Override
      public Adapter caseCompositionDecision(CompositionDecision object)
      {
        return createCompositionDecisionAdapter();
      }
      @Override
      public Adapter caseCompositionFork(CompositionFork object)
      {
        return createCompositionForkAdapter();
      }
      @Override
      public Adapter caseCompositionJoin(CompositionJoin object)
      {
        return createCompositionJoinAdapter();
      }
      @Override
      public Adapter caseCompositionObjectNode(CompositionObjectNode object)
      {
        return createCompositionObjectNodeAdapter();
      }
      @Override
      public Adapter caseActivityAction(ActivityAction object)
      {
        return createActivityActionAdapter();
      }
      @Override
      public Adapter caseActivityStart(ActivityStart object)
      {
        return createActivityStartAdapter();
      }
      @Override
      public Adapter caseActivityFinish(ActivityFinish object)
      {
        return createActivityFinishAdapter();
      }
      @Override
      public Adapter caseActivityDecision(ActivityDecision object)
      {
        return createActivityDecisionAdapter();
      }
      @Override
      public Adapter caseActivityFork(ActivityFork object)
      {
        return createActivityForkAdapter();
      }
      @Override
      public Adapter caseActivityJoin(ActivityJoin object)
      {
        return createActivityJoinAdapter();
      }
      @Override
      public Adapter caseActivityObjectNode(ActivityObjectNode object)
      {
        return createActivityObjectNodeAdapter();
      }
      @Override
      public Adapter casePerformanceAnnotation(PerformanceAnnotation object)
      {
        return createPerformanceAnnotationAdapter();
      }
      @Override
      public Adapter caseLocalPerformanceAnnotation(LocalPerformanceAnnotation object)
      {
        return createLocalPerformanceAnnotationAdapter();
      }
      @Override
      public Adapter caseFlowNode(FlowNode object)
      {
        return createFlowNodeAdapter();
      }
      @Override
      public Adapter caseFlowEdge(FlowEdge object)
      {
        return createFlowEdgeAdapter();
      }
      @Override
      public Adapter caseControlFlow(ControlFlow object)
      {
        return createControlFlowAdapter();
      }
      @Override
      public Adapter caseObjectFlow(ObjectFlow object)
      {
        return createObjectFlowAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter caseObjectNode(ObjectNode object)
      {
        return createObjectNodeAdapter();
      }
      @Override
      public Adapter caseInitialNode(InitialNode object)
      {
        return createInitialNodeAdapter();
      }
      @Override
      public Adapter caseFinalNode(FinalNode object)
      {
        return createFinalNodeAdapter();
      }
      @Override
      public Adapter caseForkNode(ForkNode object)
      {
        return createForkNodeAdapter();
      }
      @Override
      public Adapter caseJoinNode(JoinNode object)
      {
        return createJoinNodeAdapter();
      }
      @Override
      public Adapter caseDecisionNode(DecisionNode object)
      {
        return createDecisionNodeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ServiceComposition <em>Service Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ServiceComposition
   * @generated
   */
  public Adapter createServiceCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityElement <em>Activity Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityElement
   * @generated
   */
  public Adapter createActivityElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionFlowEdge <em>Composition Flow Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionFlowEdge
   * @generated
   */
  public Adapter createCompositionFlowEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionFlowNode <em>Composition Flow Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionFlowNode
   * @generated
   */
  public Adapter createCompositionFlowNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityFlowEdge <em>Activity Flow Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityFlowEdge
   * @generated
   */
  public Adapter createActivityFlowEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityFlowNode <em>Activity Flow Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityFlowNode
   * @generated
   */
  public Adapter createActivityFlowNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.SwimlaneContainer <em>Swimlane Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.SwimlaneContainer
   * @generated
   */
  public Adapter createSwimlaneContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityPerformanceAnnotation <em>Activity Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityPerformanceAnnotation
   * @generated
   */
  public Adapter createActivityPerformanceAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActionPerformanceAnnotation <em>Action Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActionPerformanceAnnotation
   * @generated
   */
  public Adapter createActionPerformanceAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionControlFlow <em>Composition Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionControlFlow
   * @generated
   */
  public Adapter createCompositionControlFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionObjectFlow <em>Composition Object Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionObjectFlow
   * @generated
   */
  public Adapter createCompositionObjectFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityControlFlow <em>Activity Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityControlFlow
   * @generated
   */
  public Adapter createActivityControlFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityObjectFlow <em>Activity Object Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityObjectFlow
   * @generated
   */
  public Adapter createActivityObjectFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ServiceActivity <em>Service Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ServiceActivity
   * @generated
   */
  public Adapter createServiceActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionStart <em>Composition Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionStart
   * @generated
   */
  public Adapter createCompositionStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionFinish <em>Composition Finish</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionFinish
   * @generated
   */
  public Adapter createCompositionFinishAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionDecision <em>Composition Decision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionDecision
   * @generated
   */
  public Adapter createCompositionDecisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionFork <em>Composition Fork</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionFork
   * @generated
   */
  public Adapter createCompositionForkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionJoin <em>Composition Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionJoin
   * @generated
   */
  public Adapter createCompositionJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.CompositionObjectNode <em>Composition Object Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.CompositionObjectNode
   * @generated
   */
  public Adapter createCompositionObjectNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityAction <em>Activity Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityAction
   * @generated
   */
  public Adapter createActivityActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityStart <em>Activity Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityStart
   * @generated
   */
  public Adapter createActivityStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityFinish <em>Activity Finish</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityFinish
   * @generated
   */
  public Adapter createActivityFinishAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityDecision <em>Activity Decision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityDecision
   * @generated
   */
  public Adapter createActivityDecisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityFork <em>Activity Fork</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityFork
   * @generated
   */
  public Adapter createActivityForkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityJoin <em>Activity Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityJoin
   * @generated
   */
  public Adapter createActivityJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityObjectNode <em>Activity Object Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityObjectNode
   * @generated
   */
  public Adapter createActivityObjectNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.PerformanceAnnotation <em>Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.PerformanceAnnotation
   * @generated
   */
  public Adapter createPerformanceAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.LocalPerformanceAnnotation <em>Local Performance Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.LocalPerformanceAnnotation
   * @generated
   */
  public Adapter createLocalPerformanceAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.FlowNode <em>Flow Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.FlowNode
   * @generated
   */
  public Adapter createFlowNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.FlowEdge <em>Flow Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.FlowEdge
   * @generated
   */
  public Adapter createFlowEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ControlFlow <em>Control Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ControlFlow
   * @generated
   */
  public Adapter createControlFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ObjectFlow <em>Object Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ObjectFlow
   * @generated
   */
  public Adapter createObjectFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.Activity
   * @generated
   */
  public Adapter createActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ObjectNode <em>Object Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ObjectNode
   * @generated
   */
  public Adapter createObjectNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.InitialNode <em>Initial Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.InitialNode
   * @generated
   */
  public Adapter createInitialNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.FinalNode <em>Final Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.FinalNode
   * @generated
   */
  public Adapter createFinalNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ForkNode <em>Fork Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ForkNode
   * @generated
   */
  public Adapter createForkNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.JoinNode <em>Join Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.JoinNode
   * @generated
   */
  public Adapter createJoinNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.DecisionNode <em>Decision Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.DecisionNode
   * @generated
   */
  public Adapter createDecisionNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ServiceCompositionAdapterFactory
