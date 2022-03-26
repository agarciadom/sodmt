package es.uca.sodmt.isa95study.scheduler.impl;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import es.uca.b2mml.domain.schedule.ProductionSchedule;
import es.uca.b2mml.service.schedule.ScheduleException;
import es.uca.b2mml.service.schedule.ScheduleService;
import es.uca.sodmt.isa95study.scheduler.GenerateSchedule;
import es.uca.sodmt.isa95study.scheduler.GenerateScheduleFault_Exception;
import es.uca.sodmt.isa95study.scheduler.GenerateScheduleResponse;
import es.uca.sodmt.isa95study.scheduler.Scheduler;

@WebService
@Stateless
@Configurable
public class SchedulerImpl implements Scheduler {

	private static final Logger LOGGER = LoggerFactory.getLogger(SchedulerImpl.class.getCanonicalName());

	@Autowired
	private ScheduleService scheduleService;

	@Autowired
	private DatatypeFactory datatypeFactory;

	@Override
	public GenerateScheduleResponse generateSchedule(GenerateSchedule parameters) throws GenerateScheduleFault_Exception {
		try {
			final GenerateScheduleResponse response = new GenerateScheduleResponse();

			final ProductionSchedule schedule = scheduleService.generateEarliestSchedule(
				parameters.getReason().trim(),
				parameters.getProductRuleId().trim(),
				new BigDecimal(parameters.getQuantity()),
				parameters.getUnitId().trim(),
				Calendar.getInstance());

			final DateTime now = new DateTime();
			final DateTime then = now.plusDays(1);

			final XMLGregorianCalendar xmlNow  = datatypeFactory.newXMLGregorianCalendar(now.toGregorianCalendar());
			final XMLGregorianCalendar xmlThen = datatypeFactory.newXMLGregorianCalendar(then.toGregorianCalendar());

			response.setProductionScheduleId(schedule.getScheduleId());
			response.setEarliestStart(xmlNow);
			response.setLatestEnd(xmlThen);
			
			return response;
		} catch (ScheduleException e) {
			LOGGER.error("Error while scheduling", e);
			throw new GenerateScheduleFault_Exception(e.getMessage(), e);
		} catch (RuntimeException e) {
			LOGGER.error("Unexpected runtime exception", e);
			throw e;
		}
	}

}
