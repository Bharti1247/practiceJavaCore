package com.learn.arrays;

import java.util.Scanner;

public class SumAndAverage2DArray {

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
		
		int sum = 0;
		for (int i=0;i<row;i++) {
        	for (int j=0;j<col;j++) {
        		sum += arr[i][j];
        	}
        }
		System.out.printf("Sum of elements : %d\n", sum);
		
		float avg = (float)sum/(row*col);
		System.out.printf("Average of elements : %f", avg);
		
		scanner.close();
	}

}
