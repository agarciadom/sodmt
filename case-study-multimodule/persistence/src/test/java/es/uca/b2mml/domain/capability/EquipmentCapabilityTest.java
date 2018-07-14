package es.uca.b2mml.domain.capability;

import java.util.Calendar;

import org.junit.Test;

/**
 * Tests for the {@link EquipmentCapability} class.
 *
 * @author Antonio García-Domínguez
 */
public class EquipmentCapabilityTest {

	@Test
	public void duplicateTest() {
		final EquipmentCapability capability = DuplicationTestUtils.createEquipmentCapabilityForDuplication();
		final EquipmentCapabilityProperty property = DuplicationTestUtils.addPropertyForDuplication(capability);

		final ProductionCapability otherCapability = new ProductionCapability();
		final Calendar today = Calendar.getInstance();
		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.add(Calendar.DAY_OF_MONTH,  1);
		final EquipmentCapability duplicate = capability.duplicateFor(otherCapability, today, tomorrow);

		DuplicationTestUtils.assertIsDuplicate(capability, property, duplicate, otherCapability,	today, tomorrow);
	}
}
