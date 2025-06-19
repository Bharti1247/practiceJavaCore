package com.learn.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(2, 45, 32, 78, 12, 2, 9, 54, 45);
		
		List<Integer> newList = list.stream()
				.distinct()
				.sorted()
				.filter(x -> x > 15)
				.collect(Collectors.toList());
		
		newList.forEach(x -> System.out.print(x + " "));

	}

}
