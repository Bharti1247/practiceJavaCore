package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apples", "mangoes", "litchi", 
				"sweet potato", "sweet potato", "mangoes", "litchi", "lime");
		
		// without using set
		System.out.println("without using set -");
		list.stream().distinct().forEach(System.out::println);
		System.out.println();
		
		// with set
		System.out.println("with set -");
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);
		
	}

}
