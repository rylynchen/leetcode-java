package q53_maximum_subarray;

/**
 * 最大子序和
 *
 * @Link: https://leetcode-cn.com/problems/maximum-subarray/
 * @Author: liuchen created at 13:40 19/11/2020
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Solution s = new Solution();
        System.out.println(s.maxSubArray(nums));
    }
}
