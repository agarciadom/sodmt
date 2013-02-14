/**
 */
package serviceProcess.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import serviceProcess.PerformanceAnnotation;
import serviceProcess.ServiceProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceProcess.impl.PerformanceAnnotationImpl#getConcurrentUsers <em>Concurrent Users</em>}</li>
 *   <li>{@link serviceProcess.impl.PerformanceAnnotationImpl#getSecsTimeLimit <em>Secs Time Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceAnnotationImpl extends EObjectImpl implements PerformanceAnnotation
{
  /**
   * The default value of the '{@link #getConcurrentUsers() <em>Concurrent Users</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcurrentUsers()
   * @generated
   * @ordered
   */
  protected static final Double CONCURRENT_USERS_EDEFAULT = new Double(1.0);

  /**
   * The cached value of the '{@link #getConcurrentUsers() <em>Concurrent Users</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcurrentUsers()
   * @generated
   * @ordered
   */
  protected Double concurrentUsers = CONCURRENT_USERS_EDEFAULT;

  /**
   * The default value of the '{@link #getSecsTimeLimit() <em>Secs Time Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecsTimeLimit()
   * @generated
   * @ordered
   */
  protected static final Double SECS_TIME_LIMIT_EDEFAULT = new Double(0.0);

  /**
   * The cached value of the '{@link #getSecsTimeLimit() <em>Secs Time Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecsTimeLimit()
   * @generated
   * @ordered
   */
  protected Double secsTimeLimit = SECS_TIME_LIMIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerformanceAnnotationImpl()
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
    return ServiceProcessPackage.Literals.PERFORMANCE_ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getConcurrentUsers()
  {
    return concurrentUsers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcurrentUsers(Double newConcurrentUsers)
  {
    Double oldConcurrentUsers = concurrentUsers;
    concurrentUsers = newConcurrentUsers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS, oldConcurrentUsers, concurrentUsers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getSecsTimeLimit()
  {
    return secsTimeLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecsTimeLimit(Double newSecsTimeLimit)
  {
    Double oldSecsTimeLimit = secsTimeLimit;
    secsTimeLimit = newSecsTimeLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceProcessPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT, oldSecsTimeLimit, secsTimeLimit));
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
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
        return getConcurrentUsers();
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
        return getSecsTimeLimit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
        setConcurrentUsers((Double)newValue);
        return;
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
        setSecsTimeLimit((Double)newValue);
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
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
        setConcurrentUsers(CONCURRENT_USERS_EDEFAULT);
        return;
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
        setSecsTimeLimit(SECS_TIME_LIMIT_EDEFAULT);
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
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
        return CONCURRENT_USERS_EDEFAULT == null ? concurrentUsers != null : !CONCURRENT_USERS_EDEFAULT.equals(concurrentUsers);
      case ServiceProcessPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
        return SECS_TIME_LIMIT_EDEFAULT == null ? secsTimeLimit != null : !SECS_TIME_LIMIT_EDEFAULT.equals(secsTimeLimit);
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
    result.append(" (concurrentUsers: ");
    result.append(concurrentUsers);
    result.append(", secsTimeLimit: ");
    result.append(secsTimeLimit);
    result.append(')');
    return result.toString();
  }

} //PerformanceAnnotationImpl
