package es.uca.b2mml.domain.psegment;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(inheritanceType = "TABLE_PER_CLASS", mappedSuperclass = true)
@Check(constraints="(quantity_value IS NULL) = (quantity_unit IS NULL)")
public abstract class SegmentSpec {

	@ManyToOne
	@NotNull
	private ProcessSegment processSegment;

    /**
     */
    @Size(max = 200)
    private String description;
}
