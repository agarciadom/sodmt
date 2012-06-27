/**
 */
package es.uca.modeling.eol.marte.weaving.links;

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
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getSamplesPerTest <em>Samples Per Test</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getThreads <em>Threads</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getBaseDir <em>Base Dir</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLinks()
 * @model
 * @generated
 */
public interface PerformanceRequirementLinks extends EObject
{
  /**
   * Returns the value of the '<em><b>Samples Per Test</b></em>' attribute.
   * The default value is <code>"1000"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Samples Per Test</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Samples Per Test</em>' attribute.
   * @see #setSamplesPerTest(Integer)
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLinks_SamplesPerTest()
   * @model default="1000"
   * @generated
   */
  Integer getSamplesPerTest();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getSamplesPerTest <em>Samples Per Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Samples Per Test</em>' attribute.
   * @see #getSamplesPerTest()
   * @generated
   */
  void setSamplesPerTest(Integer value);

  /**
   * Returns the value of the '<em><b>Threads</b></em>' attribute.
   * The default value is <code>"5"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threads</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threads</em>' attribute.
   * @see #setThreads(Integer)
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLinks_Threads()
   * @model default="5"
   * @generated
   */
  Integer getThreads();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getThreads <em>Threads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threads</em>' attribute.
   * @see #getThreads()
   * @generated
   */
  void setThreads(Integer value);

  /**
   * Returns the value of the '<em><b>Base Dir</b></em>' attribute.
   * The default value is <code>"src"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Dir</em>' attribute.
   * @see #setBaseDir(String)
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLinks_BaseDir()
   * @model default="src"
   * @generated
   */
  String getBaseDir();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getBaseDir <em>Base Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Dir</em>' attribute.
   * @see #getBaseDir()
   * @generated
   */
  void setBaseDir(String value);

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getPerformanceRequirementLinks_Links()
   * @model containment="true"
   * @generated
   */
  EList<PerformanceRequirementLink> getLinks();

} // PerformanceRequirementLinks
