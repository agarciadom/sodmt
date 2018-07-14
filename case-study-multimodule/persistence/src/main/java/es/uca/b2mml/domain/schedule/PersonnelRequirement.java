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

import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class PersonnelRequirement {

    /**
     */
    @NotNull
    @ManyToOne
    private SegmentRequirement segmentRequirement;

    /**
     */
    @ManyToMany
    private Set<PersonClass> personnelClasses = new HashSet<PersonClass>();

    /**
     */
    @ManyToMany
    private Set<Person> people = new HashSet<Person>();

    /**
     */
    @Size(max = 200)
    private String description;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="personnelRequirement", fetch=FetchType.LAZY)
    private Set<PersonnelRequirementProperty> properties = new HashSet<PersonnelRequirementProperty>();
}
