package q53_maximum_subarray;

/**
 * 最大子序和
 *
 * @Link: https://leetcode-cn.com/problems/maximum-subarray/
 * @Author: liuchen created at 13:40 19/11/2020
 */
public class Solution3 {

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[i] = nums[i];
                max = dp[i];
                continue;
            }
            dp[i] = Math.max(dp[i - 1], 0) + nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Solution3 s = new Solution3();
        System.out.println(s.maxSubArray(nums));
    }
}
