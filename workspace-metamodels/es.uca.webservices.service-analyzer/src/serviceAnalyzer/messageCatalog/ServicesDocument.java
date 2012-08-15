/*
 * An XML document type.
 * Localname: services
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.ServicesDocument
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog;


/**
 * A document containing one services(@http://serviceAnalyzer/messageCatalog) element.
 *
 * This is a complex type.
 */
public interface ServicesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServicesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92489DC22B2DE95D2859D662D51A7EB8").resolveHandle("services790fdoctype");
    
    /**
     * Gets the "services" element
     */
    serviceAnalyzer.messageCatalog.ServicesDocument.Services getServices();
    
    /**
     * Sets the "services" element
     */
    void setServices(serviceAnalyzer.messageCatalog.ServicesDocument.Services services);
    
    /**
     * Appends and returns a new empty "services" element
     */
    serviceAnalyzer.messageCatalog.ServicesDocument.Services addNewServices();
    
    /**
     * An XML services(@http://serviceAnalyzer/messageCatalog).
     *
     * This is a complex type.
     */
    public interface Services extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Services.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92489DC22B2DE95D2859D662D51A7EB8").resolveHandle("servicesb355elemtype");
        
        /**
         * Gets array of all "service" elements
         */
        serviceAnalyzer.messageCatalog.TypeService[] getServiceArray();
        
        /**
         * Gets ith "service" element
         */
        serviceAnalyzer.messageCatalog.TypeService getServiceArray(int i);
        
        /**
         * Returns number of "service" element
         */
        int sizeOfServiceArray();
        
        /**
         * Sets array of all "service" element
         */
        void setServiceArray(serviceAnalyzer.messageCatalog.TypeService[] serviceArray);
        
        /**
         * Sets ith "service" element
         */
        void setServiceArray(int i, serviceAnalyzer.messageCatalog.TypeService service);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service" element
         */
        serviceAnalyzer.messageCatalog.TypeService insertNewService(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service" element
         */
        serviceAnalyzer.messageCatalog.TypeService addNewService();
        
        /**
         * Removes the ith "service" element
         */
        void removeService(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static serviceAnalyzer.messageCatalog.ServicesDocument.Services newInstance() {
              return (serviceAnalyzer.messageCatalog.ServicesDocument.Services) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static serviceAnalyzer.messageCatalog.ServicesDocument.Services newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (serviceAnalyzer.messageCatalog.ServicesDocument.Services) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static serviceAnalyzer.messageCatalog.ServicesDocument newInstance() {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static serviceAnalyzer.messageCatalog.ServicesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (serviceAnalyzer.messageCatalog.ServicesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
