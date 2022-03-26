package es.uca.b2mml.domain.capability;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.CapabilityType;
import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural(value="PersonnelCapabilities")
@Check(constraints="((person IS NULL) <> (personnel_class IS NULL)) AND end_time > start_time")
@NamedQueries({
	@NamedQuery(
		name="pcapability.findByRangeAndClass",
		query="SELECT p FROM PersonnelCapability p WHERE p.type = :availableType AND p.quantity.quantityValue > 0 AND ((:startTime >= p.startTime AND :startTime < p.endTime) OR (:endTime > p.startTime AND :endTime <= p.endTime)) AND :personClassId IN (SELECT c.id FROM p.person.classes c)"
	),
	@NamedQuery(
		name="pcapability.findByRangeAndPerson",
		query="SELECT p FROM PersonnelCapability p WHERE p.type = :availableType AND p.quantity.quantityValue > 0 AND ((:startTime >= p.startTime AND :startTime < p.endTime) OR (:endTime > p.startTime AND :endTime <= p.endTime)) AND p.person.id = :personId"
	)
})
public class PersonnelCapability extends ChildCapability {

    /**
     */
    @ManyToOne
    private PersonClass personnelClass;

    /**
     */
    @ManyToOne
    private Person person;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy="capability", fetch=FetchType.LAZY)
    private Set<PersonnelCapabilityProperty> properties = new HashSet<PersonnelCapabilityProperty>();

	public PersonnelCapability() {
		super();
	}

	public PersonnelCapability(PersonnelCapability other) {
		super(other);

		this.personnelClass = other.personnelClass;
		this.person = other.person;

		for (PersonnelCapabilityProperty property : other.properties) {
			addProperty(new PersonnelCapabilityProperty(property));
		}
	}

	public void addProperty(PersonnelCapabilityProperty property) {
		property.setCapability(this);
		properties.add(property);
	}

	public PersonnelCapability duplicateFor(ProductionCapability otherCapability, Calendar startTime, Calendar endTime) {
		final PersonnelCapability duplicate = new PersonnelCapability(this);

		duplicate.setProductionCapability(otherCapability);
		duplicate.setStartTime(startTime);
		duplicate.setEndTime(endTime);

		return duplicate;
	}

	public static List<PersonnelCapability> findByDateRangeAndClass(Calendar rangeStart, Calendar rangeEnd, PersonClass personClass) {
		return entityManager()
			.createNamedQuery("pcapability.findByRangeAndClass", PersonnelCapability.class)
			.setParameter("availableType", CapabilityType.AVAILABLE)
			.setParameter("startTime", rangeStart)
			.setParameter("endTime", rangeEnd)
			.setParameter("personClassId", personClass.getId())
			.getResultList();
	}

	public static List<PersonnelCapability> findByDateRangeAndPerson(Calendar rangeStart, Calendar rangeEnd, Person person) {
		return entityManager()
			.createNamedQuery("pcapability.findByRangeAndPerson", PersonnelCapability.class)
			.setParameter("availableType", CapabilityType.AVAILABLE)
			.setParameter("startTime", rangeStart)
			.setParameter("endTime", rangeEnd)
			.setParameter("personId", person.getId())
			.getResultList();
	}
}
