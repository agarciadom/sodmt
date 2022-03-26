package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import es.uca.sodmt.orders.model.Address;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.MissingShipment;
import es.uca.sodmt.ws.faults.OrderAlreadyShipped;
import es.uca.sodmt.ws.faults.OrderRejected;
import es.uca.sodmt.ws.faults.beans.MissingShipmentBean;
import es.uca.sodmt.ws.responses.ShipmentResponse;

public class ShipmentWebServiceTest extends WebServiceTest {

	private static final Address DEFAULT_ADDRESS = new Address("Country", "State", "City", "Street", "13", "000");

	@Test
	public void shipped() throws MissingOrder {
		assertTrue(shipments.isShipped(getDBContents().getClosedOrder().getId()));
	}

	@Test
	public void notShipped() throws MissingOrder {
		assertFalse(shipments.isShipped(getDBContents().getAcceptedOpenOrder().getId()));
	}

	@Test
	public void shippedQuery() throws Exception {
		Long orderID = getDBContents().getClosedOrder().getId();
		final ShipmentResponse r = shipments.query(orderID);
		assertEquals(orderID, r.getOrderID());
	}

	@Test
	public void notShippedQuery() throws Exception {
		final long orderID = getDBContents().getAcceptedOpenOrder().getId();

		try {
			shipments.query(orderID);
			fail("An exception should have been thrown");
		} catch (MissingShipment ex) {
			final MissingShipmentBean info = ex.getFaultInfo();
			assertEquals(orderID, info.getOrderID());
		}
	}

	@Test(expected=OrderRejected.class)
	public void shippedRejected() throws Exception {
		final long orderID = getDBContents().getRejectedOpenOrder().getId();
		shipments.ship(orderID, DEFAULT_ADDRESS);
	}

	@Test(expected=OrderAlreadyShipped.class)
	public void shippedAlready() throws Exception {
		final long orderID = getDBContents().getClosedOrder().getId();
		shipments.ship(orderID, DEFAULT_ADDRESS);
	}

	@Test
	public void ship() throws Exception {
		final long orderID = getDBContents().getAcceptedOpenOrder().getId();
		final ShipmentResponse result = shipments.ship(orderID, DEFAULT_ADDRESS);
		assertEquals(orderID, result.getOrderID().longValue());
		assertEquals(DEFAULT_ADDRESS, result.getDestination());
	}
}
