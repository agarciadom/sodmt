/*
 *  Copyright 2011 Miguel Ángel Pérez Montero (miguelangel.perezmontero@alum.uca.es).
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
package es.uca.webservices.testgen.formatters;

import es.uca.webservices.testgen.api.generators.IGenerator;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Prototype CSV formatted output
 * @author migue
 */
public class CSVFormatter extends AbstractFormatter {

    /**
     * Save the result of CSVFormatter
     * @param os 
     */
    @SuppressWarnings("rawtypes")
	@Override
    public void save(OutputStream os) {
        final PrintWriter bw = new PrintWriter(new OutputStreamWriter(os));
        boolean variableFirst = true;
        boolean valueFirst = true;
        StringBuilder variables = new StringBuilder();
        List<StringBuilder> vals = new ArrayList<StringBuilder>();

        for (Map.Entry<String, List> entry : this.getValues().entrySet()) {
            if (!variableFirst) {
                variables.append(", ");
            }
            variableFirst = false;
            variables.append(entry.getKey());
            final List<?> value = entry.getValue();
            if (valueFirst) {
                for (int i = 0; i < value.size(); ++i) {//recorro la lista de valores porque en formato csv no es una lista de valores, sino un valor por línea
                    StringBuilder val = new StringBuilder();
                    vals.add(val.append(format(value.get(i))));
                }
                valueFirst = false;

            } else {
                for (int i = 0; i < value.size(); ++i) {//recorro la lista de valores porque en formato csv no es una lista de valores, sino un valor por línea
                    StringBuilder val = new StringBuilder("");
                    val.append(vals.get(i));
                    vals.set(i, val.append(", ").append(format(value.get(i))));
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sBuild : vals) {
            result.append(sBuild).append("\n");
        }
        bw.println(variables.toString() + "\n" + result.toString());
        bw.flush();
    }

    /**
     * Converts the object to a string representation for this file format.
     * This method should handle at least all the return values of the operations
     * in the {@link IGenerator} interface.
     * 
     * @param o Value to be formatted to a string.
     * @return String representation, to be used as one of the values for a test.
     * @see IGenerator
     */
    @Override
    public String format(Object o) {
        if (o instanceof String) {
            return "\"" + o + "\"";
        } else if (o instanceof XMLGregorianCalendar) {
            final XMLGregorianCalendar calendar = (XMLGregorianCalendar) o;
            return "\"" + calendar.toXMLFormat() + "\"";
        } else if (o instanceof Duration) {
            final Duration duration = (Duration) o;
            return "\"" +duration.toString() + "\"";
        } else if (o instanceof List) {
            throw new UnsupportedOperationException("List and tuples unsupported with format CSV");
        } else {
            return o.toString();
        }
    }
}
