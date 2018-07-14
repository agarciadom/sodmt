package es.uca.b2mml.domain.schedule;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.PropertyWithQuantity;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural("MaterialRequirementProperties")
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"material_requirement", "name"})})
public class MaterialRequirementProperty extends PropertyWithQuantity {

    /**
     */
    @NotNull
    @ManyToOne
    private MaterialRequirement materialRequirement;
}
