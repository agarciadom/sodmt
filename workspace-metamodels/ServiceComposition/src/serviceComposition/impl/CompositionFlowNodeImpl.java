/**
 */
package serviceComposition.impl;

import org.eclipse.emf.ecore.EClass;

import serviceComposition.CompositionFlowNode;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CompositionFlowNodeImpl extends FlowNodeImpl implements CompositionFlowNode
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositionFlowNodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ServiceCompositionPackage.Literals.COMPOSITION_FLOW_NODE;
  }

} //CompositionFlowNodeImpl
