package es.uca.sodmt.domain.results;

import java.util.Calendar;

public class OrderCloseResult {

	private Calendar closedTimestamp = Calendar.getInstance();

	public Calendar getClosedTimestamp() {
		return closedTimestamp;
	}

	public void setClosedTimestamp(Calendar timestamp) {
		this.closedTimestamp = timestamp;
	}
}
