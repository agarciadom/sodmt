package es.uca.b2mml.domain.perform;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import es.uca.b2mml.domain.product.ProductProductionRule;

import javax.persistence.Column;
import javax.validation.constraints.Size;

import es.uca.b2mml.domain.schedule.ProductionRequest;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ProductionResponse {

    /**
     */
    @NotNull
    @ManyToOne
    private ProductionPerformance productionPerformance;

    /**
     */
    @ManyToOne
    private ProductionRequest productionRequest;

    /**
     * Production rule finally used. The production rule may not match the one in the request
     * if alternate specifications were allowed.
     */
    @ManyToOne
    private ProductProductionRule productionRule;

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String responseId;

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

    @OneToMany(mappedBy="productionResponse", fetch=FetchType.LAZY)
    private Set<SegmentResponse> segmentResponses = new HashSet<SegmentResponse>(); 
    
}
