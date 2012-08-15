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
package es.uca.webservices.testgen.api.types;

import es.uca.webservices.testgen.api.generators.GenerationException;
import es.uca.webservices.testgen.api.generators.IGenerator;


/**
 * Interface to create the necessary types
 *
 * @author migue
 */
public interface IType {

    /**
     * Return the name of the type that represents
     *
     * @return
     */
    String getNameVariable();

    /**
     * Set the variable name
     * @param name 
     */
    void setNameVariable(String name);

    /**
     * Generates an instance of the proper IType, using double dispatch.
     * @param generator
     * @return
     * @throws GenerationException 
     */
    Object generate(IGenerator generator) throws GenerationException;
}
