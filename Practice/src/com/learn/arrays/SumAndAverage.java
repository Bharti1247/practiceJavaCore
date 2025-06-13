package com.learn.arrays;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];

    	System.out.println("Enter array elements: ");
        for (int i=0;i<size;i++) {
        	arr[i] = scanner.nextInt();
        }
        
        System.out.println("Sum of elements: " + sumOfArray(arr));
        System.out.println("Average of elements: " + averageOfArray(arr, size));
        
        scanner.close();
	}
	
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int ele: arr) {
			sum += ele;
		}
		return sum;
	}
	
	public static float averageOfArray(int[] arr, int size) {
		int sum = 0;
		for(int ele: arr) {
			sum += ele;
		}
		float average = sum/(float)size;
		return average;
	}

}
