/*
 * XML Type:  typeTypedef
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeTypedef
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog;


/**
 * An XML typeTypedef(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public interface TypeTypedef extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeTypedef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92489DC22B2DE95D2859D662D51A7EB8").resolveHandle("typetypedef2460type");
    
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
     * Gets the "type" attribute
     */
    serviceAnalyzer.messageCatalog.TypeGA.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    serviceAnalyzer.messageCatalog.TypeGA xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(serviceAnalyzer.messageCatalog.TypeGA.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(serviceAnalyzer.messageCatalog.TypeGA type);
    
    /**
     * Gets the "element" attribute
     */
    java.lang.String getElement();
    
    /**
     * Gets (as xml) the "element" attribute
     */
    org.apache.xmlbeans.XmlString xgetElement();
    
    /**
     * True if has "element" attribute
     */
    boolean isSetElement();
    
    /**
     * Sets the "element" attribute
     */
    void setElement(java.lang.String element);
    
    /**
     * Sets (as xml) the "element" attribute
     */
    void xsetElement(org.apache.xmlbeans.XmlString element);
    
    /**
     * Unsets the "element" attribute
     */
    void unsetElement();
    
    /**
     * Gets the "min" attribute
     */
    java.lang.String getMin();
    
    /**
     * Gets (as xml) the "min" attribute
     */
    org.apache.xmlbeans.XmlString xgetMin();
    
    /**
     * True if has "min" attribute
     */
    boolean isSetMin();
    
    /**
     * Sets the "min" attribute
     */
    void setMin(java.lang.String min);
    
    /**
     * Sets (as xml) the "min" attribute
     */
    void xsetMin(org.apache.xmlbeans.XmlString min);
    
    /**
     * Unsets the "min" attribute
     */
    void unsetMin();
    
    /**
     * Gets the "max" attribute
     */
    java.lang.String getMax();
    
    /**
     * Gets (as xml) the "max" attribute
     */
    org.apache.xmlbeans.XmlString xgetMax();
    
    /**
     * True if has "max" attribute
     */
    boolean isSetMax();
    
    /**
     * Sets the "max" attribute
     */
    void setMax(java.lang.String max);
    
    /**
     * Sets (as xml) the "max" attribute
     */
    void xsetMax(org.apache.xmlbeans.XmlString max);
    
    /**
     * Unsets the "max" attribute
     */
    void unsetMax();
    
    /**
     * Gets the "values" attribute
     */
    java.lang.String getValues();
    
    /**
     * Gets (as xml) the "values" attribute
     */
    org.apache.xmlbeans.XmlString xgetValues();
    
    /**
     * True if has "values" attribute
     */
    boolean isSetValues();
    
    /**
     * Sets the "values" attribute
     */
    void setValues(java.lang.String values);
    
    /**
     * Sets (as xml) the "values" attribute
     */
    void xsetValues(org.apache.xmlbeans.XmlString values);
    
    /**
     * Unsets the "values" attribute
     */
    void unsetValues();
    
    /**
     * Gets the "pattern" attribute
     */
    java.lang.String getPattern();
    
    /**
     * Gets (as xml) the "pattern" attribute
     */
    org.apache.xmlbeans.XmlString xgetPattern();
    
    /**
     * True if has "pattern" attribute
     */
    boolean isSetPattern();
    
    /**
     * Sets the "pattern" attribute
     */
    void setPattern(java.lang.String pattern);
    
    /**
     * Sets (as xml) the "pattern" attribute
     */
    void xsetPattern(org.apache.xmlbeans.XmlString pattern);
    
    /**
     * Unsets the "pattern" attribute
     */
    void unsetPattern();
    
    /**
     * Gets the "fractionDigits" attribute
     */
    java.math.BigInteger getFractionDigits();
    
    /**
     * Gets (as xml) the "fractionDigits" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetFractionDigits();
    
    /**
     * True if has "fractionDigits" attribute
     */
    boolean isSetFractionDigits();
    
    /**
     * Sets the "fractionDigits" attribute
     */
    void setFractionDigits(java.math.BigInteger fractionDigits);
    
    /**
     * Sets (as xml) the "fractionDigits" attribute
     */
    void xsetFractionDigits(org.apache.xmlbeans.XmlNonNegativeInteger fractionDigits);
    
    /**
     * Unsets the "fractionDigits" attribute
     */
    void unsetFractionDigits();
    
    /**
     * Gets the "totalDigits" attribute
     */
    java.math.BigInteger getTotalDigits();
    
    /**
     * Gets (as xml) the "totalDigits" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetTotalDigits();
    
    /**
     * True if has "totalDigits" attribute
     */
    boolean isSetTotalDigits();
    
    /**
     * Sets the "totalDigits" attribute
     */
    void setTotalDigits(java.math.BigInteger totalDigits);
    
    /**
     * Sets (as xml) the "totalDigits" attribute
     */
    void xsetTotalDigits(org.apache.xmlbeans.XmlPositiveInteger totalDigits);
    
    /**
     * Unsets the "totalDigits" attribute
     */
    void unsetTotalDigits();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static serviceAnalyzer.messageCatalog.TypeTypedef newInstance() {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static serviceAnalyzer.messageCatalog.TypeTypedef parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (serviceAnalyzer.messageCatalog.TypeTypedef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
