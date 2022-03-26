package es.uca.b2mml.domain.dates;

import java.util.Calendar;

/**
 * Simple interface for deciding whether a certain day should be considered
 * for some services which repeat their operations over a range of dates.
 *
 * @author antonio
 */
public interface DayFilter {

	/**
	 * Returns <code>true</code> if the date should be considered, or
	 * <code>false</code> if not.
	 */
	boolean acceptDay(Calendar date);

}
