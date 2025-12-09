package com.programes.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	
	
	public static void main(String[] args) {
		
		String str = "this is the String";

        // Count occurrences of each character, preserving order
        Map<Character, Long> charCount = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Find the first non-repeating character
        Character firstNonRepeating = null;
        for (Map.Entry<Character, Long> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeating = entry.getKey();
                break;
            }
        }

        if (firstNonRepeating != null) {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
		
	}
	
}