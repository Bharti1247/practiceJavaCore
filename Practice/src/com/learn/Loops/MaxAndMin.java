package com.learn.Loops;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {31,11,45,23,67,78,98,-78,100};
		int max = arr[0];
		int min = arr[0];
		
		for (int ele : arr) {
			if (ele < min) min = ele;
			if (ele > max) max = ele;
		}
		
		System.out.printf("Max num: %d\n", max);
		System.out.printf("Min num: %d\n", min);
		
		scanner.close();
	}

}
