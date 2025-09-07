package com.programes.questions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInString {

	public static void main(String[] args) {

//		Reverse Each Word in a String
//		Input: "hello world"
//		Output: "olleh dlrow"

		String str = "hello world";

		// first way
		StringBuffer sb = new StringBuffer();

		Arrays.asList(str.split(" ")).stream().filter(x -> !x.isBlank()).forEach(x -> {

			sb.append(new StringBuffer(x).reverse() + " ");
		});

		System.out.println(sb.toString().trim());

		// second way
		String collect = Arrays.asList(str.split(" ")).stream().filter(x -> !x.trim().isBlank())
				.map(x -> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
		// System.out.println(collect);

	}

}
