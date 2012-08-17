/**
 */
package serviceComposition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import serviceComposition.LocalPerformanceAnnotation;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceComposition.impl.LocalPerformanceAnnotationImpl#getMinimumTime <em>Minimum Time</em>}</li>
 *   <li>{@link serviceComposition.impl.LocalPerformanceAnnotationImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocalPerformanceAnnotationImpl extends PerformanceAnnotationImpl implements LocalPerformanceAnnotation
{
  /**
   * The default value of the '{@link #getMinimumTime() <em>Minimum Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumTime()
   * @generated
   * @ordered
   */
  protected static final Double MINIMUM_TIME_EDEFAULT = new Double(0.0);

  /**
   * The cached value of the '{@link #getMinimumTime() <em>Minimum Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumTime()
   * @generated
   * @ordered
   */
  protected Double minimumTime = MINIMUM_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final Double WEIGHT_EDEFAULT = new Double(1.0);

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected Double weight = WEIGHT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalPerformanceAnnotationImpl()
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
    return ServiceCompositionPackage.Literals.LOCAL_PERFORMANCE_ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getMinimumTime()
  {
    return minimumTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinimumTime(Double newMinimumTime)
  {
    Double oldMinimumTime = minimumTime;
    minimumTime = newMinimumTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME, oldMinimumTime, minimumTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(Double newWeight)
  {
    Double oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT, oldWeight, weight));
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
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        return getMinimumTime();
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT:
        return getWeight();
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
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        setMinimumTime((Double)newValue);
        return;
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT:
        setWeight((Double)newValue);
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
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        setMinimumTime(MINIMUM_TIME_EDEFAULT);
        return;
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
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
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        return MINIMUM_TIME_EDEFAULT == null ? minimumTime != null : !MINIMUM_TIME_EDEFAULT.equals(minimumTime);
      case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT:
        return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
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
    result.append(" (minimumTime: ");
    result.append(minimumTime);
    result.append(", weight: ");
    result.append(weight);
    result.append(')');
    return result.toString();
  }

} //LocalPerformanceAnnotationImpl
