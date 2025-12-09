package com.programes.dsa.search.linear;

public class FindTargetElementFromArray {

	// Lenear Search is the way of finding target element from array by comparing
	// value with one by one value in array.

	public static int searchTargetElement(int[] arr, int targetEle) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == targetEle)
				return i;

		}

		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 40, 22, 54, 67, 93, 55 };
		int targetEle = 12;

		int searchTargetElementIndex = searchTargetElement(arr, targetEle);

		System.out.println("Target Index is: " + searchTargetElementIndex);

		if (searchTargetElementIndex < arr.length && searchTargetElementIndex != -1)
			System.out.println("Target Value is: " + arr[searchTargetElementIndex]);
		else
			System.out.println("Invalid Search Index: " + searchTargetElementIndex);
	}

}
