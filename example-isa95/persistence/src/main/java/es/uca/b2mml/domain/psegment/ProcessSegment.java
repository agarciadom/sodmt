package es.uca.b2mml.domain.psegment;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Check;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="parent <> id")
public class ProcessSegment {

    /**
     */
    @ManyToOne
    private ProcessSegment parent;

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String segmentId = "SG-";

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @NotNull
    @ManyToOne
    private Equipment location;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar publishedDate = Calendar.getInstance();

	@Embedded
	@AttributeOverride(name = "quantityValue", column = @Column(name = "duration", columnDefinition="numeric(19, 4)"))
	@AssociationOverride(name = "quantityUnit", joinColumns=@JoinColumn(name="duration_unit"))
    private QuantityWithUnit duration;

	@OneToMany(mappedBy="segmentA", fetch=FetchType.LAZY)
	private Set<ProcessSegmentDependency> outgoingDependencies = new HashSet<ProcessSegmentDependency>();

	@OneToMany(mappedBy="segmentB", fetch=FetchType.LAZY)
	private Set<ProcessSegmentDependency> incomingDependencies = new HashSet<ProcessSegmentDependency>();
	
    @OneToMany(mappedBy="processSegment", fetch=FetchType.LAZY)
    private Set<PersonnelSegmentSpec> personnelSpecs = new HashSet<PersonnelSegmentSpec>();

    @OneToMany(mappedBy="processSegment", fetch=FetchType.LAZY)
    private Set<EquipmentSegmentSpec> equipmentSpecs = new HashSet<EquipmentSegmentSpec>();

    @OneToMany(mappedBy="processSegment", fetch=FetchType.LAZY)
    private Set<MaterialSegmentSpec> materialSpecs = new HashSet<MaterialSegmentSpec>();

    public ProcessSegment() {
    	// default ctor for Hibernate et al
    }

    public ProcessSegment(String segmentId) {
    	this.segmentId = segmentId;
	}

	public BigDecimal getDurationValue() {
		return duration != null ? duration.getQuantityValue() : null;
	}

	public void setDurationValue(BigDecimal value) {
		if (duration != null) {
			duration = new QuantityWithUnit(value, duration.getQuantityUnit());
		}
		else {
			duration = new QuantityWithUnit(value);
		}
	}

	public Unit getDurationUnit() {
		return duration != null ? duration.getQuantityUnit() : null;
	}

	public void setDurationUnit(Unit unit) {
		if (duration != null) {
			duration = new QuantityWithUnit(duration.getQuantityValue(), unit);
		}
		else {
			duration = new QuantityWithUnit(BigDecimal.ZERO, unit);
		}
	}
}
