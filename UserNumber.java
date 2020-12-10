package org.hcl.collections;

public class UserNumber implements Comparable<UserNumber> {
	private String name;
	private String mobileNumber;
	private String username;
	private String password;

	public UserNumber() {

	}

	public UserNumber(String name, String mobileNumber, String username, String password) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int compareTo(UserNumber e) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(e.getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s%-15s", this.getName(), this.getMobileNumber());
	}

}
