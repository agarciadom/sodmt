package es.uca.b2mml.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;

import org.apache.commons.lang3.tuple.Pair;

/**
 * Immutable numeric quantity with an optional unit. Supports a few simple
 * arithmetic operations: addition, subtraction, comparison and multiplication.
 * Supports adimensional quantities, linear units (e.g. meters or liters but not
 * square meters) and linear ratios (m/s, pieces/h).
 * 
 * @author antonio
 */
@Embeddable
public class QuantityWithUnit {

	@Column(columnDefinition="numeric(19, 4)")
	@Digits(integer=10, fraction=4)
	private BigDecimal quantityValue;

	@ManyToOne
	private Unit quantityUnit;

	/**
	 * Default constructor for reflection-based tools (i.e. Hibernate).
	 */
	public QuantityWithUnit() {
		// empty ctor for Hibernate et al
	}

	/**
	 * Copy constructor.
	 */
	public QuantityWithUnit(QuantityWithUnit other) {
		this.quantityValue = other.quantityValue;
		this.quantityUnit = other.quantityUnit;
	}

	/**
	 * Constructor for adimensional quantities.
	 */
	public QuantityWithUnit(BigDecimal value) {
		this.quantityValue = value;
	}

	/**
	 * Constructor for adimensional quantities.
	 */
	public QuantityWithUnit(BigInteger value) {
		this(new BigDecimal(value));
	}

	/**
	 * Constructor for adimensional quantities. 
	 */
	public QuantityWithUnit(long value) {
		this(new BigDecimal(value));
	}

	/**
	 * Constructor for dimensional quantities.
	 */
	public QuantityWithUnit(BigDecimal value, Unit unit) {
		this(value);
		this.quantityUnit = unit;
	}

	/**
	 * Constructor for dimensional quantities.
	 */
	public QuantityWithUnit(BigInteger value, Unit unit) {
		this(new BigDecimal(value), unit);
	}

	/**
	 * Constructor for dimensional quantities.
	 */
	public QuantityWithUnit(long value, Unit unit) {
		this(new BigDecimal(value), unit);
	}

	public BigDecimal getQuantityValue() {
		return quantityValue;
	}

	public Unit getQuantityUnit() {
		return quantityUnit;
	}

	public QuantityWithUnit negate() {
		return new QuantityWithUnit(quantityValue.negate(), quantityUnit);
	}

	public QuantityWithUnit inverse() {
		final BigDecimal inverseValue = BigDecimal.ONE.divide(getQuantityValue(), MathContext.DECIMAL128);
	
		Unit inverseUnit = null;
		if (getQuantityUnit() != null) {
			inverseUnit = new Unit();
			if (getQuantityUnit().getFractionUnit() == null) {
				inverseUnit.setFractionUnit(getQuantityUnit());
			} else {
				inverseUnit.setBaseUnit(getQuantityUnit().getFractionUnit());
				inverseUnit.setFractionUnit(getQuantityUnit().getBaseUnit());
			}
		}
	
		return new QuantityWithUnit(inverseValue, inverseUnit);
	}

	/**
	 * Converts the quantity to the specified unit.
	 * 
	 * @throws IncompatibleUnitsException
	 *             The target unit is not compatible with this one (e.g.
	 *             converting meters to liters).
	 */
	public QuantityWithUnit convertTo(Unit target) throws IncompatibleUnitsException {
		if (quantityUnit == target) {
			return this;
		} else if (quantityUnit == null) {
			throw new IncompatibleUnitsException("Cannot convert an adimensional quantity into a dimensional quantity");
		} else if (target == null) {
			throw new IncompatibleUnitsException("Cannot convert a dimensional quantity into a dimensional quantity");
		} else if (quantityUnit.getFractionUnit() == null && target.getFractionUnit() != null) {
			throw new IncompatibleUnitsException("Cannot convert non-fractional unit into fractional unit");
		} else if (quantityUnit.getFractionUnit() != null && target.getFractionUnit() == null) {
			throw new IncompatibleUnitsException("Cannot convert fractional unit into non-fractional unit");
		}

		final Pair<Unit, BigDecimal> leftConversion = quantityUnit.getRootUnitConversion();
		final Pair<Unit, BigDecimal> rightConversion = target.getRootUnitConversion();
		final String leftRootName = leftConversion.getLeft().getRootName();
		final String rightRootName = rightConversion.getLeft().getRootName();
		if (!leftRootName.equals(rightRootName)) {
			throw new IncompatibleUnitsException(
				String.format(
					"Cannot convert %s into %s: root units %s and %s are different",
					quantityUnit.getName(),
					target.getName(),
					leftRootName,
					rightRootName));
		}

		final BigDecimal leftConversionFactor = leftConversion.getRight();
		final BigDecimal rightConversionFactor = rightConversion.getRight();
		final BigDecimal leftConverted = quantityValue.multiply(leftConversionFactor);

		final BigDecimal newValue = leftConverted.divide(rightConversionFactor, MathContext.DECIMAL128);
		return new QuantityWithUnit(newValue, target);
	}

	public int compareTo(QuantityWithUnit r) {
		final BigDecimal rConverted = r.convertTo(quantityUnit).getQuantityValue();
		return quantityValue.compareTo(rConverted);
	}

	public QuantityWithUnit add(QuantityWithUnit r) {
		final BigDecimal rConverted = r.convertTo(quantityUnit).getQuantityValue();
		return new QuantityWithUnit(quantityValue.add(rConverted), quantityUnit);
	}

	public QuantityWithUnit subtract(QuantityWithUnit r) {
		return this.add(r.negate());
	}

	public QuantityWithUnit multiply(QuantityWithUnit r) throws IncompatibleUnitsException {
		// Check if any of the two quantities is adimensional
		if (getQuantityUnit() == null) {
			final BigDecimal rMultiplied = getQuantityValue().multiply(r.getQuantityValue());
			return new QuantityWithUnit(rMultiplied, r.getQuantityUnit());
		}
		else if (r.getQuantityUnit() == null) {
			final BigDecimal rMultiplied = getQuantityValue().multiply(r.getQuantityValue());
			return new QuantityWithUnit(rMultiplied, getQuantityUnit());
		}

		/*
		 * At this point, both quantities are dimensional: one has a fractional
		 * part (e.g. m/s) and the other does not (e.g. s).
		 */
		final Unit lFractionUnit = getQuantityUnit().getFractionUnit();
		final Unit rFractionUnit = r.getQuantityUnit().getFractionUnit();
		QuantityWithUnit fraction;
		QuantityWithUnit nonFraction;
		if (lFractionUnit != null && rFractionUnit != null) {
			throw new IncompatibleUnitsException("Exactly one of the units needs to be a fraction, but both are fractions");
		}
		else if (lFractionUnit != null) {
			fraction = this;
			nonFraction = r;
		}
		else {
			fraction = r;
			nonFraction = this;
		}

		try {
			final Unit targetUnit = new Unit();
			targetUnit.setBaseUnit(fraction.getQuantityUnit().getBaseUnit());
			targetUnit.setFractionUnit(nonFraction.getQuantityUnit());
			final BigDecimal fractionConverted = fraction.convertTo(targetUnit).getQuantityValue();

			/*
			 * Fractional part is compatible with non-fractional part of the
			 * other operand: they cancel each other out (e.g. m/s * s = m)
			 */
			final BigDecimal result = fractionConverted.multiply(nonFraction.getQuantityValue());
			return new QuantityWithUnit(result, fraction.getQuantityUnit().getBaseUnit());
		} catch (IncompatibleUnitsException ex) {
			/*
			 * Even if they're incomparable, we might be able to combine the
			 * units if the fraction is a simple division (e.g. m * 1/s = m/s).
			 */
			if (fraction.getQuantityUnit().getBaseUnit() == null) {
				final BigDecimal result = nonFraction.getQuantityValue().multiply(fraction.getQuantityValue());
				final Unit unit = new Unit();
				unit.setBaseUnit(nonFraction.getQuantityUnit());
				unit.setFractionUnit(fraction.getQuantityUnit().getFractionUnit());
				return new QuantityWithUnit(result, unit);
			}
			else {
				throw ex;
			}
		}
	}
	
	public QuantityWithUnit divide(QuantityWithUnit r) {
		return this.multiply(r.inverse());
	}

	public boolean greaterThanZero() {
		return quantityValue.compareTo(BigDecimal.ZERO) > 0;
	}

	@Override
	public String toString() {
		return quantityValue.toString() + " " + quantityUnit.getName();
	}
}
