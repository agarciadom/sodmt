package es.uca.b2mml.domain.people;
import javax.persistence.ManyToOne;
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
@Table(uniqueConstraints={
	@UniqueConstraint(columnNames="testIdentifier")
})
public class QualificationTestSpec {

	@NotNull
	@Size(max = 50)
	private String testIdentifier;

	@NotNull
	@ManyToOne
	PersonClassProperty personClassProperty;

    /**
     */
    @NotNull
    @Size(max = 30)
    private String testVersion;

    /**
     */
    @NotNull
    @Size(max = 200)
    private String description;
}
