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
@RooPlural("PersonnelRequirementProperties")
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"personnel_requirement", "name"})})
public class PersonnelRequirementProperty extends PropertyWithQuantity {

    /**
     */
    @NotNull
    @ManyToOne
    private PersonnelRequirement personnelRequirement;
}
