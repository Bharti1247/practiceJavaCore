package com.learn.java8.streams.map;

import java.util.Arrays;
import java.util.List;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(2,4,5,8);
		
		arr.stream().map(x -> x*x).forEach(x -> System.out.print(x + " "));

	}

}
