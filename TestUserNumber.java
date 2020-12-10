package org.hcl.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class TestUserNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int numberOfUsers = sc.nextInt();
		sc.nextLine();
		List<UserNumber> ul = new ArrayList<>(numberOfUsers);
		for (int i = 1; i <= numberOfUsers; i++) {
			System.out.println("Enter the details of user " + i);
			String str1[] = sc.nextLine().split(",");
			ul.add(new UserNumber(str1[0], str1[1], str1[2], str1[3]));
		}
		Collections.sort(ul);
		Collections.reverse(ul);
		System.out.println("The user details in reverse order:");
		System.out.printf("%-15s%-15s\n", "Name", "Mobile Number");
		for (UserNumber x : ul)
			System.out.println(x);
	}

}
