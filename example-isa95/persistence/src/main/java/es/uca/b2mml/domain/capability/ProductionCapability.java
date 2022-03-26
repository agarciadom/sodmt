package es.uca.b2mml.domain.capability;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.dates.DayFilter;
import es.uca.b2mml.domain.psegment.ProcessSegment;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural(value="ProductionCapabilities")
public class ProductionCapability extends Capability {

	// TODO: add 'Process Segment' references to the capabilities instead of duplicating all these classes
	@ManyToOne
	private ProcessSegment segment;

	// TODO: note that properties for process segments seem to have both a value and a quantity (copy/paste error?)

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String capabilityId = "CAP-";

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar publishedDate = Calendar.getInstance();

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy="productionCapability", fetch=FetchType.LAZY)
    private Set<PersonnelCapability> personnelCapabilities = new HashSet<PersonnelCapability>();

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy="productionCapability", fetch=FetchType.LAZY)
    private Set<EquipmentCapability> equipmentCapabilities = new HashSet<EquipmentCapability>();

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy="productionCapability", fetch=FetchType.LAZY)
    private Set<MaterialCapability> materialCapabilities = new HashSet<MaterialCapability>();

    /**
	 * Returns all the {@link ProductionCapability} objects without a start date
	 * nor an end date.
	 */
	public static List<ProductionCapability> findAllCapabilitiesWithoutDates() {
		return entityManager()
			.createQuery("SELECT c FROM ProductionCapability c WHERE c.startTime IS NULL AND c.endTime IS NULL", ProductionCapability.class)
			.getResultList();
	}

	/**
     * Default constructor.
     */
    public ProductionCapability() {
    	// default no-arg ctor for Hibernate et al
    }

    /**
     * Copy constructor.
     */
    public ProductionCapability(ProductionCapability other) {
    	super(other);
    	this.segment = other.segment;
    	this.publishedDate = other.publishedDate;

    	// This *will* make the insert fail if the user doesn't specify a different one (and that's good!)
    	this.capabilityId = other.capabilityId;

    	for (PersonnelCapability pc : other.personnelCapabilities) {
    		addCapability(new PersonnelCapability(pc));
    	}
    	for (EquipmentCapability ec : other.equipmentCapabilities) {
    		addCapability(new EquipmentCapability(ec));
    	}
    	for (MaterialCapability mc : other.materialCapabilities) {
    		addCapability(new MaterialCapability(mc));
    	}
    }

    public void addCapability(PersonnelCapability c) {
    	c.setProductionCapability(this);
    	personnelCapabilities.add(c);
	}

    public void addCapability(EquipmentCapability c) {
    	c.setProductionCapability(this);
    	equipmentCapabilities.add(c);
	}

    public void addCapability(MaterialCapability c) {
    	c.setProductionCapability(this);
    	materialCapabilities.add(c);
	}

	public ProductionCapability duplicateFor(String id, Calendar startTime, Calendar endTime) {
		final ProductionCapability prodC = new ProductionCapability(this);
		prodC.setCapabilityId(id);
		prodC.setStartTime(startTime);
		prodC.setEndTime(endTime);

		for (PersonnelCapability pc : prodC.personnelCapabilities) {
			pc.setStartTime(startTime);
			pc.setEndTime(endTime);
		}
		for (EquipmentCapability pc : prodC.equipmentCapabilities) {
			pc.setStartTime(startTime);
			pc.setEndTime(endTime);
		}
		for (MaterialCapability pc : prodC.materialCapabilities) {
			pc.setStartTime(startTime);
			pc.setEndTime(endTime);
		}

		return prodC;
	}

	public List<ProductionCapability> duplicateDailyDuring(Unit dayUnit, Calendar startTime, Calendar endTime, DayFilter filter) {
		final QuantityWithUnit oneDay = new QuantityWithUnit(1, dayUnit);
		final List<ProductionCapability> duplicates = new ArrayList<ProductionCapability>();

		final SimpleDateFormat suffixDateFormat = new SimpleDateFormat("yyyyMMdd");
		while (startTime.before(endTime)) {
			final String suffix = suffixDateFormat.format(startTime.getTime());
			final Calendar nextDay = (Calendar)startTime.clone();
			nextDay.add(Calendar.DAY_OF_MONTH, 1);

			if (filter.acceptDay(startTime)) {
				final ProductionCapability duplicate = this.duplicateFor(this.getCapabilityId() + "-" + suffix, startTime, nextDay);
				for (PersonnelCapability pc : duplicate.getPersonnelCapabilities()) {
					pc.setQuantity(pc.getQuantity().multiply(oneDay));
				}
				for (EquipmentCapability ec : duplicate.getEquipmentCapabilities()) {
					ec.setQuantity(ec.getQuantity().multiply(oneDay));
				}
				for (MaterialCapability mc : duplicate.getMaterialCapabilities()) {
					mc.setQuantity(mc.getQuantity().multiply(oneDay));
				}
				duplicates.add(duplicate);
			}
			startTime = nextDay;
		}

		return duplicates;
	}
}
