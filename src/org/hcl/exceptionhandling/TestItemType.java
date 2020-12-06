package org.hcl.exceptionhandling;

import java.util.Scanner;

public class TestItemType {

	public static void main(String[] args) {
		String name, deposit, costPerDay;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Item type details:");
			System.out.println("Enter the name:");
			name = sc.nextLine();
			System.out.println("Enter the deposit");
			deposit = sc.nextLine();
			double d = Double.parseDouble(deposit);
			System.out.println("Enter the cost per day:");
			costPerDay = sc.nextLine();
			double c = Double.parseDouble(costPerDay);
			ItemType i = new ItemType(name, deposit, costPerDay);
			System.out.println(i);

		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		}

	}

}
