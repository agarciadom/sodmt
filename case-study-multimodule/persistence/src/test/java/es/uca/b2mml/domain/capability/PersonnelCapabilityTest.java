package es.uca.b2mml.domain.capability;

import java.util.Calendar;

import org.junit.Test;

public class PersonnelCapabilityTest {

	@Test
	public void duplicateWorks() {
		final PersonnelCapability capability = DuplicationTestUtils.createPersonnelCapabilityForDuplication();
		final PersonnelCapabilityProperty property = DuplicationTestUtils.addPropertyForDuplication(capability);
		
		final ProductionCapability otherCapability = new ProductionCapability();
		final Calendar today = Calendar.getInstance();
		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.add(Calendar.DAY_OF_MONTH,  1);
		final PersonnelCapability duplicate = capability.duplicateFor(otherCapability, today, tomorrow);

		DuplicationTestUtils.assertIsDuplicate(capability, property, duplicate, otherCapability,	today, tomorrow);
	}

}
