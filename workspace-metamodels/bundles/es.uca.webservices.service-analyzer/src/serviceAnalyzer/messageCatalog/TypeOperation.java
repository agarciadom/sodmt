/*
 * XML Type:  typeOperation
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeOperation
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog;


/**
 * An XML typeOperation(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public interface TypeOperation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeOperation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92489DC22B2DE95D2859D662D51A7EB8").resolveHandle("typeoperation8efctype");
    
    /**
     * Gets the "input" element
     */
    serviceAnalyzer.messageCatalog.TypeInput getInput();
    
    /**
     * True if has "input" element
     */
    boolean isSetInput();
    
    /**
     * Sets the "input" element
     */
    void setInput(serviceAnalyzer.messageCatalog.TypeInput input);
    
    /**
     * Appends and returns a new empty "input" element
     */
    serviceAnalyzer.messageCatalog.TypeInput addNewInput();
    
    /**
     * Unsets the "input" element
     */
    void unsetInput();
    
    /**
     * Gets the "output" element
     */
    serviceAnalyzer.messageCatalog.TypeOutput getOutput();
    
    /**
     * True if has "output" element
     */
    boolean isSetOutput();
    
    /**
     * Sets the "output" element
     */
    void setOutput(serviceAnalyzer.messageCatalog.TypeOutput output);
    
    /**
     * Appends and returns a new empty "output" element
     */
    serviceAnalyzer.messageCatalog.TypeOutput addNewOutput();
    
    /**
     * Unsets the "output" element
     */
    void unsetOutput();
    
    /**
     * Gets array of all "fault" elements
     */
    serviceAnalyzer.messageCatalog.TypeFault[] getFaultArray();
    
    /**
     * Gets ith "fault" element
     */
    serviceAnalyzer.messageCatalog.TypeFault getFaultArray(int i);
    
    /**
     * Returns number of "fault" element
     */
    int sizeOfFaultArray();
    
    /**
     * Sets array of all "fault" element
     */
    void setFaultArray(serviceAnalyzer.messageCatalog.TypeFault[] faultArray);
    
    /**
     * Sets ith "fault" element
     */
    void setFaultArray(int i, serviceAnalyzer.messageCatalog.TypeFault fault);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fault" element
     */
    serviceAnalyzer.messageCatalog.TypeFault insertNewFault(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fault" element
     */
    serviceAnalyzer.messageCatalog.TypeFault addNewFault();
    
    /**
     * Removes the ith "fault" element
     */
    void removeFault(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static serviceAnalyzer.messageCatalog.TypeOperation newInstance() {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static serviceAnalyzer.messageCatalog.TypeOperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (serviceAnalyzer.messageCatalog.TypeOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
