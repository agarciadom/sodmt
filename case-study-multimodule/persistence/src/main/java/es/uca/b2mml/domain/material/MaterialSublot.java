package es.uca.b2mml.domain.material;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.equip.Equipment;

@RooJavaBean
@RooToString(excludeFields={"parent"})
@RooJpaActiveRecord
@NamedQueries({
	@NamedQuery(name="sublot.findByDefinition", query="SELECT l FROM MaterialSublot l WHERE l.lot.definition.id = :definitionId AND quantity.quantityValue > 0 ORDER BY quantity.quantityValue DESC")
})
public class MaterialSublot {

    /**
     */
    @ManyToOne
    @NotNull
    private MaterialLot lot;

    /**
     */
    @ManyToOne
    private MaterialSublot parent;

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String sublotId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @NotNull
    @ManyToOne
    private MaterialLotStatus status;

    @NotNull
    @Embedded
    @AttributeOverride(name="quantityValue", column=@Column(nullable=false, precision=19, scale=4))
    @AssociationOverride(name="quantityUnit", joinColumns=@JoinColumn(nullable=false))
    private QuantityWithUnit quantity;

    @ManyToOne
    @NotNull
    private Equipment storageLocation;

    public BigDecimal getQuantityValue() {
		return quantity != null ? quantity.getQuantityValue() : null;
	}

	public void setQuantityValue(BigDecimal value) {
		if (quantity != null) {
			quantity = new QuantityWithUnit(value, quantity.getQuantityUnit());
		}
		else {
			quantity = new QuantityWithUnit(value);
		}
	}

	public Unit getQuantityUnit() {
		return quantity != null ? quantity.getQuantityUnit() : null;
	}

	public void setQuantityUnit(Unit unit) {
		if (quantity != null) {
			quantity = new QuantityWithUnit(quantity.getQuantityValue(), unit);
		}
		else {
			quantity = new QuantityWithUnit(BigDecimal.ZERO, unit);
		}
	}

	public static List<MaterialSublot> findByDefinition(MaterialDefinition definition) {
		return entityManager()
			.createNamedQuery("sublot.findByDefinition", MaterialSublot.class)
			.setParameter("definitionId", definition.getId())
			.getResultList();
	}
}
