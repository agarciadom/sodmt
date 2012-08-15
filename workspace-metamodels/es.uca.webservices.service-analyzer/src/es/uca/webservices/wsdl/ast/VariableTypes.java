/*
 *  Copyright 2010 Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es).
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package es.uca.webservices.wsdl.ast;

import es.uca.webservices.bpel.util.Pair;
import es.uca.webservices.wsdl.ast.utils.TypedefUtils;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.GDate;
import org.apache.xmlbeans.GDateBuilder;
import org.apache.xmlbeans.GDuration;
import org.apache.xmlbeans.GDurationBuilder;
import org.apache.xmlbeans.GDurationSpecification;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlDate;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDecimal;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlDuration;
import org.apache.xmlbeans.XmlFloat;
import org.apache.xmlbeans.XmlGDay;
import org.apache.xmlbeans.XmlGMonth;
import org.apache.xmlbeans.XmlGMonthDay;
import org.apache.xmlbeans.XmlGYear;
import org.apache.xmlbeans.XmlGYearMonth;
import org.apache.xmlbeans.XmlTime;
import serviceAnalyzer.messageCatalog.TypeGA;
import serviceAnalyzer.messageCatalog.TypeGA.Enum;
import serviceAnalyzer.messageCatalog.TypeTypedef;

/**
 * This class is like a translator between XML Schema types and the types defined for the message catalog
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public final class VariableTypes {

    private static final String ANONYMOUS = null;
    private static final String XML_SCHEMA_NS = "http://www.w3.org/2001/XMLSchema";
    private static final Map<String, Integer> EQUIVALENCES = createMapEQUIVALENCES();

    private VariableTypes() {
    }

    private static Map<String, Integer> createMapEQUIVALENCES() {
        Map<String, Integer> eq = new HashMap<String, Integer>();
        eq.put("duration", SchemaType.BTC_DURATION);
        eq.put("dateTime", SchemaType.BTC_DATE_TIME);
        eq.put("time", SchemaType.BTC_TIME);
        eq.put("date", SchemaType.BTC_DATE);
        eq.put("gYearMonth", SchemaType.BTC_G_YEAR_MONTH);
        eq.put("gYear", SchemaType.BTC_G_YEAR);
        eq.put("gMonthDay", SchemaType.BTC_G_MONTH_DAY);
        eq.put("gDay", SchemaType.BTC_G_DAY);
        eq.put("gMonth", SchemaType.BTC_G_MONTH);
        eq.put("boolean", SchemaType.BTC_BOOLEAN);
        eq.put("string", SchemaType.BTC_STRING);
        eq.put("base64Binary", SchemaType.BTC_BASE_64_BINARY);
        eq.put("anyURI", SchemaType.BTC_ANY_URI);
        eq.put("NOTATION", SchemaType.BTC_NOTATION);
        eq.put("normalizedString", SchemaType.BTC_NORMALIZED_STRING);
        eq.put("token", SchemaType.BTC_TOKEN);
        eq.put("ID", SchemaType.BTC_ID);
        eq.put("IDREF", SchemaType.BTC_IDREF);
        eq.put("ENTITY", SchemaType.BTC_ENTITY);
        eq.put("hexBinary", SchemaType.BTC_HEX_BINARY);
        eq.put("decimal", SchemaType.BTC_DECIMAL);
        eq.put("integer", SchemaType.BTC_INTEGER);
        eq.put("int", SchemaType.BTC_INT);
        eq.put("float", SchemaType.BTC_FLOAT);
        eq.put("double", SchemaType.BTC_DOUBLE);
        eq.put("nonPositiveInteger", SchemaType.BTC_NON_POSITIVE_INTEGER);
        eq.put("negativeInteger", SchemaType.BTC_NEGATIVE_INTEGER);
        eq.put("long", SchemaType.BTC_LONG);
        eq.put("short", SchemaType.BTC_SHORT);
        eq.put("byte", SchemaType.BTC_BYTE);
        eq.put("nonNegativeInteger", SchemaType.BTC_NON_NEGATIVE_INTEGER);
        eq.put("unsignedLong", SchemaType.BTC_UNSIGNED_LONG);
        eq.put("unsignedInt", SchemaType.BTC_UNSIGNED_INT);
        eq.put("unsignedShort", SchemaType.BTC_UNSIGNED_SHORT);
        eq.put("unsignedByte", SchemaType.BTC_UNSIGNED_BYTE);
        eq.put("positiveInteger", SchemaType.BTC_POSITIVE_INTEGER);
        eq.put("QName", SchemaType.BTC_QNAME);
        eq.put("Name", SchemaType.BTC_NAME);
        eq.put("NCName", SchemaType.BTC_NCNAME);
        eq.put("NMTOKEN", SchemaType.BTC_NMTOKEN);
        eq.put("language", SchemaType.BTC_LANGUAGE);
        eq.put("NMTOKENS", SchemaType.BTC_NMTOKENS);
        eq.put("ENTITIES", SchemaType.BTC_ENTITIES);
        eq.put("IDREFS", SchemaType.BTC_IDREFS);
        eq.put("anyType", SchemaType.BTC_ANY_TYPE);
        eq.put("anySimpleType", SchemaType.BTC_ANY_SIMPLE);
        return eq;
    }

    private static Pair<TypeGA.Enum, TypeTypedef> traductor(int typeCode) {
        TypeGA.Enum type = null;
        TypeTypedef typedef = null;

        switch (typeCode) {
            case SchemaType.BTC_DURATION:
                type = TypeGA.DURATION;
                break;
            case SchemaType.BTC_DATE_TIME:
                type = TypeGA.DATE_TIME;
                break;
            case SchemaType.BTC_TIME:
                type = TypeGA.TIME;
                break;
            case SchemaType.BTC_DATE:
            case SchemaType.BTC_G_YEAR_MONTH:
            case SchemaType.BTC_G_YEAR:
            case SchemaType.BTC_G_MONTH_DAY:
            case SchemaType.BTC_G_DAY:
            case SchemaType.BTC_G_MONTH:
                type = TypeGA.DATE;
                break;
            case SchemaType.BTC_BOOLEAN:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.STRING);
                typedef.setValues(TypedefUtils.getValuesString(new String[]{"true", "false"}));
                break;
            
            case SchemaType.BTC_ANY_TYPE:
            case SchemaType.BTC_ANY_SIMPLE:
            case SchemaType.BTC_STRING:
            case SchemaType.BTC_BASE_64_BINARY:
            case SchemaType.BTC_ANY_URI:
            case SchemaType.BTC_NOTATION:
            case SchemaType.BTC_NORMALIZED_STRING:
            case SchemaType.BTC_TOKEN:
            case SchemaType.BTC_ID:
            case SchemaType.BTC_IDREF:
            case SchemaType.BTC_ENTITY:
                type = TypeGA.STRING;
                break;
            case SchemaType.BTC_HEX_BINARY:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.STRING);
                typedef.setPattern("[0-9a-fA-F]+");
                break;

            case SchemaType.BTC_INTEGER:
            case SchemaType.BTC_INT:
                type = TypeGA.INT;
                break;

            case SchemaType.BTC_DECIMAL:
            	// 0.01 and 100.01 are decimal numbers as well: numbers which can
            	// be produced from multiplying an integer by 1 or a negative power
            	// of 10. Internally, TestGenerator uses decimals anyway, to ensure
            	// the min/max values are met.
            case SchemaType.BTC_FLOAT:
            case SchemaType.BTC_DOUBLE:
                type = TypeGA.FLOAT;
                break;

            case SchemaType.BTC_NON_POSITIVE_INTEGER:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMax("0");
                break;
            case SchemaType.BTC_NEGATIVE_INTEGER:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMax("-1");
                break;
            case SchemaType.BTC_LONG:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin(String.valueOf(Long.MIN_VALUE));
                typedef.setMax(String.valueOf(Long.MAX_VALUE));
                break;
            case SchemaType.BTC_SHORT:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin(String.valueOf(Short.MIN_VALUE));
                typedef.setMax(String.valueOf(Short.MAX_VALUE));
                break;
            case SchemaType.BTC_BYTE:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin(String.valueOf(Byte.MIN_VALUE));
                typedef.setMax(String.valueOf(Byte.MAX_VALUE));
                break;
            case SchemaType.BTC_NON_NEGATIVE_INTEGER:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin("0");
                break;
            case SchemaType.BTC_UNSIGNED_LONG:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin("0");
                typedef.setMax("18446744073709551615");
                break;
            case SchemaType.BTC_UNSIGNED_INT:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin("0");
                typedef.setMax("4294967295");
                break;
            case SchemaType.BTC_UNSIGNED_SHORT:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin("0");
                typedef.setMax("65535");
                break;
            case SchemaType.BTC_UNSIGNED_BYTE:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin("0");
                typedef.setMax("255");
                break;
            case SchemaType.BTC_POSITIVE_INTEGER:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.INT);
                typedef.setMin("1");
                break;

            case SchemaType.BTC_QNAME:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.STRING);
                typedef.setPattern("([a-zA-Z_][a-zA-Z_0-9.-]*:)?[a-zA-Z_][a-zA-Z_0-9.-]*");
                break;

            case SchemaType.BTC_NAME:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.STRING);
                typedef.setPattern("\\i\\c*");
                break;

            case SchemaType.BTC_NCNAME:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.STRING);
                typedef.setPattern("[\\i-[:]][\\c-[:]]*");
                break;

            case SchemaType.BTC_NMTOKEN:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.STRING);
                typedef.setPattern("\\c+");
                break;

            case SchemaType.BTC_LANGUAGE:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.STRING);
                typedef.setPattern("[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*");
                break;

            case SchemaType.BTC_NMTOKENS:
            case SchemaType.BTC_ENTITIES:
            case SchemaType.BTC_IDREFS:
                typedef = TypeTypedef.Factory.newInstance();
                typedef.setName(ANONYMOUS);
                typedef.setType(TypeGA.LIST);
                typedef.setElement(TypeGA.STRING.toString());
                typedef.setMin("1");
                break;
            case SchemaType.BTC_NOT_BUILTIN:
            default:
                throw new UnsupportedOperationException();
        }

        return new Pair<Enum, TypeTypedef>(type, typedef);
    }

    /**
     * Returns a pair with the message catalog type corresponding to a XML Schema type bult-in type given by his QName
     * @param qtype The QName of the XML Schema built-in type
     * @return The pair. The left element is null if the type has restrictions. The right element is null if it's a primitive type
     */
    public static Pair<TypeGA.Enum, TypeTypedef> primitiveType2CatalogType(QName qtype) {
        if (XML_SCHEMA_NS.equals(qtype.getNamespaceURI())
                && EQUIVALENCES.containsKey(qtype.getLocalPart())) {
            return traductor(EQUIVALENCES.get(qtype.getLocalPart()));
        } else {
            return traductor(SchemaType.BTC_NOT_BUILTIN);
        }
    }

    /**
     * Returns a pair with the message catalog type corresponding to a XML Schema type
     * @param stype The SchemaType
     * @return The pair. The left element is null if the type has restrictions. The right element is null if it's a primitive type
     */
    public static Pair<TypeGA.Enum, TypeTypedef> primitiveType2CatalogType(SchemaType stype) {
        TypeGA.Enum type = null;
        TypeTypedef typedef = null;
        SchemaType st = stype;

        Pair<TypeGA.Enum, TypeTypedef> pair = traductor(st.getBuiltinTypeCode() != SchemaType.BTC_NOT_BUILTIN ? st.getBuiltinTypeCode() : st.getPrimitiveType().getBuiltinTypeCode());

        type = pair.getLeft();
        typedef = pair.getRight();

        if (hasRestrictions(st)) {
            if (typedef == null) {
                typedef = getTypedefWithRestrictions(st, type, null);
                type = null;
            } else {
                addRestrictions(st, typedef);
            }
        }

        while (!st.isBuiltinType()) {
            st = st.getBaseType();
        }

        if (st.getBuiltinTypeCode() == SchemaType.BTC_INT || isDerived(st, SchemaType.BTC_INT)) {
            if (String.valueOf(Integer.MIN_VALUE).compareTo(typedef.getMin()) == 0) {
                typedef.unsetMin();
            }
            if (String.valueOf(Integer.MAX_VALUE).compareTo(typedef.getMax()) == 0) {
                typedef.unsetMax();
            }
            if (!hasRestrictions(typedef)) {
                type = TypeGA.INT;
                typedef = null;
            }
        }

        if ((st.getBuiltinTypeCode() == SchemaType.BTC_INTEGER || isDerived(st, SchemaType.BTC_INTEGER))
                && (typedef.getFractionDigits() == BigInteger.valueOf(0))) {

            typedef.unsetFractionDigits();
            type = TypeGA.INT;

            if (!hasRestrictions(typedef)) {
                typedef = null;
            }
        }

        return new Pair<Enum, TypeTypedef>(type, typedef);
    }

    private static Boolean hasRestrictions(SchemaType sType) {
        Boolean hasRest = false;

        int i = 0,
                lastFacet = SchemaType.FACET_PATTERN;

        while (i <= lastFacet && !hasRest) {
            if (i != SchemaType.FACET_WHITE_SPACE && sType.getFacet(i) != null) {
                hasRest = true;
            }
            ++i;
        }

        if (sType.hasPatternFacet()) {

            String[] pat = sType.getPatterns();
            if (pat.length > 0) {
                hasRest = true;
            }
        }

        XmlAnySimpleType[] enumValues = sType.getEnumerationValues();
        if (enumValues != null && enumValues.length > 0) {
            hasRest = true;
        }

        return hasRest;
    }

    private static Boolean hasRestrictions(TypeTypedef typedef) {
        Boolean hasRest = false;

        if (typedef.isSetElement() || typedef.isSetFractionDigits() || typedef.isSetMax()
                || typedef.isSetMin() || typedef.isSetPattern() || typedef.isSetTotalDigits()
                || typedef.isSetValues()) {
            hasRest = true;
        }

        return hasRest;
    }

    private static Boolean isDerived(SchemaType sType, int superType) {
        Boolean isDeriv = false;
        SchemaType st = sType;

        while (st.getBaseType() != null && !isDeriv) {
            st = st.getBaseType();

            if (st.getBuiltinTypeCode() == superType) {
                isDeriv = true;
            }
        }

        return isDeriv;
    }

    private static TypeTypedef getTypedefWithRestrictions(SchemaType sType, TypeGA.Enum type, String element) {
        TypeTypedef typedef = TypeTypedef.Factory.newInstance();

        typedef.setName(ANONYMOUS);
        typedef.setType(type);

        if (element != null) {
            typedef.setElement(element);
        }

        setFacetRestrictions(sType, typedef);
        setEnumRestrictions(sType, typedef);

        return typedef;
    }

    private static void addRestrictions(SchemaType sType, TypeTypedef typedef) {
        setFacetRestrictions(sType, typedef);
        setEnumRestrictions(sType, typedef);
    }

    /**
     * Sets the corresponding restrictions of the SchemaType to the typedef
     * @param sType The SchemaType
     * @param typedef The typedef
     */
    public static void setFacetRestrictions(SchemaType sType, TypeTypedef typedef) {
        XmlDecimal facetValue;

        facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_LENGTH);
        if (facetValue != null) {
            typedef.setMin(facetValue.getBigDecimalValue().toString());
            typedef.setMax(typedef.getMin());
        }

        setMinMaxRestrictions(sType, typedef);

        facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_MIN_LENGTH);
        if (facetValue != null) {
            typedef.setMin(facetValue.getBigDecimalValue().toString());
        }

        facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_MAX_LENGTH);
        if (facetValue != null) {
            typedef.setMax(facetValue.getBigDecimalValue().toString());
        }

        facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_FRACTION_DIGITS);
        if (facetValue != null) {
            typedef.setFractionDigits(facetValue.getBigDecimalValue().toBigInteger());
        }

        facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_TOTAL_DIGITS);
        if (facetValue != null) {
            typedef.setTotalDigits(facetValue.getBigDecimalValue().toBigInteger());
        }

        if (sType.hasPatternFacet()) {
            String[] pat = sType.getPatterns();
            for (int i = 0; i < pat.length; ++i) {
                typedef.setPattern(pat[i]);
            }
        }
    }

    /**
     * Sets min y max corresponding restrictions of the SchemaType to the typedef
     * @param sType The SchemaType
     * @param typedef The typedef
     */
    public static void setMinMaxRestrictions(SchemaType sType, TypeTypedef typedef) {
        if (sType.getPrimitiveType() == null) {
            return;
        }
        switch (sType.getPrimitiveType().getBuiltinTypeCode()) {
            case SchemaType.BTC_DECIMAL: {
                XmlDecimal facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(facetValue.getBigDecimalValue().toString());
                }

                facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getBigDecimalValue().toBigInteger().add(BigInteger.ONE)));
                }

                facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(facetValue.getBigDecimalValue().toString());
                }

                facetValue = (XmlDecimal) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getBigDecimalValue().toBigInteger().subtract(BigInteger.ONE)));
                }
                break;
            }
            case SchemaType.BTC_FLOAT: {
                XmlFloat facetValue = (XmlFloat) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getFloatValue()));
                }

                facetValue = (XmlFloat) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getFloatValue() + 1));
                }

                facetValue = (XmlFloat) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getFloatValue()));
                }

                facetValue = (XmlFloat) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getFloatValue() - 1));
                }
                break;
            }
            case SchemaType.BTC_DOUBLE: {
                XmlDouble facetValue = (XmlDouble) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getDoubleValue()));
                }

                facetValue = (XmlDouble) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getDoubleValue() + 1));
                }

                facetValue = (XmlDouble) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getDoubleValue()));
                }

                facetValue = (XmlDouble) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getDoubleValue() - 1));
                }
                break;
            }
            case SchemaType.BTC_DURATION: {
                XmlDuration facetValue = (XmlDuration) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlDuration) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {

                    GDuration d = facetValue.getGDurationValue();
                    d = d.add((GDurationSpecification) new GDurationBuilder("P0Y0M0DT0H0M1S"));
                    typedef.setMin(String.valueOf(d));
                }
                facetValue = (XmlDuration) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlDuration) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    GDuration d = facetValue.getGDurationValue();
                    d = d.subtract((GDurationSpecification) new GDurationBuilder("P0Y0M0DT0H0M1S"));
                    typedef.setMax(String.valueOf(d));
                }
                break;
            }
            case SchemaType.BTC_DATE_TIME: {
                XmlDateTime facetValue = (XmlDateTime) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlDateTime) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {

                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.MILLISECOND, 1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_DATE_TIME);
                    typedef.setMin(String.valueOf(g));
                }
                facetValue = (XmlDateTime) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlDateTime) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.MILLISECOND, -1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_DATE_TIME);
                    typedef.setMax(String.valueOf(g));
                }
                break;
            }
            case SchemaType.BTC_TIME: {
                XmlTime facetValue = (XmlTime) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlTime) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {
                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.MILLISECOND, 1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_TIME);
                    typedef.setMin(String.valueOf(g));
                }
                facetValue = (XmlTime) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlTime) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.MILLISECOND, -1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_TIME);
                    typedef.setMax(String.valueOf(c));
                }
                break;
            }
            case SchemaType.BTC_DATE: {
                XmlDate facetValue = (XmlDate) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlDate) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {
                    GDate d = facetValue.getGDateValue();
                    d = d.add((GDurationSpecification) new GDurationBuilder("P0Y0M1DT0H0M0S"));
                    typedef.setMin(String.valueOf(d));
                }
                facetValue = (XmlDate) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlDate) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    GDate d = facetValue.getGDateValue();
                    d = d.subtract((GDurationSpecification) new GDurationBuilder("P0Y0M1DT0H0M0S"));
                    typedef.setMax(String.valueOf(d));
                }
                break;
            }
            case SchemaType.BTC_G_YEAR_MONTH: {
                XmlGYearMonth facetValue = (XmlGYearMonth) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGYearMonth) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {

                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.MONTH, 1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_YEAR_MONTH);
                    typedef.setMin(String.valueOf(g));
                }
                facetValue = (XmlGYearMonth) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGYearMonth) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.MONTH, -1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_YEAR_MONTH);
                    typedef.setMax(String.valueOf(g));
                }
                break;
            }
            case SchemaType.BTC_G_YEAR: {
                XmlGYear facetValue = (XmlGYear) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGYear) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {

                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.YEAR, 1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_YEAR);
                    typedef.setMin(String.valueOf(g));
                }
                facetValue = (XmlGYear) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGYear) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.YEAR, -1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_YEAR);
                    typedef.setMax(String.valueOf(g));
                }
                break;
            }
            case SchemaType.BTC_G_MONTH_DAY: {
                XmlGMonthDay facetValue = (XmlGMonthDay) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGMonthDay) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {

                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.DAY_OF_MONTH, 1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_MONTH_DAY);
                    typedef.setMin(String.valueOf(g));
                }
                facetValue = (XmlGMonthDay) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGMonthDay) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.DAY_OF_MONTH, -1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_MONTH_DAY);
                    typedef.setMax(String.valueOf(g));
                }
                break;
            }
            case SchemaType.BTC_G_DAY: {
                XmlGDay facetValue = (XmlGDay) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGDay) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {

                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.DAY_OF_MONTH, 1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_DAY);
                    typedef.setMin(String.valueOf(g));
                }
                facetValue = (XmlGDay) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGDay) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.DAY_OF_MONTH, -1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_DAY);
                    typedef.setMax(String.valueOf(g));
                }
                break;
            }
            case SchemaType.BTC_G_MONTH: {
                XmlGMonth facetValue = (XmlGMonth) sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMin(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGMonth) sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE);
                if (facetValue != null) {

                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.MONTH, 1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_MONTH);
                    typedef.setMin(String.valueOf(g));
                }
                facetValue = (XmlGMonth) sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE);
                if (facetValue != null) {
                    typedef.setMax(String.valueOf(facetValue.getStringValue()));
                }
                facetValue = (XmlGMonth) sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE);
                if (facetValue != null) {
                    Calendar c = facetValue.getCalendarValue();
                    c.add(Calendar.MONTH, -1);
                    GDateBuilder g = new GDateBuilder(c);
                    g.setBuiltinTypeCode(SchemaType.BTC_G_MONTH);
                    typedef.setMax(String.valueOf(g));
                }
                break;
            }
        }
    }

    /**
     * Sets the corresponding values restrictions of the SchemaType to the typedef
     * @param sType The SchemaType
     * @param typedef The typedef
     */
    public static void setEnumRestrictions(SchemaType sType, TypeTypedef typedef) {
        XmlAnySimpleType[] enumValues = sType.getEnumerationValues();

        if (enumValues != null && enumValues.length > 0) {
            String[] lValues = new String[enumValues.length];
            for (int i = 0; i < enumValues.length; ++i) {
                lValues[i] = enumValues[i].getStringValue();
            }
            typedef.setValues(TypedefUtils.getValuesString(lValues));
        }
    }

    /**
     * Gets The QName of the item's type of a Schema list derived built-in type
     * @param list The QName of a XML Schema list derived built-in type
     * @return The QName of the item's type of a Schema list derived built-in type
     */
    public static QName getItemElement(QName list) {
        QName item = null;
        if (XML_SCHEMA_NS.equals(list.getNamespaceURI())) {
            if ("NMTOKENS".equals(list.getLocalPart())) {
                item = new QName(XML_SCHEMA_NS, "NMTOKEN");
            } else if ("ENTITIES".equals(list.getLocalPart())) {
                item = new QName(XML_SCHEMA_NS, "ENTITY");
            } else if ("IDREFS".equals(list.getLocalPart())) {
                item = new QName(XML_SCHEMA_NS, "IDREF");
            }
        }
        return item;
    }

    /**
     * Return true if the QName represents a XML Schema list derived built-in type
     * @param list The QName of the XML Schema type
     * @return True if the QName represents a XML Schema list derived built-in type
     */
    public static Boolean isListDerivedType(QName list) {
        return XML_SCHEMA_NS.equals(list.getNamespaceURI())
                && ("NMTOKENS".equals(list.getLocalPart())
                || "ENTITIES".equals(list.getLocalPart())
                || "IDREFS".equals(list.getLocalPart()));
    }
}
