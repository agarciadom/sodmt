package es.uca.sodmt.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.OrderAlreadyShipped;
import es.uca.sodmt.ws.faults.ShipmentFault;
import es.uca.sodmt.ws.responses.ShipmentResponse;

@WebService
public interface Shipments {

	ShipmentResponse query(
		@WebParam(name="orderID") long orderID)
			throws ShipmentFault;

	boolean isShipped(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder;

	ShipmentResponse ship(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder, OrderAlreadyShipped;
}
