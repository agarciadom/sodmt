package es.uca.b2mml.domain.people;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;

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
	@NamedQuery(name="person.findByName", query="SELECT p FROM Person p WHERE p.name = :name")
})
public class Person {

    /**
     */
    @NotNull
    @Size(min = 1, max = 100)
    private String name;

    /**
     */
    @NotNull
    @Size(max = 200)
    private String surnames;

    /**
     */
    @NotNull
    @Column(unique = true)
    private String nationalID;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<PersonClass> classes = new HashSet<PersonClass>();

	public static Person findByName(String name) {
		return entityManager()
			.createNamedQuery("person.findByName", Person.class)
			.setParameter("name", name)
			.getSingleResult();
	}
}
