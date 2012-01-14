package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import es.uca.sodmt.ws.faults.MissingWarehouse;
import es.uca.sodmt.ws.faults.OrderAlreadyClosed;
import es.uca.sodmt.ws.faults.UnknownArticle;
import es.uca.sodmt.ws.faults.UnknownOrder;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse.OrderEvaluateResult;
import es.uca.sodmt.ws.responses.OrderListResponse;
import es.uca.sodmt.ws.responses.OrderQueryResponse;
import es.uca.sodmt.ws.responses.SimpleOrderLine;
import es.uca.sodmt.ws.responses.WarehouseItemsResponse;
import es.uca.sodmt.ws.responses.WarehouseItemsResponse.WarehouseItemsResponseItem;
import es.uca.sodmt.ws.responses.WarehouseListResponse.WarehouseListResponseItem;

public class OrderWebServiceTest extends WebServiceTest {

	private long[] warehouseIDs;
	private long[] articleIDsFirstWarehouse;
	private Long firstOpenOrderID;

	@Before
	public void populateIDLists() throws MissingWarehouse, UnknownOrder {
		OrderListResponse orderListResp = orders.list();
		for (long orderID : orderListResp.getOrderIds()) {
			if (orders.query(orderID).getOpen()) {
				firstOpenOrderID = orderID;
				break;
			}
		}
		if (firstOpenOrderID == null) {
			throw new IllegalArgumentException("Could not find an open order. Please check SampleContents.");
		}

		final List<WarehouseListResponseItem> lWarehouses = warehouses.list().getItems();
		warehouseIDs = new long[lWarehouses.size()];
		for (int i = 0; i < warehouseIDs.length; ++i) {
			warehouseIDs[i] = lWarehouses.get(i).getWarehouseID();
		}

		// We only need to know the IDs of the articles in the first warehouses
		final WarehouseItemsResponse itemsFirstWarehouse
			= warehouses.listStock(warehouseIDs[0]);
		final List<WarehouseItemsResponseItem> lItemsFirstWarehouse
			= itemsFirstWarehouse.getItems();
		articleIDsFirstWarehouse
			= new long[lItemsFirstWarehouse.size()];
		for (int i = 0; i < articleIDsFirstWarehouse.length; ++i) {
			articleIDsFirstWarehouse[i] = lItemsFirstWarehouse.get(i).getId();
		}
	}

	@Test
	public void queryOrders() throws UnknownOrder {
		OrderListResponse results = orders.list();
		assertEquals(2, results.getOrderIds().size());

		final long orderId = results.getOrderIds().get(0);
		OrderQueryResponse orderInfo = orders.query(orderId);
		final Set<SimpleOrderLine> lines = orderInfo.getLines();

		final Iterator<SimpleOrderLine> iterLines = lines.iterator();
		assertEqualBigDecimals(BigDecimal.valueOf(9001L), iterLines.next().getQty());
		assertEqualBigDecimals(BigDecimal.valueOf(42L), iterLines.next().getQty());
	}

	@Test
	public void evaluateOrder() throws UnknownOrder, UnknownArticle {
		final OrderEvaluateRequest newOrder = new OrderEvaluateRequest();
		final Map<Long, BigDecimal> qtys = newOrder.getArticleQuantities();
		qtys.put(articleIDsFirstWarehouse[0], BigDecimal.valueOf(10d));
		qtys.put(articleIDsFirstWarehouse[1], BigDecimal.valueOf(5d));

		OrderEvaluateResponse orderEvaluateResponse = orders.evaluate(newOrder);
		assertEquals(OrderEvaluateResult.ACCEPTED, orderEvaluateResponse.getResult());

		// Ensure that the new order exists - this wouldn't normally be needed in a performance test
		orders.query(orderEvaluateResponse.getOrderId());
	}

	@Test
	public void closeOrder() throws UnknownOrder, OrderAlreadyClosed {
		orders.close(firstOpenOrderID);
		assertTrue(!orders.query(firstOpenOrderID).getOpen());
	}

	private void assertEqualBigDecimals(BigDecimal expected, BigDecimal obtained) {
		assertTrue(expected.compareTo(obtained) == 0);
	}
}
