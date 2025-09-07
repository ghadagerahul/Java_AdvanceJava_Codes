package com.programes.questions;

import java.util.Scanner;

public class FactorialNumberUsingMethods {

	public static void main(String[] args) {

		System.err.println("Enter input Numner..!!!");
		int num = new Scanner(System.in).nextInt();

		// factorialUsingIteratorMethod(num);

		System.out.println("Factorial using factorialUsingIteratorMethod: " + factorialUsingRecursiveMethod(num));

	}

	private static int factorialUsingRecursiveMethod(int num) {
		if (num == 0 || num == 1)
			return 1;
		else
			return num * factorialUsingRecursiveMethod(num - 1);

	}

	private static void factorialUsingIteratorMethod(int num) {

		int result = 1;
		for (int i = num; i > 0; i--) {

			result = result * i;

		}

		System.out.println("Factorial using factorialUsingIteratorMethod: " + result);
	}

}
