package com.programes.questions;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.util.Chars;

public class AnagramStringCheck {

	public static void main(String[] args) {

//		
//		Anagram Checker
//		Write a function to check if two strings are anagrams.
//		Input: "listen", "silent"
//		Output: true

		// select max(salary) from Employee where salary < (select max(salary) from
		// Employee);

		String str1 = "listen";

		String str2 = "silent";

		TreeMap<String, Long> collect = str1.chars().mapToObj(Objects::toString)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

		TreeMap<String, Long> collect2 = str2.chars().mapToObj(Objects::toString)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

		if (collect.size() == collect2.size()) {

			Set<Entry<String, Long>> entrySet = collect.entrySet();
			Set<Entry<String, Long>> entrySet2 = collect2.entrySet();

		}

	}

}
