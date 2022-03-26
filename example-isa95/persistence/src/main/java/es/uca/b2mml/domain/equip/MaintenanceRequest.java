package es.uca.b2mml.domain.equip;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Priority;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.validation.constraints.Size;

import java.util.Calendar;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import es.uca.b2mml.domain.people.Person;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MaintenanceRequest {

    /**
     */
    @NotNull
    @ManyToOne
    private Equipment equipment;

    /**
     */
    @NotNull
    @Column(unique = true)
    private String requestId = "MR-";

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "SS")
    private Calendar requestedCompletionDate;

    /**
     */
    @NotNull
    @ManyToOne
    private Priority priority;

    /**
     */
    @NotNull
    @ManyToOne
    private Person requestor;

    /**
     */
    @NotNull
    @ManyToOne
    private MaintenanceRequestStatus status;

    /**
     */
    @NotNull
    @ManyToOne
    private Person reviewer;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "SS")
    private Calendar submissionDate = Calendar.getInstance();

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "SS")
    private Calendar publishedDate = Calendar.getInstance();
}
