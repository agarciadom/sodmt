package es.uca.sodmt.ws;

import javax.jws.WebService;

import es.uca.sodmt.domain.Order;
import es.uca.sodmt.domain.faults.NotEnoughStock;
import es.uca.sodmt.domain.faults.OrderAlreadyClosed;
import es.uca.sodmt.domain.faults.UnknownArticle;
import es.uca.sodmt.domain.faults.UnknownOrder;
import es.uca.sodmt.domain.results.OrderAcceptResult;
import es.uca.sodmt.domain.results.OrderCloseResult;
import es.uca.sodmt.domain.results.OrderShipResult;

@WebService
public interface OrderHandling {

	public OrderAcceptResult evaluate(Order o) throws UnknownArticle;

	public OrderShipResult ship(long orderID) throws UnknownOrder, NotEnoughStock;

	public OrderCloseResult close(long orderID) throws UnknownOrder, OrderAlreadyClosed;

}
