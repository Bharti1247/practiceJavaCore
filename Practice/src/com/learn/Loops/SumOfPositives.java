package com.learn.Loops;

import java.util.Scanner;

public class SumOfPositives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int count = 5;
		
		System.out.println("Enter the number: ");
		while (count > 0) {
			int num = scanner.nextInt();			
			if (num > 0) sum += num;
			count --;
		}
		System.out.printf("Sum of positive numbers : %d", sum);

		scanner.close();

	}

}
