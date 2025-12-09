package com.programes.prictice;

import java.util.HashMap;
import java.util.List;

import io.micrometer.common.util.StringUtils;

public class ReverseStringOrFindStringIsPalindrome {

	public static void main(String[] args) {

		String inputStr = "madam";
		boolean stringPalindrome = isStringPalindrome(inputStr);

//		if (stringPalindrome)
//			System.out.println("String is palindrome");
//		else
//			System.out.println("String is not palindrome");

		int countOfVowels = findCountOfVowels(inputStr);
		System.out.println("Count of vowels: " + countOfVowels);

	}

	public static int findCountOfVowels(String input) {

		if (StringUtils.isNotBlank(input)) {

			List<String> list = List.of("A", "E", "I", "O", "U", "a", "e", "i", "o", "u");
			int count = 0;
			HashMap<Character, Integer> map = new HashMap<>();
			for (char s : input.toCharArray()) {
				if (list.contains(String.valueOf(s)))
					count++;

				if (map.containsKey(s)) {
					map.compute(s, (key, oldVal) -> (oldVal == null) ? 1 : oldVal + 1);
					// map.computeIfPresent(s, (key, oldVal) -> (oldVal == null) ? 1 : oldVal + 1);
					// map.computeIfAbsent(s, b -> 1);
				} else {
					map.put(s, 1);
				}
			}

			return count;

		}

		return -1;
	}

	public static boolean isStringPalindrome(String input) {

		if (StringUtils.isNotBlank(input)) {

			String revStr = new StringBuffer(input).reverse().toString();

			if (input.equals(revStr))
				return true;
		}

		return false;
	}

}
