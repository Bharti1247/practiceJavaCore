package com.learn.string;

import java.util.LinkedHashMap;

public class NonRepeatedSubstring {

	public static void main(String[] args) {
		String input = "swwiss";
		
		int len = input.length();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();	
		String result = "";
		int leftPointer = 0;
		int maxlen = 0;
		
		for (int rightPointer=0; rightPointer<len; rightPointer++) {
			char ch = input.charAt(rightPointer);
			
			if (map.containsKey(ch)) {
				leftPointer = Math.max(map.get(ch)+1, leftPointer); // rightPointer + 1;
			} 
			
			map.put(ch, rightPointer);
			
			if ((rightPointer - leftPointer + 1) > maxlen) {
				maxlen = rightPointer - leftPointer + 1;
				result = input.substring(leftPointer, leftPointer+maxlen);
			}
		}
		
		System.out.print("Longest Unique Substring: " + result);

	}

}
