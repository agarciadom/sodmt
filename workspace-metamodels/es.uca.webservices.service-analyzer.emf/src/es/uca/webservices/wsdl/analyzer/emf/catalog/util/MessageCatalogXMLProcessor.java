/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.util;

import es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageCatalogXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageCatalogXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    MessageCatalogPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the MessageCatalogResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new MessageCatalogResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new MessageCatalogResourceFactoryImpl());
    }
    return registrations;
  }

} //MessageCatalogXMLProcessor
