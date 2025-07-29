package com.learn.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequency {

	public static void main(String[] args) {
		String input = "aaaabbbccabcdeef";
		int k = 4;
		
		input.chars().mapToObj(i -> (char)i)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet()
			.stream()
			.sorted((b,a) -> Long.compare(a.getValue(), b.getValue()))
			.limit(k)
			.map(Map.Entry::getKey)
			.forEach(System.out::print);
	}

}
