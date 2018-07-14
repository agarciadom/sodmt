package es.uca.b2mml.domain.capability;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.CapabilityType;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.material.MaterialUseType;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural(value="MaterialCapabilities")
@Check(constraints="((CASE WHEN material_class IS NULL THEN 0 ELSE 1 END) + (CASE WHEN material_definition IS NULL THEN 0 ELSE 1 END) + (CASE WHEN material_lot IS NULL THEN 0 ELSE 1 END) + (CASE WHEN material_sublot IS NULL THEN 0 ELSE 1 END)) = 1 AND end_time > start_time")
@NamedQueries({
	@NamedQuery(
		name="mcapability.findByDefinition",
		query="SELECT c FROM MaterialCapability c WHERE c.type = :availableType AND c.quantity.quantityValue > 0 AND c.materialDefinition.id = :materialDefinitionId"
	),
	@NamedQuery(
		name="mcapability.findByClass",
		query="SELECT c FROM MaterialCapability c WHERE c.type = :availableType AND c.quantity.quantityValue > 0 AND c.materialClass.id = :materialClassId"
	)
})
public class MaterialCapability extends ChildCapability {

    /**
     */
    @ManyToOne
    private MaterialClass materialClass;

    /**
     */
    @ManyToOne
    private MaterialDefinition materialDefinition;

    /**
     */
    @ManyToOne
    private MaterialLot materialLot;

    /**
     */
    @ManyToOne
    private MaterialSublot materialSublot;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private MaterialUseType materialUse;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy="capability", fetch=FetchType.LAZY)
    private Set<MaterialCapabilityProperty> properties = new HashSet<MaterialCapabilityProperty>();

    /**
     * Default constructor.
     */
	public MaterialCapability() {
		super();
	}

	/**
	 * Copy constructor.
	 */
	public MaterialCapability(MaterialCapability other) {
		super(other);

		this.materialClass = other.materialClass;
		this.materialDefinition = other.materialDefinition;
		this.materialLot = other.materialLot;
		this.materialSublot = other.materialSublot;
		this.materialUse = other.materialUse;

		for (MaterialCapabilityProperty property : other.properties) {
			addProperty(new MaterialCapabilityProperty(property));
		}
	}

	public void addProperty(MaterialCapabilityProperty property) {
		property.setCapability(this);
		properties.add(property);
	}

	public MaterialCapability duplicateFor(ProductionCapability otherCapability, Calendar startTime, Calendar endTime) {
		final MaterialCapability duplicate = new MaterialCapability(this);

		duplicate.setProductionCapability(otherCapability);
		duplicate.setStartTime(startTime);
		duplicate.setEndTime(endTime);

		return duplicate;
	}

	public static List<MaterialCapability> findByDefinition(MaterialDefinition material) {
		return entityManager()
			.createNamedQuery("mcapability.findByDefinition", MaterialCapability.class)
			.setParameter("availableType", CapabilityType.AVAILABLE)
			.setParameter("materialDefinitionId", material.getId())
			.getResultList();
	}

	public static List<MaterialCapability> findByClass(MaterialClass materialClass) {
		return entityManager()
			.createNamedQuery("mcapability.findByClass", MaterialCapability.class)
			.setParameter("availableType", CapabilityType.AVAILABLE)
			.setParameter("materialClassId", materialClass.getId())
			.getResultList();
	}
}
