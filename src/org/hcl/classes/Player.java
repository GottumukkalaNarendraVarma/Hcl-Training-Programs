package org.hcl.classes;

public class Player {
	String name, country, skill;

	public Player() {

	}

	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public void printDetails() {
		System.out.println("Player Details :");
		System.out.println("Player Name : " + name);
		System.out.println("Country Name : " + country);
		System.out.println("Skill : " + skill);

	}

}
