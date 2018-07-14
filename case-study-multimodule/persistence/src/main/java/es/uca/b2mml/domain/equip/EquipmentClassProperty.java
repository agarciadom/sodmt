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
@RooPlural(value="EquipmentClassProperties")
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "equipment_class", "name" }) })
public class EquipmentClassProperty extends Property {
    /**
     */
    @NotNull
    @ManyToOne
    private EquipmentClass equipmentClass;

	public EquipmentClassProperty() {
		super();
	}

	public EquipmentClassProperty(EquipmentClassProperty other) {
		super(other);
		this.equipmentClass = other.equipmentClass;
	}
    
}
