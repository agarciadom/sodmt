/**
 */
package serviceComposition.impl;

import org.eclipse.emf.ecore.EClass;

import serviceComposition.ForkNode;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ForkNodeImpl extends ActivityNodeImpl implements ForkNode
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForkNodeImpl()
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
    return ServiceCompositionPackage.Literals.FORK_NODE;
  }

} //ForkNodeImpl
