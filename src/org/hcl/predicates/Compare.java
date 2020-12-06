package org.hcl.predicates;

import java.util.function.*;

public class Compare {

	public static void main(String[] args) {
		Predicate<Integer> p = num -> (num > 10);
		System.out.println(p.test(5));
		System.out.println(p.test(21));
		System.out.println(p.test(4));

	}

}
