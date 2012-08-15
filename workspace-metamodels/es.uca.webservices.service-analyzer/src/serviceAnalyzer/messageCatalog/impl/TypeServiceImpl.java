/*
 * XML Type:  typeService
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeService
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog.impl;
/**
 * An XML typeService(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public class TypeServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements serviceAnalyzer.messageCatalog.TypeService
{
    private static final long serialVersionUID = 1L;
    
    public TypeServiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PORT$0 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "port");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName URI$4 = 
        new javax.xml.namespace.QName("", "uri");
    
    
    /**
     * Gets array of all "port" elements
     */
    public serviceAnalyzer.messageCatalog.TypePort[] getPortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PORT$0, targetList);
            serviceAnalyzer.messageCatalog.TypePort[] result = new serviceAnalyzer.messageCatalog.TypePort[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port" element
     */
    public serviceAnalyzer.messageCatalog.TypePort getPortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypePort target = null;
            target = (serviceAnalyzer.messageCatalog.TypePort)get_store().find_element_user(PORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port" element
     */
    public int sizeOfPortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORT$0);
        }
    }
    
    /**
     * Sets array of all "port" element
     */
    public void setPortArray(serviceAnalyzer.messageCatalog.TypePort[] portArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portArray, PORT$0);
        }
    }
    
    /**
     * Sets ith "port" element
     */
    public void setPortArray(int i, serviceAnalyzer.messageCatalog.TypePort port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypePort target = null;
            target = (serviceAnalyzer.messageCatalog.TypePort)get_store().find_element_user(PORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(port);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port" element
     */
    public serviceAnalyzer.messageCatalog.TypePort insertNewPort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypePort target = null;
            target = (serviceAnalyzer.messageCatalog.TypePort)get_store().insert_element_user(PORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port" element
     */
    public serviceAnalyzer.messageCatalog.TypePort addNewPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypePort target = null;
            target = (serviceAnalyzer.messageCatalog.TypePort)get_store().add_element_user(PORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "port" element
     */
    public void removePort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORT$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "uri" attribute
     */
    public java.lang.String getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$4);
            return target;
        }
    }
    
    /**
     * Sets the "uri" attribute
     */
    public void setUri(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$4);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    public void xsetUri(org.apache.xmlbeans.XmlString uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URI$4);
            }
            target.set(uri);
        }
    }
}
