/**
 */
package es.uca.modeling.eol.marte.weaving.wsdl.links;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Requirement Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks()
 * @model
 * @generated
 */
public interface PerformanceRequirementLinks extends EObject
{
  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_Links()
   * @model containment="true"
   * @generated
   */
  EList<PerformanceRequirementLink> getLinks();

} // PerformanceRequirementLinks
