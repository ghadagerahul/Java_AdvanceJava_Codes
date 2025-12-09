package com.programes.dsa.string;

public class OperationalStringClass {

	public static Character[] charArrayString = null;

	public static void createSting(char[] charArray) {
		int length = charArray.length;

		if (charArrayString == null)
			charArrayString = new Character[length];

		for (int i = 0; i < length; i++) {
			charArrayString[i] = charArray[i];
		}
	}

	public static void concatString(char[] charArray, char[] concatArr) {

		int finalLength = charArray.length + concatArr.length;

		StringBuilder sb = new StringBuilder();
		for (Character c : charArray) {
			sb.append(c);
		}

		for (Character s : concatArr) {
			sb.append(s);
		}

	}

	public static void printStringArray() {

		if (null != charArrayString) {

			int length = charArrayString.length;
			int count = 0;
			StringBuilder sb = new StringBuilder();
			while (count < length) {

				sb.append(charArrayString[count]);
				count++;
			}
			System.out.println(sb.toString());
		}

	}

	public static void main(String[] args) {

		String str = "this is string";
		char[] charArray = str.toCharArray();

		createSting(charArray);
		printStringArray();
		concatString(charArray, " Not Array".toCharArray());
		printStringArray();
	}

}
