package es.uca.sodmt.ws.impl;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.uca.sodmt.orders.model.Invoice;
import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.ws.Invoices;
import es.uca.sodmt.ws.faults.MissingInvoice;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.responses.InvoiceGenerateResponse;
import es.uca.sodmt.ws.responses.InvoiceQueryResponse;

@WebService(endpointInterface="es.uca.sodmt.ws.Invoices")
public class InvoicesImpl extends AbstractServiceImpl implements Invoices {

	@Override
	public InvoiceGenerateResponse generate(long orderID) throws MissingOrder {
		final Session session = getSession();
		final Transaction t = session.beginTransaction();

		final Order order = getOrder(orderID, session);
		Invoice newInvoice = order.getInvoice();
		if (newInvoice == null) {
			newInvoice = new Invoice(order);
			session.save(newInvoice);
		}

		InvoiceGenerateResponse response = new InvoiceGenerateResponse(orderID, newInvoice);
		t.commit();
		return response;
	}

	@Override
	public boolean isPaid(long orderID) throws MissingOrder, MissingInvoice {
		final Session session = getSession();
		final Transaction t = session.beginTransaction();
		boolean response = getInvoice(orderID, session).isPaid();
		t.commit();
		return response;
	}

	@Override
	public void pay(long orderID) throws MissingOrder, MissingInvoice {
		final Session session = getSession();
		final Transaction t = session.beginTransaction();
		getInvoice(orderID, session).setPaid(true);
		t.commit();
	}

	@Override
	public InvoiceQueryResponse query(long orderID) throws MissingOrder,
			MissingInvoice
	{
		final Session session = getSession();
		final Transaction t = session.beginTransaction();
		final Invoice invoice = getInvoice(orderID, session);
		InvoiceQueryResponse response = new InvoiceQueryResponse(orderID, invoice);
		t.commit();
		return response;
	}

}
