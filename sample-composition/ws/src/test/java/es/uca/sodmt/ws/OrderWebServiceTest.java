package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import es.uca.sodmt.ws.faults.OrderAlreadyClosed;
import es.uca.sodmt.ws.faults.UnknownArticle;
import es.uca.sodmt.ws.faults.UnknownOrder;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse.OrderEvaluateResult;
import es.uca.sodmt.ws.responses.OrderListResponse;
import es.uca.sodmt.ws.responses.OrderQueryResponse;
import es.uca.sodmt.ws.responses.SimpleOrderLine;

public class OrderWebServiceTest extends WebServiceTest {

	@Test
	public void listOrders() {
		OrderListResponse results = orders.list();
		assertEquals(2, results.getOrderIds().size());
	}

	@Test
	public void queryOrders() throws UnknownOrder {
		final OrderQueryResponse orderInfo = orders.query(getDBContents().getClosedOrder().getId());
		final Set<SimpleOrderLine> lines = orderInfo.getLines();

		final Iterator<SimpleOrderLine> iterLines = lines.iterator();
		assertEqualBigDecimals(BigDecimal.valueOf(9001L), iterLines.next().getQty());
		assertEqualBigDecimals(BigDecimal.valueOf(42L), iterLines.next().getQty());
	}

	@Test
	public void evaluateOrder() throws UnknownOrder, UnknownArticle {
		final OrderEvaluateRequest newOrder = new OrderEvaluateRequest();
		final Map<Long, BigDecimal> qtys = newOrder.getArticleQuantities();
		qtys.put(getDBContents().getFirstArticle().getId(), BigDecimal.valueOf(10d));
		qtys.put(getDBContents().getSecondArticle().getId(), BigDecimal.valueOf(5d));

		OrderEvaluateResponse orderEvaluateResponse = orders.evaluate(newOrder);
		assertEquals(OrderEvaluateResult.ACCEPTED, orderEvaluateResponse.getResult());

		// Ensure that the new order exists - this wouldn't normally be needed in a performance test
		orders.query(orderEvaluateResponse.getOrderId());
	}

	@Test
	public void closeOrder() throws UnknownOrder, OrderAlreadyClosed {
		final long firstOpenOrderID = getDBContents().getOpenOrder().getId();
		orders.close(firstOpenOrderID);
		assertTrue(!orders.query(firstOpenOrderID).getOpen());
	}
}
