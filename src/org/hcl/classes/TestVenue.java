package org.hcl.classes;

import java.util.Scanner;

public class TestVenue {

	public static void main(String[] args) {
		String name, city;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name ");
		name = sc.nextLine();
		System.out.println("Enter the city name");
		city = sc.nextLine();
		Venue v = new Venue(name, city);
		v.printDetails();

	}

}
