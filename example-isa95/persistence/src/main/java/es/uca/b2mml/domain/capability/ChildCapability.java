package es.uca.b2mml.domain.capability;

import java.util.Calendar;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity(mappedSuperclass=true)
public abstract class ChildCapability extends Capability {
    /**
     */
    @NotNull
    @ManyToOne
    private ProductionCapability productionCapability;
    
    /**
     * Default constructor.
     */
    public ChildCapability() {
		super();
	}

    /**
     * Copy constructor.
     */
	public ChildCapability(ChildCapability other) {
		super(other);
		this.productionCapability = other.productionCapability;
		this.setQuantity(other.getQuantity());
	}

	@Override
    public Calendar getStartTime() {
    	final Calendar field = super.getStartTime();
    	if (field != null) {
    		return field;
    	}
    	else if (productionCapability != null) {
    		return productionCapability.getStartTime();
    	}
    	else return null;
    }

	@Override
    public Calendar getEndTime() {
    	final Calendar field = super.getEndTime();
    	if (field != null) {
    		return field;
    	}
    	else if (productionCapability != null) {
    		return productionCapability.getEndTime();
    	}
    	else return null;
    }
}
