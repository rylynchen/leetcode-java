package q1_two_sum;

import java.util.HashMap;

/**
 * @Description:
 * @Author: liuchen created at 14:29 2020-09-30
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i<nums.length;++i) {
            int n = target - nums[i];
            if (map.containsKey(n)) {
                return new int[]{map.get(n), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
