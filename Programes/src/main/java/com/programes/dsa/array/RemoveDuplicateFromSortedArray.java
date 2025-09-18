package com.programes.dsa.array;

public class RemoveDuplicateFromSortedArray {

	// findMissing Number 1..N
	// Rotate array by k position

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 4, 6, 6, 7, 8, 8, 9 };

		// ============ For non Sorted Annray O(n^2) =======
		int newArr[] = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (checkElementIsPresent(newArr, arr[i])) {
				newArr[count] = arr[i];
				count++;
			}

		}

		for (int i = 0; i < count; i++) {
			System.err.print(newArr[i] + ", ");
		}

		// ============ For Sorted Array O(n) ========

		boolean secFlag = false;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == arr[i - 1])
				secFlag = true;

		}

		if (!secFlag)
			System.out.println("Sorted array not present.");

	}

	static boolean checkElementIsPresent(int[] neArr, int arr) {

		for (int i = 0; i < neArr.length; i++) {

			if (neArr[i] == arr)
				return false;
		}
		return true;
	}

}
