/*
 * XML Type:  typeDecls
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeDecls
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog.impl;
/**
 * An XML typeDecls(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public class TypeDeclsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements serviceAnalyzer.messageCatalog.TypeDecls
{
    private static final long serialVersionUID = 1L;
    
    public TypeDeclsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEDEF$0 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "typedef");
    private static final javax.xml.namespace.QName VARIABLE$2 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "variable");
    
    
    /**
     * Gets array of all "typedef" elements
     */
    public serviceAnalyzer.messageCatalog.TypeTypedef[] getTypedefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPEDEF$0, targetList);
            serviceAnalyzer.messageCatalog.TypeTypedef[] result = new serviceAnalyzer.messageCatalog.TypeTypedef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "typedef" element
     */
    public serviceAnalyzer.messageCatalog.TypeTypedef getTypedefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeTypedef target = null;
            target = (serviceAnalyzer.messageCatalog.TypeTypedef)get_store().find_element_user(TYPEDEF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "typedef" element
     */
    public int sizeOfTypedefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEDEF$0);
        }
    }
    
    /**
     * Sets array of all "typedef" element
     */
    public void setTypedefArray(serviceAnalyzer.messageCatalog.TypeTypedef[] typedefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typedefArray, TYPEDEF$0);
        }
    }
    
    /**
     * Sets ith "typedef" element
     */
    public void setTypedefArray(int i, serviceAnalyzer.messageCatalog.TypeTypedef typedef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeTypedef target = null;
            target = (serviceAnalyzer.messageCatalog.TypeTypedef)get_store().find_element_user(TYPEDEF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(typedef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "typedef" element
     */
    public serviceAnalyzer.messageCatalog.TypeTypedef insertNewTypedef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeTypedef target = null;
            target = (serviceAnalyzer.messageCatalog.TypeTypedef)get_store().insert_element_user(TYPEDEF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "typedef" element
     */
    public serviceAnalyzer.messageCatalog.TypeTypedef addNewTypedef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeTypedef target = null;
            target = (serviceAnalyzer.messageCatalog.TypeTypedef)get_store().add_element_user(TYPEDEF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "typedef" element
     */
    public void removeTypedef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEDEF$0, i);
        }
    }
    
    /**
     * Gets array of all "variable" elements
     */
    public serviceAnalyzer.messageCatalog.TypeVariable[] getVariableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARIABLE$2, targetList);
            serviceAnalyzer.messageCatalog.TypeVariable[] result = new serviceAnalyzer.messageCatalog.TypeVariable[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "variable" element
     */
    public serviceAnalyzer.messageCatalog.TypeVariable getVariableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeVariable target = null;
            target = (serviceAnalyzer.messageCatalog.TypeVariable)get_store().find_element_user(VARIABLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "variable" element
     */
    public int sizeOfVariableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIABLE$2);
        }
    }
    
    /**
     * Sets array of all "variable" element
     */
    public void setVariableArray(serviceAnalyzer.messageCatalog.TypeVariable[] variableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(variableArray, VARIABLE$2);
        }
    }
    
    /**
     * Sets ith "variable" element
     */
    public void setVariableArray(int i, serviceAnalyzer.messageCatalog.TypeVariable variable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeVariable target = null;
            target = (serviceAnalyzer.messageCatalog.TypeVariable)get_store().find_element_user(VARIABLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(variable);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "variable" element
     */
    public serviceAnalyzer.messageCatalog.TypeVariable insertNewVariable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeVariable target = null;
            target = (serviceAnalyzer.messageCatalog.TypeVariable)get_store().insert_element_user(VARIABLE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "variable" element
     */
    public serviceAnalyzer.messageCatalog.TypeVariable addNewVariable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeVariable target = null;
            target = (serviceAnalyzer.messageCatalog.TypeVariable)get_store().add_element_user(VARIABLE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "variable" element
     */
    public void removeVariable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIABLE$2, i);
        }
    }
}
