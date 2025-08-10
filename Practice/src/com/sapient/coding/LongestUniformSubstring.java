/*
 * Given a string s, find the longest contiguous substring where all characters are the same.
 * Return:
 * 	The starting index of that substring, and
 * 	The length of the substring.
 * If there are multiple such substrings of the same maximum length, return the first one.
 */

package com.sapient.coding;

public class LongestUniformSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaabbccccddeeeee";
		
		int len = input.length();
		char[] inputArr = input.toCharArray();
		int maxLen =0, currentLen =1, start=0, currentStart=0;
		
		for (int i=1; i<len; i++) {
			if (inputArr[i] == inputArr[i-1]) {
				currentLen++;
			} else {
//				maxLen = Math.max(maxLen, currentLen);
//				start = currentStart;
				if (currentLen > maxLen) {
					start = currentStart;
					maxLen = currentLen;
				}
				currentStart = i;
				currentLen = 1;
				
			}
		}
		
		if (currentLen > maxLen) {
			start = currentStart;
			maxLen = currentLen;
		}
		
		System.out.println("Starting index : " + start);
		System.out.println("Length : " + maxLen);
	}

}
