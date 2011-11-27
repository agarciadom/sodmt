package es.uca.sodmt.orders.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.junit.Test;

public class OrderTest extends AbstractHibernateTest {

	@Test
	public void populateOrder() {
		final Session session = sessionFactory.openSession();

		{
			final Article article = new Article("cheezburger", BigDecimal.valueOf(20));
			final Order order = new Order();
			final Warehouse warehouse = new Warehouse(new Address("Spain", "Cádiz", "Cádiz", "C/Chile", "1", "23456"));
			order.setWarehouse(warehouse);
			order.addLine(new OrderLine(article, BigDecimal.valueOf(20)));

			session.beginTransaction();
			session.persist(article);
			session.persist(warehouse);
			session.persist(order);
			session.getTransaction().commit();
		}

		final Order order = (Order)session.createCriteria(Order.class).list().get(0);
		final OrderLine firstLine = order.getLines().iterator().next();
		assertNotNull(order.getTimestamp());
		assertEquals(BigDecimal.valueOf(20), firstLine.getPrice());

		session.close();
	}
}
