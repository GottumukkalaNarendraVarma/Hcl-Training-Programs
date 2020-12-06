package org.hcl.classes;

import java.util.Scanner;

public class TestDelivery {

	public static void main(String[] args) {
		long over, ball, runs;
		String batsman, bowler, nonStriker;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over");
		over = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the ball");
		ball = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the runs");
		runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		batsman = sc.nextLine();
		System.out.println("Enter the bowler name");
		bowler = sc.nextLine();
		System.out.println("Enter the nonStriker name");
		nonStriker = sc.nextLine();
		Delivery d = new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		d.printDetails();

	}

}
