package q53_maximum_subarray;

/**
 * 最大子序和
 *
 * @Link: https://leetcode-cn.com/problems/maximum-subarray/
 * @Author: liuchen created at 13:40 19/11/2020
 */
public class Solution2 {

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + Math.max(dp[i - 1], 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Solution2 s = new Solution2();
        System.out.println(s.maxSubArray(nums));
    }
}
