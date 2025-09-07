package com.programes.questions;

import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {

		System.err.println("Enter input number..!!!");
		int num = new Scanner(System.in).nextInt();

		int num1 = num;
		StringBuffer stringBuffer = new StringBuffer();

		int rem = 0;
		while (num > 0) {
			rem = num % 2;
			num = num / 2;
			stringBuffer.append(String.valueOf(rem));
		}

		System.out.println("Binary number of :" + num1 + " is: " + stringBuffer.reverse());
	}

}
