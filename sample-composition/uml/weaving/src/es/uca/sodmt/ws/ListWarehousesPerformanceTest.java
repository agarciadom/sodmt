package es.uca.sodmt.ws;

import org.databene.contiperf.junit.ContiPerfSuiteRunner;

/**
* Performance test suite generated from test method 'listWarehouses'
* and executable node 'List Warehouses'. Time limit is 2.0
* seconds and throughput is 5.0 requests per second.
*/
@RunWith(ContiPerfSuiteRunner.class)
@PerfTest(invocations = 1000, threads=5)
@Required(throughput=5.0, max=2000)
public class ListWarehousesPerformanceTest {

}
