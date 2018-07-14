package es.uca.b2mml.domain.capability;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Property;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"capability", "name"})})
public class PersonnelCapabilityProperty extends Property {
	/**
	 */
	@ManyToOne
	@NotNull
	private PersonnelCapability capability;

	public PersonnelCapabilityProperty() {
		super();
	}

	public PersonnelCapabilityProperty(PersonnelCapabilityProperty other) {
		super(other);
		this.capability = other.capability;
	}
	
}
