package com.programes.questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {

		String input = "aabccc";

		Map<Character, Long> collect = input.chars().filter(x -> x != ' ').mapToObj(j -> (char) j)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		collect.entrySet().forEach(System.out::print);

	}

}
