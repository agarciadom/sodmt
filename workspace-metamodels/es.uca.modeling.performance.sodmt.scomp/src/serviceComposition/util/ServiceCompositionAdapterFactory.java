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
      public Adapter caseActivityPartition(ActivityPartition object)
      {
        return createActivityPartitionAdapter();
      }
      @Override
      public Adapter caseActivityEdge(ActivityEdge object)
      {
        return createActivityEdgeAdapter();
      }
      @Override
      public Adapter caseActivityNode(ActivityNode object)
      {
        return createActivityNodeAdapter();
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
      public Adapter caseExecutableNode(ExecutableNode object)
      {
        return createExecutableNodeAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseStructuredActivityNode(StructuredActivityNode object)
      {
        return createStructuredActivityNodeAdapter();
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
      public Adapter caseDecisionNode(DecisionNode object)
      {
        return createDecisionNodeAdapter();
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
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityPartition <em>Activity Partition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityPartition
   * @generated
   */
  public Adapter createActivityPartitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityEdge <em>Activity Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityEdge
   * @generated
   */
  public Adapter createActivityEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.ActivityNode <em>Activity Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ActivityNode
   * @generated
   */
  public Adapter createActivityNodeAdapter()
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
   * Creates a new adapter for an object of class '{@link serviceComposition.ExecutableNode <em>Executable Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.ExecutableNode
   * @generated
   */
  public Adapter createExecutableNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link serviceComposition.StructuredActivityNode <em>Structured Activity Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see serviceComposition.StructuredActivityNode
   * @generated
   */
  public Adapter createStructuredActivityNodeAdapter()
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
