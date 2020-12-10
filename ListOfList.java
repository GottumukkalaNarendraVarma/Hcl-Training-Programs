package org.hcl.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ArrayList<Integer>> eachDayShowList = new ArrayList<ArrayList<Integer>>(5);
		System.out.println("Enter the count of booked tickets:");

		for (int i = 1; i <= 5; i++) {
			ArrayList<Integer> list = new ArrayList<>(4);
			System.out.println("On Day " + i);
			String st[] = sc.nextLine().split(",");
			for (int j = 0; j < 4; j++)
				list.add(100 - Integer.parseInt(st[j]));
			eachDayShowList.add(list);
		}
		String choice;
		do {
			System.out.println("Enter the day to know its remaining ticket count:");
			int remainingTickets = sc.nextByte();
			sc.nextLine();
			System.out.println("Remaining tickets:" + eachDayShowList.get(remainingTickets - 1));
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.nextLine();
		} while (choice.equalsIgnoreCase("Y"));

	}
}
