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

import java.util.ArrayList;
import java.util.List;

import es.uca.webservices.testgen.api.generators.IGenerator;


/**
 * Class that represents String
 *
 */
public class TypeString extends AbstractType {

    private static final int HASH = 7;
    private static final int HASHM = 17;
    private static final int DEFAULT_MAXLENGTH = 20;
    private List<String> listValues = new ArrayList<String>(); // store the list of allowed values
    private String pattern = ""; // store the regex
    private int maxLength = DEFAULT_MAXLENGTH;
    private int minLength = 0;

    /**
     * Default constructor
     */
    public TypeString() {
    }

    /**
     * Build a TypeString with a list of valid values
     * @param listValues 
     */
    public TypeString(List<String> listValues) {
        this.listValues = listValues;
    }

    /**
     * Build a TypeString with a regx
     * @param pattern 
     */
    public TypeString(String pattern) {
        this.pattern = pattern;
    }

    /**
     * Generates an instance of the proper IType, using double dispatch.
     * @param abstractType Type of the value to be generated.
     * @return Generated instance of the specified type.
     */
    @Override
    public Object generate(IGenerator generator) {
        return generator.generate(this);
    }

    /**
     * Return true if the objects are equal
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeString)) {
            return false;
        }
        final TypeString tString = (TypeString) o;
        return this.listValues.equals(tString.getListValues()) && this.pattern.equals(tString.getPattern()) 
                && this.maxLength == tString.getMaxLength() && this.minLength == tString.getMinLength();
    }

    @Override
    public int hashCode() {
        int hash = HASH;
        hash = HASHM * hash + (this.listValues != null ? this.listValues.hashCode() : 0);
        hash = HASHM * hash + (this.pattern != null ? this.pattern.hashCode() : 0);
        hash = HASHM * hash + this.maxLength;
        hash = HASHM * hash + this.minLength;
        return hash;
    }

    @Override
	public String toString() {
		return "TypeString [listValues=" + listValues + ", pattern=" + pattern
				+ ", maxLength=" + maxLength + ", minLength=" + minLength + "]";
	}

	/**
     * @return the listValues
     */
    @SuppressWarnings("rawtypes")
    public List getListValues() {
        return listValues;
    }

    /**
     * @return the pattern
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * checks if it contains pattern
     * @return 
     */
    public boolean isSetPattern() {
        return !pattern.equals("");
    }

    /**
     * Return the maximum lenght of the string
     * @return the maxLength
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * Set the maximum lenght of the string
     * @param maxLength the maxLength to set
     */
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * Return the minimum lenght of the string
     * @return the minLength
     */
    public int getMinLength() {
        return minLength;
    }

    /**
     * Set the minimum lenght of the string
     * @param minLength the minLength to set
     */
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
}
