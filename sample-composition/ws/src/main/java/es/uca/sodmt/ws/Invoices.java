package es.uca.sodmt.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import es.uca.sodmt.ws.faults.MissingInvoice;
import es.uca.sodmt.ws.faults.UnknownOrder;
import es.uca.sodmt.ws.responses.InvoiceGenerateResponse;
import es.uca.sodmt.ws.responses.InvoiceQueryResponse;

@WebService
public interface Invoices {

	InvoiceGenerateResponse generate(
		@WebParam(name="orderID") long orderID)
			throws UnknownOrder;

	InvoiceQueryResponse query(
		@WebParam(name="orderID") long orderID)
			throws UnknownOrder, MissingInvoice;

	boolean isPaid(
		@WebParam(name="orderID") long orderID)
			throws UnknownOrder, MissingInvoice;

	void pay(
		@WebParam(name="orderID") long orderID)
			throws UnknownOrder, MissingInvoice;

}
