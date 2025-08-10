/*
 * Given a list of logs with IP addresses in the following format.
 * [ lines = ["10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"]
 * Return the most frequent IP address from the logs. 
 * The returned IP address value must be in a string format. 
 * If multiple IP addresses have the count equal to max count, then return the address as a comma-separated string 
 * with IP addresses in sorted order.
 */

package com.sapient.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lines = Arrays.asList(
								"10.0.0.1 - GET 2020-08-24", 
								"10.0.0.1 - GET 2020-08-24", 
								"10.0.0.2 - GET 2020-08-20",
								"10.0.0.2 - GET 2020-08-20"
							 );
		
		int maxCount = 0;
		HashMap<String, Integer> ipMap = new HashMap<>();
		
		for (String line : lines) {
			String ip = line.split(" ")[0]; 
			int count = ipMap.getOrDefault(ip, 0) + 1;
			ipMap.put(ip, count);
		}
		
		for (int frequency : ipMap.values()) {
			if (frequency > maxCount) {
				maxCount = frequency;
			}				
		}
		
		List<String> mostFrequentIp = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : ipMap.entrySet()) {			
			if (entry.getValue() == maxCount) {
				mostFrequentIp.add(entry.getKey());
			}
		}
		
		Collections.sort(mostFrequentIp);
		
		System.out.print(String.join(", ", mostFrequentIp));		
		
	}

}
