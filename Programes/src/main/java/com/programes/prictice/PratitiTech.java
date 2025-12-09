package com.programes.prictice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PratitiTech {

	
	public static void main(String[] args) {
		
		
		String str ="Programming";
		 
	//	output = Progamin
		
		//Employees --> list
		
	//	list.stream().sortted(collec).limit(3)
		
		String collect = str.chars().mapToObj(c-> String.valueOf((char)c)).collect(Collectors.toCollection(LinkedHashSet::new)).stream().collect(Collectors.joining());
		 
		System.out.println(collect);
	}
	
}
