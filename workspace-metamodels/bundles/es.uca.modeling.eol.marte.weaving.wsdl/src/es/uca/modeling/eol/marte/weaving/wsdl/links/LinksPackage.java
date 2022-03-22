/**
 */
package es.uca.modeling.eol.marte.weaving.wsdl.links;

import org.eclipse.emf.ecore.EAttribute;
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
   * The feature id for the '<em><b>Eclipse Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__ECLIPSE_PROJECT_NAME = 1;

  /**
   * The feature id for the '<em><b>Processes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__PROCESSES = 2;

  /**
   * The feature id for the '<em><b>Process Increment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT = 3;

  /**
   * The feature id for the '<em><b>Process Increment Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL = 4;

  /**
   * The feature id for the '<em><b>Threads Per Process</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS = 5;

  /**
   * The feature id for the '<em><b>Runs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__RUNS = 6;

  /**
   * The feature id for the '<em><b>Console Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST = 7;

  /**
   * The feature id for the '<em><b>Use Console</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE = 8;

  /**
   * The feature id for the '<em><b>Update Inputs On Spec Changed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED = 9;

  /**
   * The feature id for the '<em><b>Number Inputs On Spec Changed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED = 10;

  /**
   * The feature id for the '<em><b>Maven Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID = 11;

  /**
   * The feature id for the '<em><b>Maven Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID = 12;

  /**
   * The feature id for the '<em><b>Maven Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION = 13;

  /**
   * The feature id for the '<em><b>Maven Human Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME = 14;

  /**
   * The feature id for the '<em><b>Maven Human Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION = 15;

  /**
   * The number of structural features of the '<em>Performance Requirement Links</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_REQUIREMENT_LINKS_FEATURE_COUNT = 16;

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
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getEclipseProjectName <em>Eclipse Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eclipse Project Name</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getEclipseProjectName()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_EclipseProjectName();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processes</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcesses()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_Processes();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcessIncrement <em>Process Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Increment</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcessIncrement()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_ProcessIncrement();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcessIncrementInterval <em>Process Increment Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Increment Interval</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcessIncrementInterval()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_ProcessIncrementInterval();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getThreadsPerProcess <em>Threads Per Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threads Per Process</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getThreadsPerProcess()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_ThreadsPerProcess();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getRuns <em>Runs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runs</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getRuns()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_Runs();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getConsoleHost <em>Console Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Console Host</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getConsoleHost()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_ConsoleHost();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#isUseConsole <em>Use Console</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Console</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#isUseConsole()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_UseConsole();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#isUpdateInputsOnSpecChanged <em>Update Inputs On Spec Changed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Update Inputs On Spec Changed</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#isUpdateInputsOnSpecChanged()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_UpdateInputsOnSpecChanged();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getNumberInputsOnSpecChanged <em>Number Inputs On Spec Changed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Inputs On Spec Changed</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getNumberInputsOnSpecChanged()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_NumberInputsOnSpecChanged();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenGroupId <em>Maven Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maven Group Id</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenGroupId()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_MavenGroupId();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenArtifactId <em>Maven Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maven Artifact Id</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenArtifactId()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_MavenArtifactId();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenVersion <em>Maven Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maven Version</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenVersion()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_MavenVersion();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenHumanName <em>Maven Human Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maven Human Name</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenHumanName()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_MavenHumanName();

  /**
   * Returns the meta object for the attribute '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenHumanDescription <em>Maven Human Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maven Human Description</em>'.
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenHumanDescription()
   * @see #getPerformanceRequirementLinks()
   * @generated
   */
  EAttribute getPerformanceRequirementLinks_MavenHumanDescription();

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
     * The meta object literal for the '<em><b>Eclipse Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__ECLIPSE_PROJECT_NAME = eINSTANCE.getPerformanceRequirementLinks_EclipseProjectName();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__PROCESSES = eINSTANCE.getPerformanceRequirementLinks_Processes();

    /**
     * The meta object literal for the '<em><b>Process Increment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT = eINSTANCE.getPerformanceRequirementLinks_ProcessIncrement();

    /**
     * The meta object literal for the '<em><b>Process Increment Interval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL = eINSTANCE.getPerformanceRequirementLinks_ProcessIncrementInterval();

    /**
     * The meta object literal for the '<em><b>Threads Per Process</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS = eINSTANCE.getPerformanceRequirementLinks_ThreadsPerProcess();

    /**
     * The meta object literal for the '<em><b>Runs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__RUNS = eINSTANCE.getPerformanceRequirementLinks_Runs();

    /**
     * The meta object literal for the '<em><b>Console Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST = eINSTANCE.getPerformanceRequirementLinks_ConsoleHost();

    /**
     * The meta object literal for the '<em><b>Use Console</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE = eINSTANCE.getPerformanceRequirementLinks_UseConsole();

    /**
     * The meta object literal for the '<em><b>Update Inputs On Spec Changed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED = eINSTANCE.getPerformanceRequirementLinks_UpdateInputsOnSpecChanged();

    /**
     * The meta object literal for the '<em><b>Number Inputs On Spec Changed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED = eINSTANCE.getPerformanceRequirementLinks_NumberInputsOnSpecChanged();

    /**
     * The meta object literal for the '<em><b>Maven Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID = eINSTANCE.getPerformanceRequirementLinks_MavenGroupId();

    /**
     * The meta object literal for the '<em><b>Maven Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID = eINSTANCE.getPerformanceRequirementLinks_MavenArtifactId();

    /**
     * The meta object literal for the '<em><b>Maven Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION = eINSTANCE.getPerformanceRequirementLinks_MavenVersion();

    /**
     * The meta object literal for the '<em><b>Maven Human Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME = eINSTANCE.getPerformanceRequirementLinks_MavenHumanName();

    /**
     * The meta object literal for the '<em><b>Maven Human Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION = eINSTANCE.getPerformanceRequirementLinks_MavenHumanDescription();

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
