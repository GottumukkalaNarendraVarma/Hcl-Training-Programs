package org.hcl.exceptionhandling;

public class ItemType {
	String name, deposit, costPerDay;

	public ItemType() {

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

	public String toString() {
		return name + '\n' + deposit + '\n' + costPerDay;
	}

}
