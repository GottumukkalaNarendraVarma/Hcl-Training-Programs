package org.hcl.collections;

public class ItemType {
	private String name;
	private String deposit;
	private String costPerDay;

	public ItemType() {
		// TODO Auto-generated constructor stub
	}

	public ItemType(String name, String deposit, String costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(String costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-20s%-20s%-20s", this.name,this.deposit,this.costPerDay);
	}

}
