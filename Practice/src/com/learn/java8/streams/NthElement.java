package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Number> arr = Arrays.asList(234, 56, 23, 78, 101, 786, 453); 
		
		System.out.print("Enter the position to fetch the object: ");
		int pos = sc.nextInt();
		System.out.println();
		
		Number result = arr.stream().skip(pos-1).findFirst().orElse(null);
		
		System.out.printf("element at position %d : %d", pos, result);
		
		sc.close();
	}

}
