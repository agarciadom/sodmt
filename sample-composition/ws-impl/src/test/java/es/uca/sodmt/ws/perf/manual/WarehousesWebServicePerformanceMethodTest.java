package es.uca.sodmt.ws.perf.manual;

import static org.junit.Assert.assertTrue;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.MethodRule;

import es.uca.sodmt.ws.WarehousesWebServiceTest;

/**
 * Wraps a selection of tests in {@link WarehousesWebServiceTest} as performance tests. 
 */
public class WarehousesWebServicePerformanceMethodTest extends WarehousesWebServiceTest {

	@Rule
	public MethodRule f = new FilterByClassRule(this.getClass());

	@Rule
    public ContiPerfRule i = new ContiPerfRule();

	@PerfTest(invocations = 1000, threads = 5)
	@Required(throughput = 10, average = 10)
	@Override
	@Test
	public void listWarehouses() {
		super.listWarehouses();
	}

	@Test
	public void failingNonPerformanceTest() {
		assertTrue(false);
	}

	@Test
	public void passingNonPerformanceTest() {
		assertTrue(true);
	}
}
