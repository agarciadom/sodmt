package es.uca.sodmt.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import es.uca.sodmt.orders.model.Address;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.MissingShipment;
import es.uca.sodmt.ws.faults.OrderAlreadyShipped;
import es.uca.sodmt.ws.faults.OrderRejected;
import es.uca.sodmt.ws.responses.ShipmentResponse;

@WebService
public interface Shipments {

	ShipmentResponse query(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder, MissingShipment;

	boolean isShipped(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder;

	ShipmentResponse ship(
		@WebParam(name="orderID") long orderID,
		@WebParam(name="destination") Address destination)
			throws MissingOrder, OrderRejected, OrderAlreadyShipped;
}
