package com.learn.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UpdateListUsingIterator {
	
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(23, 45, 12, 78));
		
		// fix 1 - Iterator
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			Integer ele = it.next();
			if (ele == 45)
				it.remove();
		}
		
		System.out.println(list);
	}
}
