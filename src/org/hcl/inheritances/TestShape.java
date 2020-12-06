package org.hcl.inheritances;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		double area, radius, length, breadth, base, height;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape" + '\n' + "1.Circle" + '\n' + "2.Rectangle" + '\n' + "3.Triangle");
		choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter the radius:");
			radius = sc.nextDouble();
			Circle s = new Circle(radius);
			s.computeArea();
			break;
		case 2:
			System.out.println("Enter the length and breadth");
			length = sc.nextDouble();
			sc.nextLine();
			breadth = sc.nextDouble();
			sc.nextLine();
			Rectangle r = new Rectangle(length, breadth);
			r.computeArea();
			break;
		case 3:
			System.out.println("Enter the base and height:");
			base = sc.nextDouble();
			sc.nextLine();
			height = sc.nextDouble();
			sc.nextLine();
			Triangle t = new Triangle(base, height);
			t.computeArea();
			break;
		default:
			System.out.println("Invalid choice");

		}

	}

}
