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
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getEclipseProjectName <em>Eclipse Project Name</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcesses <em>Processes</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcessIncrement <em>Process Increment</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcessIncrementInterval <em>Process Increment Interval</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getThreadsPerProcess <em>Threads Per Process</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getRuns <em>Runs</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getConsoleHost <em>Console Host</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#isUseConsole <em>Use Console</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#isUpdateInputsOnSpecChanged <em>Update Inputs On Spec Changed</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getNumberInputsOnSpecChanged <em>Number Inputs On Spec Changed</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenGroupId <em>Maven Group Id</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenArtifactId <em>Maven Artifact Id</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenVersion <em>Maven Version</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenHumanName <em>Maven Human Name</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenHumanDescription <em>Maven Human Description</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Eclipse Project Name</b></em>' attribute.
   * The default value is <code>"performance.tests"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eclipse Project Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eclipse Project Name</em>' attribute.
   * @see #setEclipseProjectName(String)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_EclipseProjectName()
   * @model default="performance.tests"
   * @generated
   */
  String getEclipseProjectName();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getEclipseProjectName <em>Eclipse Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eclipse Project Name</em>' attribute.
   * @see #getEclipseProjectName()
   * @generated
   */
  void setEclipseProjectName(String value);

  /**
   * Returns the value of the '<em><b>Processes</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' attribute.
   * @see #setProcesses(int)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_Processes()
   * @model default="1"
   * @generated
   */
  int getProcesses();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcesses <em>Processes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processes</em>' attribute.
   * @see #getProcesses()
   * @generated
   */
  void setProcesses(int value);

  /**
   * Returns the value of the '<em><b>Process Increment</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Increment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Increment</em>' attribute.
   * @see #setProcessIncrement(int)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_ProcessIncrement()
   * @model default="1"
   * @generated
   */
  int getProcessIncrement();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcessIncrement <em>Process Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Increment</em>' attribute.
   * @see #getProcessIncrement()
   * @generated
   */
  void setProcessIncrement(int value);

  /**
   * Returns the value of the '<em><b>Process Increment Interval</b></em>' attribute.
   * The default value is <code>"1000"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Increment Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Increment Interval</em>' attribute.
   * @see #setProcessIncrementInterval(int)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_ProcessIncrementInterval()
   * @model default="1000"
   * @generated
   */
  int getProcessIncrementInterval();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getProcessIncrementInterval <em>Process Increment Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Increment Interval</em>' attribute.
   * @see #getProcessIncrementInterval()
   * @generated
   */
  void setProcessIncrementInterval(int value);

  /**
   * Returns the value of the '<em><b>Threads Per Process</b></em>' attribute.
   * The default value is <code>"5"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threads Per Process</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threads Per Process</em>' attribute.
   * @see #setThreadsPerProcess(int)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_ThreadsPerProcess()
   * @model default="5"
   * @generated
   */
  int getThreadsPerProcess();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getThreadsPerProcess <em>Threads Per Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threads Per Process</em>' attribute.
   * @see #getThreadsPerProcess()
   * @generated
   */
  void setThreadsPerProcess(int value);

  /**
   * Returns the value of the '<em><b>Runs</b></em>' attribute.
   * The default value is <code>"2"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Runs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runs</em>' attribute.
   * @see #setRuns(int)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_Runs()
   * @model default="2"
   * @generated
   */
  int getRuns();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getRuns <em>Runs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Runs</em>' attribute.
   * @see #getRuns()
   * @generated
   */
  void setRuns(int value);

  /**
   * Returns the value of the '<em><b>Console Host</b></em>' attribute.
   * The default value is <code>"127.0.0.1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Console Host</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Console Host</em>' attribute.
   * @see #setConsoleHost(String)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_ConsoleHost()
   * @model default="127.0.0.1"
   * @generated
   */
  String getConsoleHost();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getConsoleHost <em>Console Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Console Host</em>' attribute.
   * @see #getConsoleHost()
   * @generated
   */
  void setConsoleHost(String value);

  /**
   * Returns the value of the '<em><b>Use Console</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Console</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Console</em>' attribute.
   * @see #setUseConsole(boolean)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_UseConsole()
   * @model default="false"
   * @generated
   */
  boolean isUseConsole();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#isUseConsole <em>Use Console</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Console</em>' attribute.
   * @see #isUseConsole()
   * @generated
   */
  void setUseConsole(boolean value);

  /**
   * Returns the value of the '<em><b>Update Inputs On Spec Changed</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Inputs On Spec Changed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Inputs On Spec Changed</em>' attribute.
   * @see #setUpdateInputsOnSpecChanged(boolean)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_UpdateInputsOnSpecChanged()
   * @model default="true"
   * @generated
   */
  boolean isUpdateInputsOnSpecChanged();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#isUpdateInputsOnSpecChanged <em>Update Inputs On Spec Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Inputs On Spec Changed</em>' attribute.
   * @see #isUpdateInputsOnSpecChanged()
   * @generated
   */
  void setUpdateInputsOnSpecChanged(boolean value);

  /**
   * Returns the value of the '<em><b>Number Inputs On Spec Changed</b></em>' attribute.
   * The default value is <code>"5"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Inputs On Spec Changed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Inputs On Spec Changed</em>' attribute.
   * @see #setNumberInputsOnSpecChanged(int)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_NumberInputsOnSpecChanged()
   * @model default="5"
   * @generated
   */
  int getNumberInputsOnSpecChanged();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getNumberInputsOnSpecChanged <em>Number Inputs On Spec Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Inputs On Spec Changed</em>' attribute.
   * @see #getNumberInputsOnSpecChanged()
   * @generated
   */
  void setNumberInputsOnSpecChanged(int value);

  /**
   * Returns the value of the '<em><b>Maven Group Id</b></em>' attribute.
   * The default value is <code>"com.example"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maven Group Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maven Group Id</em>' attribute.
   * @see #setMavenGroupId(String)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_MavenGroupId()
   * @model default="com.example"
   * @generated
   */
  String getMavenGroupId();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenGroupId <em>Maven Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maven Group Id</em>' attribute.
   * @see #getMavenGroupId()
   * @generated
   */
  void setMavenGroupId(String value);

  /**
   * Returns the value of the '<em><b>Maven Artifact Id</b></em>' attribute.
   * The default value is <code>"grinder"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maven Artifact Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maven Artifact Id</em>' attribute.
   * @see #setMavenArtifactId(String)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_MavenArtifactId()
   * @model default="grinder"
   * @generated
   */
  String getMavenArtifactId();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenArtifactId <em>Maven Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maven Artifact Id</em>' attribute.
   * @see #getMavenArtifactId()
   * @generated
   */
  void setMavenArtifactId(String value);

  /**
   * Returns the value of the '<em><b>Maven Version</b></em>' attribute.
   * The default value is <code>"1.0-SNAPSHOT"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maven Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maven Version</em>' attribute.
   * @see #setMavenVersion(String)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_MavenVersion()
   * @model default="1.0-SNAPSHOT"
   * @generated
   */
  String getMavenVersion();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenVersion <em>Maven Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maven Version</em>' attribute.
   * @see #getMavenVersion()
   * @generated
   */
  void setMavenVersion(String value);

  /**
   * Returns the value of the '<em><b>Maven Human Name</b></em>' attribute.
   * The default value is <code>"Performance Tests"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maven Human Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maven Human Name</em>' attribute.
   * @see #setMavenHumanName(String)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_MavenHumanName()
   * @model default="Performance Tests"
   * @generated
   */
  String getMavenHumanName();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenHumanName <em>Maven Human Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maven Human Name</em>' attribute.
   * @see #getMavenHumanName()
   * @generated
   */
  void setMavenHumanName(String value);

  /**
   * Returns the value of the '<em><b>Maven Human Description</b></em>' attribute.
   * The default value is <code>"Grinder-based performance tests for our web services"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maven Human Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maven Human Description</em>' attribute.
   * @see #setMavenHumanDescription(String)
   * @see es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage#getPerformanceRequirementLinks_MavenHumanDescription()
   * @model default="Grinder-based performance tests for our web services"
   * @generated
   */
  String getMavenHumanDescription();

  /**
   * Sets the value of the '{@link es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks#getMavenHumanDescription <em>Maven Human Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maven Human Description</em>' attribute.
   * @see #getMavenHumanDescription()
   * @generated
   */
  void setMavenHumanDescription(String value);

} // PerformanceRequirementLinks
