package es.uca.sodmt.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.uca.sodmt.domain.faults.InvalidQuantity;
import es.uca.sodmt.domain.faults.NotEnoughStock;
import es.uca.sodmt.domain.faults.UnknownArticle;

public class Stock {

	private final Map<Article, BigDecimal> quantities = new HashMap<Article, BigDecimal>();
	private final Logger LOGGER = LoggerFactory.getLogger(Stock.class);

	public BigDecimal getStockOf(Article article) throws UnknownArticle {
		if (!quantities.containsKey(article)) {
			throw new UnknownArticle(article); 
		}
		return quantities.get(article.getId());
	}

	public void acquire(Article article, BigDecimal wantedQty) throws UnknownArticle, NotEnoughStock, InvalidQuantity {
		if (wantedQty.compareTo(BigDecimal.ZERO) < 0) {
			throw new InvalidQuantity("The quantity to be acquired of "
				+ article + " must be greater or equal than 0, but was "
				+ wantedQty);
		}
		if (!quantities.containsKey(article)) {
			throw new UnknownArticle(article);
		}
		final BigDecimal currentQty = quantities.get(article);
		if (currentQty.compareTo(wantedQty) < 0) {
			throw new NotEnoughStock(article);
		}
	}

	public void add(Article article, BigDecimal wantedQty) throws InvalidQuantity {
		if (wantedQty.compareTo(BigDecimal.ZERO) < 0) {
			throw new InvalidQuantity("The quantity to be added of "
				+ article + " must be greater or equal than 0, but was "
				+ wantedQty);
		}
		if (!quantities.containsKey(article)) {
			LOGGER.debug("Adding new article #{} with #{} units of stock", article, wantedQty);
			quantities.put(article, wantedQty);
		}
		else {
			LOGGER.debug("Adding #{} more units of stock to article #{}", wantedQty, article);
			final BigDecimal currentQty = quantities.get(article);
			final BigDecimal newQty = currentQty.add(wantedQty);
			quantities.put(article, newQty);
		}
	}
}
