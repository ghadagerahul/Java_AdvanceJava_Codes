package com.programes.questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestWordInSentense {

//	Longest Word in a Sentence
//	Input: "Infosys conducts Java interviews"
//	Output: "interviews"

	public static void main(String[] args) {

		String str = "Infosys conducts Java interviews";

		// first way
		String longestString = Arrays.asList(str.split(" ")).stream().filter(x -> !x.trim().isBlank())
				.max(Comparator.comparingInt(String::length)).get();
		System.out.println("longestString; " + longestString);

		// second way
		Map<String, Integer> lengthmap = new HashMap();
		Arrays.asList(str.split(" ")).stream().filter(Objects::nonNull).forEach(x -> {
			lengthmap.put(x, x.length());
		});

		LinkedHashMap<String, Integer> collect = lengthmap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		Optional<Entry<String, Integer>> first = collect.entrySet().stream().findFirst();
		String key = first.get().getKey();

		// System.out.println(key);

	}

}
