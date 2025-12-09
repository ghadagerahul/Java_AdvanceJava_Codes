package com.programes.questions.asked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupingOfAnagramStringFromArrayOfString {

	public static void main(String[] args) {

		String[] arr = { "ate", "eat", "ate", "tat", "aot", "ate" };

		HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

		for (String str : arr) {

			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String key = new String(charArray);

			if (hashMap.containsKey(key)) {
				hashMap.get(key).add(str);
			} else {
				ArrayList<String> arrayList = new ArrayList<>();
				arrayList.add(str);
				hashMap.put(key, arrayList);
			}
		}
		System.out.println(hashMap);
	}

}
