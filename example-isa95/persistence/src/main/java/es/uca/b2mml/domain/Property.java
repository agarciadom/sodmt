package es.uca.b2mml.domain;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(inheritanceType="TABLE_PER_CLASS", mappedSuperclass=true)
public abstract class Property {

	/**
     */
    @NotNull
    @Size(max = 50)
    private String name;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @NotNull
    @Size(max = 50)
    private String value;

    /**
     */
    @ManyToOne
    @NotNull
    private Unit unit;

    /**
	 * Default constructor.
	 */
	public Property() {
		// empty ctor for Hibernate et al
	}

	/**
	 * Copy constructor for Property.
	 */
	public Property(Property other) {
		this.name = other.name;
		this.description = other.description;
		this.value = other.value;
		this.unit = other.unit;
	}
}
