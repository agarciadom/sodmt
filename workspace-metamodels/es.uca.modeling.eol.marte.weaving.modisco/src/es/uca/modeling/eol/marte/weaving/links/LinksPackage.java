/**
 */
package es.uca.modeling.eol.marte.weaving.links;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uca.modeling.eol.marte.weaving.links.LinksFactory
 * @model kind="package"
 * @generated
 */
public interface LinksPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "links";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "www.uca.es/modeling/weaving/modisco";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mw";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LinksPackage eINSTANCE = es.uca.modeling.eol.marte.weaving.links.impl.LinksPackageImpl.init();

  /**
   * The meta object id for the '{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl <em>Performance Requirement Links</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl
   * @see es.uca.modeling.eol.marte.weaving.links.impl.LinksPackageImpl#getPerformanceRequirementLinks()
   * @generated
   */
  int PERFORMANCE_REQUIREMENT_LINKS = 0;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__LINKS = 0;

  /**
   * The number of structural features of the '<em>Performance Requirement Links</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl <em>Performance Requirement Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl
   * @see es.uca.modeling.eol.marte.weaving.links.impl.LinksPackageImpl#getPerformanceRequirementLink()
   * @generated
   */
  int PERFORMANCE_REQUIREMENT_LINK = 1;

  /**
   * The feature id for the '<em><b>Performance Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK__PERFORMANCE_REQUIREMENT = 0;

  /**
   * The feature id for the '<em><b>Test Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD = 1;

  /**
   * The number of structural features of the '<em>Performance Requirement Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks <em>Performance Requirement Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Performance Requirement Links</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks
   * @generated
   */
  EClass getPerformanceRequirementLinks();

  /**
   * Returns the meta object for the containment reference list '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getLinks()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EReference getPerformanceRequirementLinks_Links();

  /**
   * Returns the meta object for class '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink <em>Performance Requirement Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Performance Requirement Link</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink
   * @generated
   */
  EClass getPerformanceRequirementLink();

  /**
   * Returns the meta object for the reference '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getPerformanceRequirement <em>Performance Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Performance Requirement</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getPerformanceRequirement()
   * @see #getPerformanceRequirementLink()
   * @generated
   */
  EReference getPerformanceRequirementLink_PerformanceRequirement();

  /**
   * Returns the meta object for the reference '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getTestMethod <em>Test Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Test Method</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getTestMethod()
   * @see #getPerformanceRequirementLink()
   * @generated
   */
  EReference getPerformanceRequirementLink_TestMethod();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LinksFactory getLinksFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl <em>Performance Requirement Links</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl
     * @see es.uca.modeling.eol.marte.weaving.links.impl.LinksPackageImpl#getPerformanceRequirementLinks()
     * @generated
     */
    EClass PERFORMANCE_REQUIREMENT_LINKS = eINSTANCE.getPerformanceRequirementLinks();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERFORMANCE_REQUIREMENT_LINKS__LINKS = eINSTANCE.getPerformanceRequirementLinks_Links();

    /**
     * The meta object literal for the '{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl <em>Performance Requirement Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl
     * @see es.uca.modeling.eol.marte.weaving.links.impl.LinksPackageImpl#getPerformanceRequirementLink()
     * @generated
     */
    EClass PERFORMANCE_REQUIREMENT_LINK = eINSTANCE.getPerformanceRequirementLink();

    /**
     * The meta object literal for the '<em><b>Performance Requirement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERFORMANCE_REQUIREMENT_LINK__PERFORMANCE_REQUIREMENT = eINSTANCE.getPerformanceRequirementLink_PerformanceRequirement();

    /**
     * The meta object literal for the '<em><b>Test Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERFORMANCE_REQUIREMENT_LINK__TEST_METHOD = eINSTANCE.getPerformanceRequirementLink_TestMethod();

  }

} //LinksPackage
