package com.programes.questions;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import io.micrometer.common.util.StringUtils;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

//		Remove Duplicates from List
//		Input: [1, 2, 3, 2, 1, 4]
//		Output: [1, 2, 3, 4]

		List<Integer> list = List.of(1, 2, 3, 2, 1, 4);

		list.stream().distinct().forEach(System.out::print);

		List<String> listOfString = List.of("sam", "ram", "dam", "ram", "mam", "dam", "kamew", "dcadc", "abcd",
				"dacdac");
		System.err.println("======================");
		listOfString.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

		System.err.println("======================");
		listOfString.stream().filter(x -> StringUtils.isNotBlank(x))
				.collect(Collectors.toCollection(LinkedHashSet<String>::new)).forEach(System.out::println);

	}

}
