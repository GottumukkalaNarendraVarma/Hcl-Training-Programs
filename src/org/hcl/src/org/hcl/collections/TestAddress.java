package org.hcl.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class TestAddress {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Address> al = new ArrayList<>();
		System.out.println("Enter the number of users");
		int numberOfUsers = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
		for (int i = 1; i <= numberOfUsers; i++) {
			String s[] = sc.nextLine().split(",");
			al.add(new Address(s[0], s[1], s[2], Integer.parseInt(s[3])));
		}
		Collections.sort(al);
		System.out.println("User Details :");
		for (Address a : al)
			System.out.println(a);

	}
}
