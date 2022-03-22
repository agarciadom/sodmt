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
 * Class that represents the List
 *
 */
public class TypeList extends AbstractType {

    private static final int HASH = 5;
    private static final int HASHM = 41;
    private static final int DEFAULT_MAXLENGTH = 100; // Maximum number of elements by default
    private static final int DEFAULT_MINLENGTH = 1;
	private IType type;
    private int minNumElement;
    private int maxNumElement;

    /**
     * Contructor TypeList with the specified IType and set minimum and maximum number of elements
     * @param type
     * @param minNumElement
     * @param maxNumElement 
     */
    public TypeList(IType type, int minNumElement, int maxNumElement) {
        this.type = type;
        this.minNumElement = minNumElement;
        this.maxNumElement = maxNumElement;
    }

    /**
     * Contructor TypeList with the specified IType and set minimum number of elements
     * @param type
     * @param minNumElement 
     */
    public TypeList(IType type, int minNumElement) {
    	this(type, minNumElement, DEFAULT_MAXLENGTH);
    }

    /**
     * Consructor TypeList with the specified IType
     * @param type 
     */
    public TypeList(IType type) {
    	this(type, DEFAULT_MINLENGTH, DEFAULT_MAXLENGTH);
    }

    /**
     * Return the IType
     * @return the type
     */
    public IType getType() {
        return type;
    }

    /**
     * Return the minimum number the elements
     * @return the minNumElement
     */
    public int getMinNumElement() {
        return minNumElement;
    }

    /**
     * Return the maximum number of the elements
     * @return the maxNumElemnet
     */
    public int getMaxNumElement() {
        return maxNumElement;
    }

    @Override
    public int hashCode() {
        int hash = HASH;
        hash = HASHM * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = HASHM * hash + this.minNumElement;
        hash = HASHM * hash + this.maxNumElement;
        return hash;
    }

    /**
     * Return true if the objects are equals
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeList)) {
            return false;
        }
        final TypeList tList = (TypeList) o;
        return tList == this || (tList.getType().equals(type)
                && tList.getMaxNumElement() == maxNumElement
                && tList.getMinNumElement() == minNumElement);
    }

    /**
     * Generates an instance of the proper IType, using double dispatch.
     * @param abstractType Type of the value to be generated.
     * @return Generated instance of the specified type.
     */
    @Override
    public Object generate(IGenerator generator) throws GenerationException {
        return generator.generate(this);
    }
}
