package com.programes.dsa.array;

import java.util.Scanner;

public class ReverseArrayofInteger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.err.println("enter Size of array: ");

		int sizeOfArray = scanner.nextInt();

		System.err.println("Enter " + sizeOfArray + " Elemnts");
		int arr[] = new int[sizeOfArray];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();

		}

		reverseArray(arr);

	}

	private static void reverseArray(int[] arr) {

		for (int ar : arr) {
			System.out.print(", arr: " + ar);
		}
		for (int i = 0; i < arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;

		}

		System.out.println("");
		for (int ar : arr) {
			System.out.print(", Rev-arr: " + ar);
		}

		System.out.println("");
		System.out.println("================================");
		int newArr[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			newArr[i] = arr[i];
		}

		System.out.println("");
		for (int ar : newArr) {
			System.out.print(", Rev-arr: " + ar);
		}

	}

}
