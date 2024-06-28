package dsasheet;

/*
  3.	You are provided with daily Stock prices in an array in the order of date i.e. from previous date to latest date. You are expected to return 
  the highest profit possible based on data provided (highest profit is generated when you bought stock at lowest price and sold at highest price).
   Please note that stock can only be sold at a later date after it is purchased on previous date

Public int highestProfitFinder(int stockPrices [])

		o	Input: {9, 11, 5, 7, 16, 1, 4, 2} Output: 11 //bought @ 5 and sold @ 16
		o	Input: {9, 11, 5, 7, 16, 1, 4, 15, 2} Output: 14 //bought @ 1 and sold @ 15

 */

import java.util.*;

public class BuySell {
	static int maxProfit(int[] ar)
	{
		if(ar.length==0)
		return 0;
		
		 int buy_p = ar[0];
		 int profit = 0;
		 for(int stock : ar)
		 {
			 if(stock<buy_p)
				 buy_p = stock;
			 
			 else
			 {
				 int cur_p = stock - buy_p;
				 profit = Math.max(profit, cur_p);
			 }
		 }
		 return profit;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++)
			ar[i] = sc.nextInt();
		
		System.out.print(" Max Profit " + maxProfit(ar) );
	}
	
}
