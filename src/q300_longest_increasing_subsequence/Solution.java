package q300_longest_increasing_subsequence;

/**
 * 最长递增子序列
 * <p>
 * Solution:动态规划 dp[i] = Max(dp[i-1]) + 1, MaxLen = Max(dp[i])
 * <p>
 * Time: O(n^n),Space:O(n)
 *
 * @Link: https://leetcode-cn.com/problems/longest-increasing-subsequence/
 * @Author: liuchen created at 14:25 19/12/2020
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            len = Math.max(len, dp[i]);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        Solution s = new Solution();
        System.out.println(s.lengthOfLIS(nums));
    }
}
