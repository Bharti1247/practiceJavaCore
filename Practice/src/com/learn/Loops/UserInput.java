package com.learn.Loops;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String match = "exit";
		String input;
				
		while (true) {
			System.out.println("Enter : ");
			input = scanner.nextLine();
			
			if (input.equalsIgnoreCase(match)) {
				System.out.println("Exiting...");
				break;
			}	
			
			System.out.println("You entered : " + input);
		}

		scanner.close();
	}

}
