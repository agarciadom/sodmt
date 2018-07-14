package es.uca.b2mml.domain.equip;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class EquipmentCapabilityTestSpec {

    /**
     */
	@NotNull
	@Size(max = 50)
	private String testIdentifier;

    /**
     */
	@NotNull
	@ManyToOne
	EquipmentClassProperty equipmentClassProperty;

    /**
     */
    @NotNull
    @Size(max = 30)
    private String testVersion;

    /**
     */
    @NotNull
    @Size(max = 200)
    private String description;
	
}
