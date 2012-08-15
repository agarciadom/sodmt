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

/**
 * Represents a list of string values with a concrete output format
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class ValuesList {

    private String separator, open, close;
    private String[] values;

    /**
     * Constructor
     * @param values The array of values of the list
     * @param separator The separator of the values
     * @param open The list left limit
     * @param close The list right limit
     */
    public ValuesList(String[] values, String separator, String open, String close) {
        this.values = (String[]) values.clone();
        this.separator = separator;
        this.open = open;
        this.close = close;
    }

    /**
     * Constructor
     * @param values The formated values of the list
     * @param separator The separator of the values
     * @param open The list left limit
     * @param close The list right limit
     */
    public ValuesList(String valuesList, String separator, String open, String close) {
        String vl = valuesList;
        this.separator = separator;
        this.open = open;
        this.close = close;
        vl = vl.trim();
        if (vl.startsWith(open) && vl.endsWith(close)) {
            vl = vl.substring(open.length(), vl.length() - close.length());
        }
        // else exception
        String[] valuesArray = vl.split(this.separator);
        this.values = new String[valuesArray.length];
        for (int i = 0; i < valuesArray.length; ++i) {
            this.values[i] = valuesArray[i].trim();
        }
    }

    /**
     * Sets the array of values
     * @param values The array of values
     */
    public void setValues(String[] values) {
        this.values = (String []) values.clone();
    }

    /**
     * Gets the values of the list in an array
     * @return The values of the list in an array
     */
    public String[] getValues() {
        return (String[]) this.values.clone();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(open);
        for (int i = 0; i < values.length - 1; ++i) {
            result.append(values[i]);
            result.append(separator);

        }
        result.append(values[values.length - 1]);
        result.append(close);

        return result.toString();
    }
}
