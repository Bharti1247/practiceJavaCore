package com.learn.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		//String input = "ccaabbhggf";
		String input = "Swiss";
		input = input.toLowerCase();
		
		System.out.println(firstNonRepeatedChar(input));
	}
	
	public static Character firstNonRepeatedChar (String input) {
		// Map to store character as key and count as value
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		// count occurrence of each char
		for (char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		// check for count = 1
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}
		
		return null;
	}

}
