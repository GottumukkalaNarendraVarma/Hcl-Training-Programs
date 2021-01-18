package org.hcl.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestStall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Stall> list = new ArrayList<>();
		System.out.println("Enter the number of stall details");
		int numberOfStalls = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberOfStalls; i++) {
			System.out.println("Enter the stall " + (i + 1) + " details");
			String details[] = sc.nextLine().split(",");
			list.add(new Stall(details[0], details[1], details[2], details[3]));
		}
		Iterator<Stall> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getName().startsWith("test")) {
				itr.remove();
			}
		}
		System.out.printf("%-15s %-20s %-15s %s\n", "Name", "Detail", "Type", "OwnerName");
		for (Stall s : list)
			System.out.println(s);

	}

}
