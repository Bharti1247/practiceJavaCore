package com.learn.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListStartingWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,15,8,49,null,98,132);
		
		List<Integer> result = list.stream()
				.filter(i -> Objects.nonNull(i))
				.filter(i -> i.toString().startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(result);

	}

}
