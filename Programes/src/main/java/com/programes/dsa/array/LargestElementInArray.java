package com.programes.dsa.array;

public class LargestElementInArray {

	public static void main(String[] args) {

		int arr[] = { 12, 4, 67, 88, 9, 44, 55, 62, 87 };

		int largestNumber = 0;
		int secLargest = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largestNumber)
				largestNumber = arr[i];

			if (arr[i] > secLargest && arr[i] < largestNumber)
				secLargest = arr[i];

		}

		System.err.println("largestNumber: " + largestNumber);
		System.err.println("secLargest: " + secLargest);

	}

}
