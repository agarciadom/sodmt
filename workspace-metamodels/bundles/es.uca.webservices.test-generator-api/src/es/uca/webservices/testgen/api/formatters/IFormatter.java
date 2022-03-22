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
package es.uca.webservices.testgen.api.formatters;

import java.io.OutputStream;

/**
 * Interface that handles the output prototype
 *
 */
public interface IFormatter {

    /**
     * Start suite
     */
    void suiteStart();

    /**
     * End suite
     */
    void suiteEnd();

    /**
     * Start test
     */
    void testStart();

    /**
     * End test
     */
    void testEnd();

    /**
     * Save the result of IFormatter
     * @param os 
     */
    void save(OutputStream os);

    /**
     * Add a value for the variable
     * @param variable
     * @param val 
     */
    void valueFor(String variable, Object val);

    /**
     * Converts the object to a string representation for this file format.
     * This method should handle at least all the return values of the operations
     * in the {@link IGenerator} interface.
     * 
     * @param o Value to be formatted to a string.
     * @return String representation, to be used as one of the values for a test.
     * @see IGenerator
     */
    String format(Object o);
}
