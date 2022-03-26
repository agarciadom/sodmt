package es.uca.b2mml.domain.product;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import es.uca.b2mml.domain.Unit;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ProductParameter {

    /**
     */
    @NotNull
    @ManyToOne
    private ProductSegment segment;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @Size(max = 50)
    private String parameterName;

    /**
     */
    @NotNull
    @Size(max = 50)
    private String parameterValue;

    /**
     */
    @ManyToOne
    private Unit unit;
}
