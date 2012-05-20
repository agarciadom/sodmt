/**
 */
package es.uca.modeling.eol.marte.weaving.links.impl;

import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmt.modisco.java.MethodDeclaration;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirement Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl#getPerformanceRequirement <em>Performance Requirement</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl#getTestMethod <em>Test Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceRequirementLinkImpl extends EObjectImpl implements PerformanceRequirementLink
{
  /**
   * The cached value of the '{@link #getPerformanceRequirement() <em>Performance Requirement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerformanceRequirement()
   * @generated
   * @ordered
   */
  protected GaStep performanceRequirement;

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
  public GaStep getPerformanceRequirement()
  {
    if (performanceRequirement != null && performanceRequirement.eIsProxy())
    {
      InternalEObject oldPerformanceRequirement = (InternalEObject)performanceRequirement;
      performanceRequirement = (GaStep)eResolveProxy(oldPerformanceRequirement);
      if (performanceRequirement != oldPerformanceRequirement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__PERFORMANCE_REQUIREMENT, oldPerformanceRequirement, performanceRequirement));
      }
    }
    return performanceRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GaStep basicGetPerformanceRequirement()
  {
    return performanceRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerformanceRequirement(GaStep newPerformanceRequirement)
  {
    GaStep oldPerformanceRequirement = performanceRequirement;
    performanceRequirement = newPerformanceRequirement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__PERFORMANCE_REQUIREMENT, oldPerformanceRequirement, performanceRequirement));
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__PERFORMANCE_REQUIREMENT:
        if (resolve) return getPerformanceRequirement();
        return basicGetPerformanceRequirement();
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__PERFORMANCE_REQUIREMENT:
        setPerformanceRequirement((GaStep)newValue);
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__PERFORMANCE_REQUIREMENT:
        setPerformanceRequirement((GaStep)null);
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__PERFORMANCE_REQUIREMENT:
        return performanceRequirement != null;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD:
        return testMethod != null;
    }
    return super.eIsSet(featureID);
  }

} //PerformanceRequirementLinkImpl
