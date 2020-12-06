package org.hcl.inheritances;

public class Circle {
	private double radius;
	double area;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void computeArea() {
		area = (22 / 7) * radius * radius;
		System.out.println("The area of circle is " + area);
	}

}
