package com.learn.Recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the position till which fibonacci series is to be printed: ");
		int pos = scanner.nextInt();
		System.out.println();
		
		Fibonacci fib = new Fibonacci();
		int start = 0;
		int next =1;
		
		fib.fibonacci(start, next, pos);
		
		scanner.close();
	}
	
	void fibonacci(int start, int next, int pos) {
		if (pos > 0) {
			System.out.printf("%d, ",start);
			int temp = start;
			start = next;
			next = temp+start; 
			fibonacci(start, next, pos-1);
		}
	}

}
