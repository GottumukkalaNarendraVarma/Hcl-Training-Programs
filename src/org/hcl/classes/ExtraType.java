package org.hcl.classes;

public class ExtraType {
	String name;
	long runs;

	public ExtraType() {
		// TODO Auto-generated constructor stub
	}

	public ExtraType(String name, long runs) {
		super();
		this.name = name;
		this.runs = runs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRuns() {
		return runs;
	}

	public void setRuns(long runs) {
		this.runs = runs;
	}

	public void display() {
		System.out.println("Extratype details");
		System.out.println("Extra Type: " + name);
		System.out.println("Runs: " + runs);
	}

}
