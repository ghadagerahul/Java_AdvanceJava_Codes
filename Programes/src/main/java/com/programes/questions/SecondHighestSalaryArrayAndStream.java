package com.programes.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondHighestSalaryArrayAndStream {

	public static void main(String[] args) {

		// 2. Second Highest Salary (SQL & Java)
		// Write a SQL query and Java code to find the second highest salary.
		// Input: [4000, 3000, 1000, 2000]
		// Output: 3000

		Integer[] salArr = { 4000, 11000, 2000, 5000, 3000, 1000, 2000, 11000 };

		List<Integer> collect = Arrays.asList(salArr).stream().distinct().sorted(Comparator.reverseOrder()).limit(2)
				.collect(Collectors.toList());

		System.out.println("Second Highest Salary: " + collect.get(1));

	}

}
