package com.learn.string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String input = "I am Isha";
		
		// remove space and convert to lower case
		input = input.toLowerCase().replaceAll(" ", ""); 
		//System.out.println(input);
		
		Optional<Entry<Character, Long>> firstRepeatedCharacter = input.chars()
				.mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(
						Function.identity(), 	// x -> x
						LinkedHashMap::new, 	// to maintain order
						Collectors.counting()
				)).entrySet().stream().filter(i -> i.getValue() != 1).findFirst();
		
		if (firstRepeatedCharacter.isPresent()) System.out.println(firstRepeatedCharacter);
	}

}
