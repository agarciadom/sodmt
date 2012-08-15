/*
 * XML Type:  typeDecls
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeDecls
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog;


/**
 * An XML typeDecls(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public interface TypeDecls extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeDecls.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92489DC22B2DE95D2859D662D51A7EB8").resolveHandle("typedecls3f9etype");
    
    /**
     * Gets array of all "typedef" elements
     */
    serviceAnalyzer.messageCatalog.TypeTypedef[] getTypedefArray();
    
    /**
     * Gets ith "typedef" element
     */
    serviceAnalyzer.messageCatalog.TypeTypedef getTypedefArray(int i);
    
    /**
     * Returns number of "typedef" element
     */
    int sizeOfTypedefArray();
    
    /**
     * Sets array of all "typedef" element
     */
    void setTypedefArray(serviceAnalyzer.messageCatalog.TypeTypedef[] typedefArray);
    
    /**
     * Sets ith "typedef" element
     */
    void setTypedefArray(int i, serviceAnalyzer.messageCatalog.TypeTypedef typedef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "typedef" element
     */
    serviceAnalyzer.messageCatalog.TypeTypedef insertNewTypedef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "typedef" element
     */
    serviceAnalyzer.messageCatalog.TypeTypedef addNewTypedef();
    
    /**
     * Removes the ith "typedef" element
     */
    void removeTypedef(int i);
    
    /**
     * Gets array of all "variable" elements
     */
    serviceAnalyzer.messageCatalog.TypeVariable[] getVariableArray();
    
    /**
     * Gets ith "variable" element
     */
    serviceAnalyzer.messageCatalog.TypeVariable getVariableArray(int i);
    
    /**
     * Returns number of "variable" element
     */
    int sizeOfVariableArray();
    
    /**
     * Sets array of all "variable" element
     */
    void setVariableArray(serviceAnalyzer.messageCatalog.TypeVariable[] variableArray);
    
    /**
     * Sets ith "variable" element
     */
    void setVariableArray(int i, serviceAnalyzer.messageCatalog.TypeVariable variable);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "variable" element
     */
    serviceAnalyzer.messageCatalog.TypeVariable insertNewVariable(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "variable" element
     */
    serviceAnalyzer.messageCatalog.TypeVariable addNewVariable();
    
    /**
     * Removes the ith "variable" element
     */
    void removeVariable(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static serviceAnalyzer.messageCatalog.TypeDecls newInstance() {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static serviceAnalyzer.messageCatalog.TypeDecls parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (serviceAnalyzer.messageCatalog.TypeDecls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
