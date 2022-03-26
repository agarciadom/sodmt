package es.uca.b2mml.domain.people;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@NamedQueries({
	@NamedQuery(name="pclass.findByName", query="SELECT c FROM PersonClass c WHERE c.name = :name")
})
public class PersonClass {

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
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "classes")
    private Set<Person> members = new HashSet<Person>();

	public static PersonClass findByName(String name) {
		return entityManager()
			.createNamedQuery("pclass.findByName", PersonClass.class)
			.setParameter("name", name)
			.getSingleResult();
	}
}
