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
package es.uca.webservices.testgen.parsers;

/**
 * Enumeration of possible directions for a message: input, output or fault. 
 */
public enum MessageDirection {
	IN, OUT, ERR;

	/**
	 * Converts a regular string into the appropriate member of the MessageDirection enumeration.
	 * @param direction Direction as a regular string.
	 * @return Corresponding element of the {@link MessageDirection} enumeration.
	 * 
	 */
	public static MessageDirection fromString(String direction) {
		if ("IN".equals(direction)) {
		    return IN;
		} else if ("OUT".equals(direction)) {
		    return OUT;
		} else if ("ERR".equals(direction)) {
		    return ERR;
		} else {
		    throw new IllegalArgumentException("'" + direction + "' is not a valid message direction (IN, OUT or ERR)");
		}
	}
}
