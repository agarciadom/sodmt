/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.tests;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogFactory;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeServiceTest extends TestCase
{

  /**
   * The fixture for this Type Service test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeService fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TypeServiceTest.class);
  }

  /**
   * Constructs a new Type Service test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeServiceTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Type Service test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TypeService fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Type Service test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeService getFixture()
  {
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(MessageCatalogFactory.eINSTANCE.createTypeService());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //TypeServiceTest
