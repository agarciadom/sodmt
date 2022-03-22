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

/**
 * Abstract class for the types
 * @author Miguel Ángel Pérez Montero
 */
public abstract class AbstractType implements IType {

    private String nameVariable;

    /**
     * Return variable name
     * @return the nameVariable
     */
    @Override
    public String getNameVariable() {
        return nameVariable;
    }

    /**
     * Set variable name
     * @param nameVariable the nameVariable to set
     */
    @Override
    public void setNameVariable(String nameVariable) {
        this.nameVariable = nameVariable;
    }
}