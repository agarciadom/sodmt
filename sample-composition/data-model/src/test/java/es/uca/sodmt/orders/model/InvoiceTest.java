package es.uca.sodmt.orders.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.junit.Test;

public class InvoiceTest extends AbstractHibernateTest {

	@Test
	public void computeTotal() {
		final Session session = sessionFactory.openSession();

		final int qtyArticle1 = 5;
		final int qtyArticle2 = 2;
		final int priceArticle1 = 1;
		final int priceArticle2 = 10;
		{
			final Article article1 = new Article("cheezburger", BigDecimal.valueOf(priceArticle1));
			final Article article2 = new Article("bukkit", BigDecimal.valueOf(priceArticle2));

			final Warehouse warehouse = new Warehouse(new Address("Spain", "Cádiz", "Cádiz", "C/ Chile", "1", "28345"));
			warehouse.addStockItem(new StockItem(article1, BigDecimal.valueOf(20)));
			warehouse.addStockItem(new StockItem(article2, BigDecimal.valueOf(30)));

			final Order order = new Order();
			order.addLine(new OrderLine(article1, BigDecimal.valueOf(qtyArticle1)));
			order.addLine(new OrderLine(article2, BigDecimal.valueOf(qtyArticle2)));

			final Invoice invoice = new Invoice(order);

			session.beginTransaction();
			session.persist(article1);
			session.persist(article2);
			session.persist(warehouse);
			session.persist(order);
			session.persist(invoice);
			session.getTransaction().commit();

			System.out.println(warehouse);
			System.out.println(order);
			System.out.println(invoice);
		}

		final Invoice invoice = (Invoice)session.createCriteria(Invoice.class).list().get(0);
		final BigDecimal expectedTotal = BigDecimal.valueOf(qtyArticle1 * priceArticle1 + qtyArticle2 * priceArticle2);
		assertEquals(expectedTotal, invoice.getTotal());
	}
}
