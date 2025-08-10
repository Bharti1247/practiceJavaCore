package com.sapient.coding;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Alabama";
		
		input = input.toLowerCase();
		
		Optional<Entry<Character, Long>> result = input.chars().mapToObj(i -> (char)i)
							.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
							.entrySet()
							.stream()
							.filter(i -> i.getValue() == 1)
							.findFirst();
		
		if (result.isPresent()) System.out.println("First non-repeated char: " + result);
		else System.out.println("No such char");
	}

}
