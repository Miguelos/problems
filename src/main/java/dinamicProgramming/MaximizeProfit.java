package dinamicProgramming;

public class MaximizeProfit {

  public static void main(String[] args) {
    maxProfit1(new int[]{7, 1, 5, 3, 6, 4});
    maxProfitN(new int[]{7, 1, 5, 3, 6, 4});
  }

  /**
   * Best Time to Buy and Sell Stock. k = 1 (buy and sell at most once).
   *
   * Say you have an array for which the ith element is the price of a given stock on day i. If you
   * were only permitted to complete at most one transaction (i.e., buy one and sell one share of
   * the stock), design an algorithm to find the maximum profit. Note that you cannot sell a stock
   * before you buy one.
   *
   * Time complexity: O(N). Space complexity: O(1).
   *
   * @param prices array with p
   * @return maximum profit
   */
  public static int maxProfit1(int[] prices) {
    if (prices == null || prices.length <= 1) {
      return 0;
    }

    int minBuy = prices[0], maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
      minBuy = Math.min(minBuy, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - minBuy);
    }

    return maxProfit;
  }

  /**
   * Best Time to Buy and Sell Stock II. k = 0..n (buy and sell multiple times).
   *
   * Say you have an array for which the ith element is the price of a given stock on day i.
   *
   * Design an algorithm to find the maximum profit. You may complete as many transactions as you
   * like (i.e., buy one and sell one share of the stock multiple times).
   *
   * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the
   * stock before you buy again).
   *
   * Time complexity: O(N). Space complexity: O(1).
   *
   * @param prices array with p
   * @return maximum profit
   */
  public static int maxProfitN(int[] prices) {
    if (prices == null || prices.length <= 1) {
      return 0;
    }

    int profit = 0;
    int buyPrice = -1;

    if (prices[0] < prices[1]) {
      buyPrice = prices[0];
      profit -= prices[0];
    }

    for (int i = 1; i < prices.length - 1; i++) {
      int comparison = prices[i] - prices[i + 1];
      if (comparison > 0) {
        if (buyPrice != -1) {
          profit += prices[i];
          buyPrice = -1;
        }
      } else if (comparison < 0 && buyPrice == -1) {
        profit -= prices[i];
        buyPrice = prices[i];
      }
    }

    if (buyPrice != -1 && prices[prices.length - 1] > buyPrice) {
      profit += prices[prices.length - 1];
    }

    return profit;
  }
}