package com.learn.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpdateListUsingStreamFilter {
	
	public static void main (String[] args) {
		List<Integer> list = Arrays.asList(23, 45, 12, 78);
		
		list = list.stream().filter(i -> i!=45).collect(Collectors.toList());
		System.out.println(list);
	}
}
