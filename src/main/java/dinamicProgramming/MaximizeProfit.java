package dinamicProgramming;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i. If you
 * were only permitted to complete at most one transaction (i.e., buy one and sell one share of the
 * stock), design an algorithm to find the maximum profit. Note that you cannot sell a stock before
 * you buy one.
 */
public class MaximizeProfit {

  public static void main(String[] args) {
    maxProfit(new int[]{7, 1, 5, 3, 6, 4});
  }

  /**
   * <p>
   * Time complexity: O(N). Space complexity: O(1).
   * </p>
   */
  public static int maxProfit(int[] prices) {
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
}