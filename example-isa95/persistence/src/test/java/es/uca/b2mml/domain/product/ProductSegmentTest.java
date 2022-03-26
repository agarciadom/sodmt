package es.uca.b2mml.domain.product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import es.uca.b2mml.domain.ExecutionDependencyType;
import es.uca.b2mml.domain.psegment.ProcessSegment;
import es.uca.b2mml.domain.psegment.ProcessSegmentDependency;

/**
 * Tests on the {@link ProductSegment} class.
 *
 * @author Antonio García Domínguez
 */
public class ProductSegmentTest {

	@Test
	public void testNoChildren() {
		final ProductSegment parentSegment = new ProductSegment("P");
		assertOrderIs(new ArrayList<String>(), parentSegment.getSortedChildren());
	}

	@Test
	public void testOneChild() {
		final ProductSegment parentSegment = new ProductSegment("P");
		new ProductSegment(parentSegment, "A");
		assertOrderIs(Arrays.asList("A"), parentSegment.getSortedChildren());
	}

	@Test
	public void testTwoChildrenProductDependency() {
		final ProductSegment parentSegment = new ProductSegment("P");
		final ProductSegment psA = new ProductSegment(parentSegment, "A");
		final ProductSegment psB = new ProductSegment(parentSegment, "B");
		addBStartsAfterAProductDependency(psA, psB);

		assertOrderIs(Arrays.asList("A", "B"), parentSegment.getSortedChildren());
	}

	@Test
	public void testTwoChildrenProductDependencyReverse() {
		final ProductSegment parentSegment = new ProductSegment("P");
		final ProductSegment psA = new ProductSegment(parentSegment, "A");
		final ProductSegment psB = new ProductSegment(parentSegment, "B");
		addBStartsAfterAProductDependency(psB, psA);

		assertOrderIs(Arrays.asList("B", "A"), parentSegment.getSortedChildren());
	}

	@Test
	public void testTwoChildrenProcessDependency() {
		final ProductSegment parentSegment = new ProductSegment("P");
		final ProductSegment psA = new ProductSegment(parentSegment, "A");
		final ProductSegment psB = new ProductSegment(parentSegment, "B");

		addBStartsAfterAProcessDependency(psA, psB);
		assertOrderIs(Arrays.asList("A", "B"), parentSegment.getSortedChildren());
	}

	@Test
	public void testTwoChildrenProcessDependencyReverse() {
		final ProductSegment parentSegment = new ProductSegment("P");
		final ProductSegment psA = new ProductSegment(parentSegment, "A");
		final ProductSegment psB = new ProductSegment(parentSegment, "B");

		addBStartsAfterAProcessDependency(psB, psA);
		assertOrderIs(Arrays.asList("B", "A"), parentSegment.getSortedChildren());
	}

	@Test
	public void testProcessSomeOptionalToAllUsed() {
		final ProcessSegment segmentSetup = new ProcessSegment("S");
		final ProcessSegment segmentFeed = new ProcessSegment("F");
		final ProcessSegment segmentCut = new ProcessSegment("C");
		final ProcessSegment segmentHRect = new ProcessSegment("HR");
		final ProcessSegment segmentVRect = new ProcessSegment("VR");
		final ProcessSegment segmentDry = new ProcessSegment("D");
		final ProcessSegment segmentInspect = new ProcessSegment("I");
		final ProcessSegment segmentBoxLoad = new ProcessSegment("BL");

		addBStartsAfterAProcessDependency(segmentSetup, segmentFeed);
		addBStartsAfterAProcessDependency(segmentFeed, segmentCut);
		addBStartsAfterAProcessDependency(segmentFeed, segmentHRect);
		addBStartsAfterAProcessDependency(segmentCut, segmentHRect);
		addBStartsAfterAProcessDependency(segmentHRect, segmentVRect);
		addBStartsAfterAProcessDependency(segmentHRect, segmentDry);
		addBStartsAfterAProcessDependency(segmentVRect, segmentDry);
		addBStartsAfterAProcessDependency(segmentDry, segmentInspect);
		addBStartsAfterAProcessDependency(segmentInspect, segmentBoxLoad);

		final ProductSegment parentSegment = new ProductSegment("P");
		new ProductSegment(parentSegment, segmentSetup);
		new ProductSegment(parentSegment, segmentFeed);
		new ProductSegment(parentSegment, segmentHRect);
		new ProductSegment(parentSegment, segmentDry);
		new ProductSegment(parentSegment, segmentInspect);
		new ProductSegment(parentSegment, segmentBoxLoad);

		assertOrderIs(
			Arrays.asList("PRS-S", "PRS-F", "PRS-HR", "PRS-D", "PRS-I", "PRS-BL"),
			parentSegment.getSortedChildren());

		new ProductSegment(parentSegment, segmentCut);
		assertOrderIs(
				Arrays.asList("PRS-S", "PRS-F", "PRS-C", "PRS-HR", "PRS-D", "PRS-I", "PRS-BL"),
				parentSegment.getSortedChildren());

		new ProductSegment(parentSegment, segmentVRect);
		assertOrderIs(
				Arrays.asList("PRS-S", "PRS-F", "PRS-C", "PRS-HR", "PRS-VR", "PRS-D", "PRS-I", "PRS-BL"),
				parentSegment.getSortedChildren());
	}

	private void addBStartsAfterAProcessDependency(final ProductSegment psA, final ProductSegment psB) {
		final ProcessSegment procSA = getFirstSegmentOrCreate(psA);
		final ProcessSegment procSB = getFirstSegmentOrCreate(psB);
		addBStartsAfterAProcessDependency(procSA, procSB);
	}

	private void addBStartsAfterAProcessDependency(final ProcessSegment procSA,
			final ProcessSegment procSB) {
		final ProcessSegmentDependency processDep = new ProcessSegmentDependency();
		processDep.setDependencyType(ExecutionDependencyType.B_AFTER_END_A);
		processDep.setSegmentA(procSA);
		processDep.setSegmentB(procSB);
		procSA.getOutgoingDependencies().add(processDep);
		procSB.getIncomingDependencies().add(processDep);
	}

	private ProcessSegment getFirstSegmentOrCreate(final ProductSegment psA) {
		ProcessSegment procSA;
		if (psA.getProcessSegment().isEmpty()) {
			procSA = new ProcessSegment();
			psA.getProcessSegment().add(procSA);
		}
		else {
			procSA = psA.getProcessSegment().iterator().next();
		}
		return procSA;
	}

	private void addBStartsAfterAProductDependency(final ProductSegment psA, final ProductSegment psB) {
		final ProductSegmentDependency dep = new ProductSegmentDependency();
		dep.setSegmentA(psA);
		dep.setSegmentB(psB);
		dep.setDependencyType(ExecutionDependencyType.B_AFTER_END_A);
		psA.getOutgoingDependencies().add(dep);
		psB.getIncomingDependencies().add(dep);
	}

	private void assertOrderIs(List<String> expectedIds, List<ProductSegment> segments) {
		assertNotNull(segments);

		final List<String> actualIds = new ArrayList<String>(segments.size());
		for (ProductSegment segment : segments) {
			actualIds.add(segment.getSegmentId());
		}
		assertEquals(expectedIds, actualIds);
	}
}
