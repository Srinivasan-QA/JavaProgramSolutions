package com.practice.leetcode.problems;

public class StockMaxProfi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] price = {7,1,5,3,6,4};
		
		int maxprice = maxProfit(price);
		System.out.println(maxprice);
	}
	
	public static int maxProfit(int[] prices) {
		
		if(prices == null || prices.length == 0) {
			System.out.println("Input array is empty!");
		}
		
		int profit = 0;
		int buying_price = prices[0];
		
		for(int i=1;i<prices.length;i++) {
			if(buying_price >= prices[i]) {
				buying_price = prices[i];
				continue;
			}
			
			profit = Math.max(profit, prices[i] - buying_price);
		}
		return profit;
	}

}
