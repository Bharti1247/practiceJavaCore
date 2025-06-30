package com.learn.java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = Arrays.asList("mangrove", "tropical", "dense", "amazonia", "forest");

		List<String> fruits = Arrays.asList("apple", "mango", "banana", "mango", "litchi",
				"apple", "litchi", "apple");
		
		// list to map with value as word length
		Map<String, Integer> map 
			= strList.stream().collect(Collectors.toMap(x -> x,  y -> y.length()));
		
		System.out.println(map);
		System.out.println();
		
		// list to map with value as word count
		Map<String, Integer> fruitMap
			= fruits.stream().collect(Collectors.toMap(x -> x, x -> 1, Integer::sum));
		
		Map<String, Long> fruMap
			= fruits.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		
		System.out.println(fruitMap);
		System.out.println();
		
		System.out.println(fruMap);
		System.out.println();
	}

}
