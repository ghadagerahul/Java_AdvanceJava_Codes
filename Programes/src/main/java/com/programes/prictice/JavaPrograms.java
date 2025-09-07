package com.programes.prictice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaPrograms {

	// Function to compute the MEX of an array slice
	static int mex(int[] arr, int start, int end) {
		Set<Integer> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			if (arr[i] >= 0)
				set.add(arr[i]);
		}
		int mex = 0;
		while (set.contains(mex)) {
			mex++;
		}
		return mex;
	}

	// Main function as described in your problem
	public static int equalMEX1(int N, int[] A) {
		int totalMex = mex(A, 0, N); // MEX of the whole array
		for (int x = 0; x < N; x++) {
			int subMex = mex(A, x, N); // MEX of subarray A[x ... N-1]
			if (subMex == totalMex) {
				return x + 1; // 1-based indexing
			}
		}
		return -1;
	}

	// Example usage
	public static void main1(String[] args) {
		int[] arr = { 1, 0, 2, 4 }; // Example array
		int N = arr.length;
		System.out.println(equalMEX(N, arr)); // Outputs the minimum index x
	}
	
	
	
	
	
	
	
	
	
	
	
	


	static int equalMEX(int N, int[] A) {
	    // Step 1: Find total MEX of the whole array
	    boolean[] present = new boolean[N + 2];
	    for (int num : A) {
	        if (num <= N) present[num] = true;
	    }
	    int totalMEX = 0;
	    while (present[totalMEX]) totalMEX++;

	    // Step 2: Compute suffix MEX using counts
	    int[] freq = new int[N + 2];
	    boolean[] seen = new boolean[N + 2];
	    int suffixMEX = 0;

	    for (int i = N - 1; i >= 0; i--) {
	        freq[A[i]]++;
	        seen[A[i]] = true;
	        while (seen[suffixMEX]) suffixMEX++;
	        if (suffixMEX == totalMEX) {
	            return i + 1; // 1-based index
	        }
	    }
	    return -1; // if no split found
	}
	
	
	//---------------------------------------------------------------------
	
	
	public static void main(String[] args) {

		System.err.println("enter value");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int[] present = new int[N + 2]; // To store presence of numbers
			for (int i = 0; i < N; i++) {
				int num = sc.nextInt();
				if (num <= N) {
					present[num] = 1;
				}
			}
			int ans = -1;
			for (int i = 0; i <= N + 1; i++) {
				if (present[i] == 0) {
					ans = i;
					break;
				}
			}
			System.out.println(ans);
		}
		sc.close();

	}
	
	
	
	

}
