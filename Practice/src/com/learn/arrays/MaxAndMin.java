package com.learn.arrays;

import java.util.Scanner;

public class MaxAndMin {

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
        
        System.out.println("Sum of elements: " + maxNum(arr, size));
        System.out.println("Average of elements: " + minNum(arr, size));
        
        scanner.close();
	}
	
	static int maxNum(int[] arr, int size) {
		int num = 0;
		for(int i=0; i<size-1; i++) {
			if (arr[i] < arr[i+1]) num = arr[i+1];
			else num = arr[i];
		}		
		return num;
	}
	
	static int minNum(int[] arr, int size) {
		int num = 0;
		for(int i=0; i<size-1; i++) {
			if (arr[i] > arr[i+1]) num = arr[i+1];
			else num = arr[i];
		}		
		return num;
	}

}
