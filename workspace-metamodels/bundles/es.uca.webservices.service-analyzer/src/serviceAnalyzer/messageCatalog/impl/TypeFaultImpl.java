/*
 * XML Type:  typeFault
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeFault
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog.impl;
/**
 * An XML typeFault(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public class TypeFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements serviceAnalyzer.messageCatalog.TypeFault
{
    private static final long serialVersionUID = 1L;
    
    public TypeFaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECLS$0 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "decls");
    private static final javax.xml.namespace.QName TEMPLATE$2 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "template");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    
    
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
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$4) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$4);
        }
    }
}
