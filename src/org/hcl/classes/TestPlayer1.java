package org.hcl.classes;

import java.util.Scanner;

public class TestPlayer1 {
	public static void main(String[] args) {
		String name, country, skill, details;
		String[] player;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details ");
		details = sc.nextLine();
		player = details.split(",");
		Player1 p = new Player1();
		System.out.println("The player details are:");
		for (String c : player) {
			System.out.println(c);

		}

	}
}
