/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uca.webservices.testgen.api.types;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Abstract class for types Dates
 * @author Miguel Ángel Pérez Montero
 */
public abstract class AbstractDates extends AbstractType {

    protected static final int MAXDAY = 31;
    protected static final int MAXMONTH = 12;
    protected static final int MAXYEAR = 2198;
    protected static final int MINDAY = 1;
    protected static final int MINMONTH = 1;
    protected static final int MINYEAR = 1970;
    protected static final int MAXMILLISECOND = 59;
    protected static final int MAXMINUTE = 59;
    protected static final int MAXSECOND = 59;
    protected static final int MAXHOUR = 23;
    protected static final int MINHOUR = 0;
    protected static final int MINMILLISECOND = 0;
    protected static final int MINMINUTE = 0;
    protected static final int MINSECOND = 0;
    
    private XMLGregorianCalendar maxValue;
    private XMLGregorianCalendar minValue;

    /**
     * @return the maxValue
     */
    public XMLGregorianCalendar getMaxValue() {
        return maxValue;
    }

    /**
     * @return the minValue
     */
    public XMLGregorianCalendar getMinValue() {
        return minValue;
    }

    /**
     * @param maxValue the maxValue to set
     */
    public void setMaxValue(XMLGregorianCalendar maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * @param minValue the minValue to set
     */
    public void setMinValue(XMLGregorianCalendar minValue) {
        this.minValue = minValue;
    }
}
