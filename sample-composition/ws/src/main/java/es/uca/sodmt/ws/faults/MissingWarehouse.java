package es.uca.sodmt.ws.faults;

public class MissingWarehouse extends Exception {

	private static final long serialVersionUID = 1L;

	private long warehouseID;

	public MissingWarehouse(long warehouseID) {
		this.warehouseID = warehouseID;
	}

	public long getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(long warehouseID) {
		this.warehouseID = warehouseID;
	}

}
