package es.uca.b2mml.service.schedule;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import es.uca.b2mml.domain.capability.Capability;
import es.uca.b2mml.domain.schedule.ProductionSchedule;

/**
 * Service for creating schedules and committing them.
 *
 * @author antonio
 */
public interface ScheduleService {

	/**
	 * Returns the earliest candidate schedule necessary to produce the specified amount of the product.
	 * It's not very smart: it won't reschedule existing production orders, for instance. The production
	 * schedule is not persisted: for that, {@link #commitSchedule(ProductionSchedule)} should be used.
	 */
	ProductionSchedule
		generateEarliestSchedule(String reason, String productRuleId, BigDecimal qty, String unitId, Calendar startDate)
		throws ScheduleException;

	/**
	 * Validates the proposed schedule and commits it to storage, while
	 * modifying the available capabilities.
	 */
	List<Capability> commitSchedule(String scheduleId) throws ScheduleException;
	
}
