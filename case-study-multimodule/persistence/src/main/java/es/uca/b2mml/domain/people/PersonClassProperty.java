package es.uca.b2mml.domain.people;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Property;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural(value="PersonClassProperties")
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "person_class", "name" }) })
public class PersonClassProperty extends Property {
    @NotNull
    @ManyToOne
    private PersonClass personClass;

    @OneToMany(mappedBy="personClassProperty", fetch=FetchType.LAZY)
    private Set<QualificationTestSpec> testSpec = new HashSet<QualificationTestSpec>();
}
