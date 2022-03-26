package es.uca.b2mml.domain.capability;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Property;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural(value="EquipmentCapabilityProperties")
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"capability", "name"})})
public class EquipmentCapabilityProperty extends Property {

	@ManyToOne
	@NotNull
	private EquipmentCapability capability;

	public EquipmentCapabilityProperty() {
		super();
	}

	public EquipmentCapabilityProperty(EquipmentCapabilityProperty other) {
		super(other);
		this.capability = other.capability;
	}

	/**
	 * Creates a copy of the property, but for a different capability. Useful
	 * when we want to reuse a capability as a template.
	 */
	public EquipmentCapabilityProperty duplicateFor(EquipmentCapability otherCapability) {
		final EquipmentCapabilityProperty dupl = new EquipmentCapabilityProperty(this);
		dupl.setCapability(otherCapability);
		return dupl;
	}
}
