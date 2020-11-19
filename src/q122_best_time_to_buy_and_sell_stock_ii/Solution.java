package q122_best_time_to_buy_and_sell_stock_ii;

/**
 * 买卖股票的最佳时机 II
 * <p>
 * Solution:<贪心算法>只要判断比前一天大，就计算为收益
 * <p>
 * Time:O(n), Space: O(1)
 *
 * @Link: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 * @Author: liuchen created at 10:50 14/11/2020
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int money = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                money += prices[i] - prices[i - 1];
            }
        }
        return money;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        Solution s = new Solution();
        System.out.println(s.maxProfit(prices));
    }
}
