package com.programes.questions;

public class PalindromeString {

	public static void main(String[] args) {

//		Palindrome String Checker
//		Input: "madam"
//		Output: true

		String str = "madam";

		if (str.equals(new StringBuffer(str).reverse().toString()))
			System.err.println("this is palindrome String ..!!!!!");
		else
			System.out.println("Not palindrome...!!!");
	}

}
