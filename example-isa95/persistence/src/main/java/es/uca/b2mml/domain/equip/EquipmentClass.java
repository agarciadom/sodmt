package es.uca.b2mml.domain.equip;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@NamedQueries(
	@NamedQuery(name=EquipmentClass.QUERY_FIND_BY_NAME, query="SELECT e FROM EquipmentClass e WHERE e.name = :name")
)
public class EquipmentClass {

	static final String QUERY_FIND_BY_NAME = "eclass.findByName";

	/**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String name;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE}, mappedBy = "classes")
    private Set<Equipment> members = new HashSet<Equipment>();

	public static EquipmentClass findByName(String name) {
		return entityManager()
			.createNamedQuery(QUERY_FIND_BY_NAME, EquipmentClass.class)
			.setParameter("name", name)
			.getSingleResult();
	}
}
