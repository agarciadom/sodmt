package es.uca.b2mml.domain;
import java.math.BigDecimal;
import java.math.MathContext;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="base_unit <> id AND fraction_unit <> id")
@NamedQueries({
	@NamedQuery(name="unit.findBySystem", query="SELECT u FROM Unit u WHERE u.systemType = :systemType"),
	@NamedQuery(name="unit.findByName", query="SELECT u FROM Unit u WHERE u.name = :name")
})
public class Unit {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String name;

    /**
     * Base unit for this quantity that can be used for conversions.
     * For instance, all units of time should have "seconds" as their
     * base unit. If this is a base unit, this field should be kept unset.
     */
    @ManyToOne
    private Unit baseUnit;

    /**
     * Unit that is used as a fraction. In "m/s", this would be "seconds".
     */
    @ManyToOne
    private Unit fractionUnit;

    /**
	 * Number indicating how many times the base unit is contained into this
	 * unit. For instance, if the base unit were "Seconds" and this was
	 * "Minutes", it'd be 60 for minutes. This field should be set to 1 for
	 * fractional units (e.g. meters per second).
	 * 
	 * TODO: switch to the Commons Math Fractional type.
	 */
    @NotNull
    @Column(precision=19, scale=4)
    private BigDecimal conversionFactor = BigDecimal.ONE;

    @Column(unique = true)
    @Enumerated(EnumType.ORDINAL)
    private SystemUnitType systemType;

    /**
     * Default constructor for Hibernate et al. Regular clients should
     * use the other constructors in order to preserve class invariants.
     */
    public Unit() {
    	// empty
    }

    /**
     * Constructor for basic units.
     */
    public Unit(String name) {
    	this.name = name;
    }

    /**
     * Convenience constructor for derived units.
     */
    public Unit(String name, Unit baseUnit, BigDecimal factor) {
    	this.baseUnit = baseUnit;
    	this.conversionFactor = factor;
    	this.name = name;
    }

    /**
     * Convenience 2-arg constructor for fractional units.
     */
    public Unit(Unit numeratorUnit, Unit denominatorUnit) {
    	baseUnit = numeratorUnit;
    	fractionUnit = denominatorUnit;

    	name = baseUnit == null ? "" : baseUnit.name;
    	if (this.fractionUnit != null) {
    		name += "/" + denominatorUnit.name;
    	}
    }

    /**
     * Returns the name automatically constructed from the root types of this type.
     * Two units are said to be compatible if they have the same root name (they
     * can both be converted to the same parent unit).
     */
    public String getRootName() {
    	if (baseUnit == null && fractionUnit == null) {
    		return name;
    	}
    	else {
    		String numeratorName = baseUnit == null ? "" : baseUnit.getRootName();
    		String denominatorName = fractionUnit == null ? null : fractionUnit.getRootName();
    		return numeratorName + (denominatorName != null ? "/" + denominatorName : "");
    	}
    }

    /**
	 * Returns the root unit for this unit and the resulting conversion factor.
	 * The root unit is the first unit in a chain of base units that does not
	 * have a base unit for itself or its fractional part.
	 */
	public Pair<Unit, BigDecimal> getRootUnitConversion() {
		final Pair<Unit, BigDecimal> numConversion =
			baseUnit == null
				? new ImmutablePair<Unit, BigDecimal>(this, BigDecimal.ONE)
				: baseUnit.getRootUnitConversion();

		final Pair<Unit, BigDecimal> denConversion =
			(fractionUnit == null || fractionUnit.getBaseUnit() == null)
				? new ImmutablePair<Unit, BigDecimal>(fractionUnit, BigDecimal.ONE)
				: fractionUnit.getRootUnitConversion();

		final BigDecimal factor = conversionFactor
			.multiply(numConversion.getRight())
			.divide(denConversion.getRight(), MathContext.DECIMAL128);

		Unit compositeUnit;
		if (denConversion.getLeft() == null) {
			compositeUnit = numConversion.getLeft();
		}
		else {
			compositeUnit = new Unit();
			compositeUnit.setBaseUnit(numConversion.getLeft());
			compositeUnit.setFractionUnit(denConversion.getLeft());
		}

		return new ImmutablePair<Unit, BigDecimal>(compositeUnit, factor);
    }

	public boolean isCompatibleWith(Unit other) {
		return getRootName().equals(other.getRootName());
	}

	public static Unit findBySystemType(SystemUnitType type) {
		return entityManager()
			.createNamedQuery("unit.findBySystem", Unit.class)
			.setParameter("systemType", type)
			.getSingleResult();
	}

	public static Unit findByName(String name) {
		return entityManager()
			.createNamedQuery("unit.findByName", Unit.class)
			.setParameter("name", name)
			.getSingleResult();
	}
}
