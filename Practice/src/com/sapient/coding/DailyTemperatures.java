/*
 * You are given an array of integers temperatures where temperatures[i] represents the temperature on the iᵗʰ day.
 * Return an array answer such that answer[i] is the number of days you have to wait after the iᵗʰ day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] = 0.
 * 
 * Example:
	Input: temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
	Output: [1, 1, 4, 2, 1, 1, 0, 0]
   
   Explanation:
   	For day 0: temperature = 73 → next warmer day is day 1 (74) → wait 1 day	
	For day 1: 74 → day 2 (75) → wait 1 day	
	For day 2: 75 → day 6 (76) → wait 4 days	
	...	
	For day 6: 76 → no warmer day → 0
 */

package com.sapient.coding;

public class DailyTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
		
		int len = temperatures.length;		
		int[] result = new int[len];
		
		for (int i=0; i<len-1; i++) {
			for (int j=i+1; j<len; j++) {
				if (temperatures[j] > temperatures[i]) {
					result[i] = j-i;
					break;
				}
			}
		}
		
		for (int ele : result)
			System.out.print(ele + ", ");

	}

}
