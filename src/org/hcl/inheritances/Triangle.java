package org.hcl.inheritances;

public class Triangle {
	private double base, height;
	double area;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}


	public void computeArea() {
		area = (1 / 2) * base * height;
		System.out.println("The area of Triangle is" + area);
	}

}
