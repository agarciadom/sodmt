/**
 */
package es.uca.modeling.eol.marte.weaving.links;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.MethodDeclaration;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Requirement Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getPerformanceRequirement <em>Performance Requirement</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getTestMethod <em>Test Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLink()
 * @model
 * @generated
 */
public interface PerformanceRequirementLink extends EObject
{
  /**
   * Returns the value of the '<em><b>Performance Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Performance Requirement</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Performance Requirement</em>' reference.
   * @see #setPerformanceRequirement(GaStep)
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLink_PerformanceRequirement()
   * @model
   * @generated
   */
  GaStep getPerformanceRequirement();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getPerformanceRequirement <em>Performance Requirement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Performance Requirement</em>' reference.
   * @see #getPerformanceRequirement()
   * @generated
   */
  void setPerformanceRequirement(GaStep value);

  /**
   * Returns the value of the '<em><b>Test Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Method</em>' reference.
   * @see #setTestMethod(MethodDeclaration)
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLink_TestMethod()
   * @model
   * @generated
   */
  MethodDeclaration getTestMethod();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getTestMethod <em>Test Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Method</em>' reference.
   * @see #getTestMethod()
   * @generated
   */
  void setTestMethod(MethodDeclaration value);

} // PerformanceRequirementLink
