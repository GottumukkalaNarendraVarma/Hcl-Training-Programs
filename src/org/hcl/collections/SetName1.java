package org.hcl.collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetName1 {

	public static void main(String[] args) {
		String name, choice;
		HashSet<String> names = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the username");
			name = sc.nextLine();
			names.add(name);
			System.out.println("Do you want to continue?(Y/N)");
			choice = sc.nextLine();
		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("The unique number of usernames is " + names.size());

	}

}
