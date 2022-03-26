package es.uca.b2mml.domain.psegment;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.people.Person;
import es.uca.b2mml.domain.people.PersonClass;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="((quantity_value IS NULL) = (quantity_unit IS NULL)) AND ((person IS NULL) <> (person_class IS NULL))")
public class PersonnelSegmentSpec extends SegmentSpec {
	@ManyToOne
	private Person person;

	@ManyToOne
	private PersonClass personClass;

	@OneToMany(mappedBy="specification")
	private Set<PersonnelSegmentSpecProperty> properties = new HashSet<PersonnelSegmentSpecProperty>();
}
