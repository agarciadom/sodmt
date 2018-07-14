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

import es.uca.b2mml.domain.psegment.ProcessSegment;

import javax.persistence.Column;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class SegmentResponse {

    /**
     */
    @NotNull
    @ManyToOne
    private ProductionResponse productionResponse;

    /**
     */
    @NotNull
    @ManyToOne
    private ProcessSegment processSegment;

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String responseId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar actualStartTime;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar actualEndTime;

    @OneToMany(mappedBy="segmentResponse", fetch=FetchType.LAZY)
    private Set<ProductionData> productionData = new HashSet<ProductionData>(); 

    @OneToMany(mappedBy="segmentResponse", fetch=FetchType.LAZY)
    private Set<PersonnelActual> personnelActuals = new HashSet<PersonnelActual>(); 

    @OneToMany(mappedBy="segmentResponse", fetch=FetchType.LAZY)
    private Set<EquipmentActual> equipmentActuals = new HashSet<EquipmentActual>(); 

    @OneToMany(mappedBy="segmentResponse", fetch=FetchType.LAZY)
    private Set<MaterialActual> materialActuals = new HashSet<MaterialActual>(); 
}
