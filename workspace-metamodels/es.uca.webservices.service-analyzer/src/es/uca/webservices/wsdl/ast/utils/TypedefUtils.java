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
package es.uca.webservices.wsdl.ast.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import serviceAnalyzer.messageCatalog.TypeTypedef;

/**
 * Utility methods for handling typedefs
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public final class TypedefUtils {

    private static final String VALUES_OPEN = "";
    private static final String VALUES_CLOSE = "";
    private static final String VALUES_SEPARATOR = ",";
    private static final String ELEMENTS_OPEN = "";
    private static final String ELEMENTS_CLOSE = "";
    private static final String ELEMENTS_SEPARATOR = ",";

    private TypedefUtils() {
    }

    ;

    /**
     * Returns true if two typedefs represents the same type
     * @param a The first typedef
     * @param b The second typedef
     * @return true if a and b represents the same type
     */
    public static Boolean equals(TypeTypedef a, TypeTypedef b) {
        return (a.getType() == b.getType())
                && (a.getElement() == null ? b.getElement() == null : a.getElement().equals(b.getElement()))
                && (a.getMin() == null ? b.getMin() == null : a.getMin().equals(b.getMin()))
                && (a.getMax() == null ? b.getMax() == null : a.getMax().equals(b.getMax()))
                && (a.getValues() == null ? b.getValues() == null : a.getValues().equals(b.getValues()));
    }

    /**
     * Returns the string that represents the value of the element attribute of a typedef
     * @param elements The list of values
     * @return The string that represents the value of the element attribute of a typedef
     */
    public static String getElementsString(String[] elements) {
        return new ValuesList(elements, ELEMENTS_SEPARATOR, ELEMENTS_OPEN, ELEMENTS_CLOSE).toString();
    }

    /**
     * Returns an array with the elements corresponding with the elements string representation
     * @param elements The elements string representation
     * @return The array with the elements separated
     */
    public static String[] getElementsArray(String elements) {
        return new ValuesList(elements, ELEMENTS_SEPARATOR, ELEMENTS_OPEN, ELEMENTS_CLOSE).getValues();
    }

    /**
     * Returns the string that represents the value of the "values" attribute of a typedef
     * @param values The list of values
     * @return The string that represents the value of the "values" attribute of a typedef
     */
    public static String getValuesString(String[] values) {
        return new ValuesList(values, VALUES_SEPARATOR, VALUES_OPEN, VALUES_CLOSE).toString();
    }

    /**
     * Returns an array with the values corresponding with the values string representation
     * @param values The values string representation
     * @return The array with the values separated
     */
    public static String[] getValuesArray(String values) {
        return new ValuesList(values, VALUES_SEPARATOR, VALUES_OPEN, VALUES_CLOSE).getValues();
    }

    /**
     * Returns true if both elements array are equivalents
     * @param a The first elements array
     * @param b The second elements array
     * @return True if a and b are equivalents
     */
    public static Boolean equalsElements(String[] a, String[] b) {
        boolean equals = true;
        int i = 0;
        if (a.length != b.length) {
            equals = false;
        } else {
            while (i < a.length && equals) {
                if (a[i].compareTo(b[i]) != 0) {
                    equals = false;
                }
                ++i;
            }
        }

        return equals;
    }

    /**
     * Returns true if both values array are equivalents (order doesn't matters)
     * @param a The first values array
     * @param b The second values array
     * @return True if a and b are equivalents
     */
    public static Boolean equalsValues(String[] a, String[] b) {
        boolean equals = true;
        int i = 0;
        if (a.length != b.length) {
            equals = false;
        } else {
            List<String> lb = new ArrayList<String>(Arrays.asList(b));
            while (i < a.length && equals) {
                if (!lb.remove(a[i])) {
                    equals = false;
                }
                ++i;
            }
        }

        return equals;
    }
}
