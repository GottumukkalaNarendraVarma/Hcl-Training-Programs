package org.hcl.collections;

public class Hall1 implements Comparable<Hall1> {
	private String name;
	private String contactNumber;
	private Double costPerDay;
	private String ownerName;

	public Hall1() {
	}

	public Hall1(String name, String contactNumber, Double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerNmae) {
		this.ownerName = ownerName;
	}

	@Override
	public int compareTo(Hall1 e) {
		return this.getCostPerDay().compareTo(e.getCostPerDay());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s%-15s%-15s%-15s", this.getName(), this.getContactNumber(), this.getCostPerDay(),
				this.getOwnerName());
	}

}
