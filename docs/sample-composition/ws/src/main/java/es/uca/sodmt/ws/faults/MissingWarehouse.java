package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

import es.uca.sodmt.ws.faults.beans.MissingWarehouseBean;

@WebFault
public class MissingWarehouse extends Exception {

	private static final long serialVersionUID = 1L;
	private MissingWarehouseBean info;

	public MissingWarehouse(String message, MissingWarehouseBean info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public MissingWarehouse(String message, MissingWarehouseBean info) {
		super(message);
		this.info = info;
	}

	public MissingWarehouse(long warehouseID) {
		this("Warehouse with ID " + warehouseID + " does not exist", new MissingWarehouseBean(warehouseID));
	}

	public MissingWarehouseBean getFaultInfo() {
		return info;
	}

}
