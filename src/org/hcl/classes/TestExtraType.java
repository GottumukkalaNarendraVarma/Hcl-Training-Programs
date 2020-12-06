package org.hcl.classes;

import java.util.Scanner;

public class TestExtraType {

	public static void main(String[] args) {
		String name, details;
		String[] details1;
		long runs;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the extratype details");
		details = sc.nextLine();
		details1 = details.split("#");
		ExtraType et = new ExtraType(details1[0], Long.parseLong(details1[1]));
		et.display();

	}

}
