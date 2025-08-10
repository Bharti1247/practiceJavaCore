/*
 * You are given an array prices where prices[i] represents the price of a stock on the iᵗʰ day, 
 * and an integer money representing the amount of money you have available to buy a single stock.
 * Write a Java program to determine the maximum profit you can achieve by buying one stock on one day
 *  (at or below the available money) and selling it on a later day.
 *  
 *  Return the maximum possible profit, the buy price, and the sell price that yield this profit.
 *  If no valid transaction can be made (i.e., no affordable price or no profitable sell), return a profit of 0.
 *  
 *  Example:
 *  	Input: 
		    prices = [23, 230, 16, 24, 35, 80, 70, 18, 29, 150, 8, 155, 17]
		    money = 20
		
		Output:
		    Buy Price: 8
		    Sell Price: 155
		    Maximum Profit: 147
		    
 * Explanation:
		The stock can be bought on day 10 at price 8 (which is ≤ 20), and sold later on day 11 at price 155.
		Profit = 155 - 8 = 147 (maximum possible under the constraints).
 */

package com.sapient.coding;

public class BuyAndSellStockWithBudget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {23, 230, 16, 24, 35, 80, 70, 18, 29, 150, 8, 155, 17};
		int money = 20;
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		int sp = 0;
		int cp = 0;
		
		for (int price : prices) {
			if (price < minPrice && price <= money) {
				minPrice = price;
			} else if (price - minPrice > maxProfit && minPrice != Integer.MAX_VALUE) {
				maxProfit = price - minPrice;
				cp = minPrice;
				sp = price;
			}
		}		
				
		if (maxProfit > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append("Buy Price : ").append(cp);
			sb.append("\nSell Price : ").append(sp);
			sb.append("\nMax Profit : ").append(maxProfit);
			
			System.out.println(sb.toString());
        } else {
            System.out.println("No valid transaction possible. Profit: 0");
        }

	}

}
