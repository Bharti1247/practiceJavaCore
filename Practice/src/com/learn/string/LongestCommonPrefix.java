package com.learn.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		
		String[] s = {"cir","car"};
		
		System.out.println(lcp.longestCommonPrefix(s));

	}
	
	public String longestCommonPrefix(String[] strs) {
        int len = strs.length;

        if (len == 0) return "";

        String firstStr = strs[0];
        String lastStr = strs[len-1];
        int count = 0;

        for (int i=0; i<firstStr.length() && i<lastStr.length(); i++) {
            if (firstStr.charAt(i) == lastStr.charAt(i)) count++;
            else break;
        }
        
        return firstStr.substring(0, count);
    }

}
