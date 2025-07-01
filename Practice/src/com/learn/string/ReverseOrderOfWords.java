package com.learn.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrderOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is awesome";
		
		List<String> newstr = Arrays.asList(str.split(" "));
		
		Collections.reverse(newstr);
		
		for (String ele : newstr) {
			System.out.print(ele + " ");
		}
		

	}

}
