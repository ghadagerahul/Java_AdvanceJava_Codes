package com.programes.dsa.array;

public class MoveZeroElemetsToEnd {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 0, 4, 7, 9, 0, 95 };

		int newArr[] = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				newArr[count] = arr[i];
				count++;
			}

		}

		for (int ar : newArr) {
			System.out.print(ar + ", ");
		}

	}

}
