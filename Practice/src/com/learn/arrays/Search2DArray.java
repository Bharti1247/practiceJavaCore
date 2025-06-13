package com.learn.arrays;

import java.util.Scanner;

public class Search2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of 2D array: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        
        int[][] arr = new int[row][col];

    	System.out.println("Enter array elements: ");
        for (int i=0;i<row;i++) {
        	for (int j=0;j<col;j++) {
        		arr[i][j] = scanner.nextInt();
        	}
        }
		
		System.out.println("2D Array :");
		for (int i=0;i<row;i++) {
        	for (int j=0;j<col;j++) {
        		System.out.print(arr[i][j] + " ");
        	}
        	System.out.println();
        }
		
		System.out.print("Enter the element to search : ");
		int digit = scanner.nextInt();
		
		boolean isFound = false;
		for (int i=0;i<row;i++) {
        	for (int j=0;j<col;j++) {
        		if (digit == arr[i][j]) {
        			System.out.printf("The element is present at %d, %d\n", i,j);
        			isFound = true;
        		}
        	}
        }
		if (!isFound) System.out.print("The element is NOT present in array");	
			
		scanner.close();
	}

}
