package es.uca.sodmt.orders.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;


public class ArticleTest extends AbstractHibernateTest {

	@Test
	public void createArticle() {
		final Article article = new Article("BigFoo", BigDecimal.valueOf(2010, 2));

		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long)session.save(article);
		session.getTransaction().commit();
		session.close();

		assertEquals(id, article.getId());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void listArticles() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(new Article("cheezburger", BigDecimal.valueOf(3050, 2)));
		session.save(new Article("cheez", BigDecimal.valueOf(305, 2)));
		session.getTransaction().commit();

		final List<Article> articles = (List<Article>)
				session.createCriteria(Article.class)
				.add(Restrictions.ge("price", BigDecimal.valueOf(400, 2)))
				.list();

		assertEquals(1, articles.size());
	}
}
