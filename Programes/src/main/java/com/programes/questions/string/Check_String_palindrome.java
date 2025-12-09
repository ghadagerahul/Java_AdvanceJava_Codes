package com.programes.questions.string;

public class Check_String_palindrome {

	public static void main(String[] args) {

		String input = "madam";
		String reverse = new StringBuilder(input).reverse().toString();

		if (reverse.equals(input))
			System.out.println("given String is palindrome..!!!");
		else
			System.out.println("ohhhh.... String not palindrome");

	}

}
