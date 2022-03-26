package es.uca.b2mml.domain.capability;

import static es.uca.b2mml.domain.capability.DuplicationTestUtils.addPropertyForDuplication;
import static es.uca.b2mml.domain.capability.DuplicationTestUtils.assertIsDuplicate;
import static es.uca.b2mml.domain.capability.DuplicationTestUtils.createEquipmentCapabilityForDuplication;
import static es.uca.b2mml.domain.capability.DuplicationTestUtils.createMaterialCapabilityForDuplication;
import static es.uca.b2mml.domain.capability.DuplicationTestUtils.createPersonnelCapabilityForDuplication;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.dates.DayFilterFactory;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.psegment.ProcessSegment;

public class ProductionCapabilityTest {

	@Test
	public void duplicate() {
		// Populate a full production capability
		final ProductionCapability prodC = createSampleCapability();
		final PersonnelCapability pc = createPersonnelCapabilityForDuplication(prodC);
		final PersonnelCapabilityProperty pcp = addPropertyForDuplication(pc);
		final EquipmentCapability ec = createEquipmentCapabilityForDuplication(prodC);
		final EquipmentCapabilityProperty ecp = addPropertyForDuplication(ec);
		final MaterialCapability mc = createMaterialCapabilityForDuplication(prodC);
		final MaterialCapabilityProperty mcp = addPropertyForDuplication(mc);

		// Duplicate
		final String sID = "CAP-01D";
		final Calendar today = Calendar.getInstance();
		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.add(Calendar.DAY_OF_MONTH,  1);
		final ProductionCapability duplicate = prodC.duplicateFor(sID, today, tomorrow);

		// Extract and check duplicated instances
		assertEquals(sID, duplicate.getCapabilityId());
		assertEquals(prodC.getDescription(), duplicate.getDescription());
		assertSame(prodC.getLocation(), duplicate.getLocation());
		assertEquals(prodC.getReason(), duplicate.getReason());
		assertSame(prodC.getSegment(), duplicate.getSegment());
		assertSame(prodC.getType(), duplicate.getType());
		assertEquals(today, duplicate.getStartTime());
		assertEquals(tomorrow, duplicate.getEndTime());

		final PersonnelCapability duplPC = duplicate.getPersonnelCapabilities().iterator().next();
		final EquipmentCapability duplEC = duplicate.getEquipmentCapabilities().iterator().next();
		final MaterialCapability duplMC = duplicate.getMaterialCapabilities().iterator().next();

		assertIsDuplicate(pc, pcp, duplPC, duplicate, today, tomorrow);
		assertIsDuplicate(ec, ecp, duplEC, duplicate, today, tomorrow);
		assertIsDuplicate(mc, mcp, duplMC, duplicate, today, tomorrow);
	}

	@Test
	public void duplicateOverRange() throws ParseException {
		final ProductionCapability pc = createSampleCapability();

		final SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
		final Calendar startTime = Calendar.getInstance();
		final Calendar endTime = Calendar.getInstance();
		startTime.setTime(fmt.parse("2013/10/14"));
		endTime.setTime(fmt.parse("2013/10/21"));

		final List<ProductionCapability> duplicates
			= pc.duplicateDailyDuring(new Unit(), startTime, endTime, DayFilterFactory.weekdays());

		assertEquals(5, duplicates.size());
		for (int i = 0; i < duplicates.size(); i++) {
			final int dom = startTime.get(Calendar.DAY_OF_MONTH) + i;
			final ProductionCapability entry = duplicates.get(i);

			assertEquals("CAP-01-201310" + dom, entry.getCapabilityId());
			assertEquals(dom, entry.getStartTime().get(Calendar.DAY_OF_MONTH));
			assertEquals(dom + 1, entry.getEndTime().get(Calendar.DAY_OF_MONTH));
		}
	}

	private ProductionCapability createSampleCapability() {
		final ProductionCapability prodC = new ProductionCapability();

		prodC.setCapabilityId("CAP-01");
		prodC.setDescription("production capability");
		prodC.setLocation(new Equipment());
		prodC.setReason("reason capability");
		prodC.setSegment(new ProcessSegment());

		return prodC;
	}
}
