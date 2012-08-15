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
package es.uca.webservices.testgen.api.parsers;

/**
 * Exception thrown from the parsers in TestGenerator.
 *
 * TODO: add location field and use it for better error reporting.
 */
public class ParserException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor from a string
     *
     * @param message
     *            The message string
     */
    public ParserException(String message) {
        super(message);
    }

    /**
     * Constructor from an exception
     * @param e 
     */
    public ParserException(Throwable e) {
        super(e);
    }

    /**
     * Constructor from a String and an Exception
     * @param message
     * @param e
     */
	public ParserException(String message, Throwable e) {
		super(message, e);
	}

}
