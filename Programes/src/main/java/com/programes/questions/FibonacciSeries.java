package com.programes.questions;

public class FibonacciSeries {

	public static void main(String[] args) {

//		
//		Fibonacci Series up to N Terms
//		Input: N = 5
//		Output: 0 1 1 2 3

		int result1 = 0;
		int result2 = 1;

		for (int i = 0; i < 10; i++) {

			System.err.println(result1);
			result1 = result1 + result2;
			result2 = result1 - result2;

		}

	}
}
