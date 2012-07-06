/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Typedef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getElement <em>Element</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getMax <em>Max</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getMin <em>Min</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getPattern <em>Pattern</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getType <em>Type</em>}</li>
 *   <li>{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef()
 * @model extendedMetaData="name='typeTypedef' kind='empty'"
 * @generated
 */
public interface TypeTypedef extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_Element()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='element'"
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

  /**
   * Returns the value of the '<em><b>Fraction Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fraction Digits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fraction Digits</em>' attribute.
   * @see #setFractionDigits(BigInteger)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_FractionDigits()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
   *        extendedMetaData="kind='attribute' name='fractionDigits'"
   * @generated
   */
  BigInteger getFractionDigits();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getFractionDigits <em>Fraction Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fraction Digits</em>' attribute.
   * @see #getFractionDigits()
   * @generated
   */
  void setFractionDigits(BigInteger value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(String)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_Max()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='max'"
   * @generated
   */
  String getMax();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(String value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(String)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_Min()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='min'"
   * @generated
   */
  String getMin();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_Pattern()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='pattern'"
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

  /**
   * Returns the value of the '<em><b>Total Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Total Digits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Total Digits</em>' attribute.
   * @see #setTotalDigits(BigInteger)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_TotalDigits()
   * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
   *        extendedMetaData="kind='attribute' name='totalDigits'"
   * @generated
   */
  BigInteger getTotalDigits();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getTotalDigits <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Total Digits</em>' attribute.
   * @see #getTotalDigits()
   * @generated
   */
  void setTotalDigits(BigInteger value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(TypeGA)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_Type()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
  TypeGA getType();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeGA
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(TypeGA value);

  /**
   * Unsets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(TypeGA)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(TypeGA)
   * @generated
   */
  boolean isSetType();

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute.
   * @see #setValues(String)
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage#getTypeTypedef_Values()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='values'"
   * @generated
   */
  String getValues();

  /**
   * Sets the value of the '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef#getValues <em>Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' attribute.
   * @see #getValues()
   * @generated
   */
  void setValues(String value);

} // TypeTypedef
