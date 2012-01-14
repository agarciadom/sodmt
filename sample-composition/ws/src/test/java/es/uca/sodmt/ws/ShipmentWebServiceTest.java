package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.MissingShipment;
import es.uca.sodmt.ws.faults.ShipmentFault;
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
	public void shippedQuery() throws Exception {
		Long orderID = getDBContents().getClosedOrder().getId();
		final ShipmentResponse r = shipments.query(orderID);
		assertEquals(orderID, r.getOrderID());
	}

	@Test
	public void notShippedQuery() throws Exception {
		final long orderID = getDBContents().getOpenOrder().getId();

		try {
			shipments.query(orderID);
			fail("A ShipmentFault exception should have been thrown");
		} catch (ShipmentFault ex) {
			final MissingShipment info = ex.getFaultInfo();
			assertEquals(orderID, info.getOrderID());
		}
	}
}
