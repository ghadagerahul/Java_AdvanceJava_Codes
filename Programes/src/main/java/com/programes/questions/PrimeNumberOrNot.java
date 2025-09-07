package com.programes.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberOrNot {

	public static void main(String[] args) {

		int N = 100;

		for (int i = 2; i < N; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0)
					count++;
			}

//			if (count == 2)
//				System.err.print(i);

		}

		Integer[] arr = {1,2,6,7,8,3,9,4};
		
		List<Integer> collect = Arrays.asList(arr).stream().sorted().collect(Collectors.toList());
		
		Object[] array = collect.toArray();
		for(Object s:array) {
			System.out.println(s);
		}
		collect.forEach(System.out::print);
	}

}
