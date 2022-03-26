package es.uca.b2mml.domain.material;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.validation.constraints.Size;

import java.util.Calendar;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import es.uca.b2mml.domain.Unit;

import javax.validation.constraints.Future;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class QATestResult {

    /**
     */
    @NotNull
    @ManyToOne
    private QATestSpec testSpec;

    /**
     */
    @NotNull
    @ManyToOne
    private MaterialLotProperty lotProperty;

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String resultId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar resultDate = Calendar.getInstance();

    /**
     */
    @NotNull
    @Size(max = 50)
    private String testResult;

    /**
     */
    @ManyToOne
    private Unit unit;

    /**
     */
    @NotNull
    @Future
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Calendar expirationDate;
}
