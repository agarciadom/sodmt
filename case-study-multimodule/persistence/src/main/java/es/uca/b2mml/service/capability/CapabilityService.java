package es.uca.b2mml.service.capability;

import java.util.Calendar;
import java.util.List;

import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.dates.DayFilter;
import es.uca.b2mml.domain.dates.DayFilterFactory;

public interface CapabilityService {

	/**
	 * Duplicates a production capability <code>c</code> over a range of dates
	 * daily from <code>startTime</code> to <code>endTime</code>, filtering the
	 * applicable days using <code>dayFilter</code>.
	 *
	 * @param c
	 *            Capability to be duplicated.
	 * @param startTime
	 *            Starting date and time for the range.
	 * @param endTime
	 *            Last date and time for the range.
	 * @param dayFilter
	 *            Filters the days in the range for which <code>c</code> should
	 *            be repeated. Must not be null. {@link DayFilterFactory} can be
	 *            useful to create some common filters.
	 */
	List<ProductionCapability> duplicateDailyOverRange(ProductionCapability c,
		Calendar startTime,
		Calendar endTime,
		DayFilter dayFilter);

}
