package org.hcl.classes;

import java.util.Scanner;

public class TestVenue1 {

	public static void main(String[] args) {
		String name,city;
		Scanner sc=new Scanner(System.in);
		Venue1 v1=new Venue1();
		System.out.println("Enter the venue name");
		name=sc.nextLine();
		v1.setName(name);
		System.out.println("Enter the city name");
		city=sc.nextLine();
		v1.setCity(city);
		v1.printDetails();
		int choice;
		do {
			System.out.println("Venue Details"+'\n'+"Menu"+'\n'+"1.Update Venue Name"+'\n'+"2.Update City Name"+'\n'+"3.All informations Correct/Exit"+'\n'+"Type 1 or 2 or 3 ");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:System.out.println("Enter the venue name");
			String t=sc.nextLine();
			v1.setName(t);
			v1.printDetails();
			break;
			case 2:System.out.println("Enter the city name");
			city=sc.nextLine();
			v1.setCity(city);
		    v1.printDetails();
			break;
			default:
				break;
			
			
			
			}
		}while(choice!=3);
		
	}

}
