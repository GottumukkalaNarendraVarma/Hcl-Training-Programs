package org.hcl.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Hall {

	public static void main(String[] args) {
		String hallName;
		ArrayList<String> names=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of halls: ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Hall Name "+i);
			hallName=sc.nextLine();
			names.add(hallName);
		}
		System.out.println("Enter the hall name to be searched:");
		String choice=sc.nextLine();
		if(names.contains(choice))
		{
			int position=names.indexOf(choice);
			System.out.println(choice+" hall is found in the list at position "+position);
		}
		

	}

}
