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
package es.uca.webservices.testgen.generators;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import es.uca.webservices.testgen.api.generators.GenerationException;
import es.uca.webservices.testgen.api.generators.IGenerator;
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
import nl.flotsam.xeger.Xeger;

/**
 * Class that generates random test cases.
 * 
 */
public class UniformRandomGenerator implements IGenerator {

    private static final int DEFAULT_SECOND = 0;
    private static final int DEFAULT_MINUTE = 0;
    private static final int DEFAULT_HOUR = 0;
    private static final int DEFAULT_DAY = 1;
    private static final int DEFAULT_MONTH = 0;
    private static final int DEFAULT_YEAR = 1970;
    private static DatatypeFactory dataTypeFactory;

    private Map<String, Xeger> automatonCache = new HashMap<String, Xeger>();
    private final Random rnd = new Random();

    @Override
    public Object generate(IType abstractType) throws GenerationException {
        return abstractType.generate(this);
    }

    /**
     * Generated a BigInteger random with the terms of the typeInt received
     * 
     * @param typeInt
     * @return
     */
    @Override
    public BigInteger generate(TypeInt typeInt) {
        if (!typeInt.getListValues().isEmpty()) {
            return (BigInteger) random(typeInt.getListValues());
        } else {
            int totalDigits = typeInt.getTotalDigits();
            if (totalDigits == 0) {
                return random(typeInt.getMinValue(), typeInt.getMaxValue());
            } else {
                final BigInteger minTotalDigits = BigInteger.TEN.pow(totalDigits - 1);
                final BigInteger maxTotalDigits = BigInteger.TEN.pow(totalDigits).subtract(BigInteger.ONE);

                final BigInteger min = typeInt.getMinValue().compareTo(minTotalDigits) == 1 ? typeInt.getMinValue() : minTotalDigits;
                final BigInteger max = typeInt.getMaxValue().compareTo(maxTotalDigits) == -1 ? typeInt.getMaxValue() : maxTotalDigits;
                return random(min, max);
            }
        }
    }

    /**
     * Generated a float random of the typeFloat terms of the received
     * 
     * @param typeFloat
     * @return
     */
    @Override
    public BigDecimal generate(TypeFloat typeFloat) {
        if (!typeFloat.getListValues().isEmpty()){
            return (BigDecimal) random(typeFloat.getListValues());
        } else {
            int totalDigits = typeFloat.getTotalDigits();
            BigDecimal bd = null;
            final int fractionDigits = typeFloat.getFractionDigits() > 0 ? typeFloat.getFractionDigits() : 0;
            float randFloat;
            if (totalDigits == 0) {
                randFloat = random(typeFloat.getMinValue().floatValue(), typeFloat.getMaxValue().floatValue());
            } else {
                final float minTotalDigits = (float) Math.pow(10, totalDigits - 1 - fractionDigits);
                final float maxTotalDigits = (float) Math.pow(10, totalDigits - fractionDigits)-1;
                final float min = typeFloat.getMinValue().floatValue() > minTotalDigits ? typeFloat.getMinValue().floatValue() : minTotalDigits;
                final float max = typeFloat.getMaxValue().floatValue() < maxTotalDigits ? typeFloat.getMinValue().floatValue() : maxTotalDigits;
                randFloat = random(min, max);
            }
            bd = new BigDecimal(randFloat + "");
            if(typeFloat.getFractionDigits() >= 0){
                bd = bd.setScale(fractionDigits, RoundingMode.HALF_UP);
            }
            return bd;
        }
    }

    /**
     * Generated a List<Object> random of the typeList the terms of the received
     * 
     * @param typeList
     * @return
     */
    @Override
    public List<Object> generate(TypeList typeList) throws GenerationException {
        final int size = random(typeList.getMinNumElement(),
                typeList.getMaxNumElement());
        final List<Object> result = new ArrayList<Object>(size);
        for (int i = 0; i < size; ++i) {
            result.add(generate(typeList.getType()));
        }
        return result;
    }

    /**
     * Generated a List<Object> random of the typeTuple the terms of the
     * received
     * 
     * @param typeTuple
     * @return
     */
    @Override
    public List<Object> generate(TypeTuple typeTuple)
            throws GenerationException {
        final List<Object> result = new ArrayList<Object>(typeTuple.size());
        for (int i = 0; i < typeTuple.size(); ++i) {
            result.add(generate(typeTuple.getIType(i)));
        }
        return result;
    }

    /**
     * Generated a String random of the typeString the terms of the received
     * 
     * @param typeString
     * @return
     */
    @Override
    public String generate(TypeString typeString) {
        if (typeString.getListValues().isEmpty() && !typeString.isSetPattern()) {
            return random(random(typeString.getMinLength(), typeString.getMaxLength()));
        } else if (typeString.isSetPattern()) {
        	return getXeger(typeString.getPattern()).generate();
        } else {
            return (String) random(typeString.getListValues());
        }
    }

    /**
     * Generated a Date random of the typeDate the terms of the received
     * 
     * @param typeDate
     * @return
     */
    @Override
    public XMLGregorianCalendar generate(TypeDate typeDate)
            throws GenerationException {
        final Calendar minCalendar = toCalendar(typeDate.getMinValue());
        final Calendar maxCalendar = toCalendar(typeDate.getMaxValue());
        final Calendar randCalendar = random(minCalendar, maxCalendar);

        final DatatypeFactory factory = getDatatypeFactory();
        XMLGregorianCalendar calendar = factory.newXMLGregorianCalendarDate(
                randCalendar.get(Calendar.YEAR),
                randCalendar.get(Calendar.MONTH) + 1,
                randCalendar.get(Calendar.DAY_OF_MONTH),
                DatatypeConstants.FIELD_UNDEFINED);
        return calendar;
    }

    /**
     * Generated a Time random of the typeTime the terms of the received
     * 
     * @param typeTime
     * @return
     */
    @Override
    public XMLGregorianCalendar generate(TypeTime typeTime)
            throws GenerationException {
        final Calendar minTime = toCalendar(typeTime.getMinValue());
        final Calendar maxTime = toCalendar(typeTime.getMaxValue());
        final Calendar randTime = random(minTime, maxTime);

        final DatatypeFactory factory = getDatatypeFactory();
        XMLGregorianCalendar calendar = factory.newXMLGregorianCalendarTime(
                randTime.get(Calendar.HOUR_OF_DAY), randTime.get(Calendar.MINUTE), randTime.get(Calendar.SECOND),
                DatatypeConstants.FIELD_UNDEFINED,
                DatatypeConstants.FIELD_UNDEFINED);
        return calendar;
    }

    /**
     * Generated a DateTime random of the typeDateTime the terms of the received
     * 
     * @param typeDateTime
     * @return
     */
    @Override
    public XMLGregorianCalendar generate(TypeDateTime typeDateTime)
            throws GenerationException {
        final Calendar minCalendar = toCalendar(typeDateTime.getMinValue());
        final Calendar maxCalendar = toCalendar(typeDateTime.getMaxValue());
        final Calendar randCalendar = random(minCalendar, maxCalendar);

        final DatatypeFactory factory = getDatatypeFactory();
        XMLGregorianCalendar calendar = factory.newXMLGregorianCalendar(
                randCalendar.get(Calendar.YEAR),
                randCalendar.get(Calendar.MONTH) + 1,
                randCalendar.get(Calendar.DAY_OF_MONTH),
                randCalendar.get(Calendar.HOUR_OF_DAY),
                randCalendar.get(Calendar.MINUTE),
                randCalendar.get(Calendar.SECOND),
                randCalendar.get(Calendar.MILLISECOND),
                DatatypeConstants.FIELD_UNDEFINED);
        return calendar;
    }

    /**
     * Generated a TypeDuration random od the typeDuration the terms od the received
     * @param typeDuration
     * @return
     * @throws GenerationException 
     */
    @Override
    public Duration generate(TypeDuration typeDuration)
            throws GenerationException {
        final Duration minDuration = typeDuration.getMinValue();
        final Duration maxDuration = typeDuration.getMaxValue();
        return random(minDuration, maxDuration);

    }

    /**
     * Changes the seed of the internal PRNG.
     * @param seed New seed to be used. 
     */
    public void setSeed(long seed) {
        rnd.setSeed(seed);
    }

    private synchronized DatatypeFactory getDatatypeFactory()
            throws GenerationException {
        if (dataTypeFactory == null) {
            try {
                dataTypeFactory = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException ex) {
                throw new GenerationException(ex);
            }
        }
        return dataTypeFactory;
    }

    /**
     * Constructor Calendar with a XMLGregorianCalendar
     * @param xmlCalendar
     * @return 
     */
    private Calendar toCalendar(final XMLGregorianCalendar xmlCalendar) {
        final int year = xmlCalendar.getYear()     != DatatypeConstants.FIELD_UNDEFINED ? xmlCalendar.getYear()      : DEFAULT_YEAR;
        final int month = xmlCalendar.getMonth()   != DatatypeConstants.FIELD_UNDEFINED ? xmlCalendar.getMonth() - 1 : DEFAULT_MONTH;
        final int day = xmlCalendar.getDay()       != DatatypeConstants.FIELD_UNDEFINED ? xmlCalendar.getDay()       : DEFAULT_DAY;
        final int hour = xmlCalendar.getHour()     != DatatypeConstants.FIELD_UNDEFINED ? xmlCalendar.getHour()      : DEFAULT_HOUR;
        final int minute = xmlCalendar.getMinute() != DatatypeConstants.FIELD_UNDEFINED ? xmlCalendar.getMinute()    : DEFAULT_MINUTE;
        final int second = xmlCalendar.getSecond() != DatatypeConstants.FIELD_UNDEFINED ? xmlCalendar.getSecond()    : DEFAULT_SECOND;

        final Calendar calendar = new GregorianCalendar(year, month, day, hour, minute, second);
        calendar.setLenient(false);
        return calendar;
    }

    /**
     * Generated a BigInteger randomly distributed over the range [min, max]
     * 
     * @param mix
     * @param max
     * @return
     */
    private BigInteger random(BigInteger min, BigInteger max) {
        final BigInteger diff = max.subtract(min);
        BigInteger result = null;
        do {
            final BigInteger rand = new BigInteger(diff.bitLength(), rnd);
            result = min.add(rand);
        } while (result.compareTo(max) > 0);
        return result;
    }

    /**
     * Generated a Calendar randomly distributed over the range [min, max]
     * @param minCalendar
     * @param maxCalendar
     * @return 
     */
    private Calendar random(Calendar minCalendar, Calendar maxCalendar) {
        final long minMillis = minCalendar.getTimeInMillis();
        final long maxMillis = maxCalendar.getTimeInMillis();
        final long rndMillis = random(minMillis, maxMillis);
        final Calendar randCalendar = new GregorianCalendar();
        randCalendar.setTimeInMillis(rndMillis);
        return randCalendar;
    }

    /**
     * Generated a Duration randomly distributed over the range [min, max]
     * @param min
     * @param max
     * @return 
     */
    private Duration random(Duration min, Duration max) throws GenerationException {
        final long minMillis = min.getTimeInMillis(new GregorianCalendar(1900,0,1));
        final long maxMillis = max.getTimeInMillis(new GregorianCalendar(1900,0,1));
        final long rndMillis = random(minMillis, maxMillis);
        
        final DatatypeFactory factory = getDatatypeFactory();
        return factory.newDuration(rndMillis);
    }
    
    /**
     * Generated an int randomly distributed over the range [min, max]
     * 
     * @param max
     * @param min
     * @return
     */
    private int random(int min, int max) {
        return rnd.nextInt(max - min + 1) + min;
    }

    /**
     * Generate a long randomly distributed over the range [min, max]
     * 
     * @param max
     * @param min
     * @return
     */
    private long random(long min, long max) {
        long rndLong = rnd.nextLong();
        if (rndLong < 0) {
            rndLong = -rndLong;
        }
        return rndLong % (max - min + 1) + min;
    }

    /**
     * Generated a float randomly distributed over the range [min, max]
     * 
     * @param max
     * @param min
     * @return
     */
    private float random(float min, float max) {
        return (max - min) * rnd.nextFloat() + min;
    }

    /**
     * Generates a random alphanumeric string of a certain <code>length</code>.
     * 
     * @param length
     * @return
     */
    private String random(int length) {
        return getXeger("[A-Za-Z0-9]{" + length + "}").generate();
    }

    /**
     * Returns a random item from the list
     * @param listValues
     * @return 
     */
    private Object random(List<?> listValues) {
        int pos = random(0, listValues.size() - 1);
        return listValues.get(pos);
    }

    private Xeger getXeger(String pattern) {
    	if (automatonCache.containsKey(pattern)) {
    		return automatonCache.get(pattern);
    	}
    	else {
    		final Xeger xeger = new Xeger(pattern, rnd);
    		automatonCache.put(pattern, xeger);
    		return xeger;
    	}
    }
}
