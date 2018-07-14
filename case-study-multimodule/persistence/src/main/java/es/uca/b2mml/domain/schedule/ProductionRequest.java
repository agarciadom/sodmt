package es.uca.b2mml.domain.schedule;
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

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.Priority;
import es.uca.b2mml.domain.product.ProductProductionRule;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ProductionRequest {

    /**
     */
    @NotNull
    @ManyToOne
    private ProductionSchedule schedule;

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 50)
    private String requestId;

    /**
     */
    @Size(max = 200)
    private String description;

    /**
     */
    @ManyToOne
    private ProductProductionRule productionRule;

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

    @ManyToOne
    private Priority priority;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="productionRequest")
    private Set<SegmentRequirement> segments = new HashSet<SegmentRequirement>();

	public void addSegmentRequirement(SegmentRequirement segmentRequirement) {
		segmentRequirement.setProductionRequest(this);
		segments.add(segmentRequirement);
	}

	public List<SegmentRequirement> getSegmentsSortedByStart() {
		final List<SegmentRequirement> sorted = new ArrayList<SegmentRequirement>(segments);
		Collections.sort(sorted, new Comparator<SegmentRequirement>() {
			@Override
			public int compare(SegmentRequirement o1, SegmentRequirement o2) {
				return o1.getEarliestStartTime().compareTo(o2.getEarliestStartTime());
			}
		});
		return sorted;
	}
}
