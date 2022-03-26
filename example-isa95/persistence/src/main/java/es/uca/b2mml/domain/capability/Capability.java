package es.uca.b2mml.domain.capability;
import java.util.Calendar;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.CapabilityType;
import es.uca.b2mml.domain.equip.Equipment;

@RooJavaBean
@RooToString
@RooPlural("Capabilities")
@RooJpaActiveRecord(inheritanceType = "TABLE_PER_CLASS", mappedSuperclass=true)
public abstract class Capability {

    /**
     */
    @Size(max = 200)
    private String description;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private CapabilityType type;

    /**
     */
    @Size(max = 200)
    private String reason;

    /**
     */
    @NotNull
    @ManyToOne
    private Equipment location;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar startTime;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar endTime;

    /**
     * Default constructor.
     */
    public Capability() {
    	// default empty ctor
    }

    /**
     * Copy constructor.
     */
    public Capability(Capability other) {
    	this.description = other.description;
    	this.type = other.type;
    	this.reason = other.reason;
    	this.location = other.location;
    	this.startTime = other.startTime;
    	this.endTime = other.endTime;
    }
}
