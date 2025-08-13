package com.learn.java8.streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,5,3,6,4,5,7,8,8};
		
		System.out.println("Using boxed and Comparator :");		
		Arrays.stream(a).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);		
		
		System.out.println("\nUsing map and sign :");	
		Arrays.stream(a).distinct().map(i -> -i).sorted().map(i -> -i).skip(1).findFirst().ifPresent(System.out::println);
	}

}
