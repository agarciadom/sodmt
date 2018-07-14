package es.uca.b2mml.domain.equip;
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
@RooPlural(value="EquipmentProperties")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames={"equipment", "name"})})
public class EquipmentProperty extends Property {
    /**
     */
    @NotNull
    @ManyToOne
    private Equipment equipment;

	public EquipmentProperty() {
		super();
	}

	public EquipmentProperty(EquipmentProperty other) {
		super(other);
		this.equipment = other.equipment;
	}

}
