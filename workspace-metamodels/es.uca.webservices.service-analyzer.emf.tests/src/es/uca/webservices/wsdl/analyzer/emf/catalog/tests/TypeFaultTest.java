/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.tests;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogFactory;
import es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Fault</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeFaultTest extends TestCase
{

  /**
   * The fixture for this Type Fault test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeFault fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TypeFaultTest.class);
  }

  /**
   * Constructs a new Type Fault test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFaultTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Type Fault test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TypeFault fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Type Fault test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeFault getFixture()
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
    setFixture(MessageCatalogFactory.eINSTANCE.createTypeFault());
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

} //TypeFaultTest
