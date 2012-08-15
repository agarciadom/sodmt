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
package es.uca.webservices.wsdl.analyzer;

/**
 * This class specifies that the content of the WSDL entry is not valid
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class InvalidWSDLContentsException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
     * Constructor from a String
     * @param message   The message string
     */
    public InvalidWSDLContentsException(String message) {
        super(message);
    }

    /**
     * Constructor from a Throwable object
     * @param cause     The Throwable object to be nested
     */
    public InvalidWSDLContentsException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor from a String and a Throwable object
     * @param message   The message string
     * @param cause        The throwable object
     */
    public InvalidWSDLContentsException(String message, Throwable cause) {
        super(message, cause);
    }
}
