package com.learn.arrays;

import java.util.Scanner;

public class Sort {

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
        
        System.out.println("Array sorted: " + isSorted(arr, size));
                
        scanner.close();
	}
	
	static boolean isSorted(int[] arr, int size) {
		for(int i=0;i<size-1;i++) {
			if (arr[i] > arr[i+1]) {
				sortArray(arr, size);
				return false;
			}
		}
		return true;
	}
	
	static void sortArray(int arr[], int size) {
		int temp;
		for(int k=size;k>0;k--) {
			for(int i=0;i<size-1;i++) {
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		for(int ele : arr) {
			System.out.println(ele);
		}
	}

}
