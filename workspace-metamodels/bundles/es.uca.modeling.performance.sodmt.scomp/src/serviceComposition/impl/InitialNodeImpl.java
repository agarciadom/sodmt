/**
 */
package serviceComposition.impl;

import org.eclipse.emf.ecore.EClass;

import serviceComposition.InitialNode;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InitialNodeImpl extends ActivityNodeImpl implements InitialNode
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InitialNodeImpl()
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
		return ServiceCompositionPackage.Literals.INITIAL_NODE;
	}

} //InitialNodeImpl
