package es.uca.b2mml.domain.capability;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.Calendar;
import java.util.HashSet;

import es.uca.b2mml.domain.CapabilityType;
import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.material.MaterialUseType;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;

public class DuplicationTestUtils {

	public static PersonnelCapability createPersonnelCapabilityForDuplication() {
		return createPersonnelCapabilityForDuplication(new ProductionCapability());
	}

	public static PersonnelCapability createPersonnelCapabilityForDuplication(ProductionCapability productionCapability) {
		final PersonnelCapability capability = new PersonnelCapability();
		
		capability.setDescription("eq desc");
		capability.setId(1L);
		capability.setLocation(new Equipment());
		capability.setPerson(new Person());
		capability.setPersonnelClass(new PersonClass());
		capability.setQuantity(new QuantityWithUnit(9001, new Unit()));
		capability.setReason("eq reason");
		capability.setVersion(0);

		productionCapability.addCapability(capability);
		return capability;
	}

	public static EquipmentCapability createEquipmentCapabilityForDuplication() {
		return createEquipmentCapabilityForDuplication(new ProductionCapability());
	}

	public static EquipmentCapability createEquipmentCapabilityForDuplication(ProductionCapability productionCapability) {
		final EquipmentCapability capability = new EquipmentCapability();
		capability.setDescription("eq desc");
		capability.setEquipment(new Equipment());
		capability.setEquipmentClass(new EquipmentClass());
		capability.setId(1L);
		capability.setLocation(new Equipment());
		capability.setQuantity(new QuantityWithUnit(9001, new Unit()));
		capability.setReason("eq reason");
		capability.setType(CapabilityType.AVAILABLE);
		capability.setVersion(0);

		productionCapability.addCapability(capability);
		return capability;
	}

	public static MaterialCapability createMaterialCapabilityForDuplication() {
		ProductionCapability productionCapability = new ProductionCapability();
		return createMaterialCapabilityForDuplication(productionCapability);
	}

	public static MaterialCapability createMaterialCapabilityForDuplication(ProductionCapability productionCapability) {
		final MaterialCapability capability = new MaterialCapability();

		capability.setDescription("eq desc");
		capability.setId(1L);
		capability.setLocation(new Equipment());
		capability.setMaterialClass(new MaterialClass());
		capability.setMaterialDefinition(new MaterialDefinition());
		capability.setMaterialLot(new MaterialLot());
		capability.setMaterialSublot(new MaterialSublot());
		capability.setMaterialUse(MaterialUseType.CONSUMED);
		capability.setQuantity(new QuantityWithUnit(9001, new Unit()));
		capability.setReason("eq reason");
		capability.setType(CapabilityType.AVAILABLE);
		capability.setVersion(0);

		productionCapability.addCapability(capability);
		return capability;
	}

	public static PersonnelCapabilityProperty addPropertyForDuplication(final PersonnelCapability capability) {
		final PersonnelCapabilityProperty property = new PersonnelCapabilityProperty();
		property.setCapability(capability);
		property.setDescription("cap desc");
		property.setId(2L);
		property.setName("Something");
		property.setUnit(new Unit());
		property.setValue("prop value");
		property.setVersion(2);
		final HashSet<PersonnelCapabilityProperty> capProperties = new HashSet<PersonnelCapabilityProperty>();
		capProperties.add(property);
		capability.setProperties(capProperties);
		return property;
	}

	public static EquipmentCapabilityProperty addPropertyForDuplication(final EquipmentCapability capability) {
		final EquipmentCapabilityProperty property = new EquipmentCapabilityProperty();
		property.setCapability(capability);
		property.setDescription("cap desc");
		property.setId(2L);
		property.setName("Something");
		property.setUnit(new Unit());
		property.setValue("prop value");
		property.setVersion(2);
		final HashSet<EquipmentCapabilityProperty> capProperties = new HashSet<EquipmentCapabilityProperty>();
		capProperties.add(property);
		capability.setProperties(capProperties);
		return property;
	}

	public static MaterialCapabilityProperty addPropertyForDuplication(final MaterialCapability capability) {
		final MaterialCapabilityProperty property = new MaterialCapabilityProperty();
		property.setCapability(capability);
		property.setDescription("cap desc");
		property.setId(2L);
		property.setName("Something");
		property.setUnit(new Unit());
		property.setValue("prop value");
		property.setVersion(2);
		final HashSet<MaterialCapabilityProperty> capProperties = new HashSet<MaterialCapabilityProperty>();
		capProperties.add(property);
		capability.setProperties(capProperties);
		return property;
	}

	public static void assertIsDuplicate(
			final PersonnelCapability originalCapability,
			final PersonnelCapabilityProperty originalProperty,
			final PersonnelCapability duplicateCapability,
			final ProductionCapability newProductionCapability,
			final Calendar newStartTime, final Calendar newEndTime) {
		assertNotSame(originalCapability, duplicateCapability);
		assertSame(newProductionCapability, duplicateCapability.getProductionCapability());
		assertEquals(newStartTime, duplicateCapability.getStartTime());
		assertEquals(newEndTime, duplicateCapability.getEndTime());
	
		assertEquals(originalCapability.getDescription(), duplicateCapability.getDescription());
		assertSame(originalCapability.getPerson(), duplicateCapability.getPerson());
		assertSame(originalCapability.getPersonnelClass(), duplicateCapability.getPersonnelClass());
		assertSame(originalCapability.getLocation(), duplicateCapability.getLocation());
		assertEquals(originalCapability.getQuantity(), duplicateCapability.getQuantity());
		assertEquals(originalCapability.getReason(), duplicateCapability.getReason());
		assertSame(originalCapability.getType(), duplicateCapability.getType());
	
		// Id and Version are set by the persistence layer, not by the domain itself
		assertNull(duplicateCapability.getId());
		assertNull(duplicateCapability.getVersion());
	
		// Properties should be also duplicated
		final PersonnelCapabilityProperty duplProperty = duplicateCapability.getProperties().iterator().next();
		DuplicationTestUtils.assertIsDuplicate(originalProperty, duplicateCapability, duplProperty);
	}

	public static void assertIsDuplicate(final PersonnelCapabilityProperty property,
			final PersonnelCapability duplCapability,
			final PersonnelCapabilityProperty duplProperty) {
		assertNotSame(property, duplProperty);
		assertSame(duplCapability, duplProperty.getCapability());
		assertEquals(property.getDescription(), duplProperty.getDescription());
		assertNull(duplProperty.getId());
		assertEquals(property.getName(), duplProperty.getName());
		assertSame(property.getUnit(), duplProperty.getUnit());
		assertEquals(property.getValue(), duplProperty.getValue());
		assertNull(duplProperty.getVersion());
	}

	public static void assertIsDuplicate(
			final EquipmentCapability originalCapability,
			final EquipmentCapabilityProperty originalProperty,
			final EquipmentCapability duplicateCapability,
			final ProductionCapability newProductionCapability,
			final Calendar newStartTime, final Calendar newEndTime) {
		assertNotSame(originalCapability, duplicateCapability);
		assertSame(newProductionCapability, duplicateCapability.getProductionCapability());
		assertEquals(newStartTime, duplicateCapability.getStartTime());
		assertEquals(newEndTime, duplicateCapability.getEndTime());
	
		assertEquals(originalCapability.getDescription(), duplicateCapability.getDescription());
		assertSame(originalCapability.getEquipment(), duplicateCapability.getEquipment());
		assertSame(originalCapability.getEquipmentClass(), duplicateCapability.getEquipmentClass());
		assertSame(originalCapability.getLocation(), duplicateCapability.getLocation());
		assertEquals(originalCapability.getQuantity(), duplicateCapability.getQuantity());
		assertEquals(originalCapability.getReason(), duplicateCapability.getReason());
		assertSame(originalCapability.getType(), duplicateCapability.getType());
	
		// Id and Version are set by the persistence layer, not by the domain itself
		assertNull(duplicateCapability.getId());
		assertNull(duplicateCapability.getVersion());
	
		// Properties should be also duplicated
		final EquipmentCapabilityProperty duplProperty = duplicateCapability.getProperties().iterator().next();
		DuplicationTestUtils.assertIsDuplicate(originalProperty, duplicateCapability, duplProperty);
	}

	public static void assertIsDuplicate(final EquipmentCapabilityProperty property,
			final EquipmentCapability duplCapability,
			final EquipmentCapabilityProperty duplProperty) {
		assertNotSame(property, duplProperty);
		assertSame(duplCapability, duplProperty.getCapability());
		assertEquals(property.getDescription(), duplProperty.getDescription());
		assertNull(duplProperty.getId());
		assertEquals(property.getName(), duplProperty.getName());
		assertSame(property.getUnit(), duplProperty.getUnit());
		assertEquals(property.getValue(), duplProperty.getValue());
		assertNull(duplProperty.getVersion());
	}

	public static void assertIsDuplicate(
			final MaterialCapability originalCapability,
			final MaterialCapabilityProperty originalProperty,
			final MaterialCapability duplicateCapability,
			final ProductionCapability newProductionCapability,
			final Calendar newStartTime, final Calendar newEndTime) {
		assertNotSame(originalCapability, duplicateCapability);
		assertSame(newProductionCapability, duplicateCapability.getProductionCapability());
		assertEquals(newStartTime, duplicateCapability.getStartTime());
		assertEquals(newEndTime, duplicateCapability.getEndTime());
	
		assertEquals(originalCapability.getDescription(), duplicateCapability.getDescription());
		assertSame(originalCapability.getMaterialDefinition(), duplicateCapability.getMaterialDefinition());
		assertSame(originalCapability.getMaterialClass(), duplicateCapability.getMaterialClass());
		assertSame(originalCapability.getMaterialLot(), duplicateCapability.getMaterialLot());
		assertSame(originalCapability.getMaterialSublot(), duplicateCapability.getMaterialSublot());
		assertSame(originalCapability.getMaterialUse(), duplicateCapability.getMaterialUse());
		assertSame(originalCapability.getLocation(), duplicateCapability.getLocation());
		assertEquals(originalCapability.getQuantity(), duplicateCapability.getQuantity());
		assertEquals(originalCapability.getReason(), duplicateCapability.getReason());
		assertSame(originalCapability.getType(), duplicateCapability.getType());
	
		// Id and Version are set by the persistence layer, not by the domain itself
		assertNull(duplicateCapability.getId());
		assertNull(duplicateCapability.getVersion());
	
		// Properties should be also duplicated
		final MaterialCapabilityProperty duplProperty = duplicateCapability.getProperties().iterator().next();
		assertIsDuplicate(originalProperty, duplicateCapability, duplProperty);
	}

	public static void assertIsDuplicate(final MaterialCapabilityProperty property,
			final MaterialCapability duplCapability,
			final MaterialCapabilityProperty duplProperty) {
		assertNotSame(property, duplProperty);
		assertSame(duplCapability, duplProperty.getCapability());
		assertEquals(property.getDescription(), duplProperty.getDescription());
		assertNull(duplProperty.getId());
		assertEquals(property.getName(), duplProperty.getName());
		assertSame(property.getUnit(), duplProperty.getUnit());
		assertEquals(property.getValue(), duplProperty.getValue());
		assertNull(duplProperty.getVersion());
	}

}
