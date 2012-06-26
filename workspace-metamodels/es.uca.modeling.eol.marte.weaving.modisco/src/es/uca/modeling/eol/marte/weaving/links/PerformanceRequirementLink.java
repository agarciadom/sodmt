/**
 */
package es.uca.modeling.eol.marte.weaving.links;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
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
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getMetric <em>Metric</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getExecNode <em>Exec Node</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getKlazz <em>Klazz</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getTestMethods <em>Test Methods</em>}</li>
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
   * Returns the value of the '<em><b>Metric</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * The literals are from the enumeration {@link es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' attribute.
   * @see es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric
   * @see #setMetric(TimeLimitMetric)
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLink_Metric()
   * @model default="0"
   * @generated
   */
  TimeLimitMetric getMetric();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getMetric <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metric</em>' attribute.
   * @see es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric
   * @see #getMetric()
   * @generated
   */
  void setMetric(TimeLimitMetric value);

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
   * Returns the value of the '<em><b>Klazz</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Klazz</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Klazz</em>' reference.
   * @see #setKlazz(ClassDeclaration)
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLink_Klazz()
   * @model
   * @generated
   */
  ClassDeclaration getKlazz();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getKlazz <em>Klazz</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Klazz</em>' reference.
   * @see #getKlazz()
   * @generated
   */
  void setKlazz(ClassDeclaration value);

  /**
   * Returns the value of the '<em><b>Test Methods</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.gmt.modisco.java.MethodDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Methods</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Methods</em>' reference list.
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLink_TestMethods()
   * @model
   * @generated
   */
  EList<MethodDeclaration> getTestMethods();

} // PerformanceRequirementLink
