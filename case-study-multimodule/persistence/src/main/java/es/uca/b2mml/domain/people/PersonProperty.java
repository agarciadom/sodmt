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
@RooPlural(value="PersonProperties")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames={"person", "name"})})
public class PersonProperty extends Property {
	@ManyToOne
	@NotNull
	private Person person;

    @OneToMany(mappedBy="personProperty", fetch=FetchType.LAZY)
    private Set<QualificationTestResult> testResult = new HashSet<QualificationTestResult>();
}
