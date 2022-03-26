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

import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class PersonnelActual {

    /**
     */
    @NotNull
    @ManyToOne
    private SegmentResponse segmentResponse;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<PersonClass> personnelClasses = new HashSet<PersonClass>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Person> people = new HashSet<Person>();

    /**
     */
    @Size(max = 200)
    private String description;

    @OneToMany(mappedBy="personnelActual", fetch=FetchType.LAZY)
    private Set<PersonnelActualProperty> properties = new HashSet<PersonnelActualProperty>(); 
}
