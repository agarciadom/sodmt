package es.uca.b2mml.domain.schedule;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Property;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"segment_requirement", "name"})})
public class ProductionParameter extends Property {
    /**
     */
    @NotNull
    @ManyToOne
    private SegmentRequirement segmentRequirement;
}
