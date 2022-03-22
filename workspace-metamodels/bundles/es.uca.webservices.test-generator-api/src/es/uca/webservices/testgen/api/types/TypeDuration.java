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

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import es.uca.webservices.testgen.api.generators.GenerationException;
import es.uca.webservices.testgen.api.generators.IGenerator;

/**
 * Class that represents the Duration
 * 
 */
public class TypeDuration extends AbstractType {

    private static final int HASH = 7;
    private static final int HASHM = 23;
    private Duration minValue;
    private Duration maxValue;

    /**
     * Default constructor
     * @throws DatatypeConfigurationException 
     */
    public TypeDuration() throws DatatypeConfigurationException {
        final DatatypeFactory factory = DatatypeFactory.newInstance();
        this.minValue = factory.newDuration("P0Y");
        this.maxValue = factory.newDuration("P10Y");
    }

    /**
     * Contructor that set minimum value and maximum value
     * @param minValue
     * @param maxValue 
     */
    public TypeDuration(Duration minValue, Duration maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /**
     * Return true if the objects are equals
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeDuration)) {
            return false;
        }
        final TypeDuration tDuration = (TypeDuration) o;
        return tDuration == this || ((tDuration.getMaxValue().equals(this.getMaxValue()))
                && tDuration.getMinValue().equals(this.getMinValue()));
    }

    @Override
    public int hashCode() {
        int hash = HASH;
        hash = HASHM * hash + (this.getMaxValue() != null ? this.getMaxValue().hashCode() : 0);
        hash = HASHM * hash + (this.getMinValue() != null ? this.getMinValue().hashCode() : 0);
        return hash;
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

    /**
     * @return the min
     */
    public Duration getMinValue() {
        return minValue;
    }

    /**
     * @param min the min to set
     */
    public void setMinValue(Duration min) {
        this.minValue = min;
    }

    /**
     * @return the maxValue
     */
    public Duration getMaxValue() {
        return maxValue;
    }

    /**
     * @param maxValue the maxValue to set
     */
    public void setMaxValue(Duration max) {
        this.maxValue = max;
    }
}
