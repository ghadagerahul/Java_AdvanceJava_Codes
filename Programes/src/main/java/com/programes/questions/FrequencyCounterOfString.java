package com.programes.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyCounterOfString {

	public static void main(String[] args) {

		String str = "adbcdabcdbabcdca";

		Map<Character, Long> collect2 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		collect2.entrySet().forEach(System.out::println);

	}

}
