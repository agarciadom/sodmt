/*
 * XML Type:  typeTypedef
 * Namespace: http://serviceAnalyzer/messageCatalog
 * Java type: serviceAnalyzer.messageCatalog.TypeTypedef
 *
 * Automatically generated - do not modify.
 */
package serviceAnalyzer.messageCatalog.impl;
/**
 * An XML typeTypedef(@http://serviceAnalyzer/messageCatalog).
 *
 * This is a complex type.
 */
public class TypeTypedefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements serviceAnalyzer.messageCatalog.TypeTypedef
{
    private static final long serialVersionUID = 1L;
    
    public TypeTypedefImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ELEMENT$4 = 
        new javax.xml.namespace.QName("", "element");
    private static final javax.xml.namespace.QName MIN$6 = 
        new javax.xml.namespace.QName("", "min");
    private static final javax.xml.namespace.QName MAX$8 = 
        new javax.xml.namespace.QName("", "max");
    private static final javax.xml.namespace.QName VALUES$10 = 
        new javax.xml.namespace.QName("", "values");
    private static final javax.xml.namespace.QName PATTERN$12 = 
        new javax.xml.namespace.QName("", "pattern");
    private static final javax.xml.namespace.QName FRACTIONDIGITS$14 = 
        new javax.xml.namespace.QName("", "fractionDigits");
    private static final javax.xml.namespace.QName TOTALDIGITS$16 = 
        new javax.xml.namespace.QName("", "totalDigits");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public serviceAnalyzer.messageCatalog.TypeGA.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return (serviceAnalyzer.messageCatalog.TypeGA.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public serviceAnalyzer.messageCatalog.TypeGA xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeGA target = null;
            target = (serviceAnalyzer.messageCatalog.TypeGA)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(serviceAnalyzer.messageCatalog.TypeGA.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(serviceAnalyzer.messageCatalog.TypeGA type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            serviceAnalyzer.messageCatalog.TypeGA target = null;
            target = (serviceAnalyzer.messageCatalog.TypeGA)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (serviceAnalyzer.messageCatalog.TypeGA)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "element" attribute
     */
    public java.lang.String getElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "element" attribute
     */
    public org.apache.xmlbeans.XmlString xgetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELEMENT$4);
            return target;
        }
    }
    
    /**
     * True if has "element" attribute
     */
    public boolean isSetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ELEMENT$4) != null;
        }
    }
    
    /**
     * Sets the "element" attribute
     */
    public void setElement(java.lang.String element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEMENT$4);
            }
            target.setStringValue(element);
        }
    }
    
    /**
     * Sets (as xml) the "element" attribute
     */
    public void xsetElement(org.apache.xmlbeans.XmlString element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELEMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELEMENT$4);
            }
            target.set(element);
        }
    }
    
    /**
     * Unsets the "element" attribute
     */
    public void unsetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ELEMENT$4);
        }
    }
    
    /**
     * Gets the "min" attribute
     */
    public java.lang.String getMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "min" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIN$6);
            return target;
        }
    }
    
    /**
     * True if has "min" attribute
     */
    public boolean isSetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MIN$6) != null;
        }
    }
    
    /**
     * Sets the "min" attribute
     */
    public void setMin(java.lang.String min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$6);
            }
            target.setStringValue(min);
        }
    }
    
    /**
     * Sets (as xml) the "min" attribute
     */
    public void xsetMin(org.apache.xmlbeans.XmlString min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MIN$6);
            }
            target.set(min);
        }
    }
    
    /**
     * Unsets the "min" attribute
     */
    public void unsetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MIN$6);
        }
    }
    
    /**
     * Gets the "max" attribute
     */
    public java.lang.String getMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "max" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAX$8);
            return target;
        }
    }
    
    /**
     * True if has "max" attribute
     */
    public boolean isSetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAX$8) != null;
        }
    }
    
    /**
     * Sets the "max" attribute
     */
    public void setMax(java.lang.String max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$8);
            }
            target.setStringValue(max);
        }
    }
    
    /**
     * Sets (as xml) the "max" attribute
     */
    public void xsetMax(org.apache.xmlbeans.XmlString max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAX$8);
            }
            target.set(max);
        }
    }
    
    /**
     * Unsets the "max" attribute
     */
    public void unsetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAX$8);
        }
    }
    
    /**
     * Gets the "values" attribute
     */
    public java.lang.String getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUES$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "values" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUES$10);
            return target;
        }
    }
    
    /**
     * True if has "values" attribute
     */
    public boolean isSetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUES$10) != null;
        }
    }
    
    /**
     * Sets the "values" attribute
     */
    public void setValues(java.lang.String values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUES$10);
            }
            target.setStringValue(values);
        }
    }
    
    /**
     * Sets (as xml) the "values" attribute
     */
    public void xsetValues(org.apache.xmlbeans.XmlString values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUES$10);
            }
            target.set(values);
        }
    }
    
    /**
     * Unsets the "values" attribute
     */
    public void unsetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUES$10);
        }
    }
    
    /**
     * Gets the "pattern" attribute
     */
    public java.lang.String getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERN$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pattern" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATTERN$12);
            return target;
        }
    }
    
    /**
     * True if has "pattern" attribute
     */
    public boolean isSetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATTERN$12) != null;
        }
    }
    
    /**
     * Sets the "pattern" attribute
     */
    public void setPattern(java.lang.String pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATTERN$12);
            }
            target.setStringValue(pattern);
        }
    }
    
    /**
     * Sets (as xml) the "pattern" attribute
     */
    public void xsetPattern(org.apache.xmlbeans.XmlString pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATTERN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATTERN$12);
            }
            target.set(pattern);
        }
    }
    
    /**
     * Unsets the "pattern" attribute
     */
    public void unsetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATTERN$12);
        }
    }
    
    /**
     * Gets the "fractionDigits" attribute
     */
    public java.math.BigInteger getFractionDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRACTIONDIGITS$14);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "fractionDigits" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetFractionDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(FRACTIONDIGITS$14);
            return target;
        }
    }
    
    /**
     * True if has "fractionDigits" attribute
     */
    public boolean isSetFractionDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRACTIONDIGITS$14) != null;
        }
    }
    
    /**
     * Sets the "fractionDigits" attribute
     */
    public void setFractionDigits(java.math.BigInteger fractionDigits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRACTIONDIGITS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRACTIONDIGITS$14);
            }
            target.setBigIntegerValue(fractionDigits);
        }
    }
    
    /**
     * Sets (as xml) the "fractionDigits" attribute
     */
    public void xsetFractionDigits(org.apache.xmlbeans.XmlNonNegativeInteger fractionDigits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(FRACTIONDIGITS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(FRACTIONDIGITS$14);
            }
            target.set(fractionDigits);
        }
    }
    
    /**
     * Unsets the "fractionDigits" attribute
     */
    public void unsetFractionDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRACTIONDIGITS$14);
        }
    }
    
    /**
     * Gets the "totalDigits" attribute
     */
    public java.math.BigInteger getTotalDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALDIGITS$16);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalDigits" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetTotalDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(TOTALDIGITS$16);
            return target;
        }
    }
    
    /**
     * True if has "totalDigits" attribute
     */
    public boolean isSetTotalDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALDIGITS$16) != null;
        }
    }
    
    /**
     * Sets the "totalDigits" attribute
     */
    public void setTotalDigits(java.math.BigInteger totalDigits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALDIGITS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALDIGITS$16);
            }
            target.setBigIntegerValue(totalDigits);
        }
    }
    
    /**
     * Sets (as xml) the "totalDigits" attribute
     */
    public void xsetTotalDigits(org.apache.xmlbeans.XmlPositiveInteger totalDigits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(TOTALDIGITS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(TOTALDIGITS$16);
            }
            target.set(totalDigits);
        }
    }
    
    /**
     * Unsets the "totalDigits" attribute
     */
    public void unsetTotalDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALDIGITS$16);
        }
    }
}
