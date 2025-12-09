package com.programes.prictice;

public class VolksVagenTech {

	public static void main(String[] args) {

		int input = 100;

		int a = 0;
		int b = 1;
		int temp = 0;

		for (temp = a + b; temp < input; temp = a + b) {
			System.out.println(temp);
			a = b;
			b = temp;
		}
	
		
//		for (temp = a + b; temp < input; temp = a + b) {
//			System.out.println(temp);
//			a = b;
//			b = temp;
//
//		}

	}

}
