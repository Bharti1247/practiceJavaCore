package com.sapient.coding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bharti";
		String str2 = "itbnra";
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if (len1 != len2) System.out.println("NOT Anagram");
		else {			
			char[] input1 =str1.toLowerCase().toCharArray();		
			char[] input2 =str2.toLowerCase().toCharArray();	
			
			Arrays.sort(input1);
			Arrays.sort(input2);
			
			int i=0, j=0;
			boolean isAnagram = true;
			while (len1 > i && len2 > j) {
				if (input1[i++] != input2[j++]) {
					isAnagram = false;
					break;
				}
			}
			
			if (isAnagram) System.out.println("Anagram");
			else System.out.println("NOT Anagram");
		}
	}

}
