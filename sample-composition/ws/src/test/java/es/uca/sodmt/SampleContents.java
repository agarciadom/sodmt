package es.uca.sodmt;


import java.math.BigDecimal;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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

	private Article cheezburger;
	private Article bukkit;
	private Warehouse warehouse;
	private Order closedOrder, openOrder;
 
	public void createContents() {
		final SessionFactory factory = new Configuration().configure().buildSessionFactory();
		final Session session = factory.openSession();

		try {
			cheezburger = new Article("cheezburger", BigDecimal.valueOf(3));
			bukkit = new Article("bukkit", BigDecimal.valueOf(6));

			warehouse = new Warehouse(new Address("Spain", "Cádiz", "Cádiz", "C/Chile", "1", "23456"));
			final StockItem stock1 = new StockItem(cheezburger, BigDecimal.valueOf(20));
			final StockItem stock2 = new StockItem(bukkit, BigDecimal.valueOf(15));
			warehouse.addStockItem(stock1);
			warehouse.addStockItem(stock2);

			closedOrder = new Order();
			closedOrder.setWarehouse(warehouse);
			closedOrder.addLine(new OrderLine(cheezburger, BigDecimal.valueOf(42)));
			closedOrder.addLine(new OrderLine(bukkit, BigDecimal.valueOf(9001)));
			closedOrder.setOpen(false);

			final Invoice invoice = new Invoice(closedOrder);
			final Shipment shipment = new Shipment(closedOrder);
			invoice.setPaid(true);

			openOrder = new Order();
			openOrder.setWarehouse(warehouse);
			openOrder.addLine(new OrderLine(cheezburger, BigDecimal.valueOf(5)));
			openOrder.setOpen(true);

			final Transaction transaction = session.beginTransaction();
			session.persist(cheezburger);
			session.persist(bukkit);
			session.persist(warehouse);
			session.persist(closedOrder);
			session.persist(invoice);
			session.persist(shipment);
			session.persist(openOrder);
			transaction.commit();

			LOGGER.info("Finished creating some sample contents for the in-memory H2 database");
			LOGGER.info("Warehouse: " + warehouse);
			LOGGER.info("Order: " + closedOrder);
		} finally {
			session.close();
			factory.close();
		}
	}

	public Article getFirstArticle() {
		return cheezburger;
	}

	public Article getSecondArticle() {
		return bukkit;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public Order getClosedOrder() {
		return closedOrder;
	}

	public Order getOpenOrder() {
		return openOrder;
	}

}
