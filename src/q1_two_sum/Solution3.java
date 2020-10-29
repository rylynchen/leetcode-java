package q1_two_sum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Description:
 * @Author: liuchen created at 14:29 2020-09-30
 */
public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 1) {
            return new int[]{};
        }
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution3 s = new Solution3();
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }
}
