package com.learn.Loops;

import java.util.Scanner;

public class PrintEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the numbers: ");
		while (true) {
			int num = scanner.nextInt();			
			if (num <= 0) break;
			else {
				if (num%2 != 0) {
					continue;
				} else System.out.println("Even");
			}
		}

		scanner.close();
	}

}
