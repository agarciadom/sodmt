package es.uca.b2mml.domain.perform;
import es.uca.b2mml.domain.PropertyWithQuantity;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooPlural("EquipmentActualProperties")
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"equipment_actual", "name"})})
public class EquipmentActualProperty extends PropertyWithQuantity {

    /**
     */
    @NotNull
    @ManyToOne
    private EquipmentActual equipmentActual;
}
