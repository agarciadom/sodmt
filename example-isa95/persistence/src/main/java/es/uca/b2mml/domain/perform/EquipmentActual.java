package es.uca.b2mml.domain.perform;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.equip.EquipmentClass;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class EquipmentActual {
    /**
     */
    @NotNull
    @ManyToOne
    private SegmentResponse segmentResponse;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<EquipmentClass> equipmentClasses = new HashSet<EquipmentClass>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipment> equipment = new HashSet<Equipment>();

    /**
     */
    @Size(max = 200)
    private String description;

    @OneToMany(mappedBy="equipmentActual", fetch=FetchType.LAZY)
    private Set<EquipmentActualProperty> properties = new HashSet<EquipmentActualProperty>(); 
}
