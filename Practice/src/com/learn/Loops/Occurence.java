package com.learn.Loops;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {31,11,45,23,67,78,98,-78,100,31,31,24};
		
		System.out.print("Enter the num to find: ");
		int num = scanner.nextInt();
		System.out.println();
		
		int count = 0;
		for (int ele : arr) {
			if (ele == num) {
				count++;
			}
		}
		System.out.printf("%d occured %d times in array",num,count);

		scanner.close();
	}

}
