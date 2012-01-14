package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import es.uca.sodmt.ws.faults.UnknownOrder;
import es.uca.sodmt.ws.responses.OrderListResponse;
import es.uca.sodmt.ws.responses.OrderQueryResponse;
import es.uca.sodmt.ws.responses.SimpleOrderLine;

public class OrderWebServiceTest extends WebServiceTest {

	public OrderWebServiceTest() {
		super(Orders.class, "/orders");
	}

	@Test
	public void queryOrders() throws UnknownOrder {
		OrderListResponse results = client.list();
		assertEquals(1, results.getOrderIds().size());

		final long orderId = results.getOrderIds().get(0);
		OrderQueryResponse orderInfo = client.query(orderId);
		final Set<SimpleOrderLine> lines = orderInfo.getLines();

		final Iterator<SimpleOrderLine> iterLines = lines.iterator();
		assertEqualBigDecimals(BigDecimal.valueOf(9001L), iterLines.next().getQty());
		assertEqualBigDecimals(BigDecimal.valueOf(42L), iterLines.next().getQty());
	}

	private void assertEqualBigDecimals(BigDecimal expected, BigDecimal obtained) {
		assertTrue(expected.compareTo(obtained) == 0);
	}
}
