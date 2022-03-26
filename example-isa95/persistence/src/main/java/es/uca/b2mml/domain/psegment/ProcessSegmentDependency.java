package es.uca.b2mml.domain.psegment;
import java.math.BigDecimal;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.ExecutionDependencyType;
import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural(value="ProcessSegmentDependencies")
@Check(constraints="segmenta <> segmentb")
public class ProcessSegmentDependency {

    /**
     */
    @NotNull
    @ManyToOne
    private ProcessSegment segmentA;

    /**
     */
    @NotNull
    @ManyToOne
    private ProcessSegment segmentB;

    /**
     */
    @Size(max = 200)
    private String description;

    @Embedded
    @AttributeOverride(name="quantityValue", column=@Column(name="timing_factor"))
    @AssociationOverride(name="quantityUnit", joinColumns=@JoinColumn(name="timing_unit"))
    private QuantityWithUnit timingFactor;

    /**
     */
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private ExecutionDependencyType dependencyType;

	public BigDecimal getTimingFactorValue() {
		return timingFactor != null ? timingFactor.getQuantityValue() : null;
	}

	public void setTimingFactorValue(BigDecimal value) {
		if (timingFactor != null) {
			timingFactor = new QuantityWithUnit(value, timingFactor.getQuantityUnit());
		}
		else {
			timingFactor = new QuantityWithUnit(value);
		}
	}

	public Unit getTimingFactorUnit() {
		return timingFactor != null ? timingFactor.getQuantityUnit() : null;
	}

	public void setTimingFactorUnit(Unit unit) {
		if (timingFactor != null) {
			timingFactor = new QuantityWithUnit(timingFactor.getQuantityValue(), unit);
		}
		else {
			timingFactor = new QuantityWithUnit(BigDecimal.ZERO, unit);
		}
	}
}
