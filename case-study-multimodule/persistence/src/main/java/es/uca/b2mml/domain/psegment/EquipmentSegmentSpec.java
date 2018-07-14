package es.uca.b2mml.domain.psegment;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="((quantity_value IS NULL) = (quantity_unit IS NULL)) AND ((equipment IS NULL) <> (equipment_class IS NULL))")
public class EquipmentSegmentSpec extends SegmentSpec {
	@ManyToOne
	private Equipment equipment;

	@ManyToOne
	private EquipmentClass equipmentClass;

	@OneToMany(mappedBy="specification")
	private Set<EquipmentSegmentSpecProperty> properties = new HashSet<EquipmentSegmentSpecProperty>();
}
