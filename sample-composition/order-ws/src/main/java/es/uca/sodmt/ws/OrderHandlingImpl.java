package es.uca.sodmt.ws;

import java.util.Random;

import javax.jws.WebService;

import es.uca.sodmt.domain.Order;
import es.uca.sodmt.domain.OrderAcceptStatus;
import es.uca.sodmt.domain.UnknownOrder;

@WebService(endpointInterface="es.uca.sodmt.ws.OrderHandling")
public class OrderHandlingImpl implements OrderHandling {

	private final Random rnd = new Random();

	public OrderAcceptStatus evaluate(Order o) throws UnknownOrder {
		OrderAcceptStatus[] possibleValues = OrderAcceptStatus.values();
		final int possibleResult = rnd.nextInt(possibleValues.length+1);
		if (possibleResult >= possibleValues.length) {
			throw new UnknownOrder(o.getID());
		}
		return possibleValues[rnd.nextInt(possibleValues.length)];
	}

}
