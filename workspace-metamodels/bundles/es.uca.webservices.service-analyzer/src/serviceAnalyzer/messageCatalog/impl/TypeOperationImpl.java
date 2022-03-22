/*
 * XML Type:  typeOperation
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeOperation
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog.impl;
/**
 * An XML typeOperation(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public class TypeOperationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements serviceAnalyzer.messageCatalog.TypeOperation
{
    private static final long serialVersionUID = 1L;
    
    public TypeOperationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUT$0 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "input");
    private static final javax.xml.namespace.QName OUTPUT$2 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "output");
    private static final javax.xml.namespace.QName FAULT$4 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "fault");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "input" element
     */
    public serviceAnalyzer.messageCatalog.TypeInput getInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeInput target = null;
            target = (serviceAnalyzer.messageCatalog.TypeInput)get_store().find_element_user(INPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "input" element
     */
    public boolean isSetInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUT$0) != 0;
        }
    }
    
    /**
     * Sets the "input" element
     */
    public void setInput(serviceAnalyzer.messageCatalog.TypeInput input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeInput target = null;
            target = (serviceAnalyzer.messageCatalog.TypeInput)get_store().find_element_user(INPUT$0, 0);
            if (target == null)
            {
                target = (serviceAnalyzer.messageCatalog.TypeInput)get_store().add_element_user(INPUT$0);
            }
            target.set(input);
        }
    }
    
    /**
     * Appends and returns a new empty "input" element
     */
    public serviceAnalyzer.messageCatalog.TypeInput addNewInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeInput target = null;
            target = (serviceAnalyzer.messageCatalog.TypeInput)get_store().add_element_user(INPUT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "input" element
     */
    public void unsetInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUT$0, 0);
        }
    }
    
    /**
     * Gets the "output" element
     */
    public serviceAnalyzer.messageCatalog.TypeOutput getOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeOutput target = null;
            target = (serviceAnalyzer.messageCatalog.TypeOutput)get_store().find_element_user(OUTPUT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "output" element
     */
    public boolean isSetOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUT$2) != 0;
        }
    }
    
    /**
     * Sets the "output" element
     */
    public void setOutput(serviceAnalyzer.messageCatalog.TypeOutput output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeOutput target = null;
            target = (serviceAnalyzer.messageCatalog.TypeOutput)get_store().find_element_user(OUTPUT$2, 0);
            if (target == null)
            {
                target = (serviceAnalyzer.messageCatalog.TypeOutput)get_store().add_element_user(OUTPUT$2);
            }
            target.set(output);
        }
    }
    
    /**
     * Appends and returns a new empty "output" element
     */
    public serviceAnalyzer.messageCatalog.TypeOutput addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeOutput target = null;
            target = (serviceAnalyzer.messageCatalog.TypeOutput)get_store().add_element_user(OUTPUT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "output" element
     */
    public void unsetOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUT$2, 0);
        }
    }
    
    /**
     * Gets array of all "fault" elements
     */
    public serviceAnalyzer.messageCatalog.TypeFault[] getFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAULT$4, targetList);
            serviceAnalyzer.messageCatalog.TypeFault[] result = new serviceAnalyzer.messageCatalog.TypeFault[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fault" element
     */
    public serviceAnalyzer.messageCatalog.TypeFault getFaultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeFault target = null;
            target = (serviceAnalyzer.messageCatalog.TypeFault)get_store().find_element_user(FAULT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fault" element
     */
    public int sizeOfFaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULT$4);
        }
    }
    
    /**
     * Sets array of all "fault" element
     */
    public void setFaultArray(serviceAnalyzer.messageCatalog.TypeFault[] faultArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(faultArray, FAULT$4);
        }
    }
    
    /**
     * Sets ith "fault" element
     */
    public void setFaultArray(int i, serviceAnalyzer.messageCatalog.TypeFault fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeFault target = null;
            target = (serviceAnalyzer.messageCatalog.TypeFault)get_store().find_element_user(FAULT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fault);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fault" element
     */
    public serviceAnalyzer.messageCatalog.TypeFault insertNewFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeFault target = null;
            target = (serviceAnalyzer.messageCatalog.TypeFault)get_store().insert_element_user(FAULT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fault" element
     */
    public serviceAnalyzer.messageCatalog.TypeFault addNewFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeFault target = null;
            target = (serviceAnalyzer.messageCatalog.TypeFault)get_store().add_element_user(FAULT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "fault" element
     */
    public void removeFault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULT$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
}
