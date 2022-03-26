package es.uca.b2mml.domain.material;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MaterialLot {
    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String lotId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @NotNull
    @ManyToOne
    private MaterialDefinition definition;

    /**
     */
    @NotNull
    @ManyToOne
    private MaterialLotStatus status;

    @OneToMany(mappedBy="lot")
    private Set<MaterialSublot> sublots = new HashSet<MaterialSublot>();
}
