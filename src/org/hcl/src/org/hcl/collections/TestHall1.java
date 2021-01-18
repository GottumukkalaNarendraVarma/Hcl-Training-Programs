package org.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestHall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Hall1> list = new ArrayList<>();
		System.out.println("Enter the number of halls :");
		int noOfHalls = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= noOfHalls; i++) {
			System.out.println("Enter the details of hall " + i);
			String details[] = sc.nextLine().split(",");
			list.add(new Hall1(details[0], details[1], Double.parseDouble(details[2]), details[3]));
		}
		Collections.sort(list);
		System.out.println("Sorted Order (from the least expensive to the most):");
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Contact Number", "Cost Per Day", "Owner Name");
		for (Hall1 h : list) {
			System.out.println(h);
		}

	}

}
