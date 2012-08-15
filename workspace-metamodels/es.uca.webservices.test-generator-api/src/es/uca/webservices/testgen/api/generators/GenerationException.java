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
package es.uca.webservices.testgen.api.generators;

/**
 * Exception throw from the methods generate()
 */
public class GenerationException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
     * Constructor form a String
     * @param message 
     */
    public GenerationException(String message) {
        super(message);
    }

    /**
     * Constructor form a Throwable
     * @param e 
     */
    public GenerationException(Throwable e) {
        super(e);
    }

    /**
     * Contructor form String and Throwable
     * @param message
     * @param e 
     */
    public GenerationException(String message, Throwable e) {
        super(message, e);
    }
}
