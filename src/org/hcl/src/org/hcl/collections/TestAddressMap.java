package org.hcl.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestAddressMap {

	public static void add(Map<String, Map<String, List<AddressMap>>> stateMap, AddressMap am) {
		String state = am.getState();
		String city = am.getCity();
		List<AddressMap> list = new ArrayList<>();
		list.add(am);

		Map<String, List<AddressMap>> cityMap = new HashMap<String, List<AddressMap>>();
		cityMap.put(city, list);

		if (stateMap.containsKey(state)) {

			if (stateMap.get(state).containsKey(city)) {
				stateMap.get(state).get(city).add(am);
			} else
				stateMap.get(state).put(city, list);
		} else
			stateMap.put(state, cityMap);

	}

	private static void search(Map<String, Map<String, List<AddressMap>>> stateMap, String state, String city) {
		if (stateMap.containsKey(state)) {

			if (stateMap.get(state).containsKey(city)) {
				for (AddressMap m : stateMap.get(state).get(city)) {
					System.out.println(m);
				}
			} else {
				System.out.println("Searched City not found");
			}
		} else {
			System.out.println("Searched State not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String, Map<String, List<AddressMap>>> map = new HashMap<>();
		System.out.println("Enter the number of address");
		int noOfAddress = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= noOfAddress; i++) {
			System.out.println("Enter the address" + i + " details");
			String[] str = in.nextLine().split(",");
			String add1 = str[0];
			String add2 = str[1];
			String city = str[2];
			String state = str[3];
			Integer pinCode = Integer.parseInt(str[4]);
			add(map, new AddressMap(add1, add2, city, state, pinCode));
		}
		System.out.println("Enter the state to be searched");
		String searchState = in.nextLine();
		System.out.println("Enter the city to be searched");
		String searchCity = in.nextLine();
		// System.out.println("++++"+searchCity);
		System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line1", "Line2", "City", "State", "Pincode");

		search(map, searchState, searchCity);

	}

}
