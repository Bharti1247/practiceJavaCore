package com.learn.basic;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the num: ");
		int num = input.nextInt();
		System.out.println();
		
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("Sum of digits: "+sum);

		input.close();
	}

}
