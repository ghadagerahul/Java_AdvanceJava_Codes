package com.programes.questions.array;

public class Rotate_Array_by_K_Position {

	private static void rotateArray(int[] arr, int pos) {

		int index = 1;
		for (int i = 0; i < pos; i++) {

			arr[index] = arr[index - 1];

			arr[index - 1] = arr[index - 2];
		}

		System.err.println(arr);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int pos = 3;

		rotateArray(arr, pos);

	}

}
