package es.uca.b2mml.domain.product;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class EquipmentSpec extends Specification {

    /**
     */
    @NotNull
    @ManyToOne
    private ProductSegment segment;

    /**
     * Additional equipment classes required for this product segment. One
     * piece of equipment from each of these classes would be required.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<EquipmentClass> equipmentClasses = new HashSet<EquipmentClass>();

    /**
     * Additional equipment required for this product segment. All these
     * pieces of equipment would be required.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipment> equipment = new HashSet<Equipment>();

    /**
     */
    @OneToMany(mappedBy="specification")
    private Set<EquipmentSpecProperty> properties = new HashSet<EquipmentSpecProperty>();
}
