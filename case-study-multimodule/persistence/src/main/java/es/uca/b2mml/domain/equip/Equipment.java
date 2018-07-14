package es.uca.b2mml.domain.equip;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@NamedQueries({
	@NamedQuery(name="equipment.findByEquipmentId", query="SELECT e FROM Equipment e WHERE e.equipmentId = :equipmentId")
})
public class Equipment {

	@ManyToOne
	private Equipment parent;

	@OneToMany(mappedBy = "parent")
	private Set<Equipment> children;

	/**
     */
	@NotNull
	@Column(unique = true)
	@Size(max = 50)
	private String equipmentId = "EQ-";

	/**
     */
	@Size(max = 200)
	private String description;

	/**
     */
	@NotNull
	@ManyToOne
	private EquipmentType type;

	/**
     */
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE })
	private Set<EquipmentClass> classes = new HashSet<EquipmentClass>();

	public String toString() {
		return "Equipment " + equipmentId;
	}

	public static Equipment findByEquipmentId(String equipmentId) {
		return entityManager()
			.createNamedQuery("equipment.findByEquipmentId", Equipment.class)
			.setParameter("equipmentId", equipmentId)
			.getSingleResult();
	}
}
