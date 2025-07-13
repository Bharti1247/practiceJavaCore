package com.learn.string;

public class LongestPalindromicString {

	public static void main(String[] args) {
		String input = "cabba";
		
		int len = input.length();
		int start = 0;
		int end = 0;
		
		if (input == null || len <= 0) System.out.println("Empty string.");
		
		for (int i=0; i<len; i++) {
			int len1 = checkForPalindrome(input, i, i);   // odd
			int len2 = checkForPalindrome(input, i, i+1); // even
			
			int maxlen = Math.max(len1, len2);
			
			if (maxlen > end-start) {
				start = i-(maxlen-1)/2;
				end = i+maxlen/2;
			}
		}
		
		String result = input.substring(start, end+1);
		System.out.println(result);
	}
	
	public static int checkForPalindrome(String str, int left, int right) {
		while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left --;
			right ++;
		}
		
		return right-left-1;
	}

}
