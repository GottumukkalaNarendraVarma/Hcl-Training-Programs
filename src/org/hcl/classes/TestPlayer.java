package org.hcl.classes;

import java.util.Scanner;

public class TestPlayer {

	public static void main(String[] args) {
		String name, country, skill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name ");
		name = sc.nextLine();
		System.out.println("Enter the country name");
		country = sc.nextLine();
		System.out.println("Enter the skill");
		skill = sc.nextLine();
		Player p = new Player(name, country, skill);
		p.printDetails();

	}

}
