package com.learn.classes;

import java.util.Scanner;

public class StringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String 1: ");
		String str1 = scanner.nextLine();
		System.out.println("Enter String 2: ");
		String str2 = scanner.nextLine();
		
		System.out.println("Concatenated string from main function: " + (str1+str2).toUpperCase());		
		
		System.out.println(concatenateString(str1, str2));
		
		StringConcatenate sc = new StringConcatenate();
		System.out.println(sc.concatenateStringBuilder(str1, str2).toString().toUpperCase());
		
		scanner.close();
	}
	
	static String concatenateString(String str1, String str2) {
		return "Concatenated string: " + (str1+str2).toUpperCase();
	}
	
	StringBuilder concatenateStringBuilder(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		return sb.append("Concatenated string via builder: ").append(str1).append(str2);
	}

}
