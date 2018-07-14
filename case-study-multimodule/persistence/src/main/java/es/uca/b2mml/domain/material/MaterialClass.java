package es.uca.b2mml.domain.material;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MaterialClass {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String classId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @ManyToMany(mappedBy="materialClasses")
    private Set<MaterialDefinition> definitions = new HashSet<MaterialDefinition>();

    /**
     */
    @OneToMany(mappedBy="materialClass")
    private Set<MaterialClassProperty> properties = new HashSet<MaterialClassProperty>();
}
