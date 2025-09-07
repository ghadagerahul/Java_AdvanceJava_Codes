package com.programes.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	
	
	public static void main(String[] args) {
		
		String str = "this is the String";
		
		str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e1, LinkedHashMap);
		
	}
	
}
