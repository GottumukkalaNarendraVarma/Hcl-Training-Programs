package org.hcl.predicates;

import java.util.function.*;

public class PredicateJoinExp {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		Predicate<Integer> p1 = num -> num > 1;
		System.out.println("The numbers greater than one are");
		calc(p1, a);
		System.out.println("The even numbers are ");
		Predicate<Integer> p2 = num -> (num % 2 == 0);
		calc(p2, a);
		System.out.println("The numbers divisible by 5 are ");
		Predicate<Integer> p3 = num -> (num % 5 == 0);
		calc(p3, a);
		System.out.println("The numbers that are not greater than one");
		calc(p1.negate(), a);
		System.out.println("The numbers greater than one and even are ");
		calc(p1.and(p2), a);
		System.out.println("The numbers greater than one or the numbers which are divisible by 5");
		calc(p1.or(p3), a);
	}

	public static void calc(Predicate<Integer> p, int[] a) {
		for (int a1 : a) {
			if (p.test(a1))
				System.out.println(a1);

		}

	}

}
