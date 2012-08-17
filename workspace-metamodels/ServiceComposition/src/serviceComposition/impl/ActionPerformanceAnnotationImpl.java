/**
 */
package serviceComposition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import serviceComposition.ActionPerformanceAnnotation;
import serviceComposition.ActivityAction;
import serviceComposition.LocalPerformanceAnnotation;
import serviceComposition.PerformanceAnnotation;
import serviceComposition.ServiceCompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Performance Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceComposition.impl.ActionPerformanceAnnotationImpl#getConcurrentUsers <em>Concurrent Users</em>}</li>
 *   <li>{@link serviceComposition.impl.ActionPerformanceAnnotationImpl#getSecsTimeLimit <em>Secs Time Limit</em>}</li>
 *   <li>{@link serviceComposition.impl.ActionPerformanceAnnotationImpl#getMinimumTime <em>Minimum Time</em>}</li>
 *   <li>{@link serviceComposition.impl.ActionPerformanceAnnotationImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link serviceComposition.impl.ActionPerformanceAnnotationImpl#getAction <em>Action</em>}</li>
 *   <li>{@link serviceComposition.impl.ActionPerformanceAnnotationImpl#isManuallyAdded <em>Manually Added</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionPerformanceAnnotationImpl extends ActivityElementImpl implements ActionPerformanceAnnotation
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
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected ActivityAction action;

  /**
   * The default value of the '{@link #isManuallyAdded() <em>Manually Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isManuallyAdded()
   * @generated
   * @ordered
   */
  protected static final boolean MANUALLY_ADDED_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isManuallyAdded() <em>Manually Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isManuallyAdded()
   * @generated
   * @ordered
   */
  protected boolean manuallyAdded = MANUALLY_ADDED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionPerformanceAnnotationImpl()
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
    return ServiceCompositionPackage.Literals.ACTION_PERFORMANCE_ANNOTATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS, oldConcurrentUsers, concurrentUsers));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT, oldSecsTimeLimit, secsTimeLimit));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME, oldMinimumTime, minimumTime));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityAction getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (ActivityAction)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityAction basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(ActivityAction newAction, NotificationChain msgs)
  {
    ActivityAction oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(ActivityAction newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, ServiceCompositionPackage.ACTIVITY_ACTION__ANNOTATION, ActivityAction.class, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, ServiceCompositionPackage.ACTIVITY_ACTION__ANNOTATION, ActivityAction.class, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isManuallyAdded()
  {
    return manuallyAdded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManuallyAdded(boolean newManuallyAdded)
  {
    boolean oldManuallyAdded = manuallyAdded;
    manuallyAdded = newManuallyAdded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED, oldManuallyAdded, manuallyAdded));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION:
        if (action != null)
          msgs = ((InternalEObject)action).eInverseRemove(this, ServiceCompositionPackage.ACTIVITY_ACTION__ANNOTATION, ActivityAction.class, msgs);
        return basicSetAction((ActivityAction)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION:
        return basicSetAction(null, msgs);
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
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
        return getConcurrentUsers();
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
        return getSecsTimeLimit();
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        return getMinimumTime();
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__WEIGHT:
        return getWeight();
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        return isManuallyAdded();
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
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
        setConcurrentUsers((Double)newValue);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
        setSecsTimeLimit((Double)newValue);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        setMinimumTime((Double)newValue);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__WEIGHT:
        setWeight((Double)newValue);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION:
        setAction((ActivityAction)newValue);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        setManuallyAdded((Boolean)newValue);
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
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
        setConcurrentUsers(CONCURRENT_USERS_EDEFAULT);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
        setSecsTimeLimit(SECS_TIME_LIMIT_EDEFAULT);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        setMinimumTime(MINIMUM_TIME_EDEFAULT);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION:
        setAction((ActivityAction)null);
        return;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        setManuallyAdded(MANUALLY_ADDED_EDEFAULT);
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
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS:
        return CONCURRENT_USERS_EDEFAULT == null ? concurrentUsers != null : !CONCURRENT_USERS_EDEFAULT.equals(concurrentUsers);
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT:
        return SECS_TIME_LIMIT_EDEFAULT == null ? secsTimeLimit != null : !SECS_TIME_LIMIT_EDEFAULT.equals(secsTimeLimit);
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME:
        return MINIMUM_TIME_EDEFAULT == null ? minimumTime != null : !MINIMUM_TIME_EDEFAULT.equals(minimumTime);
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__WEIGHT:
        return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__ACTION:
        return action != null;
      case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MANUALLY_ADDED:
        return manuallyAdded != MANUALLY_ADDED_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == PerformanceAnnotation.class)
    {
      switch (derivedFeatureID)
      {
        case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS: return ServiceCompositionPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS;
        case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT: return ServiceCompositionPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT;
        default: return -1;
      }
    }
    if (baseClass == LocalPerformanceAnnotation.class)
    {
      switch (derivedFeatureID)
      {
        case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME: return ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME;
        case ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__WEIGHT: return ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == PerformanceAnnotation.class)
    {
      switch (baseFeatureID)
      {
        case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__CONCURRENT_USERS: return ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__CONCURRENT_USERS;
        case ServiceCompositionPackage.PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT: return ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__SECS_TIME_LIMIT;
        default: return -1;
      }
    }
    if (baseClass == LocalPerformanceAnnotation.class)
    {
      switch (baseFeatureID)
      {
        case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__MINIMUM_TIME: return ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__MINIMUM_TIME;
        case ServiceCompositionPackage.LOCAL_PERFORMANCE_ANNOTATION__WEIGHT: return ServiceCompositionPackage.ACTION_PERFORMANCE_ANNOTATION__WEIGHT;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", minimumTime: ");
    result.append(minimumTime);
    result.append(", weight: ");
    result.append(weight);
    result.append(", manuallyAdded: ");
    result.append(manuallyAdded);
    result.append(')');
    return result.toString();
  }

} //ActionPerformanceAnnotationImpl
