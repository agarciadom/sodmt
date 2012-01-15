package es.uca.sodmt.ws.impl;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.uca.sodmt.orders.model.Address;
import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.orders.model.Shipment;
import es.uca.sodmt.ws.Shipments;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.MissingShipment;
import es.uca.sodmt.ws.faults.OrderAlreadyShipped;
import es.uca.sodmt.ws.faults.beans.MissingShipmentBean;
import es.uca.sodmt.ws.responses.ShipmentResponse;

@WebService(endpointInterface="es.uca.sodmt.ws.Shipments")
public class ShipmentsImpl extends AbstractServiceImpl implements Shipments {

	@Override
	public ShipmentResponse query(long orderID) throws MissingShipment {
		final Session session = getSession();
		final Transaction t = session.beginTransaction();

		try {
			final Order o = getOrder(orderID, session);
			if (o.getShipment() == null) {
				throw new MissingShipment(
					"Order with ID " + orderID + " has not been shipped yet",
					new MissingShipmentBean(orderID));
			}
			final ShipmentResponse response = new ShipmentResponse(o.getShipment());
			return response;
		} catch (MissingOrder o) {
			throw new MissingShipment("Order with ID " + orderID + " does not exist",
					new MissingShipmentBean(orderID));
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
	public ShipmentResponse ship(long orderID, Address address) throws MissingOrder, OrderAlreadyShipped {
		final Session session = getSession();

		final Transaction t = session.beginTransaction();
		final Order o = getOrder(orderID, session);
		if (o.getShipment() != null) {
			throw new OrderAlreadyShipped(orderID);
		}
		Shipment shipment = new Shipment(o, address);
		session.persist(shipment);
		o.setShipment(shipment);
		final ShipmentResponse response = new ShipmentResponse(o.getShipment());
		t.commit();
		
		return response;
	}

}
