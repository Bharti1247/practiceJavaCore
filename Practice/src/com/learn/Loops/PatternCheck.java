package com.learn.Loops;

import java.util.Scanner;
import java.util.regex.*;

public class PatternCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the password: ");
		String input;
				
		Pattern p = Pattern.compile("^(?=[^@]*@[^@]*$)(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+$");		
				
		do {
			input = scanner.nextLine();
			Matcher m = p.matcher(input);
			if (m.find()) {
				System.out.print("Welcome!");
				break;
			}
			else System.out.print("Invalid Password. Try again."); 
		} while (true);
		
		scanner.close();
	}

}
