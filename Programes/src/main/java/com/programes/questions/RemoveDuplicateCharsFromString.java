package com.programes.questions;

import java.util.stream.Collectors;

public class RemoveDuplicateCharsFromString {

	public static void main(String[] args) {

		// Remove duplicate characters from a string.
		String str = "geek for freeks";

		String collect = str.chars().mapToObj(c -> String.valueOf((char) c)).distinct().collect(Collectors.joining());
		System.err.println(collect);
      //=======================================================
		String tmp = "";
		for (int i = 0; i < str.length(); i++) {

			char charAt = str.charAt(i);
			if (charAt == ' ' && !tmp.contains(String.valueOf(charAt))) {
				tmp += charAt;

			} else {
				if (!tmp.contains(String.valueOf(charAt)))
					tmp += charAt;
			}

		}

		System.out.println(tmp);

	}
}
