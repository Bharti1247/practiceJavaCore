package com.learn.basic;
import java.util.Scanner;
public class sumOddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the num: ");
		int num = input.nextInt();
		System.out.println();
		
		int i=1;
		int sum=0;
		while(i<=num) {
			if(i%2 != 0) {
				sum += i;
			}
			i++;
		}
				
		System.out.print("Sum of all odd numbers between 1 and " + num + " : " + sum);
						
		input.close();
	}

}
