/**
 */
package serviceComposition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import serviceComposition.PerformanceAnnotation;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link serviceComposition.impl.PerformanceAnnotationImpl#getConcurrentUsers <em>Concurrent Users</em>}</li>
 *   <li>{@link serviceComposition.impl.PerformanceAnnotationImpl#getSecsTimeLimit <em>Secs Time Limit</em>}</li>
 * </ul>
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
  protected static final double CONCURRENT_USERS_EDEFAULT = 1.0;

  /**
	 * The cached value of the '{@link #getConcurrentUsers() <em>Concurrent Users</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConcurrentUsers()
	 * @generated
	 * @ordered
	 */
  protected double concurrentUsers = CONCURRENT_USERS_EDEFAULT;

  /**
	 * The default value of the '{@link #getSecsTimeLimit() <em>Secs Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecsTimeLimit()
	 * @generated
	 * @ordered
	 */
  protected static final double SECS_TIME_LIMIT_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getSecsTimeLimit() <em>Secs Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecsTimeLimit()
	 * @generated
	 * @ordered
	 */
  protected double secsTimeLimit = SECS_TIME_LIMIT_EDEFAULT;

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
		return ServiceCompositionPackage.Literals.PERFORMANCE_ANNOTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public double getConcurrentUsers()
  {
		return concurrentUsers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setConcurrentUsers(double newConcurrentUsers)
  {
		double oldConcurrentUsers = concurrentUsers;
		concurrentUsers = newConcurrentUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS, oldConcurrentUsers, concurrentUsers));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public double getSecsTimeLimit()
  {
		return secsTimeLimit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setSecsTimeLimit(double newSecsTimeLimit)
  {
		double oldSecsTimeLimit = secsTimeLimit;
		secsTimeLimit = newSecsTimeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT, oldSecsTimeLimit, secsTimeLimit));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
				return getConcurrentUsers();
			case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
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
		switch (featureID) {
			case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
				setConcurrentUsers((Double)newValue);
				return;
			case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
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
		switch (featureID) {
			case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
				setConcurrentUsers(CONCURRENT_USERS_EDEFAULT);
				return;
			case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
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
		switch (featureID) {
			case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
				return concurrentUsers != CONCURRENT_USERS_EDEFAULT;
			case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
				return secsTimeLimit != SECS_TIME_LIMIT_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (concurrentUsers: ");
		result.append(concurrentUsers);
		result.append(", secsTimeLimit: ");
		result.append(secsTimeLimit);
		result.append(')');
		return result.toString();
	}

} //PerformanceAnnotationImpl
