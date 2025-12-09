package com.programes.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		
		String name = "aacbbd";
		
		Character orElse = name.chars().mapToObj(c -> (char) c).filter(c -> name.indexOf(c) == name.lastIndexOf(c))
				.findFirst().orElse(null);

	//	System.out.println(orElse);
		
	Character orElse2 = name.chars().mapToObj(c -> (char) c)
			.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
			.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
	System.out.println(orElse2);

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
