package com.learn.string;

public class StringCompression {

	public static void main(String[] args) {

		String input = "ccaaghggg";
		
		if (input == null || input.isEmpty()) System.out.println("Empty string");
		
		char current	= input.charAt(0);
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		for (int i=1; i<input.length(); i++) {
			if (input.charAt(i) == current) count++;
			else {
				sb.append(current).append(count);
				current = input.charAt(i);
				count = 1;
			}
		}
		sb.append(current).append(count);
		
		System.out.println(sb.toString());

	}

}
