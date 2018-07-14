package es.uca.b2mml.domain.psegment;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Property;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural(value="EquipmentSegmentSpecProperties")
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"specification", "name"})})
public class EquipmentSegmentSpecProperty extends Property {

    /**
     */
	@NotNull
    @ManyToOne
    private EquipmentSegmentSpec specification;

}
