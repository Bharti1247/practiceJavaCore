package com.learn.Loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***** Welcome to Table Generator *****");
		do {
			System.out.print("\nEnter the num: ");
			int num = scanner.nextInt();
			System.out.println();
			
			if (num > 0) {
				for(int i=1;i<=10;i++) {
					System.out.printf("%d X %d = %d\n", num,i,num*i);
				}
			} else {
				System.out.print("Entered number should be positive and greater than '0'");
				break;
			}
		} while (true);
		
		scanner.close();
	}

}
