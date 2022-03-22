package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import es.uca.sodmt.ws.faults.MissingArticle;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.OrderAlreadyClosed;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest.OrderEvaluateRequestItem;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse.OrderEvaluateResult;
import es.uca.sodmt.ws.responses.OrderListResponse;
import es.uca.sodmt.ws.responses.OrderQueryResponse;
import es.uca.sodmt.ws.responses.SimpleOrderLine;

public class OrderWebServiceTest extends WebServiceTest {

	@Test
	public void listOrders() {
		OrderListResponse results = orders.list();
		assertEquals(3, results.getOrderIds().size());
	}

	@Test
	public void queryOrders() throws MissingOrder {
		final OrderQueryResponse orderInfo = orders.query(getDBContents().getClosedOrder().getId());
		final Set<SimpleOrderLine> lines = orderInfo.getLines();

		final Iterator<SimpleOrderLine> iterLines = lines.iterator();
		assertEqualBigDecimals(BigDecimal.valueOf(9001L), iterLines.next().getQty());
		assertEqualBigDecimals(BigDecimal.valueOf(42L), iterLines.next().getQty());
	}

	@Test
	public void evaluateOrderAccepted() throws MissingOrder, MissingArticle {
		final OrderEvaluateRequest newOrder = new OrderEvaluateRequest();
		final List<OrderEvaluateRequestItem> qtys = newOrder.getArticleQuantities();
		qtys.add(new OrderEvaluateRequestItem(getDBContents().getFirstArticle().getId(), BigDecimal.valueOf(10d)));
		qtys.add(new OrderEvaluateRequestItem(getDBContents().getSecondArticle().getId(), BigDecimal.valueOf(5d)));

		OrderEvaluateResponse orderEvaluateResponse = orders.evaluate(newOrder);
		assertEquals(OrderEvaluateResult.ACCEPTED, orderEvaluateResponse.getResult());

		// Ensure that the new order exists - this wouldn't normally be needed in a performance test
		OrderQueryResponse queryResult = orders.query(orderEvaluateResponse.getOrderId());
		assertTrue("The order should have been accepted", queryResult.getAccepted());
	}

	@Test
	public void evaluateOrderRejected() throws Exception {
		final OrderEvaluateRequest newOrder = new OrderEvaluateRequest();
		final List<OrderEvaluateRequestItem> qtys = newOrder.getArticleQuantities();
		qtys.add(new OrderEvaluateRequestItem(getDBContents().getFirstArticle().getId(), BigDecimal.valueOf(1000d)));

		OrderEvaluateResponse orderEvaluateResponse = orders.evaluate(newOrder);
		assertEquals(OrderEvaluateResult.REJECTED, orderEvaluateResponse.getResult());

		// Ensure that the new order exists - this wouldn't normally be needed in a performance test
		OrderQueryResponse queryResult = orders.query(orderEvaluateResponse.getOrderId());
		assertFalse("The order should have been rejected", queryResult.getAccepted());
	}

	@Test
	public void closeOrder() throws MissingOrder, OrderAlreadyClosed {
		final long firstOpenOrderID = getDBContents().getAcceptedOpenOrder().getId();
		orders.close(firstOpenOrderID);
		assertTrue(!orders.query(firstOpenOrderID).getOpen());
	}
}
