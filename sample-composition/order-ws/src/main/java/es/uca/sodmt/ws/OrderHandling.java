package es.uca.sodmt.ws;

import javax.jws.WebService;

import es.uca.sodmt.domain.Order;
import es.uca.sodmt.domain.OrderAcceptStatus;
import es.uca.sodmt.domain.UnknownOrder;

@WebService
public interface OrderHandling {

	public OrderAcceptStatus evaluate(Order o) throws UnknownOrder;

}
