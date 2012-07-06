/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.impl;

import es.uca.webservices.wsdl.analyzer.emf.catalog.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageCatalogFactoryImpl extends EFactoryImpl implements MessageCatalogFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MessageCatalogFactory init()
  {
    try
    {
      MessageCatalogFactory theMessageCatalogFactory = (MessageCatalogFactory)EPackage.Registry.INSTANCE.getEFactory("http://serviceAnalyzer/messageCatalog"); 
      if (theMessageCatalogFactory != null)
      {
        return theMessageCatalogFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MessageCatalogFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageCatalogFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MessageCatalogPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case MessageCatalogPackage.SERVICES_TYPE: return createServicesType();
      case MessageCatalogPackage.TYPE_DECLS: return createTypeDecls();
      case MessageCatalogPackage.TYPE_FAULT: return createTypeFault();
      case MessageCatalogPackage.TYPE_INPUT: return createTypeInput();
      case MessageCatalogPackage.TYPE_OPERATION: return createTypeOperation();
      case MessageCatalogPackage.TYPE_OUTPUT: return createTypeOutput();
      case MessageCatalogPackage.TYPE_PORT: return createTypePort();
      case MessageCatalogPackage.TYPE_SERVICE: return createTypeService();
      case MessageCatalogPackage.TYPE_TEMPLATE: return createTypeTemplate();
      case MessageCatalogPackage.TYPE_TYPEDEF: return createTypeTypedef();
      case MessageCatalogPackage.TYPE_VARIABLE: return createTypeVariable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MessageCatalogPackage.TYPE_GA:
        return createTypeGAFromString(eDataType, initialValue);
      case MessageCatalogPackage.TYPE_GA_OBJECT:
        return createTypeGAObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MessageCatalogPackage.TYPE_GA:
        return convertTypeGAToString(eDataType, instanceValue);
      case MessageCatalogPackage.TYPE_GA_OBJECT:
        return convertTypeGAObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServicesType createServicesType()
  {
    ServicesTypeImpl servicesType = new ServicesTypeImpl();
    return servicesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecls createTypeDecls()
  {
    TypeDeclsImpl typeDecls = new TypeDeclsImpl();
    return typeDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFault createTypeFault()
  {
    TypeFaultImpl typeFault = new TypeFaultImpl();
    return typeFault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInput createTypeInput()
  {
    TypeInputImpl typeInput = new TypeInputImpl();
    return typeInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeOperation createTypeOperation()
  {
    TypeOperationImpl typeOperation = new TypeOperationImpl();
    return typeOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeOutput createTypeOutput()
  {
    TypeOutputImpl typeOutput = new TypeOutputImpl();
    return typeOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePort createTypePort()
  {
    TypePortImpl typePort = new TypePortImpl();
    return typePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeService createTypeService()
  {
    TypeServiceImpl typeService = new TypeServiceImpl();
    return typeService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTemplate createTypeTemplate()
  {
    TypeTemplateImpl typeTemplate = new TypeTemplateImpl();
    return typeTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTypedef createTypeTypedef()
  {
    TypeTypedefImpl typeTypedef = new TypeTypedefImpl();
    return typeTypedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeVariable createTypeVariable()
  {
    TypeVariableImpl typeVariable = new TypeVariableImpl();
    return typeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeGA createTypeGAFromString(EDataType eDataType, String initialValue)
  {
    TypeGA result = TypeGA.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeGAToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeGA createTypeGAObjectFromString(EDataType eDataType, String initialValue)
  {
    return createTypeGAFromString(MessageCatalogPackage.Literals.TYPE_GA, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeGAObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertTypeGAToString(MessageCatalogPackage.Literals.TYPE_GA, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageCatalogPackage getMessageCatalogPackage()
  {
    return (MessageCatalogPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MessageCatalogPackage getPackage()
  {
    return MessageCatalogPackage.eINSTANCE;
  }

} //MessageCatalogFactoryImpl
