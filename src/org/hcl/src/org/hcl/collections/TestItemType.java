package org.hcl.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestItemType {

	public static void main(String[] args) {
		String name, deposit, costPerDay;
		Scanner sc = new Scanner(System.in);
		int no = 1;
		String choice;
		ArrayList<ItemType> items = new ArrayList<>();
		do {
			System.out.println("Enter the details of Item Type " + no++);
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("deposit: ");
			deposit = sc.nextLine();
			System.out.println("costPerDay: ");
			costPerDay = sc.nextLine();
			items.add(new ItemType(name, deposit, costPerDay));
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.nextLine();
		} while (choice.equalsIgnoreCase("Y"));
		System.out.printf("%-20s%-20s%-20s\n", "Name", "Deposit", "Cost Per Day");
		for (ItemType item : items) {
			System.out.println(item);
		}
		sc.close();

	}
}
