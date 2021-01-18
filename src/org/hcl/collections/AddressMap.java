package org.hcl.collections;

public class AddressMap {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private Integer pinCode;

	public AddressMap(String addressLine1, String addressLine2, String city, String state, Integer pinCode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s %-15s %-15s %-15s %d", this.addressLine1, this.addressLine2, this.city, this.state,
				this.pinCode);
	}

}