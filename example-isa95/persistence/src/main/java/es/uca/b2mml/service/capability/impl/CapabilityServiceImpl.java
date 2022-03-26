package es.uca.b2mml.service.capability.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.uca.b2mml.domain.SystemUnitType;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.dates.DayFilter;
import es.uca.b2mml.service.capability.CapabilityService;

@Configurable
@Service("capabilities")
public class CapabilityServiceImpl implements CapabilityService {

	@Transactional
	@Override
	public List<ProductionCapability> duplicateDailyOverRange(
		ProductionCapability c, Calendar startTime, Calendar endTime, DayFilter dayFilter) {
		final Unit dayUnit = Unit.findBySystemType(SystemUnitType.DAY);
		final List<ProductionCapability> duplicates = c.duplicateDailyDuring(dayUnit, startTime, endTime, dayFilter);
		for (ProductionCapability capability : duplicates) {
			capability.persist();
		}
		return duplicates;
	}

}
