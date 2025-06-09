package com.learn.basic;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number/string to check: ");
		String entry = input.nextLine();
		System.out.println();

		String original = entry;
		String reversed = "";
		
		int length = entry.length();
		for(int i=length-1;i>=0;i--) {
			reversed += entry.charAt(i);
		}
		
		if(original.equalsIgnoreCase(reversed)) System.out.println(original + " is Palindrome");
		else System.out.println(original + " is Not Palindrome");
						
		input.close();
	}

}