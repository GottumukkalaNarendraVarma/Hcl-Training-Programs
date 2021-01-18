package org.hcl.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class TestTicketBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<TicketBooking> list = new ArrayList<>();
		System.out.println("Enter the number of customers");
		int noOfCustomers = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		for (int i = 0; i < noOfCustomers; i++) {
			String ticketDetails[] = sc.nextLine().split(",");
			list.add(new TicketBooking(ticketDetails[0], Integer.parseInt(ticketDetails[1])));
		}
		TicketBooking maximumTicket = Collections.max(list, new TicketBooking());
		TicketBooking minimumTicket = Collections.min(list, new TicketBooking());
		System.out
				.println(minimumTicket.getCustomerName() + " spends minimum amount of Rs." + minimumTicket.getPrice());
		System.out.println(maximumTicket.getCustomerName() + " maximum amount of Rs." + maximumTicket.getPrice());

	}

}
