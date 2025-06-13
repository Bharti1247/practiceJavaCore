package com.learn.arrays;

import java.util.Scanner;

public class RemoveElement {

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
        
        System.out.print("Enter the element to remove: ");
        int num = scanner.nextInt();
        System.out.println();
        
        int pos = -1;
        for(int i=0;i<size-1;i++) {
        	if(arr[i] == num) {
        		pos = i;
        		break;
        	}
        }
        
        if (pos == -1) {
        	System.out.println("Element not found...");
        }
        else {
        	for (int i=pos;i<size-1;i++) {
        		arr[i] = arr[i+1];
        	}
	    	size--;
	        
	        for(int i=0;i<size;i++) {
	        	System.out.print(arr[i] + ", ");
	        }
        }
        scanner.close();
	}

}
