package es.uca.b2mml.domain.material;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToMany;
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
@RooPlural(value="MaterialClassProperties")
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "material_class", "name" }) })
public class MaterialClassProperty extends Property {

    @NotNull
    @ManyToOne
    private MaterialClass materialClass;

    @ManyToMany
    private Set<QATestSpec> qualityTestSpecs = new HashSet<QATestSpec>();
}
