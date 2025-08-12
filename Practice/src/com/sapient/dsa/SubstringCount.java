package com.sapient.dsa;

import java.util.HashMap;

public class SubstringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s = "swiss";
		
		HashMap<Character, Integer> map = new HashMap<>();
		int len = s.length();
		int start = 0;
		int count = 0;
		
		for (int end=0; end<len; end++) {
			char c = s.charAt(end);
			
			if (map.containsKey(c) && map.get(c) >= start) {
				start = map.get(c) + 1;				
			} 
				
			map.put(c, end);
			count = Math.max(count, end-start+1);
		}
		
		System.out.println(count);
	}

}
