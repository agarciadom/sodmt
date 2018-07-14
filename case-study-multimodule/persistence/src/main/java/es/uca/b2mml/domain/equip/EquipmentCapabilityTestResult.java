package es.uca.b2mml.domain.equip;
import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Unit;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class EquipmentCapabilityTestResult {
    /**
     */
    @NotNull
    @ManyToOne
    private EquipmentCapabilityTestSpec testSpecification;

    /**
     */
    @NotNull
    @ManyToOne
    private EquipmentProperty personProperty;

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
