package org.hcl.functions;

import java.util.function.*;

public class StringLength {

	public static void main(String[] args) {
		Function<String, Integer> f1 = str -> str.length();
		Function<String, Integer> f2 = str -> str.length();
		Function<String, Integer> f3 = str -> str.length();
		System.out.println(f1.apply("hello"));
		System.out.println(f2.apply("Hcl"));
		System.out.println(f3.apply("Trainees"));

	}

}
