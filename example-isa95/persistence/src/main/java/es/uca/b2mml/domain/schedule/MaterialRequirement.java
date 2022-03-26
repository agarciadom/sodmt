package es.uca.b2mml.domain.schedule;
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
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialSublot;

/**
 * Persistent entity for the ISA-95 'Material consumed requirement', 'Material
 * produced requirement' and 'Consumable expected' object types.
 *
 * @author Antonio García-Domínguez
 */
@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MaterialRequirement {

    /**
     */
    @NotNull
    @ManyToOne
    private SegmentRequirement segmentRequirement;

    /**
     */
    @ManyToMany
    private Set<MaterialClass> materialClasses = new HashSet<MaterialClass>();

    /**
     */
    @ManyToMany
    private Set<MaterialDefinition> materialDefinitions = new HashSet<MaterialDefinition>();

    /**
     */
    @ManyToMany
    private Set<MaterialLot> materialLots = new HashSet<MaterialLot>();

    /**
     */
    @ManyToMany
    private Set<MaterialSublot> materialSublots = new HashSet<MaterialSublot>();

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @ManyToOne
    private Equipment location;

	/**
	 * Flag which indicates that the material is consumed if it is
	 * <code>true</code>. Otherwise, the material is produced by the segment.
	 * 
	 * This flag allows using the same class for the 'Material produced
	 * requirement', 'Material consumed requirement' and 'Consumable expected'
	 * object types in the ISA-95 spec.
	 */
    @NotNull
    private Boolean consumed = true;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="materialRequirement", fetch=FetchType.LAZY)
    private Set<MaterialRequirementProperty> properties = new HashSet<MaterialRequirementProperty>();
}
