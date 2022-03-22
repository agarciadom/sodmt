/**
 */
package es.uca.modeling.eol.marte.weaving.wsdl.links.impl;

import es.uca.modeling.eol.marte.weaving.wsdl.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.wsdl.links.PerformanceRequirementLinks;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirement Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getEclipseProjectName <em>Eclipse Project Name</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getProcessIncrement <em>Process Increment</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getProcessIncrementInterval <em>Process Increment Interval</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getThreadsPerProcess <em>Threads Per Process</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getRuns <em>Runs</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getConsoleHost <em>Console Host</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#isUseConsole <em>Use Console</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#isUpdateInputsOnSpecChanged <em>Update Inputs On Spec Changed</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getNumberInputsOnSpecChanged <em>Number Inputs On Spec Changed</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getMavenGroupId <em>Maven Group Id</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getMavenArtifactId <em>Maven Artifact Id</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getMavenVersion <em>Maven Version</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getMavenHumanName <em>Maven Human Name</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.wsdl.links.impl.PerformanceRequirementLinksImpl#getMavenHumanDescription <em>Maven Human Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceRequirementLinksImpl extends EObjectImpl implements PerformanceRequirementLinks
{
  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<PerformanceRequirementLink> links;

  /**
   * The default value of the '{@link #getEclipseProjectName() <em>Eclipse Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEclipseProjectName()
   * @generated
   * @ordered
   */
  protected static final String ECLIPSE_PROJECT_NAME_EDEFAULT = "performance.tests";

  /**
   * The cached value of the '{@link #getEclipseProjectName() <em>Eclipse Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEclipseProjectName()
   * @generated
   * @ordered
   */
  protected String eclipseProjectName = ECLIPSE_PROJECT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getProcesses() <em>Processes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected static final int PROCESSES_EDEFAULT = 1;
  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected int processes = PROCESSES_EDEFAULT;
  /**
   * The default value of the '{@link #getProcessIncrement() <em>Process Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessIncrement()
   * @generated
   * @ordered
   */
  protected static final int PROCESS_INCREMENT_EDEFAULT = 1;
  /**
   * The cached value of the '{@link #getProcessIncrement() <em>Process Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessIncrement()
   * @generated
   * @ordered
   */
  protected int processIncrement = PROCESS_INCREMENT_EDEFAULT;
  /**
   * The default value of the '{@link #getProcessIncrementInterval() <em>Process Increment Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessIncrementInterval()
   * @generated
   * @ordered
   */
  protected static final int PROCESS_INCREMENT_INTERVAL_EDEFAULT = 1000;
  /**
   * The cached value of the '{@link #getProcessIncrementInterval() <em>Process Increment Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessIncrementInterval()
   * @generated
   * @ordered
   */
  protected int processIncrementInterval = PROCESS_INCREMENT_INTERVAL_EDEFAULT;
  /**
   * The default value of the '{@link #getThreadsPerProcess() <em>Threads Per Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreadsPerProcess()
   * @generated
   * @ordered
   */
  protected static final int THREADS_PER_PROCESS_EDEFAULT = 5;
  /**
   * The cached value of the '{@link #getThreadsPerProcess() <em>Threads Per Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreadsPerProcess()
   * @generated
   * @ordered
   */
  protected int threadsPerProcess = THREADS_PER_PROCESS_EDEFAULT;
  /**
   * The default value of the '{@link #getRuns() <em>Runs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuns()
   * @generated
   * @ordered
   */
  protected static final int RUNS_EDEFAULT = 2;
  /**
   * The cached value of the '{@link #getRuns() <em>Runs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuns()
   * @generated
   * @ordered
   */
  protected int runs = RUNS_EDEFAULT;
  /**
   * The default value of the '{@link #getConsoleHost() <em>Console Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsoleHost()
   * @generated
   * @ordered
   */
  protected static final String CONSOLE_HOST_EDEFAULT = "127.0.0.1";
  /**
   * The cached value of the '{@link #getConsoleHost() <em>Console Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsoleHost()
   * @generated
   * @ordered
   */
  protected String consoleHost = CONSOLE_HOST_EDEFAULT;
  /**
   * The default value of the '{@link #isUseConsole() <em>Use Console</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseConsole()
   * @generated
   * @ordered
   */
  protected static final boolean USE_CONSOLE_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isUseConsole() <em>Use Console</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseConsole()
   * @generated
   * @ordered
   */
  protected boolean useConsole = USE_CONSOLE_EDEFAULT;
  /**
   * The default value of the '{@link #isUpdateInputsOnSpecChanged() <em>Update Inputs On Spec Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpdateInputsOnSpecChanged()
   * @generated
   * @ordered
   */
  protected static final boolean UPDATE_INPUTS_ON_SPEC_CHANGED_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isUpdateInputsOnSpecChanged() <em>Update Inputs On Spec Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpdateInputsOnSpecChanged()
   * @generated
   * @ordered
   */
  protected boolean updateInputsOnSpecChanged = UPDATE_INPUTS_ON_SPEC_CHANGED_EDEFAULT;
  /**
   * The default value of the '{@link #getNumberInputsOnSpecChanged() <em>Number Inputs On Spec Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberInputsOnSpecChanged()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_INPUTS_ON_SPEC_CHANGED_EDEFAULT = 5;
  /**
   * The cached value of the '{@link #getNumberInputsOnSpecChanged() <em>Number Inputs On Spec Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberInputsOnSpecChanged()
   * @generated
   * @ordered
   */
  protected int numberInputsOnSpecChanged = NUMBER_INPUTS_ON_SPEC_CHANGED_EDEFAULT;
  /**
   * The default value of the '{@link #getMavenGroupId() <em>Maven Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenGroupId()
   * @generated
   * @ordered
   */
  protected static final String MAVEN_GROUP_ID_EDEFAULT = "com.example";
  /**
   * The cached value of the '{@link #getMavenGroupId() <em>Maven Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenGroupId()
   * @generated
   * @ordered
   */
  protected String mavenGroupId = MAVEN_GROUP_ID_EDEFAULT;
  /**
   * The default value of the '{@link #getMavenArtifactId() <em>Maven Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenArtifactId()
   * @generated
   * @ordered
   */
  protected static final String MAVEN_ARTIFACT_ID_EDEFAULT = "grinder";
  /**
   * The cached value of the '{@link #getMavenArtifactId() <em>Maven Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenArtifactId()
   * @generated
   * @ordered
   */
  protected String mavenArtifactId = MAVEN_ARTIFACT_ID_EDEFAULT;
  /**
   * The default value of the '{@link #getMavenVersion() <em>Maven Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenVersion()
   * @generated
   * @ordered
   */
  protected static final String MAVEN_VERSION_EDEFAULT = "1.0-SNAPSHOT";
  /**
   * The cached value of the '{@link #getMavenVersion() <em>Maven Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenVersion()
   * @generated
   * @ordered
   */
  protected String mavenVersion = MAVEN_VERSION_EDEFAULT;
  /**
   * The default value of the '{@link #getMavenHumanName() <em>Maven Human Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenHumanName()
   * @generated
   * @ordered
   */
  protected static final String MAVEN_HUMAN_NAME_EDEFAULT = "Performance Tests";
  /**
   * The cached value of the '{@link #getMavenHumanName() <em>Maven Human Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenHumanName()
   * @generated
   * @ordered
   */
  protected String mavenHumanName = MAVEN_HUMAN_NAME_EDEFAULT;
  /**
   * The default value of the '{@link #getMavenHumanDescription() <em>Maven Human Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenHumanDescription()
   * @generated
   * @ordered
   */
  protected static final String MAVEN_HUMAN_DESCRIPTION_EDEFAULT = "Grinder-based performance tests for our web services";
  /**
   * The cached value of the '{@link #getMavenHumanDescription() <em>Maven Human Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMavenHumanDescription()
   * @generated
   * @ordered
   */
  protected String mavenHumanDescription = MAVEN_HUMAN_DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerformanceRequirementLinksImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINKS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PerformanceRequirementLink> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<PerformanceRequirementLink>(PerformanceRequirementLink.class, this, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEclipseProjectName()
  {
    return eclipseProjectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEclipseProjectName(String newEclipseProjectName)
  {
    String oldEclipseProjectName = eclipseProjectName;
    eclipseProjectName = newEclipseProjectName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__ECLIPSE_PROJECT_NAME, oldEclipseProjectName, eclipseProjectName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getProcesses()
  {
    return processes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcesses(int newProcesses)
  {
    int oldProcesses = processes;
    processes = newProcesses;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESSES, oldProcesses, processes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getProcessIncrement()
  {
    return processIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessIncrement(int newProcessIncrement)
  {
    int oldProcessIncrement = processIncrement;
    processIncrement = newProcessIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT, oldProcessIncrement, processIncrement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getProcessIncrementInterval()
  {
    return processIncrementInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessIncrementInterval(int newProcessIncrementInterval)
  {
    int oldProcessIncrementInterval = processIncrementInterval;
    processIncrementInterval = newProcessIncrementInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL, oldProcessIncrementInterval, processIncrementInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getThreadsPerProcess()
  {
    return threadsPerProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThreadsPerProcess(int newThreadsPerProcess)
  {
    int oldThreadsPerProcess = threadsPerProcess;
    threadsPerProcess = newThreadsPerProcess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS, oldThreadsPerProcess, threadsPerProcess));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRuns()
  {
    return runs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuns(int newRuns)
  {
    int oldRuns = runs;
    runs = newRuns;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__RUNS, oldRuns, runs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConsoleHost()
  {
    return consoleHost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConsoleHost(String newConsoleHost)
  {
    String oldConsoleHost = consoleHost;
    consoleHost = newConsoleHost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST, oldConsoleHost, consoleHost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUseConsole()
  {
    return useConsole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseConsole(boolean newUseConsole)
  {
    boolean oldUseConsole = useConsole;
    useConsole = newUseConsole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE, oldUseConsole, useConsole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUpdateInputsOnSpecChanged()
  {
    return updateInputsOnSpecChanged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateInputsOnSpecChanged(boolean newUpdateInputsOnSpecChanged)
  {
    boolean oldUpdateInputsOnSpecChanged = updateInputsOnSpecChanged;
    updateInputsOnSpecChanged = newUpdateInputsOnSpecChanged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED, oldUpdateInputsOnSpecChanged, updateInputsOnSpecChanged));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberInputsOnSpecChanged()
  {
    return numberInputsOnSpecChanged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberInputsOnSpecChanged(int newNumberInputsOnSpecChanged)
  {
    int oldNumberInputsOnSpecChanged = numberInputsOnSpecChanged;
    numberInputsOnSpecChanged = newNumberInputsOnSpecChanged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED, oldNumberInputsOnSpecChanged, numberInputsOnSpecChanged));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMavenGroupId()
  {
    return mavenGroupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMavenGroupId(String newMavenGroupId)
  {
    String oldMavenGroupId = mavenGroupId;
    mavenGroupId = newMavenGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID, oldMavenGroupId, mavenGroupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMavenArtifactId()
  {
    return mavenArtifactId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMavenArtifactId(String newMavenArtifactId)
  {
    String oldMavenArtifactId = mavenArtifactId;
    mavenArtifactId = newMavenArtifactId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID, oldMavenArtifactId, mavenArtifactId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMavenVersion()
  {
    return mavenVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMavenVersion(String newMavenVersion)
  {
    String oldMavenVersion = mavenVersion;
    mavenVersion = newMavenVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION, oldMavenVersion, mavenVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMavenHumanName()
  {
    return mavenHumanName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMavenHumanName(String newMavenHumanName)
  {
    String oldMavenHumanName = mavenHumanName;
    mavenHumanName = newMavenHumanName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME, oldMavenHumanName, mavenHumanName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMavenHumanDescription()
  {
    return mavenHumanDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMavenHumanDescription(String newMavenHumanDescription)
  {
    String oldMavenHumanDescription = mavenHumanDescription;
    mavenHumanDescription = newMavenHumanDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION, oldMavenHumanDescription, mavenHumanDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        return getLinks();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__ECLIPSE_PROJECT_NAME:
        return getEclipseProjectName();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESSES:
        return getProcesses();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT:
        return getProcessIncrement();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL:
        return getProcessIncrementInterval();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS:
        return getThreadsPerProcess();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__RUNS:
        return getRuns();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST:
        return getConsoleHost();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE:
        return isUseConsole();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED:
        return isUpdateInputsOnSpecChanged();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED:
        return getNumberInputsOnSpecChanged();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID:
        return getMavenGroupId();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID:
        return getMavenArtifactId();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION:
        return getMavenVersion();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME:
        return getMavenHumanName();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION:
        return getMavenHumanDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends PerformanceRequirementLink>)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__ECLIPSE_PROJECT_NAME:
        setEclipseProjectName((String)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESSES:
        setProcesses((Integer)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT:
        setProcessIncrement((Integer)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL:
        setProcessIncrementInterval((Integer)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS:
        setThreadsPerProcess((Integer)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__RUNS:
        setRuns((Integer)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST:
        setConsoleHost((String)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE:
        setUseConsole((Boolean)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED:
        setUpdateInputsOnSpecChanged((Boolean)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED:
        setNumberInputsOnSpecChanged((Integer)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID:
        setMavenGroupId((String)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID:
        setMavenArtifactId((String)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION:
        setMavenVersion((String)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME:
        setMavenHumanName((String)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION:
        setMavenHumanDescription((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        getLinks().clear();
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__ECLIPSE_PROJECT_NAME:
        setEclipseProjectName(ECLIPSE_PROJECT_NAME_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESSES:
        setProcesses(PROCESSES_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT:
        setProcessIncrement(PROCESS_INCREMENT_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL:
        setProcessIncrementInterval(PROCESS_INCREMENT_INTERVAL_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS:
        setThreadsPerProcess(THREADS_PER_PROCESS_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__RUNS:
        setRuns(RUNS_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST:
        setConsoleHost(CONSOLE_HOST_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE:
        setUseConsole(USE_CONSOLE_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED:
        setUpdateInputsOnSpecChanged(UPDATE_INPUTS_ON_SPEC_CHANGED_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED:
        setNumberInputsOnSpecChanged(NUMBER_INPUTS_ON_SPEC_CHANGED_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID:
        setMavenGroupId(MAVEN_GROUP_ID_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID:
        setMavenArtifactId(MAVEN_ARTIFACT_ID_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION:
        setMavenVersion(MAVEN_VERSION_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME:
        setMavenHumanName(MAVEN_HUMAN_NAME_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION:
        setMavenHumanDescription(MAVEN_HUMAN_DESCRIPTION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        return links != null && !links.isEmpty();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__ECLIPSE_PROJECT_NAME:
        return ECLIPSE_PROJECT_NAME_EDEFAULT == null ? eclipseProjectName != null : !ECLIPSE_PROJECT_NAME_EDEFAULT.equals(eclipseProjectName);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESSES:
        return processes != PROCESSES_EDEFAULT;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT:
        return processIncrement != PROCESS_INCREMENT_EDEFAULT;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__PROCESS_INCREMENT_INTERVAL:
        return processIncrementInterval != PROCESS_INCREMENT_INTERVAL_EDEFAULT;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS_PER_PROCESS:
        return threadsPerProcess != THREADS_PER_PROCESS_EDEFAULT;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__RUNS:
        return runs != RUNS_EDEFAULT;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__CONSOLE_HOST:
        return CONSOLE_HOST_EDEFAULT == null ? consoleHost != null : !CONSOLE_HOST_EDEFAULT.equals(consoleHost);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__USE_CONSOLE:
        return useConsole != USE_CONSOLE_EDEFAULT;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__UPDATE_INPUTS_ON_SPEC_CHANGED:
        return updateInputsOnSpecChanged != UPDATE_INPUTS_ON_SPEC_CHANGED_EDEFAULT;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__NUMBER_INPUTS_ON_SPEC_CHANGED:
        return numberInputsOnSpecChanged != NUMBER_INPUTS_ON_SPEC_CHANGED_EDEFAULT;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_GROUP_ID:
        return MAVEN_GROUP_ID_EDEFAULT == null ? mavenGroupId != null : !MAVEN_GROUP_ID_EDEFAULT.equals(mavenGroupId);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_ARTIFACT_ID:
        return MAVEN_ARTIFACT_ID_EDEFAULT == null ? mavenArtifactId != null : !MAVEN_ARTIFACT_ID_EDEFAULT.equals(mavenArtifactId);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_VERSION:
        return MAVEN_VERSION_EDEFAULT == null ? mavenVersion != null : !MAVEN_VERSION_EDEFAULT.equals(mavenVersion);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_NAME:
        return MAVEN_HUMAN_NAME_EDEFAULT == null ? mavenHumanName != null : !MAVEN_HUMAN_NAME_EDEFAULT.equals(mavenHumanName);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__MAVEN_HUMAN_DESCRIPTION:
        return MAVEN_HUMAN_DESCRIPTION_EDEFAULT == null ? mavenHumanDescription != null : !MAVEN_HUMAN_DESCRIPTION_EDEFAULT.equals(mavenHumanDescription);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (eclipseProjectName: ");
    result.append(eclipseProjectName);
    result.append(", processes: ");
    result.append(processes);
    result.append(", processIncrement: ");
    result.append(processIncrement);
    result.append(", processIncrementInterval: ");
    result.append(processIncrementInterval);
    result.append(", threadsPerProcess: ");
    result.append(threadsPerProcess);
    result.append(", runs: ");
    result.append(runs);
    result.append(", consoleHost: ");
    result.append(consoleHost);
    result.append(", useConsole: ");
    result.append(useConsole);
    result.append(", updateInputsOnSpecChanged: ");
    result.append(updateInputsOnSpecChanged);
    result.append(", numberInputsOnSpecChanged: ");
    result.append(numberInputsOnSpecChanged);
    result.append(", mavenGroupId: ");
    result.append(mavenGroupId);
    result.append(", mavenArtifactId: ");
    result.append(mavenArtifactId);
    result.append(", mavenVersion: ");
    result.append(mavenVersion);
    result.append(", mavenHumanName: ");
    result.append(mavenHumanName);
    result.append(", mavenHumanDescription: ");
    result.append(mavenHumanDescription);
    result.append(')');
    return result.toString();
  }

} //PerformanceRequirementLinksImpl
