package org.hcl.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Type {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter an integer input");
			number = sc.nextInt();
			sc.nextLine();
			System.out.println("Entered value is " + number);
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
		}

	}

}
