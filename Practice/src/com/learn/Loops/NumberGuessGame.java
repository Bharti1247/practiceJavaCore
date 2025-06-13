package com.learn.Loops;

import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***** Welcome to Number Guessing Game *****");
		
		do {
			System.out.print("To try your luck, enter the num: ");
			int num = scanner.nextInt();
			int digit = (int)(Math.random()*100);
			System.out.printf("Generated number: %d\n", digit);
			
			if (num == digit) {
				System.out.println("Congratulations!!! You won.");
				break;
			}
			else System.out.println("Better Luck next time...");
		} while (true);
		
		scanner.close();
	}

}
