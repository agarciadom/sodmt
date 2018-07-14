package es.uca.b2mml.domain.psegment;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Check;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialUseType;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Check(constraints="((quantity_value IS NULL) = (quantity_unit IS NULL)) AND ((material_class IS NULL) <> (material_definition IS NULL))")
public class MaterialSegmentSpec extends SegmentSpec {
	@ManyToOne
	private MaterialClass materialClass;

	@ManyToOne
	private MaterialDefinition materialDefinition;

	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private MaterialUseType materialUse;

	@OneToMany(mappedBy="specification")
	private Set<MaterialSegmentSpecProperty> properties = new HashSet<MaterialSegmentSpecProperty>();

	public static Object findMaterialSegmentSpecEntries(List<String> orderBy, int firstResult, int maxResults) {
        final TypedQuery<MaterialSegmentSpec> tq = createFindMaterialSegmentSpecEntriesQuery(orderBy);
		tq.setFirstResult(firstResult);
		tq.setMaxResults(maxResults);
		return tq.getResultList();
	}

	public static Object findAllMaterialSegmentSpecs(List<String> orderBy) {
        return createFindMaterialSegmentSpecEntriesQuery(orderBy).getResultList();
	}

	private static TypedQuery<MaterialSegmentSpec> createFindMaterialSegmentSpecEntriesQuery(List<String> orderBy) {
		final CriteriaBuilder builder = entityManager().getCriteriaBuilder();

        final CriteriaQuery<MaterialSegmentSpec> cq = builder.createQuery(MaterialSegmentSpec.class);
		final Root<MaterialSegmentSpec> mSegSpec = cq.from(MaterialSegmentSpec.class);
		cq.select(mSegSpec);
		if (orderBy != null) {
			for (String field : orderBy) {
				cq.orderBy(builder.asc(mSegSpec.get(field)));
			}
		}

		final TypedQuery<MaterialSegmentSpec> tq = entityManager().createQuery(cq);
		return tq;
	}

}
