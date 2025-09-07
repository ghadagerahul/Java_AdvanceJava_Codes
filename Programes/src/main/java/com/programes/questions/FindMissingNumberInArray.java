package com.programes.questions;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

//		Find Missing Number in Array
//		Input: [1, 2, 4, 5] with range 1–5
//		Output: 3

		int[] arr = { 2, 4, 8, 10, 14 };

		int length = arr.length + 1;

		int expectedLength = length * (length + 1) / 2;
		int actualLength = 0;

		for (int sr : arr) {
			actualLength += sr;
		}

		System.out.println(expectedLength - actualLength);

		/*
		 * int[] arr = { 2, 4, 8, 10, 14 }; int prevDiff = 0; boolean flag = false; for
		 * (int i = 0; i < arr.length; i++) {
		 * 
		 * for (int j = i + 1; j < arr.length; j++) {
		 * 
		 * int diff = arr[j] - arr[i];
		 * 
		 * if (diff != prevDiff && i > 0 && i < arr.length - 2) { int val = arr[i] +
		 * prevDiff; System.out.println("Missing Number is : " + val);
		 * 
		 * }
		 * 
		 * prevDiff = diff;
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * }
		 */
	}

}
