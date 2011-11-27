package es.uca.sodmt.ws;

import javax.jws.WebService;

import es.uca.sodmt.ws.faults.OrderAlreadyClosed;
import es.uca.sodmt.ws.faults.UnknownArticle;
import es.uca.sodmt.ws.faults.UnknownOrder;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest;
import es.uca.sodmt.ws.responses.OrderCloseResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse;
import es.uca.sodmt.ws.responses.OrderListResponse;
import es.uca.sodmt.ws.responses.OrderQueryResponse;

@WebService
public interface Orders {

	public OrderEvaluateResponse evaluate(OrderEvaluateRequest o) throws UnknownArticle;

	public OrderCloseResponse close(long orderID) throws UnknownOrder, OrderAlreadyClosed;

	public OrderListResponse  list();

	public OrderQueryResponse query(long orderID) throws UnknownOrder;

}
