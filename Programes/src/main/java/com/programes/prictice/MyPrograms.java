package com.programes.prictice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyPrograms {

	public static void main(String[] args) {

		String s = "welcome to java, interview and welcome to coding";

		List<String> asList = Arrays.asList(s.split(" "));

		Map<String, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		LinkedHashMap<String, Long> collect2 = collect.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toMap(Entry::getKey,
						Entry::getValue, (e1, e2) -> e1, LinkedHashMap<String, Long>::new));

		collect.entrySet().forEach(System.out::println);
		System.out.println("**********");
		collect2.entrySet().forEach(System.out::println);

	}

	// introductiion
	// oops - pillers
	// design pattern - singletone, builder, abstract
	// how to create singletone class
	// collections
	// araylist vs linkedlist
	// internal working of hashmap
	// working of hashtable - not ans
	// treeset vs hashset
	// rest-api - http methods.
	// microservice
	// mysql- statements
	// mockito - unit testing
	// make every words count in string and sort by value

}
