package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1", "a3");
		List<String> sortedList = myList.stream()
			    .sorted()
			    .collect(Collectors.toList());
		System.out.println("Sorted List: ");
		for(String s: sortedList)
		System.out.print(s + ", ");
	}

}
