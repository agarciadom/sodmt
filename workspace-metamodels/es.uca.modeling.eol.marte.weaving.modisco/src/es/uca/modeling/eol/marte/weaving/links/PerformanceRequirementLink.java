/**
 */
package es.uca.modeling.eol.marte.weaving.links;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.uml2.uml.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Requirement Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getExecNode <em>Exec Node</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getTestMethod <em>Test Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLink()
 * @model annotation="exeed label='return Sequence { self.testMethod.abstractTypeDeclaration.package }.closure(p | p.package).invert.collect(p|p.name).concat(\'.\') + \'.\' + self.testMethod.abstractTypeDeclaration.name + \'#\' + self.testMethod.name;'"
 * @generated
 */
public interface PerformanceRequirementLink extends EObject
{
  /**
   * Returns the value of the '<em><b>Exec Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exec Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec Node</em>' reference.
   * @see #setExecNode(ExecutableNode)
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLink_ExecNode()
   * @model
   * @generated
   */
  ExecutableNode getExecNode();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getExecNode <em>Exec Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec Node</em>' reference.
   * @see #getExecNode()
   * @generated
   */
  void setExecNode(ExecutableNode value);

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
