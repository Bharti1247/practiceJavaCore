package com.learn.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class CoinChange {

	public static void main(String[] args) {
		int amount = 10;
		int[] coins = {1,2,5};
		
		HashMap<Integer, Integer> result = coinCount(amount, coins);
		
		for (Entry<Integer, Integer> entry : result.entrySet()) {
			System.out.println("Coin: " + entry.getKey() + ", No.: " + entry.getValue());
		}

	}
	
	public static HashMap<Integer, Integer> coinCount(int amount, int[] coins) {
		int len = coins.length;
		int count = 0;
		
		Arrays.sort(coins);		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i=len-1; i>=0; i--) {
			int coin = coins[i];
			if (amount >= coin) {
				count = amount/coin;
				amount %= coin;
				map.put(coin, count);
			}
		}
		
		return map;
	}

}
