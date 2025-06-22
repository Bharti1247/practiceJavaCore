package com.learn.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arr = Arrays.asList(234, 56, -342, 23, 78, 101, 786, 453, -245, -54); 
		
		System.out.print("Enter the element to check: ");
		int num = sc.nextInt();
		System.out.println();
		
		OptionalInt pos = IntStream.range(0, arr.size())
				.filter(x -> arr.get(x).equals(num))
				.findFirst();
		
		if (pos.isPresent()) System.out.printf("element available at position: %d", pos.getAsInt()+1);
		else System.out.println("Not found");
				
		sc.close();

	}

}
