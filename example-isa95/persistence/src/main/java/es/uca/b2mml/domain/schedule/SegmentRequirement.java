package es.uca.b2mml.domain.schedule;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
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
import es.uca.b2mml.domain.product.ProductSegment;
import es.uca.b2mml.domain.psegment.ProcessSegment;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="earliest_start_time <= latest_end_time")
public class SegmentRequirement {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String segmentRequirementId;

    /**
     */
    @ManyToOne
    private ProcessSegment processSegment;

    /**
     */
    @ManyToOne
    private ProductSegment productSegment;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar earliestStartTime;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar latestEndTime;

	@Embedded
	@AttributeOverride(name = "quantityValue", column = @Column(name = "duration", columnDefinition="numeric(19, 4)"))
	@AssociationOverride(name = "quantityUnit", joinColumns=@JoinColumn(name="duration_unit"))
    private QuantityWithUnit duration;

    /**
     */
    @NotNull
    @ManyToOne
    private ProductionRequest productionRequest;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="segmentRequirement", fetch=FetchType.LAZY)
    private Set<EquipmentRequirement> equipmentRequirements = new HashSet<EquipmentRequirement>();

    @OneToMany(cascade=CascadeType.ALL, mappedBy="segmentRequirement", fetch=FetchType.LAZY)
    private Set<PersonnelRequirement> personnelRequirements = new HashSet<PersonnelRequirement>();

    @OneToMany(cascade=CascadeType.ALL, mappedBy="segmentRequirement", fetch=FetchType.LAZY)
    private Set<MaterialRequirement> materialRequirements = new HashSet<MaterialRequirement>();

    public SegmentRequirement() {
    	// default constructor
    }

    public SegmentRequirement(ProductionRequest request, ProductSegment productSegment, ProcessSegment processSegment) {
		this.productionRequest = request;
		this.productSegment = productSegment;
		this.processSegment = processSegment;
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

	public void addEquipmentRequirement(EquipmentRequirement equipmentRequirement) {
		equipmentRequirement.setSegmentRequirement(this);
		this.equipmentRequirements.add(equipmentRequirement);
	}
}
