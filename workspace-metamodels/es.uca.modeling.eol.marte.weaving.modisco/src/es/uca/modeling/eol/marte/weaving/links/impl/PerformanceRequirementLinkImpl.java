/**
 */
package es.uca.modeling.eol.marte.weaving.links.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.uml2.uml.ExecutableNode;

import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirement Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl#getExecNode <em>Exec Node</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl#getTestMethod <em>Test Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceRequirementLinkImpl extends EObjectImpl implements PerformanceRequirementLink
{
  /**
   * The cached value of the '{@link #getExecNode() <em>Exec Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecNode()
   * @generated
   * @ordered
   */
  protected ExecutableNode execNode;

  /**
   * The cached value of the '{@link #getTestMethod() <em>Test Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestMethod()
   * @generated
   * @ordered
   */
  protected MethodDeclaration testMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerformanceRequirementLinkImpl()
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
    return LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutableNode getExecNode()
  {
    if (execNode != null && execNode.eIsProxy())
    {
      InternalEObject oldExecNode = (InternalEObject)execNode;
      execNode = (ExecutableNode)eResolveProxy(oldExecNode);
      if (execNode != oldExecNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE, oldExecNode, execNode));
      }
    }
    return execNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutableNode basicGetExecNode()
  {
    return execNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecNode(ExecutableNode newExecNode)
  {
    ExecutableNode oldExecNode = execNode;
    execNode = newExecNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE, oldExecNode, execNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDeclaration getTestMethod()
  {
    if (testMethod != null && testMethod.eIsProxy())
    {
      InternalEObject oldTestMethod = (InternalEObject)testMethod;
      testMethod = (MethodDeclaration)eResolveProxy(oldTestMethod);
      if (testMethod != oldTestMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD, oldTestMethod, testMethod));
      }
    }
    return testMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDeclaration basicGetTestMethod()
  {
    return testMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestMethod(MethodDeclaration newTestMethod)
  {
    MethodDeclaration oldTestMethod = testMethod;
    testMethod = newTestMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD, oldTestMethod, testMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE:
        if (resolve) return getExecNode();
        return basicGetExecNode();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD:
        if (resolve) return getTestMethod();
        return basicGetTestMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE:
        setExecNode((ExecutableNode)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD:
        setTestMethod((MethodDeclaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE:
        setExecNode((ExecutableNode)null);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD:
        setTestMethod((MethodDeclaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE:
        return execNode != null;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD:
        return testMethod != null;
    }
    return super.eIsSet(featureID);
  }

} //PerformanceRequirementLinkImpl
