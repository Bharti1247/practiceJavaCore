package com.learn.arrays;

import java.util.Scanner;

public class Palindrome {

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
        
        boolean flag = false;
        for (int i=0;i<size/2;i++) {
        	if (arr[i] == arr[size-1-i]) flag = true;
        }
        if (flag) System.out.print("Array is palindrome");
    	else System.out.print("Array is NOT palindrome");
        
        scanner.close();
	}

}
