package es.uca.b2mml.forms.capability;

import java.util.Calendar;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import es.uca.b2mml.controllers.capability.GenerateCapabilitiesController;
import es.uca.b2mml.domain.capability.ProductionCapability;

/**
 * Form backing object for the {@link GenerateCapabilitiesController}-based form.
 *
 * @author Antonio García-Domínguez
 */
public class GenerateCapabilitiesForm {
	@NotNull
	private ProductionCapability template;

	@NotNull
    @DateTimeFormat(style = "M-")
	private Calendar startDate, endDate;

    @NotNull
	private Boolean workMon = true, workTue = true, workWed = true,
			workThu = true, workFri = true, workSat, workSun;

	public GenerateCapabilitiesForm() {
		startDate = Calendar.getInstance();
		endDate = Calendar.getInstance();
		endDate.add(Calendar.MONTH, 1);
	}

	public ProductionCapability getTemplate() {
		return template;
	}

	public void setTemplate(ProductionCapability template) {
		this.template = template;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	public Boolean getWorkMon() {
		return workMon;
	}

	public void setWorkMon(Boolean workMon) {
		this.workMon = workMon;
	}

	public Boolean getWorkTue() {
		return workTue;
	}

	public void setWorkTue(Boolean workTue) {
		this.workTue = workTue;
	}

	public Boolean getWorkWed() {
		return workWed;
	}

	public void setWorkWed(Boolean workWed) {
		this.workWed = workWed;
	}

	public Boolean getWorkThu() {
		return workThu;
	}

	public void setWorkThu(Boolean workThu) {
		this.workThu = workThu;
	}

	public Boolean getWorkFri() {
		return workFri;
	}

	public void setWorkFri(Boolean workFri) {
		this.workFri = workFri;
	}

	public Boolean getWorkSat() {
		return workSat;
	}

	public void setWorkSat(Boolean workSat) {
		this.workSat = workSat;
	}

	public Boolean getWorkSun() {
		return workSun;
	}

	public void setWorkSun(Boolean workSun) {
		this.workSun = workSun;
	}

	@AssertTrue(message="Start date must be before end date")
	public boolean isStartBeforeEnd() {
		return startDate != null && endDate != null && startDate.before(endDate);
	}
}