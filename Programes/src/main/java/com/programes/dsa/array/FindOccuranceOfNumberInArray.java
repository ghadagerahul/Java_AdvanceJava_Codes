package com.programes.dsa.array;

import java.util.Scanner;

public class FindOccuranceOfNumberInArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of an Array..!!!");
		int sizeofArray = scanner.nextInt();
		System.out.println("Enter Target Element of Array.");
		int targetElement = scanner.nextInt();

		int arr[] = new int[sizeofArray];
		System.err.println("Enter " + sizeofArray + " Numbers.");
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = scanner.nextInt();
		}

		int frequescyOfTargetElement = findFrequescyOfTargetElement(arr, targetElement);
		System.out.println("Frequency of " + targetElement + " is " + frequescyOfTargetElement);
	}

	private static int findFrequescyOfTargetElement(int[] arr, int targetElement) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {

			if (targetElement == arr[i])
				counter++;
		}
		return counter;
	}

}
