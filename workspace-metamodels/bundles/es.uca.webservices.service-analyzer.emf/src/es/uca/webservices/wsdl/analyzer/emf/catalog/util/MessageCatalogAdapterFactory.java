/**
 */
package es.uca.webservices.wsdl.analyzer.emf.catalog.util;

import es.uca.webservices.wsdl.analyzer.emf.catalog.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uca.webservices.wsdl.analyzer.emf.catalog.MessageCatalogPackage
 * @generated
 */
public class MessageCatalogAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MessageCatalogPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageCatalogAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MessageCatalogPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageCatalogSwitch<Adapter> modelSwitch =
    new MessageCatalogSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseServicesType(ServicesType object)
      {
        return createServicesTypeAdapter();
      }
      @Override
      public Adapter caseTypeDecls(TypeDecls object)
      {
        return createTypeDeclsAdapter();
      }
      @Override
      public Adapter caseTypeFault(TypeFault object)
      {
        return createTypeFaultAdapter();
      }
      @Override
      public Adapter caseTypeInput(TypeInput object)
      {
        return createTypeInputAdapter();
      }
      @Override
      public Adapter caseTypeOperation(TypeOperation object)
      {
        return createTypeOperationAdapter();
      }
      @Override
      public Adapter caseTypeOutput(TypeOutput object)
      {
        return createTypeOutputAdapter();
      }
      @Override
      public Adapter caseTypePort(TypePort object)
      {
        return createTypePortAdapter();
      }
      @Override
      public Adapter caseTypeService(TypeService object)
      {
        return createTypeServiceAdapter();
      }
      @Override
      public Adapter caseTypeTemplate(TypeTemplate object)
      {
        return createTypeTemplateAdapter();
      }
      @Override
      public Adapter caseTypeTypedef(TypeTypedef object)
      {
        return createTypeTypedefAdapter();
      }
      @Override
      public Adapter caseTypeVariable(TypeVariable object)
      {
        return createTypeVariableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType <em>Services Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.ServicesType
   * @generated
   */
  public Adapter createServicesTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls <em>Type Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeDecls
   * @generated
   */
  public Adapter createTypeDeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault <em>Type Fault</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeFault
   * @generated
   */
  public Adapter createTypeFaultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput <em>Type Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeInput
   * @generated
   */
  public Adapter createTypeInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation <em>Type Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOperation
   * @generated
   */
  public Adapter createTypeOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput <em>Type Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeOutput
   * @generated
   */
  public Adapter createTypeOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort <em>Type Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypePort
   * @generated
   */
  public Adapter createTypePortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService <em>Type Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeService
   * @generated
   */
  public Adapter createTypeServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate <em>Type Template</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTemplate
   * @generated
   */
  public Adapter createTypeTemplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef <em>Type Typedef</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeTypedef
   * @generated
   */
  public Adapter createTypeTypedefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable <em>Type Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.uca.webservices.wsdl.analyzer.emf.catalog.TypeVariable
   * @generated
   */
  public Adapter createTypeVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MessageCatalogAdapterFactory
