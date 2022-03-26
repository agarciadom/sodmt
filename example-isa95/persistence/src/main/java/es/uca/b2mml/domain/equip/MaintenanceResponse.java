package es.uca.b2mml.domain.equip;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Check;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.people.Person;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="actual_finish_date > actual_start_date")
public class MaintenanceResponse {

    /**
     */
    @NotNull
    @ManyToOne
    private MaintenanceWorkOrder workOrder;

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String responseId = "MR-";

    /**
     */
    @NotNull
    @Size(min=1, max = 200)
    private String cause;

    /**
     */
    @NotNull
    @Size(min=1, max = 200)
    private String correction;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar actualStartDate;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar actualFinishDate;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "SS")
    private Calendar publishedDate = Calendar.getInstance();

    /**
     */
    @NotNull
    @ManyToOne
    private MaintenanceResponseStatus status;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "SS")
    @Column(updatable = false)
    private Calendar statusDate = Calendar.getInstance();

    /**
     */
    @ManyToOne
    private Person responsible;

    /**
     */
    @ElementCollection
    private Set<String> consumables = new HashSet<String>();
}
