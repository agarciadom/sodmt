package es.uca.b2mml.service.schedule.impl;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.capability.Capability;
import es.uca.b2mml.domain.product.ProductProductionRule;
import es.uca.b2mml.domain.psegment.ProcessSegment;
import es.uca.b2mml.domain.schedule.ProductionRequest;
import es.uca.b2mml.domain.schedule.ProductionSchedule;
import es.uca.b2mml.domain.schedule.SegmentRequirement;
import es.uca.b2mml.service.schedule.ScheduleException;
import es.uca.b2mml.service.schedule.ScheduleService;

/**
 * Simple sequential scheduler based on a topological sort of the product and
 * process segments.
 * 
 * TODO: generalize and replace with more advanced scheduler that directly uses
 * the dependency graph and allows multiple root product segments and parallel
 * assignments.
 */
@Service("schedule")
public class ScheduleServiceImpl implements ScheduleService {

	@Transactional
	@Override
	public ProductionSchedule generateEarliestSchedule(String reason,
			String productRuleId, BigDecimal requestedQuantity,
			String unitName, Calendar startDate)
			throws ScheduleException
	{
		final ProductProductionRule productProductionRule = ProductProductionRule.findById(productRuleId);
		final Unit unit = Unit.findByName(unitName);
		final QuantityWithUnit requestedQuantityWithUnit = new QuantityWithUnit(requestedQuantity, unit);

		final ProductionSchedule schedule = new ProductionSchedule();
		schedule.setScheduleId(String.format("PS-" + getHexUID()));
		schedule.setDescription(reason);
		new EagerScheduler().schedule(schedule, productProductionRule, requestedQuantityWithUnit, startDate);

		// FIXME: use the first location as the main location of the production schedule for now
		requests:
		for (ProductionRequest request : schedule.getRequests()) {
			for (SegmentRequirement segment : request.getSegmentsSortedByStart()) {
				final ProcessSegment processSegment = segment.getProcessSegment();
				if (processSegment != null) {
					schedule.setLocation(processSegment.getLocation());
					break requests;
				}
			}
		}

		schedule.persist();

		return schedule;
	}

	private String getHexUID() {
		return Long.toHexString(UUID.randomUUID().getMostSignificantBits());
	}

	@Transactional
	@Override
	public List<Capability> commitSchedule(String scheduleId) throws ScheduleException {
		// TODO stub for now
		throw new UnsupportedOperationException();
	}
}
