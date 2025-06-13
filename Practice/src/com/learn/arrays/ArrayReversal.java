package com.learn.arrays;

import java.util.Scanner;

public class ArrayReversal {

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
        
        for (int i=size-1;i>=0;i--) {
        	System.out.print(arr[i] + ", ");
        }
        System.out.println();
        
        System.out.print("Reversed array: ");
        for (int i=0;i<size/2;i++) {
        	int temp = arr[i];
        	arr[i] = arr[size-1-i];
        	arr[size-1-i] = temp;
        }
        
        for(int ele : arr) {
        	System.out.print(ele + ", ");
        }
        
        scanner.close();
	}

}
