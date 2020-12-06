package org.hcl.inheritances;

public class Stall {
	protected String name, detail, ownerName;
	String stallType;

	public Stall() {

	}

	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void computeCost(String stallType, Integer squareFeet) {
		if (stallType.equals("platinum")) {
			int cost = 200 * squareFeet;
			System.out.println("The cost is:" + cost);

		} else if (stallType.equals("diamond")) {
			int cost = 150 * squareFeet;
			System.out.println("The cost is:" + cost);

		} else if (stallType.equals("gold")) {
			int cost = 100 * squareFeet;
			System.out.println("The cost is:" + cost);

		}

	}

	public void computeCost(String stallType, Integer squareFeet, Integer noOfTv) {
		if (stallType.equals("platinum")) {
			int cost = 200 * squareFeet * noOfTv;
			System.out.println("The cost is:" + cost);
		} else if (stallType.equals("diamond")) {
			int cost = 150 * squareFeet * noOfTv;
			System.out.println("The cost is:" + cost);

		} else if (stallType.equals("gold")) {
			int cost = 100 * squareFeet * noOfTv;
			System.out.println("The cost is: " + cost);

		}

	}

}
