/*
  Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

  Say you have an array for which the ith element is the price of a given stock 
  on day i. If you were only permitted to complete at most one transaction 
  (ie, buy one and sell one share of the stock), design an algorithm to find 
  the maximum profit.

*/

package hackerrank;

public class BuySellStock {
  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int[] prices2 = {7, 6, 5, 4, 3, 2};
    
    System.out.println(maxProfitQuadratic(prices));
    System.out.println(maxProfitLinear(prices));
  }

  // First go-around. It's the obvious O(n^2) solution.
  private static int maxProfitQuadratic(int[] prices) {
    int max = 0;
    int diff = 0;
    for (int outer = 0; outer < prices.length-1; outer++) {
      for (int inner = outer+1; inner < prices.length; inner++) {
        diff = prices[inner] - prices[outer];
        if (diff > max) {
          max = diff;
        }
      }
    }
    return max;
  }
  
  // Bringing the time complexity down to O(n). They key is to keep track of
  // the cheapest stock price and compare subsequent prices to it to find max
  // profit, updating the cheapest price as needed.
  private static int maxProfitLinear(int[] prices) {
    int min = 0, maxDiff = 0, diff = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < prices[min]) {
        min = i;
      }
      diff = prices[i] - prices[min];
      if (diff > maxDiff) {
        maxDiff = diff;
      }
    }
    return maxDiff;
  }
}
