package es.uca.sodmt.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import es.uca.sodmt.ws.faults.MissingInvoice;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.OrderRejected;
import es.uca.sodmt.ws.responses.InvoiceGenerateResponse;
import es.uca.sodmt.ws.responses.InvoiceQueryResponse;

@WebService
public interface Invoices {

	InvoiceGenerateResponse generate(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder, OrderRejected;

	InvoiceQueryResponse query(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder, MissingInvoice;

	boolean isPaid(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder, MissingInvoice;

	void pay(
		@WebParam(name="orderID") long orderID)
			throws MissingOrder, MissingInvoice;

}
