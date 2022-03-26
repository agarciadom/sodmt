package es.uca.sodmt.orders.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

public class WarehouseTest extends AbstractHibernateTest {

	@Test
	public void populateWarehouse() {
		final Warehouse originalWarehouse = new Warehouse();
		final Address address = new Address("Spain", "Cádiz", "Cádiz", "C/Chile", "1", "34856");
		final Article article = new Article("cheezburger", BigDecimal.valueOf(2010, 2));
		final StockItem stockItem = new StockItem(article, BigDecimal.valueOf(30));
		originalWarehouse.setAddress(address);
		originalWarehouse.addStockItem(stockItem);

		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(article);
		session.persist(originalWarehouse);
		session.getTransaction().commit();

		final Warehouse savedWarehouse
			= (Warehouse)session.createCriteria(Warehouse.class).list().get(0);
		assertEquals("Spain", savedWarehouse.getAddress().getCountry());

		final Set<StockItem> savedItems = savedWarehouse.getStockItems();
		final StockItem savedItem = savedItems.iterator().next();
		assertEquals(BigDecimal.valueOf(30), savedItem.getQuantity());
		assertEquals("cheezburger", savedItem.getArticle().getName());

		session.close();
	}
}
