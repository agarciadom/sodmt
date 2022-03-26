package es.uca.sodmt.ws.faults.beans;

public class MissingWarehouseBean {

	private long warehouseID;

	public MissingWarehouseBean() {
		// JAXB
	}

	public MissingWarehouseBean(long warehouseID) {
		this.warehouseID = warehouseID;
	}

	public long getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(long warehouseID) {
		this.warehouseID = warehouseID;
	}

}
