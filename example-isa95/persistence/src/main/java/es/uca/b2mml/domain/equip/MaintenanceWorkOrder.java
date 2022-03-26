package es.uca.b2mml.domain.equip;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.people.Person;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MaintenanceWorkOrder {

    /**
     */
    @NotNull
    @Column(unique = true)
    private String orderID = "MWO-";

    /**
     */
    @NotNull
    @Future
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar plannedStart;

    /**
     */
    @NotNull
    @Future
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar plannedFinish;

    /**
     */
    @NotNull
    @ManyToOne
    private Person responsible;

    /**
     */
    @NotNull
    @ManyToOne
    private MaintenanceOrderStatus status;

    @ElementCollection
    private Set<String> resources = new HashSet<String>();

    /**
     */
    @NotNull
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private Set<MaintenanceRequest> requests = new HashSet<MaintenanceRequest>();

    @OneToMany(mappedBy = "workOrder")
    private Set<MaintenanceResponse> responses = new HashSet<MaintenanceResponse>();
}
