package com.programes.dsa.array;

import java.util.Scanner;

public class SumOfArrayElemnts {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int arrSize = scanner.nextInt();

		System.out.println("Enter " + arrSize + " Numbers");

		int arr[] = new int[arrSize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.err.println("Sum is: " + sum);
	}
}
