package es.uca.b2mml.domain.capability;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.TypedQuery;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.CapabilityType;
import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural(value="EquipmentCapabilities")
@Check(constraints="(equipment_class IS NULL) <> (equipment IS NULL) AND end_time > start_time")
@NamedQueries({
	@NamedQuery(
		name="ecapability.findEarliestAvailableWithoutParentsWithClass",
		query="SELECT e FROM EquipmentCapability e WHERE e.type = :availableType AND e.quantity.quantityValue > 0 AND e.startTime >= :earliestDate AND :equipmentClassId IN (SELECT c.id FROM e.equipment.classes c) ORDER BY e.startTime ASC, e.quantity.quantityValue DESC"
	),
	@NamedQuery(
		name="ecapability.findEarliestAvailableWithParentsWithClass",
		query="SELECT e FROM EquipmentCapability e WHERE e.type = :availableType AND e.quantity.quantityValue > 0 AND e.startTime >= :earliestDate AND :equipmentClassId IN (SELECT c.id FROM e.equipment.classes c) AND e.equipment.parent.id IN :acceptableParentIds ORDER BY e.startTime ASC, e.quantity.quantityValue DESC"
	),
	@NamedQuery(
		name="ecapability.findEarliestAvaiableWithSingleId",
		query="SELECT e FROM EquipmentCapability e WHERE e.type = :availableType AND e.quantity.quantityValue > 0 AND e.startTime >= :earliestDate AND e.equipment.id = :equipmentId ORDER BY e.startTime ASC, e.quantity.quantityValue DESC"
	),
	@NamedQuery(
		name="ecapability.findByDateRangeAndEquipment",
		query="SELECT e FROM EquipmentCapability e WHERE e.type = :availableType AND e.quantity.quantityValue > 0 AND e.equipment.id = :equipmentId AND ((:startTime >= e.startTime AND :startTime < e.endTime) OR (:endTime > e.startTime AND :endTime <= e.endTime))"
	),
	@NamedQuery(
		name="ecapability.findByDateRangeAndEquipmentClass",
		query="SELECT e FROM EquipmentCapability e WHERE e.type = :availableType AND e.quantity.quantityValue > 0 AND :equipmentClassId IN (SELECT c.id FROM e.equipment.classes c) AND ((:startTime >= e.startTime AND :startTime < e.endTime) OR (:endTime > e.startTime AND :endTime <= e.endTime))"
	),
	@NamedQuery(
		name="ecapability.findByDateRangeAndParentsAndEquipmentClass",
		query="SELECT e FROM EquipmentCapability e WHERE e.type = :availableType AND e.quantity.quantityValue > 0 AND :equipmentClassId IN (SELECT c.id FROM e.equipment.classes c) AND e.equipment.parent.id IN :acceptableParentIds AND ((:startTime >= e.startTime AND :startTime < e.endTime) OR (:endTime > e.startTime AND :endTime <= e.endTime))"
	),
	@NamedQuery(
		name="ecapability.findStartTimeSet",
		query="SELECT e FROM EquipmentCapability e WHERE e.type = :availableType AND e.startTime IS NOT NULL ORDER BY e.startTime ASC"
	)
})
public class EquipmentCapability extends ChildCapability {

	private static final Logger LOGGER = Logger.getLogger(EquipmentCapability.class.getCanonicalName());

	/**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy="capability", fetch=FetchType.LAZY)
    private Set<EquipmentCapabilityProperty> properties = new HashSet<EquipmentCapabilityProperty>();

    /**
     */
    @ManyToOne
    private EquipmentClass equipmentClass;

    /**
     */
    @ManyToOne
    private Equipment equipment;

	public EquipmentCapability() {
		super();
	}

	public EquipmentCapability(EquipmentCapability other) {
		super(other);

		this.equipmentClass = other.equipmentClass;
		this.equipment = other.equipment;
		for (EquipmentCapabilityProperty property : other.properties) {
			addProperty(new EquipmentCapabilityProperty(property));
		}
	}

	/**
	 * Adds a property to this element while updating the property to point to it.
	 */
	public void addProperty(EquipmentCapabilityProperty property) {
		property.setCapability(this);
		properties.add(property);
	}

	/**
	 * Duplicates this capability and its properties while changing its parent
	 * capability and its start and end dates. Properties are also duplicated,
	 * but not the equipment or the equipment class.
	 * 
	 * Mostly useful to services that may need to use existing capabilities
	 * without start/end dates as templates.
	 */
	public EquipmentCapability duplicateFor(ProductionCapability otherCapability, Calendar startTime, Calendar endTime)
	{
		final EquipmentCapability duplicate = new EquipmentCapability(this);

		duplicate.setProductionCapability(otherCapability);
		duplicate.setStartTime(startTime);
		duplicate.setEndTime(endTime);

		return duplicate;
	}

	public static List<EquipmentCapability> findEarliestAvailableOf(EquipmentClass equipmentClass, Set<Equipment> acceptableParents, Calendar earliestDate) {
		TypedQuery<EquipmentCapability> query;
		if (acceptableParents != null && !acceptableParents.isEmpty()) {
			query = entityManager().createNamedQuery("ecapability.findEarliestAvailableWithParentsWithClass", EquipmentCapability.class);

			final List<Long> acceptableParentIds = getEquipmentIds(acceptableParents);
			query.setParameter("acceptableParentIds", acceptableParentIds);
		} else {
			query = entityManager().createNamedQuery("ecapability.findEarliestAvailableWithoutParentsWithClass", EquipmentCapability.class);
		}

		LOGGER.info("Looking for the earliest available capabilities for equipment class #" + equipmentClass.getId());

		query.setParameter("equipmentClassId", equipmentClass.getId());
		query.setParameter("availableType", CapabilityType.AVAILABLE);
		query.setParameter("earliestDate", earliestDate);
		query.setMaxResults(50);

		return query.getResultList();
	}

	public static List<EquipmentCapability> findEarliestAvailable(Equipment equipment, Calendar earliestDate) {
		return entityManager()
			.createNamedQuery("ecapability.findEarliestAvaiableWithSingleId", EquipmentCapability.class)
			.setParameter("availableType", CapabilityType.AVAILABLE)
			.setParameter("equipmentId", equipment.getId())
			.setParameter("earliestDate", earliestDate)
			.setMaxResults(50)
			.getResultList();
	}

	public static List<EquipmentCapability> findByDateRangeAndEquipment(Calendar rangeStart, Calendar rangeEnd, Equipment equipment) {
		assert rangeStart.before(rangeEnd);
		return entityManager()
			.createNamedQuery("ecapability.findByDateRangeAndEquipment", EquipmentCapability.class)
			.setParameter("availableType", CapabilityType.AVAILABLE)
			.setParameter("startTime", rangeStart)
			.setParameter("endTime", rangeEnd)
			.setParameter("equipmentId", equipment.getId())
			.getResultList();
	}

	public static List<EquipmentCapability> findByDateRangeAndEquipmentClass(Calendar rangeStart, Calendar rangeEnd, Set<Equipment> acceptableParents, EquipmentClass equipmentClass) {
		assert rangeStart.before(rangeEnd);

		final String queryName = acceptableParents == null ? "ecapability.findByDateRangeAndEquipmentClass" : "ecapability.findByDateRangeAndParentsAndEquipmentClass";
		final TypedQuery<EquipmentCapability> query = entityManager().createNamedQuery(queryName, EquipmentCapability.class);
		if (acceptableParents != null) {
			query.setParameter("acceptableParentIds", acceptableParents == null ? null : getEquipmentIds(acceptableParents));
		}
		return query
			.setParameter("availableType", CapabilityType.AVAILABLE)
			.setParameter("startTime", rangeStart)
			.setParameter("endTime", rangeEnd)
			.setParameter("equipmentClassId", equipmentClass.getId())
			.getResultList();
	}

	public static List<EquipmentCapability> findStartTimeSet() {
		final TypedQuery<EquipmentCapability> query = entityManager().createNamedQuery("ecapability.findStartTimeSet", EquipmentCapability.class);
		return query
			.setParameter("availableType", CapabilityType.AVAILABLE)
			.getResultList();
	}

	private static List<Long> getEquipmentIds(Set<Equipment> eqs) {
		final List<Long> acceptableParentIds = new ArrayList<Long>();
		for (Equipment eq : eqs) {
			acceptableParentIds.add(eq.getId());
		}
		return acceptableParentIds;
	}

}
