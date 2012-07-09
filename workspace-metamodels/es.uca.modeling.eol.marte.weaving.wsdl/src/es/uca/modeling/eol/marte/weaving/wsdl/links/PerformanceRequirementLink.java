/**
 */
package es.uca.modeling.eol.marte.weaving.wsdl.links;

import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Requirement Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink#getExecNode <em>Exec Node</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLink()
 * @model
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
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLink_ExecNode()
   * @model
   * @generated
   */
  ExecutableNode getExecNode();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink#getExecNode <em>Exec Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec Node</em>' reference.
   * @see #getExecNode()
   * @generated
   */
  void setExecNode(ExecutableNode value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' reference.
   * @see #setOperation(TypeOperation)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLink_Operation()
   * @model
   * @generated
   */
  TypeOperation getOperation();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink#getOperation <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(TypeOperation value);

} // PerformanceRequirementLink
