// Also, known as most repeated character

package com.sapient.coding;

import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestUniformSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaabbccccddeeee";
		
		Optional<Entry<Character, Long>> result = input.chars().mapToObj(i -> (char)i)
													.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
													.entrySet()
													.stream()
													.max((a,b) -> Long.compare(a.getValue(), b.getValue()));
		
		if (result.isPresent()) System.out.print(result);

	}

}
