package com.learn.classes;

import java.util.Scanner;

public class DiceSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****🎲Welcome to Dice Rolling*****");
		String input;
		do {
			System.out.print("Do you want to roll a dice?\n Enter yes/no: ");
			input = scanner.nextLine();
			System.out.println();
			
			int result = (int)(Math.random()*6)+1;
			
			System.out.printf("You got a %d",result);
			System.out.println();
		} while (input.equalsIgnoreCase("Yes"));
		
		scanner.close();
	}

}
