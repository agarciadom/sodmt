package es.uca.b2mml.domain.capability;

import java.util.Calendar;

import org.junit.Test;

/**
 * Tests for the {@link PersonnelCapability} class.
 *
 * @author antonio
 */
public class MaterialCapabilityTest {

	@Test
	public void duplicateWorks() {
		final MaterialCapability capability = DuplicationTestUtils.createMaterialCapabilityForDuplication();
		final MaterialCapabilityProperty property = DuplicationTestUtils.addPropertyForDuplication(capability);
		
		final ProductionCapability otherCapability = new ProductionCapability();
		final Calendar today = Calendar.getInstance();
		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.add(Calendar.DAY_OF_MONTH,  1);
		final MaterialCapability duplicate = capability.duplicateFor(otherCapability, today, tomorrow);

		DuplicationTestUtils.assertIsDuplicate(capability, property, duplicate, otherCapability,	today, tomorrow);
	}

}
