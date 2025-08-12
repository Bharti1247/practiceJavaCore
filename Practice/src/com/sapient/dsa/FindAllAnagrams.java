package com.sapient.dsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindAllAnagrams {

	public static void main(String[] args) {
		
		FindAllAnagrams a = new FindAllAnagrams();
		
		String s = "abab";
		String p = "ab";
		
		System.out.println(a.findAnagramsUsingHashMap(s, p));
		System.out.println(a.findAnagramsUsingSubstring(s, p));

	}
	
	public List<Integer> findAnagramsUsingHashMap(String s, String p) {
        int len = p.length();
        int maxLen = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> compareMap = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        if (len > maxLen) return list;

        // frequency map of string p
        int frequency = 0;
        for (char c : p.toCharArray()) {
            frequency = map.getOrDefault(c, 0) + 1;
            map.put(c, frequency);
        }

        frequency = 0;
        for (int start=0; start<=maxLen-len; start++) {
            
            String sub = s.substring(start, start+len);
            for (char c : sub.toCharArray()) {
                frequency = compareMap.getOrDefault(c, 0) + 1;
                compareMap.put(c, frequency);
            }            

            if (compareMap.equals(map))
                list.add(start);
            
            compareMap.clear();
        }

       return list;         
    }
	
	
	
	public List<Integer> findAnagramsUsingSubstring(String s, String p) {
		int len = p.length();
        int maxLen = s.length();
        List<Integer> list = new ArrayList<>();

        if (len > maxLen) return list;
		char[] arrP = p.toCharArray();
        Arrays.sort(arrP);
        String p1 = new String(arrP);

        for (int start=0; start<=maxLen-len; start++) {
            
            String temp = s.substring(start, start+len);
            char[] tempArr = temp.toCharArray();
            Arrays.sort(tempArr);
            String temp1 = new String (tempArr);

            if (temp1.equals(p1)) {
                list.add(start);
            }
            
        }

        return list;
	}

}
