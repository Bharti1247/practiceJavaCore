package com.learn.java8.streams.map;

import java.util.Arrays;
import java.util.List;

public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> list = Arrays.asList(
			Arrays.asList("Lazy Fox", "eating grapes"),
			Arrays.asList("Lazy Fox", "making money"),
			Arrays.asList("White sheep", "eating grass", "roaming freely"),
			Arrays.asList("Students are studying", "in school")
		);
		
		// print list of string
		list.stream().forEach(System.out::println);
		System.out.println();
		
		// print stream of strings
		list.stream().flatMap(x -> x.stream()).forEach(System.out::println);
		System.out.println();
		
		// print stream of distinct strings
		list.stream().flatMap(x -> x.stream()).distinct().forEach(System.out::println);
		System.out.println();
		
		// print list of distinct words
		list.stream().flatMap(x -> x.stream()).flatMap(str -> Arrays.stream(str.split(" ")))
		.distinct().forEach(System.out::println);
	}

}
