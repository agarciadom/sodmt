/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.impl;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Typedef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getElement <em>Element</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getMax <em>Max</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getMin <em>Min</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.impl.TypeTypedefImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypedefImpl extends EObjectImpl implements TypeTypedef
{
  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionDigits()
   * @generated
   * @ordered
   */
  protected static final BigInteger FRACTION_DIGITS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionDigits()
   * @generated
   * @ordered
   */
  protected BigInteger fractionDigits = FRACTION_DIGITS_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final String MAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected String max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final String MIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected String min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected static final String PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected String pattern = PATTERN_EDEFAULT;

  /**
   * The default value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotalDigits()
   * @generated
   * @ordered
   */
  protected static final BigInteger TOTAL_DIGITS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotalDigits()
   * @generated
   * @ordered
   */
  protected BigInteger totalDigits = TOTAL_DIGITS_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final TypeGA TYPE_EDEFAULT = TypeGA.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeGA type = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean typeESet;

  /**
   * The default value of the '{@link #getValues() <em>Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected static final String VALUES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected String values = VALUES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeTypedefImpl()
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
    return MessageCatalogPackage.Literals.TYPE_TYPEDEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(String newElement)
  {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getFractionDigits()
  {
    return fractionDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFractionDigits(BigInteger newFractionDigits)
  {
    BigInteger oldFractionDigits = fractionDigits;
    fractionDigits = newFractionDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__FRACTION_DIGITS, oldFractionDigits, fractionDigits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(String newMax)
  {
    String oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(String newMin)
  {
    String oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(String newPattern)
  {
    String oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getTotalDigits()
  {
    return totalDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTotalDigits(BigInteger newTotalDigits)
  {
    BigInteger oldTotalDigits = totalDigits;
    totalDigits = newTotalDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__TOTAL_DIGITS, oldTotalDigits, totalDigits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeGA getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeGA newType)
  {
    TypeGA oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetType()
  {
    TypeGA oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MessageCatalogPackage.TYPE_TYPEDEF__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType()
  {
    return typeESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValues()
  {
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValues(String newValues)
  {
    String oldValues = values;
    values = newValues;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MessageCatalogPackage.TYPE_TYPEDEF__VALUES, oldValues, values));
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
      case MessageCatalogPackage.TYPE_TYPEDEF__ELEMENT:
        return getElement();
      case MessageCatalogPackage.TYPE_TYPEDEF__FRACTION_DIGITS:
        return getFractionDigits();
      case MessageCatalogPackage.TYPE_TYPEDEF__MAX:
        return getMax();
      case MessageCatalogPackage.TYPE_TYPEDEF__MIN:
        return getMin();
      case MessageCatalogPackage.TYPE_TYPEDEF__NAME:
        return getName();
      case MessageCatalogPackage.TYPE_TYPEDEF__PATTERN:
        return getPattern();
      case MessageCatalogPackage.TYPE_TYPEDEF__TOTAL_DIGITS:
        return getTotalDigits();
      case MessageCatalogPackage.TYPE_TYPEDEF__TYPE:
        return getType();
      case MessageCatalogPackage.TYPE_TYPEDEF__VALUES:
        return getValues();
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
      case MessageCatalogPackage.TYPE_TYPEDEF__ELEMENT:
        setElement((String)newValue);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__FRACTION_DIGITS:
        setFractionDigits((BigInteger)newValue);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__MAX:
        setMax((String)newValue);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__MIN:
        setMin((String)newValue);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__NAME:
        setName((String)newValue);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__PATTERN:
        setPattern((String)newValue);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__TOTAL_DIGITS:
        setTotalDigits((BigInteger)newValue);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__TYPE:
        setType((TypeGA)newValue);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__VALUES:
        setValues((String)newValue);
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
      case MessageCatalogPackage.TYPE_TYPEDEF__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__FRACTION_DIGITS:
        setFractionDigits(FRACTION_DIGITS_EDEFAULT);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__PATTERN:
        setPattern(PATTERN_EDEFAULT);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__TOTAL_DIGITS:
        setTotalDigits(TOTAL_DIGITS_EDEFAULT);
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__TYPE:
        unsetType();
        return;
      case MessageCatalogPackage.TYPE_TYPEDEF__VALUES:
        setValues(VALUES_EDEFAULT);
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
      case MessageCatalogPackage.TYPE_TYPEDEF__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case MessageCatalogPackage.TYPE_TYPEDEF__FRACTION_DIGITS:
        return FRACTION_DIGITS_EDEFAULT == null ? fractionDigits != null : !FRACTION_DIGITS_EDEFAULT.equals(fractionDigits);
      case MessageCatalogPackage.TYPE_TYPEDEF__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
      case MessageCatalogPackage.TYPE_TYPEDEF__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case MessageCatalogPackage.TYPE_TYPEDEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MessageCatalogPackage.TYPE_TYPEDEF__PATTERN:
        return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
      case MessageCatalogPackage.TYPE_TYPEDEF__TOTAL_DIGITS:
        return TOTAL_DIGITS_EDEFAULT == null ? totalDigits != null : !TOTAL_DIGITS_EDEFAULT.equals(totalDigits);
      case MessageCatalogPackage.TYPE_TYPEDEF__TYPE:
        return isSetType();
      case MessageCatalogPackage.TYPE_TYPEDEF__VALUES:
        return VALUES_EDEFAULT == null ? values != null : !VALUES_EDEFAULT.equals(values);
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
    result.append(" (element: ");
    result.append(element);
    result.append(", fractionDigits: ");
    result.append(fractionDigits);
    result.append(", max: ");
    result.append(max);
    result.append(", min: ");
    result.append(min);
    result.append(", name: ");
    result.append(name);
    result.append(", pattern: ");
    result.append(pattern);
    result.append(", totalDigits: ");
    result.append(totalDigits);
    result.append(", type: ");
    if (typeESet) result.append(type); else result.append("<unset>");
    result.append(", values: ");
    result.append(values);
    result.append(')');
    return result.toString();
  }

} //TypeTypedefImpl
