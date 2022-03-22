/**
 */
package es.uca.modeling.eol.marte.weaving.links;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Limit Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage#getTimeLimitMetric()
 * @model
 * @generated
 */
public enum TimeLimitMetric implements Enumerator {
	/**
	 * The '<em><b>MAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(0, "MAX", "MAX"),

	/**
	 * The '<em><b>AVERAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE(1, "AVERAGE", "AVERAGE"),

	/**
	 * The '<em><b>PERCENTILE 90</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE_90_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTILE_90(2, "PERCENTILE_90", "PERCENTILE_90"),

	/**
	 * The '<em><b>PERCENTILE 95</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE_95_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTILE_95(3, "PERCENTILE_95", "PERCENTILE_95"),

	/**
	 * The '<em><b>PERCENTILE 99</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE_99_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTILE_99(4, "PERCENTILE_99", "PERCENTILE_99"),

	/**
	 * The '<em><b>MEDIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIAN(5, "MEDIAN", "MEDIAN");

	/**
	 * The '<em><b>MAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 0;

	/**
	 * The '<em><b>AVERAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_VALUE = 1;

	/**
	 * The '<em><b>PERCENTILE 90</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE_90
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTILE_90_VALUE = 2;

	/**
	 * The '<em><b>PERCENTILE 95</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE_95
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTILE_95_VALUE = 3;

	/**
	 * The '<em><b>PERCENTILE 99</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE_99
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTILE_99_VALUE = 4;

	/**
	 * The '<em><b>MEDIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIAN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Time Limit Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeLimitMetric[] VALUES_ARRAY =
		new TimeLimitMetric[] {
			MAX,
			AVERAGE,
			PERCENTILE_90,
			PERCENTILE_95,
			PERCENTILE_99,
			MEDIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Limit Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeLimitMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Limit Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeLimitMetric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeLimitMetric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Limit Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeLimitMetric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeLimitMetric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Limit Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeLimitMetric get(int value) {
		switch (value) {
			case MAX_VALUE: return MAX;
			case AVERAGE_VALUE: return AVERAGE;
			case PERCENTILE_90_VALUE: return PERCENTILE_90;
			case PERCENTILE_95_VALUE: return PERCENTILE_95;
			case PERCENTILE_99_VALUE: return PERCENTILE_99;
			case MEDIAN_VALUE: return MEDIAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeLimitMetric(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimeLimitMetric
