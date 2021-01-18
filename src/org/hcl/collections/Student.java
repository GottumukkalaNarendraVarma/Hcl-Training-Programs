package org.hcl.collections;

public class Student {
	private String name;
	private String college;
	private String erank;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String college, String erank) {
		super();
		this.name = name;
		this.college = college;
		this.erank = erank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getErank() {
		return erank;
	}
	public void setErank(String erank) {
		this.erank = erank;
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t",name,college,erank);
	}
	

}
