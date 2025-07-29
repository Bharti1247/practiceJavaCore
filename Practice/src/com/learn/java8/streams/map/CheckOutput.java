package com.learn.java8.streams.map;

import java.util.Arrays;
import java.util.List;

public class CheckOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2);
		
		numbers.stream().map(n -> {
			System.out.println(n*2);
			return n*2;
		});
		
		
		/** No output as there's no terminal operation
		 	Correct way -
		 	numbers.stream()
		 		.map(n -> {
					System.out.println(n*2);
					return n*2
				})
				.forEach(System.out::println);
		*/
	}

}
