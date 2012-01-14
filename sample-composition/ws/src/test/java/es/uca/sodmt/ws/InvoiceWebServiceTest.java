package es.uca.sodmt.ws;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

import es.uca.sodmt.ws.faults.MissingInvoice;
import es.uca.sodmt.ws.faults.UnknownOrder;
import es.uca.sodmt.ws.responses.InvoiceGenerateResponse;

public class InvoiceWebServiceTest extends WebServiceTest {

	@Test
	public void doPayment() throws UnknownOrder, MissingInvoice {
		final long orderID = getDBContents().getOpenOrder().getId();

		InvoiceGenerateResponse response = invoices.generate(orderID);
		assertEqualBigDecimals(BigDecimal.valueOf(15L), response.getTotal());
		assertFalse(invoices.query(orderID).isPaid());

		invoices.pay(orderID);
		assertTrue(invoices.query(orderID).isPaid());
	}
}
