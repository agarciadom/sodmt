package es.uca.b2mml.service.capability;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import es.uca.b2mml.domain.capability.EquipmentCapability;
import es.uca.b2mml.domain.capability.PersonnelCapability;
import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.dates.DayFilterFactory;

/**
 * Tests for the {@link CapabilityService}.
 *
 * @author antonio
 */
@ContextConfiguration("classpath:/testContext-base.xml")
public class CapabilityServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private CapabilityService capabilityService;

	@Test
	public void testDuplicates() throws ParseException {
		final long originalProdC = ProductionCapability.countProductionCapabilities();
		final long originalPC = PersonnelCapability.countPersonnelCapabilities();
		final long originalEC = EquipmentCapability.countEquipmentCapabilities();
		
		final ProductionCapability pc = ProductionCapability.findAllProductionCapabilities().get(0);

		final SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
		final Calendar startTime = Calendar.getInstance();
		final Calendar endTime = Calendar.getInstance();
		startTime.setTime(fmt.parse("2013/10/14"));
		endTime.setTime(fmt.parse("2013/10/21"));

		// The production capability has 4 personnel capabilities and 16 equipment capabilities
		// associated with it: duplicating it 5 times results in 20 new personnel capabilities
		// and 80 new equipment capabilities.
		capabilityService.duplicateDailyOverRange(pc, startTime, endTime, DayFilterFactory.weekdays());
		assertEquals(originalProdC + 5, ProductionCapability.countProductionCapabilities());
		assertEquals(originalPC + 20, PersonnelCapability.countPersonnelCapabilities());
		assertEquals(originalEC + 80, EquipmentCapability.countEquipmentCapabilities());
	}
}
