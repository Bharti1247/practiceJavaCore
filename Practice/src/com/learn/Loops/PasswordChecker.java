package com.learn.Loops;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the password: ");
		String input;
		
		String pass = "abc123";
				
		do {
			input = scanner.nextLine();
			if (input .equals(pass)) {
				System.out.print("Welcome!");
				break;
			}
			else System.out.print("Invalid Password. Try again."); 
		} while (true);
		
		scanner.close();
	}

}
