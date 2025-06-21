package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ElementAvailability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arr = Arrays.asList(234, 56, -342, 23, 78, 101, 786, 453, -245, -54); 
		
		System.out.print("Enter the element to check: ");
		int pos = sc.nextInt();
		System.out.println();
		
		// Availability of element
		Boolean result = arr.stream().anyMatch(x -> pos==x);		
		System.out.printf("element available: %b", result);
				
		sc.close();
	}

}
