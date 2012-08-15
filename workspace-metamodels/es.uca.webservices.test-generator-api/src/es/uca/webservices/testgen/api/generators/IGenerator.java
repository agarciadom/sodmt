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

import java.math.BigInteger;
import java.util.List;


import java.math.BigDecimal;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import es.uca.webservices.testgen.api.types.IType;
import es.uca.webservices.testgen.api.types.TypeDate;
import es.uca.webservices.testgen.api.types.TypeDateTime;
import es.uca.webservices.testgen.api.types.TypeDuration;
import es.uca.webservices.testgen.api.types.TypeFloat;
import es.uca.webservices.testgen.api.types.TypeInt;
import es.uca.webservices.testgen.api.types.TypeList;
import es.uca.webservices.testgen.api.types.TypeString;
import es.uca.webservices.testgen.api.types.TypeTime;
import es.uca.webservices.testgen.api.types.TypeTuple;

/**
 * Interface for test case data generators.
 *
 * @author Miguel Ángel Pérez Montero
 */
public interface IGenerator {

    /**
     * Generates an instance of the proper IType, using double dispatch.
     * @param abstractType Type of the value to be generated.
     * @return Generated instance of the specified type.
     */
    Object generate(IType abstractType) throws GenerationException;

    /**
     * Generates an BigInteger of the proper TypeInt
     * @param typeInt
     * @return Generated BigInteger with the properties specified in typeInt
     */
    BigInteger generate(TypeInt typeInt);

    /**
     * Generates a List of the proper typeList
     * @param typeList
     * @return Generated List with the properties specified in typeList
     */
    List<?> generate(TypeList typeList) throws GenerationException;

    /**
     * Generates a String of the proper TypeString
     * @param typeString
     * @return Generated String with the properties specified in typeString
     */
    String generate(TypeString typeString);

    /**
     * Generates an List of the proper TypeTuple
     * @param typeTuple
     * @return Generated List with the properties specified in typeTuple
     */
    List<?> generate(TypeTuple typeTuple) throws GenerationException;

    /**
     * Generates a float of the proper TypeFloat
     * @param typeFloat
     * @return 
     */
    BigDecimal generate(TypeFloat typeFloat);

    /**
     * Generates a Date of the proper TypeDate
     * @param typeDate
     * @return 
     */
    XMLGregorianCalendar generate(TypeDate typeDate) throws GenerationException;

    /**
     * Generates a Date of the proper TypeTime
     * @param typeDate
     * @return 
     */
    XMLGregorianCalendar generate(TypeTime typeTime) throws GenerationException;

    /**
     * Generates a DateTime of the proper TypeDateTime
     * @param typeDate
     * @return 
     */
    XMLGregorianCalendar generate(TypeDateTime typeDateTime) throws GenerationException;

    /**
     * Generates a DateTime of the proper TypeDuration
     * @param typeDate
     * @return 
     */
    Duration generate(TypeDuration typeDuration) throws GenerationException;
}
