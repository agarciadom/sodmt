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
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialSublot;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MaterialActual {

    /**
     */
    @NotNull
    @ManyToOne
    private SegmentResponse segmentResponse;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<MaterialClass> materialClasses = new HashSet<MaterialClass>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<MaterialDefinition> materialDefinitions = new HashSet<MaterialDefinition>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<MaterialLot> materialLots = new HashSet<MaterialLot>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<MaterialSublot> materialSublots = new HashSet<MaterialSublot>();

    /**
     */
    @NotNull
    @ManyToOne
    private Equipment location;

	/**
	 * Flag which indicates that the material is consumed if it is
	 * <code>true</code>. Otherwise, the material is produced by the segment.
	 * 
	 * This flag allows using the same class for the 'Material produced actual',
	 * 'Material consumed actual' and 'Consumable actual' object types in the ISA-95
	 * spec.
	 */
    @NotNull
    private Boolean consumed = true;

    @OneToMany(mappedBy="materialActual", fetch=FetchType.LAZY)
    private Set<MaterialActualProperty> properties = new HashSet<MaterialActualProperty>(); 
}
