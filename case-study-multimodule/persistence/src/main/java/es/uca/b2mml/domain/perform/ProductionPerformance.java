package es.uca.b2mml.domain.perform;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Check;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.schedule.ProductionSchedule;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="start_time < end_time")
public class ProductionPerformance {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String performanceId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @ManyToOne(fetch=FetchType.LAZY)
    private ProductionSchedule productionSchedule;

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
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar publishedDate;

    /**
     */
    @NotNull
    @ManyToOne
    private Equipment location;

    @OneToMany(mappedBy="productionPerformance", fetch=FetchType.LAZY)
    private Set<ProductionResponse> productionResponses = new HashSet<ProductionResponse>(); 
}
