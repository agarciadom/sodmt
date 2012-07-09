/**
 */
package es.uca.modeling.eol.marte.weaving.wsdl.links;

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
 * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksFactory
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
  String eNS_URI = "www.uca.es/modeling/weaving/wsdl";

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
  LinksPackage eINSTANCE = es.uca.modeling.eol.marte.weaving.wsdl.links.impl.LinksPackageImpl.init();

  /**
   * The meta object id for the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl <em>Performance Requirement Links</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.impl.LinksPackageImpl#getPerformanceRequirementLinks()
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
   * The meta object id for the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinkImpl <em>Performance Requirement Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinkImpl
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.impl.LinksPackageImpl#getPerformanceRequirementLink()
   * @generated
   */
  int PERFORMANCE_REQUIREMENT_LINK = 1;

  /**
   * The feature id for the '<em><b>Exec Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK__OPERATION = 1;

  /**
   * The number of structural features of the '<em>Performance Requirement Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks <em>Performance Requirement Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Performance Requirement Links</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks
   * @generated
   */
  EClass getPerformanceRequirementLinks();

  /**
   * Returns the meta object for the containment reference list '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getLinks()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EReference getPerformanceRequirementLinks_Links();

  /**
   * Returns the meta object for class '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink <em>Performance Requirement Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Performance Requirement Link</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink
   * @generated
   */
  EClass getPerformanceRequirementLink();

  /**
   * Returns the meta object for the reference '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exec Node</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink#getExecNode()
   * @see #getPerformanceRequirementLink()
   * @generated
   */
  EReference getPerformanceRequirementLink_ExecNode();

  /**
   * Returns the meta object for the reference '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operation</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink#getOperation()
   * @see #getPerformanceRequirementLink()
   * @generated
   */
  EReference getPerformanceRequirementLink_Operation();

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
     * The meta object literal for the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl <em>Performance Requirement Links</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl
     * @see es.uca.modeling.eol.marte.weaving.wsdl.links.impl.LinksPackageImpl#getPerformanceRequirementLinks()
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
     * The meta object literal for the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinkImpl <em>Performance Requirement Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinkImpl
     * @see es.uca.modeling.eol.marte.weaving.wsdl.links.impl.LinksPackageImpl#getPerformanceRequirementLink()
     * @generated
     */
    EClass PERFORMANCE_REQUIREMENT_LINK = eINSTANCE.getPerformanceRequirementLink();

    /**
     * The meta object literal for the '<em><b>Exec Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE = eINSTANCE.getPerformanceRequirementLink_ExecNode();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERFORMANCE_REQUIREMENT_LINK__OPERATION = eINSTANCE.getPerformanceRequirementLink_Operation();

  }

} //LinksPackage
