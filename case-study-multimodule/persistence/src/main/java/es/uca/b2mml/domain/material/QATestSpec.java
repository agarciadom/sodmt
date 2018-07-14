package es.uca.b2mml.domain.material;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Table(uniqueConstraints = {@UniqueConstraint(columnNames={"name", "version"})})
public class QATestSpec {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String name;

    /**
     */
    @Size(max = 300)
    private String description;

    /**
     */
    @Column(unique = true)
    @Size(max = 50)
    private String testVersion;

    @ManyToMany(mappedBy="qualityTestSpecs")
    private Set<MaterialClassProperty> classProperties = new HashSet<MaterialClassProperty>();

    @ManyToMany(mappedBy="qualityTestSpecs")
    private Set<MaterialDefinitionProperty> definitionProperties = new HashSet<MaterialDefinitionProperty>();

    @OneToMany(mappedBy="testSpec")
    private Set<QATestResult> results = new HashSet<QATestResult>();
}
