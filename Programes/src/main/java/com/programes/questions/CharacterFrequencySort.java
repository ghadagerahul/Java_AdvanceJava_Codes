package com.programes.questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.xml.stream.events.Characters;

public class CharacterFrequencySort {

	public static void main(String[] args) {

		// Given a character array, sort characters by frequency in descending order.
		// Input: ['a', 'b', 'a', 'c', 'b', 'a', 'd']
		// Output: ['a', 'a', 'a', 'b', 'b', 'd', 'c']

		Character[] charArr = { 'a', 'b', 'a', 'c', 'b', 'a', 'd' };

		LinkedHashMap<Character, Long> collect = Arrays.stream(charArr)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		LinkedHashMap<Character, Long> collect2 = collect.entrySet().stream()
				.sorted(Map.Entry.<Character, Long>comparingByValue(Comparator.reverseOrder())
						.thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		List<Character> list = new ArrayList();
		collect2.entrySet().forEach(x -> {

			for (int i = 0; i < x.getValue(); i++) {
				list.add(x.getKey());

			}

		});

		list.stream().forEach(System.out::print);
	}

}
