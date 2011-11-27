package es.uca.sodmt;

import java.math.BigDecimal;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.uca.sodmt.orders.model.Address;
import es.uca.sodmt.orders.model.Article;
import es.uca.sodmt.orders.model.Invoice;
import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.orders.model.OrderLine;
import es.uca.sodmt.orders.model.Shipment;
import es.uca.sodmt.orders.model.StockItem;
import es.uca.sodmt.orders.model.Warehouse;

public class SampleContents {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleContents.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory factory) {
		this.sessionFactory = factory;
	}
 
	public void createContents() {
		final Session session = sessionFactory.openSession();

		try {
			final Article article1 = new Article("cheezburger", BigDecimal.valueOf(3));
			final Article article2 = new Article("bukkit", BigDecimal.valueOf(6));

			final Warehouse warehouse1 = new Warehouse(new Address("Spain", "Cádiz", "Cádiz", "C/Chile", "1", "23456"));
			final StockItem stock1 = new StockItem(article1, BigDecimal.valueOf(20));
			final StockItem stock2 = new StockItem(article2, BigDecimal.valueOf(15));
			warehouse1.addStockItem(stock1);
			warehouse1.addStockItem(stock2);

			final Order order = new Order();
			order.setWarehouse(warehouse1);
			order.addLine(new OrderLine(article1, BigDecimal.valueOf(42)));
			order.addLine(new OrderLine(article2, BigDecimal.valueOf(9001)));
			order.setOpen(false);

			final Invoice invoice = new Invoice(order);
			final Shipment shipment = new Shipment(order);
			invoice.setPaid(true);

			session.beginTransaction();
			session.persist(article1);
			session.persist(article2);
			session.persist(warehouse1);
			session.persist(order);
			session.persist(invoice);
			session.persist(shipment);
			session.getTransaction().commit();

			LOGGER.info("Finished creating some sample contents for the in-memory H2 database");
			LOGGER.info("Warehouse: " + warehouse1);
			LOGGER.info("Order: " + order);
		} finally {
			session.close();
		}
	}
}
