package es.uca.sodmt.ws.impl;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

import es.uca.sodmt.orders.model.Invoice;
import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.ws.Invoices;
import es.uca.sodmt.ws.faults.MissingInvoice;
import es.uca.sodmt.ws.faults.UnknownOrder;
import es.uca.sodmt.ws.responses.InvoiceGenerateResponse;
import es.uca.sodmt.ws.responses.InvoiceQueryResponse;

@WebService(endpointInterface="es.uca.sodmt.ws.Invoices")
public class InvoicesImpl implements Invoices {

	@Override
	public InvoiceGenerateResponse generate(long orderID) throws UnknownOrder {
		final Session session = getSession();
		final Order order = getOrder(orderID, session);
		Invoice newInvoice = order.getInvoice();
		if (newInvoice != null) {
			newInvoice = new Invoice(order);

			final Transaction t = session.beginTransaction();
			session.save(newInvoice);
			t.commit();
		}

		return new InvoiceGenerateResponse(orderID, newInvoice);
	}

	@Override
	public boolean isPaid(long orderID) throws UnknownOrder, MissingInvoice {
		final Session session = getSession();
		return getInvoice(orderID, session).isPaid();
	}

	@Override
	public void pay(long orderID) throws UnknownOrder, MissingInvoice {
		final Session session = getSession();
		getInvoice(orderID, session).setPaid(true);
	}

	@Override
	public InvoiceQueryResponse query(long orderID) throws UnknownOrder,
			MissingInvoice
	{
		final Session session = getSession();
		final Invoice invoice = getInvoice(orderID, session);
		return new InvoiceQueryResponse(orderID, invoice);
	}

	private Invoice getInvoice(long orderID, final Session session)
			throws UnknownOrder, MissingInvoice {
		final Order order = getOrder(orderID, session);
		if (order.getInvoice() == null) {
			throw new MissingInvoice(orderID);
		}
		return order.getInvoice();
	}

	private Order getOrder(long orderID, final Session session)
			throws UnknownOrder {
		final Order order = (Order) session.get(Order.class, orderID);
		if (order == null) {
			throw new UnknownOrder(orderID);
		}
		return order;
	}

	private synchronized Session getSession() {
		final ApplicationContext appContext = ContextLoader.getCurrentWebApplicationContext();
		final SessionFactory factory = (SessionFactory)appContext.getBean("hibernateSessionFactory");
		return factory.getCurrentSession();
	}
}
