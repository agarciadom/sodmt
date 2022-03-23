/**
 */
package serviceProcess.impl;

import org.eclipse.emf.ecore.EClass;

import serviceProcess.ForkNode;
import serviceProcess.ServiceProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
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
		return ServiceProcessPackage.Literals.FORK_NODE;
	}

} //ForkNodeImpl
