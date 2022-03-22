/*
 * XML Type:  typeInput
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeInput
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog.impl;
/**
 * An XML typeInput(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public class TypeInputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements serviceAnalyzer.messageCatalog.TypeInput
{
    private static final long serialVersionUID = 1L;
    
    public TypeInputImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECLS$0 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "decls");
    private static final javax.xml.namespace.QName TEMPLATE$2 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "template");
    
    
    /**
     * Gets the "decls" element
     */
    public serviceAnalyzer.messageCatalog.TypeDecls getDecls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeDecls target = null;
            target = (serviceAnalyzer.messageCatalog.TypeDecls)get_store().find_element_user(DECLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "decls" element
     */
    public void setDecls(serviceAnalyzer.messageCatalog.TypeDecls decls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeDecls target = null;
            target = (serviceAnalyzer.messageCatalog.TypeDecls)get_store().find_element_user(DECLS$0, 0);
            if (target == null)
            {
                target = (serviceAnalyzer.messageCatalog.TypeDecls)get_store().add_element_user(DECLS$0);
            }
            target.set(decls);
        }
    }
    
    /**
     * Appends and returns a new empty "decls" element
     */
    public serviceAnalyzer.messageCatalog.TypeDecls addNewDecls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeDecls target = null;
            target = (serviceAnalyzer.messageCatalog.TypeDecls)get_store().add_element_user(DECLS$0);
            return target;
        }
    }
    
    /**
     * Gets the "template" element
     */
    public serviceAnalyzer.messageCatalog.TypeTemplate getTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeTemplate target = null;
            target = (serviceAnalyzer.messageCatalog.TypeTemplate)get_store().find_element_user(TEMPLATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "template" element
     */
    public void setTemplate(serviceAnalyzer.messageCatalog.TypeTemplate template)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeTemplate target = null;
            target = (serviceAnalyzer.messageCatalog.TypeTemplate)get_store().find_element_user(TEMPLATE$2, 0);
            if (target == null)
            {
                target = (serviceAnalyzer.messageCatalog.TypeTemplate)get_store().add_element_user(TEMPLATE$2);
            }
            target.set(template);
        }
    }
    
    /**
     * Appends and returns a new empty "template" element
     */
    public serviceAnalyzer.messageCatalog.TypeTemplate addNewTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeTemplate target = null;
            target = (serviceAnalyzer.messageCatalog.TypeTemplate)get_store().add_element_user(TEMPLATE$2);
            return target;
        }
    }
}
