package com.programes.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "madam";

		// first non repeating character
		Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		Character key = collect.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
		// System.out.println(key);

		// palindrome
		if (new StringBuilder(str).reverse().toString().equals(str)) {
			// System.out.println("Stringis palindrome: " + str);
		} else {
			// System.out.println("Stringis not palidrome");
		}

		// duplicate chanracters in string
		String nonrepeatingChanrsString = str.chars().mapToObj(c -> (char) c).distinct().map(x -> String.valueOf(x))
				.collect(Collectors.joining());
		System.out.println(nonrepeatingChanrsString);
		
		//palindrome numbers
		int number = 500;
		int num1 = 0, num2 = 1, temp = 0;
		for (temp = num1 + num2; temp < number; temp = num1 + num2) {
			//System.out.println(temp);
			num1 = num2;
			num2 = temp;
		}
		
		
		int[] arr = {1000, 35,56,777,555,424,5678};

		Integer orElse = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(0).findFirst().orElse(0);
	
		int[] array = Arrays.stream(arr).boxed().sorted().limit(1).mapToInt(Integer::intValue).toArray();
		
		System.out.println(array[0]);

		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(3).mapToInt(Integer::intValue).toArray();
		
		
		
		
	}

}
