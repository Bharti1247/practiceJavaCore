package com.learn.Loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.print("\nEnter the number to check: ");
			int num = scanner.nextInt();
			
			//com.learn.basic.Prime prime = new com.learn.basic.Prime();   --> not needed as we're calling static  method
			boolean isPrime = com.learn.basic.Prime.isPrime(num);
			System.out.print(isPrime);
		}
		
		scanner.close();
	}

}
