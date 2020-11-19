package q322_coin_change;

import java.util.Arrays;

/**
 * 零钱兑换
 * <p>
 * Solution: 贪心算法, 从大到小
 *
 * @Link: https://leetcode-cn.com/problems/coin-change/
 * @Author: liuchen created at 23:29 11/11/2020
 */
public class Solution {

    private int ans;

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        Arrays.sort(coins);
        ans = Integer.MAX_VALUE;
        helper(coins, amount, coins.length - 1, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private void helper(int[] coins, int amount, int index, int count) {
        if (amount == 0) {
            ans = Math.min(ans, count);
            return;
        }
        if (index < 0) {
            return;
        }
        for (int k = amount / coins[index]; k >= 0 && k + count < ans; k--) {
            helper(coins, amount - k * coins[index], index - 1, count + k);
        }
    }

    public static void main(String[] args) {
        int[] coins = new int[]{1, 5, 2};
        int amount = 11;
        Solution s = new Solution();
        System.out.println(s.coinChange(coins, amount));
    }
}
