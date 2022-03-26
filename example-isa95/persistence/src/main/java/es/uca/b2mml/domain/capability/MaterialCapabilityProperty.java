package es.uca.b2mml.domain.capability;
import javax.persistence.ManyToOne;
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
@RooPlural(value="MaterialCapabilityProperties")
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"capability", "name"})})
public class MaterialCapabilityProperty extends Property {
	/**
	 */
	@ManyToOne
	@NotNull
	private MaterialCapability capability;

	public MaterialCapabilityProperty() {
		super();
	}

	public MaterialCapabilityProperty(MaterialCapabilityProperty other) {
		super(other);
		this.capability = other.capability;
	}
}
