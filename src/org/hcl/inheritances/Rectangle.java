package org.hcl.inheritances;

public class Rectangle {
	private double length, breadth;
	double area;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public void computeArea() {
		area = length * breadth;
		System.out.println("The area of rectangle is " + area);
	}

}
