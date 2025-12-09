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

		Integer[] arr = { 4000, 3000, 1000, 2000 };

		Integer secHighSal = Arrays.asList(arr).stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst()
				.orElse(null);

		System.out.println("Second Highest Salary: " + secHighSal);

	}

}
