package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arr = Arrays.asList(23, 56, -342, 23, -54, 101, 786, 453, -245, 23, -54); 
		
		System.out.print("Enter the element to check: ");
		int num = sc.nextInt();
		System.out.println();
		
		List<Integer> pos = IntStream.range(0, arr.size())
				.filter(x -> arr.get(x).equals(num))
				.boxed()
				.collect(Collectors.toList());
		
		if (!pos.isEmpty()) System.out.printf("element available at index/indices: %s", pos);
		else System.out.println("Not found");
				
		sc.close();

	}

}
