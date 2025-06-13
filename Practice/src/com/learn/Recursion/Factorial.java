package com.learn.Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the num: ");
		int num = scanner.nextInt();
		System.out.println();
		
		if (num < 0) System.out.print("Enter valid number.");
		
		Factorial factorial = new Factorial();
				
		int fact = factorial.calculateFactorial(num);
		System.out.printf("Factorial of %d is %d", num, fact);
		
		scanner.close();
	}
	
	int calculateFactorial(int num){
		if (num > 0) {
			return num*calculateFactorial(num-1);
		}
		return 1;		
	}

}
