/**
 */
package serviceProcess.impl;

import org.eclipse.emf.ecore.EClass;

import serviceProcess.DecisionNode;
import serviceProcess.ServiceProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DecisionNodeImpl extends ActivityNodeImpl implements DecisionNode
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DecisionNodeImpl()
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
		return ServiceProcessPackage.Literals.DECISION_NODE;
	}

} //DecisionNodeImpl
