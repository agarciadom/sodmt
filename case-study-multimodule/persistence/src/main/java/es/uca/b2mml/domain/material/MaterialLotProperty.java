package es.uca.b2mml.domain.material;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@RooPlural(value="MaterialLotProperties")
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "lot", "name" }) })
public class MaterialLotProperty extends Property {
    /**
     */
    @NotNull
    @ManyToOne
    private MaterialLot lot;

    @OneToMany(mappedBy="lotProperty")
    private Set<QATestResult> testResults = new HashSet<QATestResult>();

	public MaterialLotProperty() {
		super();
	}

	public MaterialLotProperty(MaterialLotProperty other) {
		super(other);
		this.lot = other.lot;
	}
    
}
