package com.learn.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateList {
	
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(23, 45, 12, 78));
		
		for (int ele : list) {
			if (ele == 45)
				// Integer.valueOf(ele) returns Object of ele
				list.remove(Integer.valueOf(ele)); // throws java.util.ConcurrentModificationException
		}
				
	}
}
