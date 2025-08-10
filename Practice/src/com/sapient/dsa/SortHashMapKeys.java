package com.sapient.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Java");
		hashMap.put(1, "Jenkins");
		hashMap.put(4, "Python");
		hashMap.put(2, "Groovy");
		
		System.out.println("HashMap:");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		Map<Integer, String> sortedMap = new TreeMap<>(hashMap);
		System.out.println("\nSorted HashMap with TreeMap:");
		for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
