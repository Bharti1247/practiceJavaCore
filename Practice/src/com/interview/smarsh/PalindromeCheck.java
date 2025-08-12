package com.interview.smarsh;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abba";
		
		int len = input.length();		
		char[] inputArray = input.toCharArray();
		
		boolean flag = true;
		
		for (int i=0, j=len-1; i<len && j>=0; ) {
			if (inputArray[i++] != inputArray[j--]) {
				flag = false;
				break;
			}
		}
		
		if (flag) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");

	}

}
