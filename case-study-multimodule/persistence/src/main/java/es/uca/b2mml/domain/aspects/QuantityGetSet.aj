package es.uca.b2mml.domain.aspects;

import java.math.BigDecimal;

import javax.persistence.Embedded;

import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;

/**
 * Adds the 'quantity' field and the appropriate setters to the types that do
 * not need to change the resulting column names. It's our poor man's version of
 * a mixin.
 */
public aspect QuantityGetSet {

	interface HasQuantityGetSet {}

	declare parents: (
		es.uca.b2mml.domain.PropertyWithQuantity
		|| es.uca.b2mml.domain.capability.ChildCapability
		|| es.uca.b2mml.domain.perform.EquipmentActual
		|| es.uca.b2mml.domain.perform.MaterialActual
		|| es.uca.b2mml.domain.perform.PersonnelActual
		|| es.uca.b2mml.domain.product.Specification
		|| es.uca.b2mml.domain.psegment.SegmentSpec
		|| es.uca.b2mml.domain.schedule.EquipmentRequirement
		|| es.uca.b2mml.domain.schedule.MaterialRequirement
		|| es.uca.b2mml.domain.schedule.PersonnelRequirement
	) implements HasQuantityGetSet;

	@Embedded
	private QuantityWithUnit HasQuantityGetSet.quantity;

	public QuantityWithUnit HasQuantityGetSet.getQuantity() {
		return quantity;
	}

	public void HasQuantityGetSet.setQuantity(QuantityWithUnit qty) {
		this.quantity = qty;
	}

	public BigDecimal HasQuantityGetSet.getQuantityValue() {
		return quantity != null ? quantity.getQuantityValue() : null;
	}

	public void HasQuantityGetSet.setQuantityValue(BigDecimal value) {
		if (quantity != null) {
			quantity = new QuantityWithUnit(value, quantity.getQuantityUnit());
		}
		else {
			quantity = new QuantityWithUnit(value);
		}
	}

	public Unit HasQuantityGetSet.getQuantityUnit() {
		return quantity != null ? quantity.getQuantityUnit() : null;
	}

	public void HasQuantityGetSet.setQuantityUnit(Unit unit) {
		if (quantity != null) {
			quantity = new QuantityWithUnit(quantity.getQuantityValue(), unit);
		}
		else {
			quantity = new QuantityWithUnit(BigDecimal.ZERO, unit);
		}
	}
}
