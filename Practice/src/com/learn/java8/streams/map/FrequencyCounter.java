package com.learn.java8.streams.map;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello hello";
		
		Map<Character, Long> map = 
				str.chars().mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);

	}

}
