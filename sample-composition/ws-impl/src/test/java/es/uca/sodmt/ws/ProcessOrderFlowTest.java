package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import es.uca.sodmt.orders.model.Address;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest;
import es.uca.sodmt.ws.responses.OrderCloseResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse.OrderEvaluateResult;

public class ProcessOrderFlowTest extends WebServiceTest {

	private ExecutorService executor;

	@Rule
	public ContiPerfRule performanceRule = new ContiPerfRule();

	@Before
	public void prepareExecutor() {
		executor = Executors.newFixedThreadPool(2);
	}

	/**
	 * This test emulates the case in which the request is rejected.
	 */
	@Test
	@PerfTest(invocations = 50)
	@Required(average = 100)
	public void runRejected() throws Exception {
		final OrderEvaluateRequest newOrder = new OrderEvaluateRequest();
		final Map<Long, BigDecimal> qtys = newOrder.getArticleQuantities();
		qtys.put(getDBContents().getFirstArticle().getId(), BigDecimal.valueOf(20000L));

		OrderEvaluateResponse evalResponse = orders.evaluate(newOrder);
		assertEquals(OrderEvaluateResult.REJECTED, evalResponse.getResult());

		OrderCloseResponse closeResponse = orders.close(evalResponse.getOrderId());
		assertEquals(evalResponse.getOrderId(), closeResponse.getOrderID());
	}

	/**
	 * This test emulates the case in which the request is accepted.
	 */
	@Test
	@PerfTest(invocations = 50)
	@Required(average = 100)
	public void runAccepted() throws Exception {
		final OrderEvaluateRequest newOrder = new OrderEvaluateRequest();
		final Map<Long, BigDecimal> qtys = newOrder.getArticleQuantities();
		qtys.put(getDBContents().getFirstArticle().getId(), BigDecimal.valueOf(1L));

		final OrderEvaluateResponse evaluation = orders.evaluate(newOrder);
		final long orderID = evaluation.getOrderId();
		assertEquals(OrderEvaluateResult.ACCEPTED, evaluation.getResult());

		Future<Boolean> paymentBranch = executor.submit(new Callable<Boolean>() {
			@Override
			public Boolean call() throws Exception {
				invoices.generate(orderID);
				invoices.pay(orderID);
				return true;
			}
		});
		Future<Boolean> shipmentBranch = executor.submit(new Callable<Boolean>() {
			@Override
			public Boolean call() throws Exception {
				shipments.ship(orderID, new Address("Country", "State", "City", "Street", "No", "000"));
				return true;
			}
		});
		paymentBranch.get();
		shipmentBranch.get();

		final OrderCloseResponse closeResponse = orders.close(orderID);
		assertEquals(orderID, closeResponse.getOrderID());
	}
	
}
