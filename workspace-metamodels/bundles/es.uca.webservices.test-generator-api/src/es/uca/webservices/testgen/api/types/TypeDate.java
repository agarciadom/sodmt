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
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import es.uca.webservices.testgen.api.generators.GenerationException;
import es.uca.webservices.testgen.api.generators.IGenerator;

/**
 * Class that represents the Date
 *
 */
public class TypeDate extends AbstractDates {

    private static final int HASH = 3;
    private static final int HASHM = 37;

    /**
     * Default constructor
     * @throws DatatypeConfigurationException 
     */
    public TypeDate() throws DatatypeConfigurationException {
        final DatatypeFactory factory = DatatypeFactory.newInstance();
        this.setMaxValue(factory.newXMLGregorianCalendarDate(MAXYEAR, MAXMONTH, MAXDAY, DatatypeConstants.FIELD_UNDEFINED));
        this.setMinValue(factory.newXMLGregorianCalendarDate(MINYEAR, MINMONTH, MINDAY, DatatypeConstants.FIELD_UNDEFINED));
    }

    /**
     * Contructor that set minimum value and maximum value
     * @param minValue
     * @param maxValue 
     */
    public TypeDate(XMLGregorianCalendar minValue, XMLGregorianCalendar maxValue) {
        this.setMinValue(minValue);
        this.setMaxValue(maxValue);
    }

    /**
     * Return true if the objects are equals
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeDate)) {
            return false;
        }
        final TypeDate tDate = (TypeDate) o;
        return tDate == this || ((tDate.getMaxValue().equals(this.getMaxValue()))
                && tDate.getMinValue().equals(this.getMinValue()));
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
}
