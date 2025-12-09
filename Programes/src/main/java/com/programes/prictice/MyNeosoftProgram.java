package com.programes.prictice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyNeosoftProgram {

	public static void main(String[] args) {

		String name = "Rahul ghadage";

		Map<Character, Long> collect = name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// collect.entrySet().stream().forEach(x -> );
		
		int[] arr = new int[10];
		
		Arrays.stream(arr);

		int num = 5;
		for (int i = 1; i <= num; i++) {

			for (int j = i; j < num; j++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
