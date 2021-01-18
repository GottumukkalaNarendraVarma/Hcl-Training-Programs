package org.hcl.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestUserMail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<UserMail> ul = new ArrayList<>();
		System.out.println("Enter the number of user details");
		int numberOfUsers = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= numberOfUsers; i++) {
			System.out.println("Enter the User " + i + " details");
			String[] str1 = sc.nextLine().split(",");
			ul.add(new UserMail(str1[0], str1[1], str1[2], str1[3]));
		}
		int choice;
		do {
			System.out.println("Sort by\n1. Name\n2. Email");
			choice = sc.nextInt();
			if (choice == 1) {
				Collections.sort(ul, new NameComparator());
			} else if (choice == 2) {
				Collections.sort(ul, new EmailComparator());
			} else {
				System.out.println("Exited");
				break;
			}
			System.out.printf("%-15s %-15s %-15s %s\n", "Name", "Email", "UserName", "Password");
			for (UserMail u : ul)
				System.out.println(u);
		} while (true);

	}

	
}
