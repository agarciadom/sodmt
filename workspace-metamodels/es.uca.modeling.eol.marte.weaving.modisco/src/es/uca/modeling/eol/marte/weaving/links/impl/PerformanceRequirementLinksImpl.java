/**
 */
package es.uca.modeling.eol.marte.weaving.links.impl;

import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLinks;

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
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl#getSamplesPerTest <em>Samples Per Test</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl#getBaseDir <em>Base Dir</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinksImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceRequirementLinksImpl extends EObjectImpl implements PerformanceRequirementLinks
{
  /**
   * The default value of the '{@link #getSamplesPerTest() <em>Samples Per Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSamplesPerTest()
   * @generated
   * @ordered
   */
  protected static final Integer SAMPLES_PER_TEST_EDEFAULT = new Integer(1000);
  /**
   * The cached value of the '{@link #getSamplesPerTest() <em>Samples Per Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSamplesPerTest()
   * @generated
   * @ordered
   */
  protected Integer samplesPerTest = SAMPLES_PER_TEST_EDEFAULT;
  /**
   * The default value of the '{@link #getThreads() <em>Threads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreads()
   * @generated
   * @ordered
   */
  protected static final Integer THREADS_EDEFAULT = new Integer(5);
  /**
   * The cached value of the '{@link #getThreads() <em>Threads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreads()
   * @generated
   * @ordered
   */
  protected Integer threads = THREADS_EDEFAULT;
  /**
   * The default value of the '{@link #getBaseDir() <em>Base Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseDir()
   * @generated
   * @ordered
   */
  protected static final String BASE_DIR_EDEFAULT = "src";
  /**
   * The cached value of the '{@link #getBaseDir() <em>Base Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseDir()
   * @generated
   * @ordered
   */
  protected String baseDir = BASE_DIR_EDEFAULT;
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
  public Integer getSamplesPerTest()
  {
    return samplesPerTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSamplesPerTest(Integer newSamplesPerTest)
  {
    Integer oldSamplesPerTest = samplesPerTest;
    samplesPerTest = newSamplesPerTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__SAMPLES_PER_TEST, oldSamplesPerTest, samplesPerTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getThreads()
  {
    return threads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThreads(Integer newThreads)
  {
    Integer oldThreads = threads;
    threads = newThreads;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS, oldThreads, threads));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseDir()
  {
    return baseDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseDir(String newBaseDir)
  {
    String oldBaseDir = baseDir;
    baseDir = newBaseDir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR, oldBaseDir, baseDir));
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__SAMPLES_PER_TEST:
        return getSamplesPerTest();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS:
        return getThreads();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR:
        return getBaseDir();
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        return getLinks();
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__SAMPLES_PER_TEST:
        setSamplesPerTest((Integer)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS:
        setThreads((Integer)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR:
        setBaseDir((String)newValue);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends PerformanceRequirementLink>)newValue);
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__SAMPLES_PER_TEST:
        setSamplesPerTest(SAMPLES_PER_TEST_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS:
        setThreads(THREADS_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR:
        setBaseDir(BASE_DIR_EDEFAULT);
        return;
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        getLinks().clear();
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
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__SAMPLES_PER_TEST:
        return SAMPLES_PER_TEST_EDEFAULT == null ? samplesPerTest != null : !SAMPLES_PER_TEST_EDEFAULT.equals(samplesPerTest);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__THREADS:
        return THREADS_EDEFAULT == null ? threads != null : !THREADS_EDEFAULT.equals(threads);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__BASE_DIR:
        return BASE_DIR_EDEFAULT == null ? baseDir != null : !BASE_DIR_EDEFAULT.equals(baseDir);
      case LinksPackage.PERFORMANCE_REQUIREMENT_LINKS__LINKS:
        return links != null && !links.isEmpty();
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
    result.append(" (samplesPerTest: ");
    result.append(samplesPerTest);
    result.append(", threads: ");
    result.append(threads);
    result.append(", baseDir: ");
    result.append(baseDir);
    result.append(')');
    return result.toString();
  }

} //PerformanceRequirementLinksImpl
