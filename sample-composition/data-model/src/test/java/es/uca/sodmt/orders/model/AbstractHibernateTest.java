package es.uca.sodmt.orders.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;

public abstract class AbstractHibernateTest {

	protected SessionFactory sessionFactory;

	@Before
	public void setup() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	@After
	public void teardown() {
		sessionFactory.close();
	}

}