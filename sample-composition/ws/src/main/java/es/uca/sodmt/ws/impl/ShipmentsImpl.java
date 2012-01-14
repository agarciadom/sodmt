package es.uca.sodmt.ws.impl;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.orders.model.Shipment;
import es.uca.sodmt.ws.Shipments;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.MissingShipment;
import es.uca.sodmt.ws.faults.OrderAlreadyShipped;
import es.uca.sodmt.ws.faults.ShipmentFault;
import es.uca.sodmt.ws.responses.ShipmentResponse;

@WebService(endpointInterface="es.uca.sodmt.ws.Shipments")
public class ShipmentsImpl extends AbstractServiceImpl implements Shipments {

	@Override
	public ShipmentResponse query(long orderID) throws ShipmentFault {
		final Session session = getSession();
		final Transaction t = session.beginTransaction();

		try {
			final Order o = getOrder(orderID, session);
			if (o.getShipment() == null) {
				throw new ShipmentFault(
					"Order with ID " + orderID + " has not been shipped yet",
					new MissingShipment(orderID));
			}
			final ShipmentResponse response = new ShipmentResponse(o.getShipment());
			return response;
		} catch (MissingOrder o) {
			throw new ShipmentFault("Order with ID " + orderID + " does not exist",
					new MissingShipment(orderID));
		} finally {
			t.commit();
		}
	}

	@Override
	public boolean isShipped(long orderID) throws MissingOrder {
		final Session session = getSession();

		final Transaction t = session.beginTransaction();
		final Order o = getOrder(orderID, session);
		final boolean shipped = o.getShipment() != null;
		t.commit();

		return shipped;
	}

	@Override
	public ShipmentResponse ship(long orderID) throws MissingOrder, OrderAlreadyShipped {
		final Session session = getSession();

		final Transaction t = session.beginTransaction();
		final Order o = getOrder(orderID, session);
		if (o.getShipment() != null) {
			throw new OrderAlreadyShipped(orderID);
		}
		o.setShipment(new Shipment(o));
		final ShipmentResponse response = new ShipmentResponse(o.getShipment());
		t.commit();
		
		return response;
	}

}
