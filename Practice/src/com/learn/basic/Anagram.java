package com.learn.basic;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Cab";
		String str2 = "Cba";
		
		Anagram a = new Anagram();
		a.checkAnagram(str1.toLowerCase(), str2.toLowerCase());

	}
	
	public void checkAnagram(String str1, String str2) {
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		
		if (str1.length() != str2.length()) System.out.println("NOT Anagram");
		else {
			Arrays.sort(char1);
			Arrays.sort(char2);
			int i=0, j=0;
			boolean isAnagram = true;
			while (i < str1.length() && j < str2.length()) {
				if (char1[i++] != char2[j++]) {
					isAnagram = false;
					break;
				}
			}
			if (isAnagram) System.out.println("Anagram");
			else System.out.println("NOT Anagram");
		}
	}

}
