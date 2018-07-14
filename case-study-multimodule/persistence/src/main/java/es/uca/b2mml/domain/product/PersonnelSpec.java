package es.uca.b2mml.domain.product;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class PersonnelSpec extends Specification {

    /**
     */
    @NotNull
    @ManyToOne
    private ProductSegment segment;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<PersonClass> personnelClass = new HashSet<PersonClass>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Person> people = new HashSet<Person>();

    /**
     */
    @OneToMany(mappedBy="specification")
    private Set<PersonnelSpecProperty> properties = new HashSet<PersonnelSpecProperty>();
}
