package com.programes.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapToSimpleMap {

	public static void main(String[] args) {

//		Flat Map Example
//		Input: [[1, 2], [3, 4], [5]]

		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));

		List<Integer> collect = listOfLists.stream().flatMap(List<Integer>::stream).collect(Collectors.toList());
		collect.stream().forEach(System.out::print);

	}

}
