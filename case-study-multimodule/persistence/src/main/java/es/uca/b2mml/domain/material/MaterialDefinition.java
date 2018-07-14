package es.uca.b2mml.domain.material;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
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
@NamedQueries(
	@NamedQuery(
		name="mdefinition.findByName",
		query="SELECT d FROM MaterialDefinition d WHERE d.definitionId = :definitionId"
	)
)
public class MaterialDefinition {
    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String definitionId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @ManyToMany
    private Set<MaterialClass> materialClasses = new HashSet<MaterialClass>();

    @OneToMany(mappedBy="definition", fetch=FetchType.LAZY)
    private Set<MaterialLot> materialLots = new HashSet<MaterialLot>();

    @OneToMany(mappedBy="definition", fetch=FetchType.LAZY)
    private Set<MaterialDefinitionProperty> properties = new HashSet<MaterialDefinitionProperty>();

	public static MaterialDefinition findByDefinitionId(String definitionId) {
		return entityManager()
			.createNamedQuery("mdefinition.findByName", MaterialDefinition.class)
			.setParameter("definitionId", definitionId)
			.getSingleResult();
	}
}
