package com.learn.arrays;

import java.util.Scanner;

public class numberOfOccurence {

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
        
        System.out.print("Enter the digit to search: ");
        int digit = scanner.nextInt();
        System.out.println();
        
        int count=0;
        for(int ele : arr) {
        	if (ele == digit) count++;
        }
        
        if (count != 0)	System.out.print("The element '" + digit + "' was found " + count + " times in the array.");
        else System.out.print(digit + " not found.");
        
        scanner.close();
	}

}
