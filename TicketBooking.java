package org.hcl.collections;

import java.util.Comparator;

public class TicketBooking implements Comparator<TicketBooking> {
	private String customerName;
	private Integer price;

	public TicketBooking() {

	}

	public TicketBooking(String customerName, Integer price) {
		this.customerName = customerName;
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public int compare(TicketBooking e1, TicketBooking e2) {

		return e1.getPrice().compareTo(e2.getPrice());

	}

}
