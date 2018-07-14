package es.uca.b2mml.domain.product;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.material.MaterialClass;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import es.uca.b2mml.domain.material.MaterialDefinition;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MaterialSpec extends Specification {

    /**
     */
    @NotNull
    @ManyToOne
    private ProductSegment segment;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<MaterialClass> materialClasses = new HashSet<MaterialClass>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<MaterialDefinition> materialDefinitions = new HashSet<MaterialDefinition>();

    /**
     */
    @OneToMany(mappedBy="specification")
    private Set<MaterialSpecProperty> properties = new HashSet<MaterialSpecProperty>();
}
