package es.uca.b2mml.domain.product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.ExecutionDependencyType;
import es.uca.b2mml.domain.QuantityWithUnit;
import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.psegment.ProcessSegment;
import es.uca.b2mml.domain.psegment.ProcessSegmentDependency;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="parent <> id")
public class ProductSegment {

	@ManyToOne(fetch=FetchType.LAZY)
	private ProductSegment parent;

	@OneToMany(mappedBy="parent", fetch=FetchType.LAZY)
	private Set<ProductSegment> children = new HashSet<ProductSegment>(); 

	// TODO: it is not clear whether a ProductSegment belongs to a single Production Rule or not.
	@NotNull
	@ManyToOne
	private ProductProductionRule rule;

    /**
     */
    @NotNull
    @Column(unique = true)
    private String segmentId;

    /**
     */
    @Size(max = 200)
    private String description;

	@Embedded
	@AttributeOverride(name = "quantityValue", column = @Column(name = "duration", columnDefinition="numeric(19, 4)"))
	@AssociationOverride(name = "quantityUnit", joinColumns=@JoinColumn(name="duration_unit"))
    private QuantityWithUnit duration;

	@OneToMany(mappedBy="segmentA", fetch = FetchType.LAZY)
	private Set<ProductSegmentDependency> outgoingDependencies = new HashSet<ProductSegmentDependency>();

	@OneToMany(mappedBy="segmentB", fetch = FetchType.LAZY)
	private Set<ProductSegmentDependency> incomingDependencies = new HashSet<ProductSegmentDependency>();

	@Size(min = 1)
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ProcessSegment> processSegment = new HashSet<ProcessSegment>();

    @OneToMany(mappedBy="segment", fetch = FetchType.LAZY)
    private Set<ProductParameter> parameters = new HashSet<ProductParameter>();

    @OneToMany(mappedBy="segment", fetch = FetchType.LAZY)
    private Set<PersonnelSpec> personnel = new HashSet<PersonnelSpec>();

    @OneToMany(mappedBy="segment", fetch = FetchType.LAZY)
    private Set<MaterialSpec> materials = new HashSet<MaterialSpec>();

    @OneToMany(mappedBy="segment", fetch = FetchType.LAZY)
    private Set<EquipmentSpec> equipment = new HashSet<EquipmentSpec>();

    public ProductSegment() {
    	// default ctor for Hibernate
    }

	public ProductSegment(String segmentId) {
		this.segmentId = segmentId;
	}

	public ProductSegment(ProductSegment parentSegment, String segmentId) {
		this(segmentId);
		this.parent = parentSegment;
		this.parent.children.add(this);
	}

	public ProductSegment(ProductSegment parentSegment, ProcessSegment processSegment) {
		this(parentSegment, "PRS-" + processSegment.getSegmentId());
		this.processSegment.add(processSegment);
	}

	public String toString() {
        return segmentId;
    }

	public BigDecimal getDurationValue() {
		return duration != null ? duration.getQuantityValue() : null;
	}

	public void setDurationValue(BigDecimal value) {
		if (duration != null) {
			duration = new QuantityWithUnit(value, duration.getQuantityUnit());
		}
		else {
			duration = new QuantityWithUnit(value);
		}
	}

	public Unit getDurationUnit() {
		return duration != null ? duration.getQuantityUnit() : null;
	}

	public void setDurationUnit(Unit unit) {
		if (duration != null) {
			duration = new QuantityWithUnit(duration.getQuantityValue(), unit);
		}
		else {
			duration = new QuantityWithUnit(BigDecimal.ZERO, unit);
		}
	}

	public List<ProductSegment> getSortedChildren() {
		final Map<ProcessSegment, ProductSegment> process2ProductMap = new HashMap<ProcessSegment, ProductSegment>();
		final Map<ProductSegment, Set<ProductSegment>> outEdges = new HashMap<ProductSegment, Set<ProductSegment>>();
		final Map<ProductSegment, Set<ProductSegment>> inEdges = new HashMap<ProductSegment, Set<ProductSegment>>();
		final List<ProductSegment> sorted = new ArrayList<ProductSegment>();

		prepareDependencyGraph(process2ProductMap, outEdges, inEdges);
		addDependencyEdges(process2ProductMap, outEdges, inEdges);
		topologicalSort(sorted, outEdges, inEdges);

		return sorted;
	}

	private void prepareDependencyGraph(
			final Map<ProcessSegment, ProductSegment> process2ProductMap,
			final Map<ProductSegment, Set<ProductSegment>> outEdges,
			final Map<ProductSegment, Set<ProductSegment>> inEdges) {
		for (ProductSegment child : children) {
			if (child.getProcessSegment().size() > 1) {
				throw new UnsupportedOperationException("Alternative process segments are not supported yet.");
			}
			for (ProcessSegment ps : child.getProcessSegment()) {
				if (process2ProductMap.put(ps, child) != null) {
					throw new IllegalArgumentException("Process segment " + ps + " is used in more than one child of " + this);
				}
			}
			outEdges.put(child, new HashSet<ProductSegment>());
			inEdges.put(child, new HashSet<ProductSegment>());
		}
	}

	private void addDependencyEdges(
			final Map<ProcessSegment, ProductSegment> process2ProductMap,
			final Map<ProductSegment, Set<ProductSegment>> outEdges,
			final Map<ProductSegment, Set<ProductSegment>> inEdges) {
		for (ProductSegment child : children) {
			for (ProductSegmentDependency dep : child.getOutgoingDependencies()) {
				final ProductSegment a = dep.getSegmentA();
				final ProductSegment b = dep.getSegmentB();
				assert a == child && b != child;
	
				if (dep.getDependencyType() != ExecutionDependencyType.B_AFTER_END_A) {
					throw new UnsupportedOperationException("Only B_AFTER_END_A is currently supported.");
				}
	
				outEdges.get(a).add(b);
				inEdges.get(b).add(a);
			}
	
			for (ProcessSegment ps : child.getProcessSegment()) {
				for (ProcessSegmentDependency dep : ps.getOutgoingDependencies()) {
					final ProcessSegment a = dep.getSegmentA();
					final ProcessSegment b = dep.getSegmentB();
					assert a == ps && b != ps;
	
					final ProductSegment productA = process2ProductMap.get(a);
					final ProductSegment productB = process2ProductMap.get(b);
					assert productA == child && productB != child;
	
					if (dep.getDependencyType() != ExecutionDependencyType.B_AFTER_END_A) {
						throw new UnsupportedOperationException("Only B_AFTER_END_A is currently supported.");
					}
					if (productB != null) {
						// productB may be null if the segment is not used in this product
						outEdges.get(productA).add(productB);
						inEdges.get(productB).add(productA);
					}
				}
			}
		}
	}

	private void topologicalSort(final List<ProductSegment> sorted,
			final Map<ProductSegment, Set<ProductSegment>> outEdges,
			final Map<ProductSegment, Set<ProductSegment>> inEdges) {
		while (!outEdges.isEmpty()) {
			ProductSegment next = null;
			for (Map.Entry<ProductSegment, Set<ProductSegment>> inEntry : inEdges.entrySet()) {
				if (inEntry.getValue().isEmpty()) {
					// No in-edges: use this one
					next = inEntry.getKey();
					break;
				}
			}

			if (next != null) {
				sorted.add(next);

				// Remove the edges leaving this node
				for (ProductSegment target : outEdges.get(next)) {
					inEdges.get(target).remove(next);
				}
				outEdges.remove(next);

				// Do not consider the node again for the next iteration
				inEdges.remove(next);
			}
			else if (!outEdges.isEmpty()) {
				throw new IllegalArgumentException("Could not find any node with no incoming edges: is there a cycle?");
			}
		}
	}
}
