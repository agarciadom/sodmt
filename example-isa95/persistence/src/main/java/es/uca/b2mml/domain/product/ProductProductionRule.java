package es.uca.b2mml.domain.product;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@NamedQueries(
	@NamedQuery(name="ppr.byRuleId", query="SELECT o FROM ProductProductionRule o WHERE o.ruleId = :ruleId")
)
public class ProductProductionRule {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String ruleId;

    /**
     */
    @Size(max = 50)
    private String version;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar publishedDate = Calendar.getInstance();

    @OneToMany(mappedBy="rule", fetch=FetchType.LAZY)
    private Set<ProductSegment> segments = new HashSet<ProductSegment>();


    public static ProductProductionRule findById(String ruleId) {
    	return entityManager()
    		.createNamedQuery("ppr.byRuleId", ProductProductionRule.class)
    		.setParameter("ruleId", ruleId)
    		.getSingleResult();
    }
}
