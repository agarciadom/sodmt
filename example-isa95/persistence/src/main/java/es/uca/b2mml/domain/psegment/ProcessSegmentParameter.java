package es.uca.b2mml.domain.psegment;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;

import es.uca.b2mml.domain.Unit;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ProcessSegmentParameter {

    /**
     */
    @NotNull
    @Size(max = 50)
    private String name;

    /**
     */
    @NotNull
    @ManyToOne
    private ProcessSegment segment;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @Size(max = 50)
    private String parameterValue;

    /**
     */
    @ManyToOne
    private Unit unit;
}
