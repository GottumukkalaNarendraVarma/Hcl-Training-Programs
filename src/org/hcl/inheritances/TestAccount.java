package org.hcl.inheritances;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		String accName, accNo, bankName, tinNumber, orgName, accountDetails, accountDetails1;
		int at;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Account type " + '\n' + "1.Savings Account" + '\n' + "2.Current Account");
		at = sc.nextInt();
		sc.nextLine();
		switch (at) {
		case 1:
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			accountDetails = sc.nextLine();
			String[] details = accountDetails.split(",");
			for (String value : details) {
				System.out.println(value);
			}
			break;
		case 2:
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			accountDetails1 = sc.nextLine();
			String[] details1 = accountDetails1.split(",");
			for (String value1 : details1) {
				System.out.println(value1);
			}
			break;
		default:
			System.out.println("please enter correct choice");
			break;
		}

	}

}
