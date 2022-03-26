package es.uca.b2mml.domain.schedule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Check;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.people.Person;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="start_time < end_time")
public class ProductionSchedule {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String scheduleId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar startTime;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar endTime;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar publishedDate;

    /**
     */
    @NotNull
    @ManyToOne
    private Equipment location;

    /*
     * FIXME: cannot enforce that it must not be empty - we wouldn't be able to create new instances
     * using the default Roo UI in that case. This would require creating a better UI that allows for
     * creating the whole schedule in one go.
     */

    @OneToMany(cascade=CascadeType.ALL, mappedBy="schedule")
	private Set<ProductionRequest> requests = new HashSet<ProductionRequest>();

	public void addRequest(ProductionRequest request) {
		request.setSchedule(this);
		requests.add(request);
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder("ProductionSchedule ");
		buf.append(getScheduleId());
		buf.append(':');

		final SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		for (ProductionRequest request : requests) {
			buf.append("\n- ");
			buf.append(request.getRequestId());
			buf.append(": ");

			final List<SegmentRequirement> sortedRequirements = new ArrayList<SegmentRequirement>(request.getSegments());
			Collections.sort(sortedRequirements, new Comparator<SegmentRequirement>() {
				@Override
				public int compare(SegmentRequirement o1, SegmentRequirement o2) {
					final int cmpStart = o1.getEarliestStartTime().compareTo(o2.getEarliestStartTime());
					if (cmpStart == 0) {
						return o1.getLatestEndTime().compareTo(o2.getLatestEndTime());
					} else return cmpStart;
				}
			});
			
			for (SegmentRequirement segmentRequirement : sortedRequirements) {
				buf.append("\n    - ");
				buf.append(segmentRequirement.getProcessSegment().getSegmentId());
				buf.append(" (");
				buf.append(fmt.format(segmentRequirement.getEarliestStartTime().getTime()));
				buf.append(" - ");
				buf.append(fmt.format(segmentRequirement.getLatestEndTime().getTime()));
				buf.append(")");

				for (PersonnelRequirement r : segmentRequirement.getPersonnelRequirements()) {
					buf.append("\n      - P: ");
					for (Person p : r.getPeople()) {
						buf.append(p.getNationalID());
						buf.append(" ");
					}
					buf.append(r.getQuantity());
				}
				for (EquipmentRequirement r : segmentRequirement.getEquipmentRequirements()) {
					buf.append("\n      - E: ");
					for (Equipment p : r.getEquipment()) {
						buf.append(p.getEquipmentId());
						buf.append(" ");
					}
					buf.append(r.getQuantity());
				}
				for (MaterialRequirement r : segmentRequirement.getMaterialRequirements()) {
					buf.append("\n      - M: ");
					for (MaterialDefinition p : r.getMaterialDefinitions()) {
						buf.append(p.getDefinitionId());
						buf.append(" ");
					}
					buf.append(r.getQuantity());
				}
			}
		}
		buf.append("]");
		return buf.toString();
	}
}
