package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

import es.uca.sodmt.ws.faults.beans.MissingInvoiceBean;

@WebFault
public class MissingInvoice extends Exception {

	private static final long serialVersionUID = 1L;
	private MissingInvoiceBean info;

	public MissingInvoice(String message, MissingInvoiceBean info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public MissingInvoice(String message, MissingInvoiceBean info) {
		super(message);
		this.info = info;
	}

	public MissingInvoiceBean getFaultInfo() {
		return info;
	}

}
