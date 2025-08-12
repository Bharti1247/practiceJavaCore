package com.sapient.dsa;

import java.util.HashMap;
import java.util.Map;

public class SubstringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s = "dvdf";
		HashMap<String, Integer> map = new HashMap<>();
		
		int len = s.length();
        for (int i=0; i<len; i++) {
            for (int j=i+1; j<=len; j++) {
                //System.out.println(s.substring(i,j));
            	String temp = s.substring(i,j);
                map.put(temp, temp.length());
            }
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        	System.out.println(entry.getKey() + " - " + entry.getValue());
        }

	}

}
