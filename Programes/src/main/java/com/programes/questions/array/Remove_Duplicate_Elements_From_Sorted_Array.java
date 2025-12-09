package com.programes.questions.array;

import java.util.Arrays;

public class Remove_Duplicate_Elements_From_Sorted_Array {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };

		Arrays.stream(arr).map(c -> (int) c).distinct().forEach(System.out::println);
	}
}
