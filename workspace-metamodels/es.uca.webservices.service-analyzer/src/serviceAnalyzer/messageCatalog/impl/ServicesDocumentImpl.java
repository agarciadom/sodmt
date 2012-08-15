/*
 * An XML document type.
 * Localname: services
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.ServicesDocument
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog.impl;
/**
 * A document containing one services(@http://serviceAnalyzer/messageCatalog) element.
 *
 * This is a complex type.
 */
public class ServicesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements serviceAnalyzer.messageCatalog.ServicesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServicesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICES$0 = 
        new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "services");
    
    
    /**
     * Gets the "services" element
     */
    public serviceAnalyzer.messageCatalog.ServicesDocument.Services getServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.ServicesDocument.Services target = null;
            target = (serviceAnalyzer.messageCatalog.ServicesDocument.Services)get_store().find_element_user(SERVICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "services" element
     */
    public void setServices(serviceAnalyzer.messageCatalog.ServicesDocument.Services services)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.ServicesDocument.Services target = null;
            target = (serviceAnalyzer.messageCatalog.ServicesDocument.Services)get_store().find_element_user(SERVICES$0, 0);
            if (target == null)
            {
                target = (serviceAnalyzer.messageCatalog.ServicesDocument.Services)get_store().add_element_user(SERVICES$0);
            }
            target.set(services);
        }
    }
    
    /**
     * Appends and returns a new empty "services" element
     */
    public serviceAnalyzer.messageCatalog.ServicesDocument.Services addNewServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.ServicesDocument.Services target = null;
            target = (serviceAnalyzer.messageCatalog.ServicesDocument.Services)get_store().add_element_user(SERVICES$0);
            return target;
        }
    }
    /**
     * An XML services(@http://serviceAnalyzer/messageCatalog).
     *
     * This is a complex type.
     */
    public static class ServicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements serviceAnalyzer.messageCatalog.ServicesDocument.Services
    {
        private static final long serialVersionUID = 1L;
        
        public ServicesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICE$0 = 
            new javax.xml.namespace.QName("http://serviceAnalyzer/messageCatalog", "service");
        
        
        /**
         * Gets array of all "service" elements
         */
        public serviceAnalyzer.messageCatalog.TypeService[] getServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICE$0, targetList);
                serviceAnalyzer.messageCatalog.TypeService[] result = new serviceAnalyzer.messageCatalog.TypeService[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "service" element
         */
        public serviceAnalyzer.messageCatalog.TypeService getServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                serviceAnalyzer.messageCatalog.TypeService target = null;
                target = (serviceAnalyzer.messageCatalog.TypeService)get_store().find_element_user(SERVICE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "service" element
         */
        public int sizeOfServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICE$0);
            }
        }
        
        /**
         * Sets array of all "service" element
         */
        public void setServiceArray(serviceAnalyzer.messageCatalog.TypeService[] serviceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(serviceArray, SERVICE$0);
            }
        }
        
        /**
         * Sets ith "service" element
         */
        public void setServiceArray(int i, serviceAnalyzer.messageCatalog.TypeService service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                serviceAnalyzer.messageCatalog.TypeService target = null;
                target = (serviceAnalyzer.messageCatalog.TypeService)get_store().find_element_user(SERVICE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(service);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service" element
         */
        public serviceAnalyzer.messageCatalog.TypeService insertNewService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                serviceAnalyzer.messageCatalog.TypeService target = null;
                target = (serviceAnalyzer.messageCatalog.TypeService)get_store().insert_element_user(SERVICE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service" element
         */
        public serviceAnalyzer.messageCatalog.TypeService addNewService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                serviceAnalyzer.messageCatalog.TypeService target = null;
                target = (serviceAnalyzer.messageCatalog.TypeService)get_store().add_element_user(SERVICE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "service" element
         */
        public void removeService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICE$0, i);
            }
        }
    }
}
