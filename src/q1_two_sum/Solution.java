package q1_two_sum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 *
 * 遍历nums, 同时生成map(key = target - num[i], val = i)
 *
 * Time: O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/two-sum/
 * @Author: liuchen created at 14:29 2020-09-30
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            int n = target - nums[i];
            if (map.containsKey(n)) {
                return new int[]{map.get(n), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }
}
