package com.programes.questions.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class First_Non_Repeating_Character_String {

	public static void main(String[] args) {

		String input = "first non repeating character from string";

		LinkedHashMap<Character, Long> collect = input.chars().mapToObj(s -> (char) s)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		collect.entrySet().forEach(entry -> System.out.print(entry + " "));

		Character key = collect.entrySet().stream().filter(x -> x.getValue() == 1).limit(1).findFirst().get().getKey();

		System.out.print(" ||| key: " + key);

	}

}
