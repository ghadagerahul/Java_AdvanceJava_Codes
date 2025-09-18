package com.programes.dsa.array;

public class CheckIsArrayIsSorted {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 6, 8 };

		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				flag = true;
			}

		}

		if (flag)
			System.out.println("Array is Not sorted");
		else
			System.err.println("Array is sorted");
	}
}
