package com.learn.basic;

import java.util.HashMap;

public class KeypadCountMap {

	public static void main(String[] args) {
		
		String input = "I love India";
		input = input.toLowerCase();
		
		HashMap<Character, Integer> keyCount = new HashMap<>();
		
		keyCount.put('a', 1);keyCount.put('b', 2);keyCount.put('c', 3);
		keyCount.put('d', 1);keyCount.put('e', 2);keyCount.put('f', 3);
		keyCount.put('g', 1);keyCount.put('h', 2);keyCount.put('i', 3);
		keyCount.put('j', 1);keyCount.put('k', 2);keyCount.put('l', 3);
		keyCount.put('m', 1);keyCount.put('n', 2);keyCount.put('o', 3);
		keyCount.put('p', 1);keyCount.put('q', 2);keyCount.put('r', 3);keyCount.put('s', 4);
		keyCount.put('t', 1);keyCount.put('u', 2);keyCount.put('v', 3);
		keyCount.put('w', 1);keyCount.put('x', 2);keyCount.put('y', 3);keyCount.put('z', 4);
		keyCount.put(' ', 1);
		
		int count = 0;
		for(char ch : input.toCharArray()) {
			if (keyCount.containsKey(ch)) {
				count += keyCount.get(ch);
			}
		}
		
		if (count > 0)
			System.out.println("No. of times keys were pressed : " + count);
		else System.out.println("Empty string.");

	}

}
