package com.learn.Recursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the String/Number: ");
		String input = scanner.nextLine();
		System.out.println();

		Palindrome p = new Palindrome();
		
		int forward = 0; 
		int backward = input.length()-1;
		boolean result = p.isPalindrome(input, forward, backward);
		
		if (result) System.out.printf("Entered String/Number is Palindrome");
		else System.out.printf("Entered String/Number is NOT Palindrome");
		
		scanner.close();
	}
		
	boolean isPalindrome(String input, int forward, int backward) {
		if (forward >= backward) return true; // rum till half of array
		if (input.charAt(forward) != input.charAt(backward)) return false;
		else return isPalindrome(input, forward+1, backward-1);
	}

}
