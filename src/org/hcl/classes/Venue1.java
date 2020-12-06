package org.hcl.classes;

public class Venue1 {
	private String name, city;

	public Venue1() {
		// TODO Auto-generated constructor stub
	}

	public Venue1(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void printDetails() {
		System.out.println("Venue Details");
		System.out.println("Venue Name : " + name);
		System.out.println("City Name : " + city);

	}

	
}
