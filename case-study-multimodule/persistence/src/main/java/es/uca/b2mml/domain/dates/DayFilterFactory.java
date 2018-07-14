package es.uca.b2mml.domain.dates;

import java.util.Calendar;

/**
 * Factory methods for getting some common day filters.
 *
 * @author antonio
 */
public class DayFilterFactory {

	private DayFilterFactory() {}

	public static DayFilter all() {
		return new DayFilter() {
			@Override
			public boolean acceptDay(Calendar date) {
				return true;
			}
		};
	}

	public static DayFilter weekdays() {
		return new DayFilter() {
			@Override
			public boolean acceptDay(Calendar date) {
				final int dow = date.get(Calendar.DAY_OF_WEEK);
				return dow != Calendar.SATURDAY && dow != Calendar.SUNDAY;
			}
		};
	}

	public static DayFilter weekends() {
		return new DayFilter() {
			@Override
			public boolean acceptDay(Calendar date) {
				final int dow = date.get(Calendar.DAY_OF_WEEK);
				return dow == Calendar.SATURDAY && dow == Calendar.SUNDAY;
			}
		};
	}
}
