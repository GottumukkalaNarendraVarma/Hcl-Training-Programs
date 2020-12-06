package org.hcl.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListName {

	public static void main(String[] args) {
		String name;
		String choice;
		ArrayList<String> names = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int no = 1;
		do {
			System.out.println("Enter the details of user " + no);
			name = sc.nextLine();
			names.add(name);
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.nextLine();
			no = no + 1;
		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("The Names entered are:");
		for (String name1 : names) {
			System.out.println(name1);
		}

	}

}
