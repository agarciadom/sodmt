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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.uca.webservices.testgen.api.generators.IGenerator;

/**
 * Class that represents the float
 *
 */
public class TypeFloat extends AbstractType {

    private static final int HASH = 3;
    private static final int HASHM = 43;
    private static final BigDecimal MINVALUEDEFECT = new BigDecimal("-100000000");
    private static final BigDecimal MAXVALUEDEFECT = new BigDecimal("100000000");
    private List<BigDecimal> listValues = new ArrayList<BigDecimal>();//save the lis of allowed values
    private BigDecimal maxValue;
    private BigDecimal minValue;
    private int fractionDigits = -1;
    private int totalDigits = 0;

    /**
     * Default constructor
     */
    public TypeFloat() {
        this.maxValue = MAXVALUEDEFECT;
        this.minValue = MINVALUEDEFECT;
    }
    
    /**
     * Build a TypeFloat with a list of valid values
     * @param listValues 
     */
    public TypeFloat(List<BigDecimal> listValues) {
        this.listValues = listValues;
        this.maxValue = MAXVALUEDEFECT;
        this.minValue = MINVALUEDEFECT;
    }

    /**
     * Contructor that set minimum value and maximum value
     * @param minValue
     * @param maxValue 
     */
    public TypeFloat(BigDecimal minValue, BigDecimal maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
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
     * @return the maxValue
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * @return the minValue
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * Return true if the objects are equals
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeFloat)) {
            return false;
        }
        final TypeFloat tFloat = (TypeFloat) o;
        return tFloat == this || (tFloat.getMaxValue().equals(maxValue)
                && tFloat.getMinValue().equals(minValue) && tFloat.getFractionDigits() == fractionDigits
                && tFloat.getTotalDigits() == totalDigits
                && tFloat.getListValues().equals(listValues));
    }

    @Override
    public int hashCode() {
        int hash = HASH;
        hash = HASHM * hash + (this.listValues != null ? this.listValues.hashCode() : 0);
        hash = HASHM * hash + (this.maxValue != null ? this.maxValue.hashCode() : 0);
        hash = HASHM * hash + (this.minValue != null ? this.minValue.hashCode() : 0);
        hash = HASHM * hash + this.fractionDigits;
        hash = HASHM * hash + this.totalDigits;
        return hash;
    }

    /**
     * Set de maximum value
     * @param maxValue the maxValue to set
     */
    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Set the minimum value
     * @param minValue the minValue to set
     */
    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }

    /**
     * Return the fraction digits, if value is negative then no value assigned
     * @return the fractionDigits
     */
    public int getFractionDigits() {
        return fractionDigits;
    }

    /**
     * Set the fraction digits
     * @param fractionDigits the fractionDigits to set
     */
    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
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
