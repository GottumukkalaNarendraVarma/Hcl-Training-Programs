package org.hcl.classes;

public class Venue {
	String name, city;

	public Venue() {

	}

	public Venue(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public void printDetails() {
		System.out.println("Venue Details :");
		System.out.println("Venue Name :" + name);
		System.out.println("City Name :" + city);

	}

}
