package org.hcl.exceptionhandling;

import java.util.Scanner;

public class Cost {

	public static void main(String[] args) {
		int cost, noOfDays, costPerDay;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the cost of the item for n days");
			cost = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the value of n");
			noOfDays = sc.nextInt();
			sc.nextLine();
			costPerDay = cost / noOfDays;
			System.out.println("Cost per day of the item is " + costPerDay);

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

	}

}
