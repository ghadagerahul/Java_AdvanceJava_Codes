package com.programes.dsa.search.binary;

public class FindTargetElementFromArray {

	// Binary Search is fastest way to search target element from sorted array by
	// repeately dividing array by half per iteration.

	// mid = low + (high-low)/2

	public static int binarySearch(int[] arr, int targetElement) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == targetElement) {
				return mid;
			} else if (targetElement < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1; // Element not found
	}

	public static void main(String[] args) {

		int[] arr = { 10, 25, 40, 55, 76, 88, 102, 150 };
		int targetElement = 10;

		int index = binarySearch(arr, targetElement);

		if (index != -1) {
			System.out.println("✅ Target element found at index: " + index);
			System.out.println("🔎 Target element is: " + arr[index]);
		} else {
			System.out.println("❌ Target element not found in the array.");
		}
	}

}
