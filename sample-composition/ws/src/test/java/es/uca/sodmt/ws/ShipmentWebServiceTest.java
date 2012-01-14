package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.MissingShipment;
import es.uca.sodmt.ws.responses.ShipmentResponse;

public class ShipmentWebServiceTest extends WebServiceTest {

	@Test
	public void shipped() throws MissingOrder {
		assertTrue(shipments.isShipped(getDBContents().getClosedOrder().getId()));
	}

	@Test
	public void notShipped() throws MissingOrder {
		assertFalse(shipments.isShipped(getDBContents().getOpenOrder().getId()));
	}

	@Test
	public void shippedQuery() throws MissingOrder, MissingShipment {
		Long orderID = getDBContents().getClosedOrder().getId();
		final ShipmentResponse r = shipments.query(orderID);
		assertEquals(orderID, r.getOrderID());
	}

	@Test(expected=MissingShipment.class)
	public void notShippedQuery() throws MissingOrder, MissingShipment {
		shipments.query(getDBContents().getOpenOrder().getId());
	}
}
