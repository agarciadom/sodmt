package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Map;

import org.junit.Test;

import es.uca.sodmt.ws.requests.OrderEvaluateRequest;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse.OrderEvaluateResult;

public class ProcessOrderFlowTest extends WebServiceTest {

	@Test
	public void runRejected() throws Exception {
		final OrderEvaluateRequest newOrder = new OrderEvaluateRequest();
		final Map<Long, BigDecimal> qtys = newOrder.getArticleQuantities();
		qtys.put(getDBContents().getFirstArticle().getId(), BigDecimal.valueOf(20000L));

		OrderEvaluateResponse evaluation = orders.evaluate(newOrder);
		assertEquals(OrderEvaluateResult.REJECTED, evaluation.getResult());
	}

	@Test
	public void runAccepted() throws Exception {
		final OrderEvaluateRequest newOrder = new OrderEvaluateRequest();
		final Map<Long, BigDecimal> qtys = newOrder.getArticleQuantities();
		qtys.put(getDBContents().getFirstArticle().getId(), BigDecimal.valueOf(2L));

		OrderEvaluateResponse evaluation = orders.evaluate(newOrder);
		assertEquals(OrderEvaluateResult.ACCEPTED, evaluation.getResult());
	}
	
}
