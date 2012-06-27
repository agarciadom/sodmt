/**
 */
package es.uca.modeling.eol.marte.weaving.links;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The feature id for the '<em><b>Samples Per Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__SAMPLES_PER_TEST = 0;

  /**
   * The feature id for the '<em><b>Threads</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__THREADS = 1;

  /**
   * The feature id for the '<em><b>Base Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR = 2;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__LINKS = 3;

  /**
   * The number of structural features of the '<em>Performance Requirement Links</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Metric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK__METRIC = 0;

  /**
   * The feature id for the '<em><b>Exec Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE = 1;

  /**
   * The feature id for the '<em><b>Klazz</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK__KLAZZ = 2;

  /**
   * The feature id for the '<em><b>Test Methods</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS = 3;

  /**
   * The number of structural features of the '<em>Performance Requirement Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINK_FEATURE_COUNT = 4;


  /**
   * The meta object id for the '{@link es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric <em>Time Limit Metric</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric
   * @see es.uca.modeling.eol.marte.weaving.links.impl.LinksPackageImpl#getTimeLimitMetric()
   * @generated
   */
  int TIME_LIMIT_METRIC = 2;


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
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getSamplesPerTest <em>Samples Per Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Samples Per Test</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getSamplesPerTest()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_SamplesPerTest();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getThreads <em>Threads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threads</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getThreads()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_Threads();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getBaseDir <em>Base Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Dir</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks#getBaseDir()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_BaseDir();

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
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getMetric <em>Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metric</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getMetric()
   * @see #getPerformanceRequirementLink()
   * @generated
   */
  EAttribute getPerformanceRequirementLink_Metric();

  /**
   * Returns the meta object for the reference '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getExecNode <em>Exec Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exec Node</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getExecNode()
   * @see #getPerformanceRequirementLink()
   * @generated
   */
  EReference getPerformanceRequirementLink_ExecNode();

  /**
   * Returns the meta object for the reference '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getKlazz <em>Klazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Klazz</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getKlazz()
   * @see #getPerformanceRequirementLink()
   * @generated
   */
  EReference getPerformanceRequirementLink_Klazz();

  /**
   * Returns the meta object for the reference list '{@link es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getTestMethods <em>Test Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Test Methods</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink#getTestMethods()
   * @see #getPerformanceRequirementLink()
   * @generated
   */
  EReference getPerformanceRequirementLink_TestMethods();

  /**
   * Returns the meta object for enum '{@link es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric <em>Time Limit Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Time Limit Metric</em>'.
   * @see es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric
   * @generated
   */
  EEnum getTimeLimitMetric();

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
     * The meta object literal for the '<em><b>Samples Per Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__SAMPLES_PER_TEST = eINSTANCE.getPerformanceRequirementLinks_SamplesPerTest();

    /**
     * The meta object literal for the '<em><b>Threads</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__THREADS = eINSTANCE.getPerformanceRequirementLinks_Threads();

    /**
     * The meta object literal for the '<em><b>Base Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR = eINSTANCE.getPerformanceRequirementLinks_BaseDir();

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
     * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINK__METRIC = eINSTANCE.getPerformanceRequirementLink_Metric();

    /**
     * The meta object literal for the '<em><b>Exec Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE = eINSTANCE.getPerformanceRequirementLink_ExecNode();

    /**
     * The meta object literal for the '<em><b>Klazz</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERFORMANCE_REQUIREMENT_LINK__KLAZZ = eINSTANCE.getPerformanceRequirementLink_Klazz();

    /**
     * The meta object literal for the '<em><b>Test Methods</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS = eINSTANCE.getPerformanceRequirementLink_TestMethods();

    /**
     * The meta object literal for the '{@link es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric <em>Time Limit Metric</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric
     * @see es.uca.modeling.eol.marte.weaving.links.impl.LinksPackageImpl#getTimeLimitMetric()
     * @generated
     */
    EEnum TIME_LIMIT_METRIC = eINSTANCE.getTimeLimitMetric();

  }

} //LinksPackage
