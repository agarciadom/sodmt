/**
 */
package serviceProcess;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visit Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see serviceProcess.ServiceProcessPackage#getVisitStatus()
 * @model
 * @generated
 */
public enum VisitStatus implements Enumerator
{
  /**
   * The '<em><b>NOT VISITED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_VISITED_VALUE
   * @generated
   * @ordered
   */
  NOT_VISITED(0, "NOT_VISITED", "NOT_VISITED"),

  /**
   * The '<em><b>VISITING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISITING_VALUE
   * @generated
   * @ordered
   */
  VISITING(1, "VISITING", "VISITING"),

  /**
   * The '<em><b>VISITED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISITED_VALUE
   * @generated
   * @ordered
   */
  VISITED(2, "VISITED", "VISITED");

  /**
   * The '<em><b>NOT VISITED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOT VISITED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_VISITED
   * @model
   * @generated
   * @ordered
   */
  public static final int NOT_VISITED_VALUE = 0;

  /**
   * The '<em><b>VISITING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VISITING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VISITING
   * @model
   * @generated
   * @ordered
   */
  public static final int VISITING_VALUE = 1;

  /**
   * The '<em><b>VISITED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VISITED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VISITED
   * @model
   * @generated
   * @ordered
   */
  public static final int VISITED_VALUE = 2;

  /**
   * An array of all the '<em><b>Visit Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VisitStatus[] VALUES_ARRAY =
    new VisitStatus[]
    {
      NOT_VISITED,
      VISITING,
      VISITED,
    };

  /**
   * A public read-only list of all the '<em><b>Visit Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VisitStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Visit Status</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisitStatus get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VisitStatus result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Visit Status</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisitStatus getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VisitStatus result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Visit Status</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisitStatus get(int value)
  {
    switch (value)
    {
      case NOT_VISITED_VALUE: return NOT_VISITED;
      case VISITING_VALUE: return VISITING;
      case VISITED_VALUE: return VISITED;
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
  private VisitStatus(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //VisitStatus
