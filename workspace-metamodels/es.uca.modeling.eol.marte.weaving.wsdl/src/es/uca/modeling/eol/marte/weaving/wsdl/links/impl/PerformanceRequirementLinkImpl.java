/**
 */
package es.uca.modeling.eol.marte.weaving.wsdl.links.impl;

import es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink;

import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirement Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinkImpl#getExecNode <em>Exec Node</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinkImpl#getOperation <em>Operation</em>}</li>
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
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected TypeOperation operation;

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
  public TypeOperation getOperation()
  {
    if (operation != null && operation.eIsProxy())
    {
      InternalEObject oldOperation = (InternalEObject)operation;
      operation = (TypeOperation)eResolveProxy(oldOperation);
      if (operation != oldOperation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__OPERATION, oldOperation, operation));
      }
    }
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeOperation basicGetOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(TypeOperation newOperation)
  {
    TypeOperation oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__OPERATION, oldOperation, operation));
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__OPERATION:
        if (resolve) return getOperation();
        return basicGetOperation();
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__OPERATION:
        setOperation((TypeOperation)newValue);
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__OPERATION:
        setOperation((TypeOperation)null);
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__OPERATION:
        return operation != null;
    }
    return super.eIsSet(featureID);
  }

} //PerformanceRequirementLinkImpl
