/*
 * Problem Statement:
	You are given an array prices where prices[i] represents the price of a given stock on the iᵗʰ day.
	You want to maximize your profit by choosing a single day to buy one stock 
	and choosing a different day in the future to sell that stock.
	
	Return the maximum profit you can achieve from this transaction. If no profit is possible, return 0.
	
	Example:
		Input: prices = [7, 1, 5, 3, 6, 4]
		Output: 5
		Explanation: Buy on day 1 (price = 1) and sell on day 4 (price = 6), profit = 6 - 1 = 5.
		Note that you cannot sell before you buy.
 */

package com.sapient.coding;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7, 1, 5, 3, 6, 4};
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price; // update minimum price
			} else if ((price - minPrice) > maxProfit) {
				maxProfit = price - minPrice; // update maximum profit
			}
		}
		
		System.out.println("Max Profit : " + maxProfit);

	}

}
