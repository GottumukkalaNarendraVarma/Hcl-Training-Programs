package org.hcl.inheritances;

import java.util.Scanner;

public class TestStall {
	public static void main(String[] args) {
		String name, detail, ownerName, stallType;
		int squareFeet, noOfTv, cost;
		char find;
		Scanner sc = new Scanner(System.in);
		Stall s = new Stall();
		System.out.println("Enter the name of the stall:");
		name = sc.nextLine();
		System.out.println("Enter the detail of the stall:");
		detail = sc.nextLine();
		System.out.println("Enter the owner name of the stall:");
		ownerName = sc.nextLine();
		System.out.println("Enter the type of the stall:");
		stallType = sc.nextLine();
		System.out.println("Enter the size of the stall in square feet:");
		squareFeet = sc.nextInt();
		sc.nextLine();
		System.out.println("Does the hall have TV?(y/n)");
		find = sc.next().charAt(0);
		sc.nextLine();
		switch (find) {
		case 'y':
			System.out.println("Enter the number of TV:");
			noOfTv = sc.nextInt();
			sc.nextLine();
			s.computeCost(stallType, squareFeet, noOfTv);
			break;
		case 'n':
			s.computeCost(stallType, squareFeet);
			break;
		}

	}

}
