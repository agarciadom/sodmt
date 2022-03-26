package es.uca.b2mml.domain.equip;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MaintenanceResponseStatus {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String name;
}
