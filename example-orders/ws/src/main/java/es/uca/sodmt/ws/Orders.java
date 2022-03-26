package es.uca.sodmt.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import es.uca.sodmt.ws.faults.MissingArticle;
import es.uca.sodmt.ws.faults.OrderAlreadyClosed;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest;
import es.uca.sodmt.ws.responses.OrderCloseResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse;
import es.uca.sodmt.ws.responses.OrderListResponse;
import es.uca.sodmt.ws.responses.OrderQueryResponse;

@WebService
public interface Orders {

	OrderEvaluateResponse evaluate(
		@WebParam(name="newOrder") OrderEvaluateRequest o)
			throws MissingArticle;

	OrderCloseResponse close(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder, OrderAlreadyClosed;

	OrderListResponse  list();

	OrderQueryResponse query(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder;

}
