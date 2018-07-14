package es.uca.b2mml.domain.people;
import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Unit;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"test_specification", "person_property", "testDate"})})
public class QualificationTestResult {

    /**
     */
    @NotNull
    @ManyToOne
    private QualificationTestSpec testSpecification;

    /**
     */
    @NotNull
    @ManyToOne
    private PersonProperty personProperty;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date testDate;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date expiration;

    /**
     */
    @NotNull
    private String testResult;

    /**
     */
    @NotNull
    @ManyToOne
    private Unit unit;
}
