package es.uca.sodmt.ws;

import java.math.BigDecimal;
import java.util.Map;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.uca.sodmt.domain.Article;
import es.uca.sodmt.domain.Order;
import es.uca.sodmt.domain.Stock;
import es.uca.sodmt.domain.faults.InvalidQuantity;
import es.uca.sodmt.domain.faults.NotEnoughStock;
import es.uca.sodmt.domain.faults.OrderAlreadyClosed;
import es.uca.sodmt.domain.faults.UnknownArticle;
import es.uca.sodmt.domain.faults.UnknownOrder;
import es.uca.sodmt.domain.results.OrderAcceptResult;
import es.uca.sodmt.domain.results.OrderCloseResult;
import es.uca.sodmt.domain.results.OrderShipResult;

@WebService(endpointInterface="es.uca.sodmt.ws.OrderHandling")
public class OrderHandlingImpl implements OrderHandling {

	private final Stock  stock  = new Stock();
	private long currentOrderID = 0;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderHandlingImpl.class);

	public OrderHandlingImpl() throws InvalidQuantity {
		final Article artCheezburgers = new Article();
		artCheezburgers.setName("cheezburger");
		artCheezburgers.setId(1);
		stock.add(artCheezburgers, BigDecimal.valueOf(9001));
	}

	public synchronized long getNewOrderID() {
		return ++currentOrderID;
	}

	public OrderAcceptResult evaluate(Order o) throws UnknownArticle {
		LOGGER.info("Processing order #{}", o.getID());

		// Check if we have enough stock for every order item
		for (Map.Entry<Article, BigDecimal> entry : o.getOrderItems().entrySet()) {
			final Article a = entry.getKey();
			final BigDecimal wantedQty = entry.getValue();
			final BigDecimal currentStock = stock.getStockOf(a);
			if (currentStock.compareTo(wantedQty) < 0) {
				LOGGER.info("We don't have enough stock of #{} for order #{}", a.getName(), o.getID());
				return OrderAcceptResult.REJECTED;
			}
		}

		LOGGER.info("We have enough stock for order #{}", o.getID());

		// We do have enough stock: acquire it now
		for (Map.Entry<Article, BigDecimal> entry : o.getOrderItems().entrySet()) {
			final Article a = entry.getKey();
			final BigDecimal wantedQty = entry.getValue();
			try {
				stock.acquire(a, wantedQty);
			} catch (Exception e) {
				LOGGER.error("BUG: did not expect an exception here", e);
			}
		}

		// FIXME: return order ID through the result
		return OrderAcceptResult.ACCEPTED;
	}

	public OrderShipResult ship(long o) throws UnknownOrder, NotEnoughStock {
		
		
		// TODO Auto-generated method stub
		return null;
	}

	public OrderCloseResult close(long orderID) throws UnknownOrder,
			OrderAlreadyClosed {
		// TODO Auto-generated method stub
		return null;
	}

}
