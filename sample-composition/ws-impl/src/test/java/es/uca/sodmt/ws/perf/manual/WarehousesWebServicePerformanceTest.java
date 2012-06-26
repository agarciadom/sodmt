package es.uca.sodmt.ws.perf.manual;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfSuiteRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import es.uca.sodmt.ws.WarehousesWebServiceTest;

/**
 * Wraps all tests in {@link WarehousesWebServiceTest} as performance tests. 
 */
@RunWith(ContiPerfSuiteRunner.class)
@SuiteClasses(WarehousesWebServiceTest.class)
@PerfTest(invocations = 1000, threads = 5)
@Required(throughput = 20, average = 10)
public class WarehousesWebServicePerformanceTest {

	// nothing!

}
