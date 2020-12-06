package org.hcl.functions;

import java.util.function.*;

public class ReplaceSpaces {

	public static void main(String[] args) {
		Function<String, String> f = str -> str.replaceAll(" ", "");
		System.out.println(f.apply("we are undergoing java full stack training"));
		System.out.println(f.apply("Our training started on 16th november and will end on january 1st"));
		System.out.println(f.apply("we are campus joiners"));

	}

}
