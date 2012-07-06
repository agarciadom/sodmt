/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.tests;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogFactory;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypePortTest extends TestCase
{

  /**
   * The fixture for this Type Port test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypePort fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TypePortTest.class);
  }

  /**
   * Constructs a new Type Port test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePortTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Type Port test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TypePort fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Type Port test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypePort getFixture()
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
    setFixture(MessageCatalogFactory.eINSTANCE.createTypePort());
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

} //TypePortTest
