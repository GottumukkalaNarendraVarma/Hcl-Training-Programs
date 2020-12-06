package org.hcl.classes;

public class Delivery {
	long over, ball, runs;
	String batsman, bowler, nonStriker;

	public Delivery() {
		// TODO Auto-generated constructor stub
	}

	public Delivery(long over, long ball, long runs, String batsMan, String bowler, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsMan;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	public void printDetails() {
		System.out.println("Delivery Details :");
		System.out.println("Over :" + over + '\n' + "Ball :" + ball + '\n' + "Runs :" + runs);
		System.out.println("Batsman :" + batsman + '\n' + "Bowler :" + bowler + '\n' + "NonStriker :" + nonStriker);

	}

}
