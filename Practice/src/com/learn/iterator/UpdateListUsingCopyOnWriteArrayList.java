package com.learn.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UpdateListUsingCopyOnWriteArrayList {
	
	public static void main(String[] args) {

		// fix 2 - CopyOnWriteArrayList
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(23, 45, 12, 78));
		
		for (int ele : list) {
			if (ele == 45) 
				list.remove(Integer.valueOf(ele));
		}
		
		System.out.println(list);
	}

}
