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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import es.uca.webservices.testgen.api.generators.IGenerator;


/**
 * Class that represents the integer
 *
 */
public class TypeInt extends AbstractType {

    private static final int HASH = 5;
    private static final int HASHM = 89;
    private static final int MINVALUEDEFECT = -100000000;
    private static final int MAXVALUEDEFECT = 100000000;
    private List<BigInteger> listValues = new ArrayList<BigInteger>();//save the lis of allowed values
    private BigInteger maxValue;
    private BigInteger minValue;
    private int totalDigits=0;

    /**
     * Default constructor
     */
    public TypeInt() {
        this.minValue = BigInteger.valueOf(MINVALUEDEFECT);
        this.maxValue = BigInteger.valueOf(MAXVALUEDEFECT);
    }
    
    /**
     * Build a TypeInt with a list of valid values
     * @param listValues 
     */
    public TypeInt(List<BigInteger> listValues) {
        this.listValues = listValues;
        this.minValue = BigInteger.valueOf(MINVALUEDEFECT);
        this.maxValue = BigInteger.valueOf(MAXVALUEDEFECT);
    }

    /**
     * Contructor that set minimum value and maximum value
     * @param minValue
     * @param maxValue
     */
    public TypeInt(BigInteger minValue, BigInteger maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /**
     * Contructor that set minimum value and maximum value
     * @param minValue
     * @param maxValue 
     */
    public TypeInt(long minValue, long maxValue) {
        this.minValue = BigInteger.valueOf(minValue);
        this.maxValue = BigInteger.valueOf(maxValue);
    }

    /**
     * Return true if the objects are equals
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeInt)) {
            return false;
        }
        final TypeInt tInt = (TypeInt) o;
        return tInt == this || (tInt.getMaxValue().equals(this.maxValue)
                && tInt.getMinValue().equals(this.minValue)
                && tInt.getTotalDigits() == this.totalDigits
                && tInt.getListValues().equals(this.listValues));
    }

    @Override
    public int hashCode() {
        int hash = HASH;
        hash = HASHM * hash + (this.listValues != null ? this.listValues.hashCode() : 0);
        hash = HASHM * hash + (this.maxValue != null ? this.maxValue.hashCode() : 0);
        hash = HASHM * hash + (this.minValue != null ? this.minValue.hashCode() : 0);
        hash = HASHM * hash + this.totalDigits;
        return hash;
    }

    /**
     * Return the maximum value
     * @return the maxValue
     */
    public BigInteger getMaxValue() {
        return maxValue;
    }

    /**
     * Return the minimum value
     * @return the minValue
     */
    public BigInteger getMinValue() {
        return minValue;
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
     * Set the maximum value
     * @param maxValue the maxValue to set
     */
    public void setMaxValue(BigInteger maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Set the maximum value
     * @param maxValue the maxValue to set
     */
    public void setMaxValue(long maxValue) {
        this.maxValue = BigInteger.valueOf(maxValue);
    }

    /**
     * Set the minimum value
     * @param minValue the minValue to set
     */
    public void setMinValue(BigInteger minValue) {
        this.minValue = minValue;
    }

    /**
     * Set the minimum value
     * @param minValue the minValue to set
     */
    public void setMinValue(long minValue) {
        this.minValue = BigInteger.valueOf(minValue);
    }

    /**
     * Return the totalDigits, if value equals 0 then no value assigned
     * @return the totalDigits
     */
    public int getTotalDigits() {
        return totalDigits;
    }

    /**
     * @param totalDigits the totalDigits to set
     */
    public void setTotalDigits(int totalDigits) {
        this.totalDigits = totalDigits;
    }
    
    /**
     * @return the listValues
     */
    @SuppressWarnings("rawtypes")
    public List getListValues() {
        return listValues;
    }
}
