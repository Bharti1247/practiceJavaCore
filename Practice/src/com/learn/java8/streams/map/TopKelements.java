package com.learn.java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKelements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,2,3,4,3,4,3,1,2,2);
		
		int k = 2;
		
		list.stream()
			.collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()))
			.entrySet()
			.stream()
			.sorted((x , y) -> Long.compare(y.getValue(), x.getValue()))
			.limit(k)
			.map(Map.Entry::getKey)
			.forEach(System.out::println);
		
	}

}
