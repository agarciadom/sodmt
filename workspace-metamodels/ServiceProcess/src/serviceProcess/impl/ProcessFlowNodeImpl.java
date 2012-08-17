/**
 */
package serviceProcess.impl;

import org.eclipse.emf.ecore.EClass;

import serviceProcess.ProcessFlowNode;
import serviceProcess.ServiceProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ProcessFlowNodeImpl extends FlowNodeImpl implements ProcessFlowNode
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessFlowNodeImpl()
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
    return ServiceProcessPackage.Literals.PROCESS_FLOW_NODE;
  }

} //ProcessFlowNodeImpl
