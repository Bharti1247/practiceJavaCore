package com.learn.arrays;

import java.util.Scanner;

public class SortAndMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int size = scanner.nextInt();
        
        int[] arr1 = new int[size];

    	System.out.println("Enter array1 elements: ");
        for (int i=0;i<size;i++) {
        	arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of array2: ");
        int size2 = scanner.nextInt();
        
        int[] arr2 = new int[size2];

    	System.out.println("Enter array2 elements: ");
        for (int i=0;i<size2;i++) {
        	arr2[i] = scanner.nextInt();
        }
        
        //Sort s = new Sort();  -> Class creation not needed as method is static and in same package.
        System.out.println(Sort.isSorted(arr1, size));
        System.out.println(Sort.isSorted(arr2, size2));
        
        int[] mergedArray = new int[size+size2];
        
        int i=0, j=0, k=0;
        while (i<size && j<size2) {
        	if (arr1[i] < arr2[j]) mergedArray[k++] = arr1[i++];
        	else mergedArray[k++] = arr2[j++];
        }
        
        while (i<size) {
        	mergedArray[k++] = arr1[i++];
        }
        
        while (j<size2) {
        	mergedArray[k++] = arr2[j++];
        }
        
        System.out.print("Merged array : ");
        for(int ele : mergedArray) {
        	System.out.print(ele + ", ");
        }
        
        scanner.close();
	}

}
