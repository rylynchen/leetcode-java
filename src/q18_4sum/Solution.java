package q18_4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 *
 * @Link: https://leetcode-cn.com/problems/4sum/
 * @Author: liuchen created at 12:21 22/11/2020
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            // not first and same pre
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // too big
            if (nums[i] + nums[i + 1] + +nums[i + 2] + +nums[i + 3] > target) {
                break;
            }
            // too small
            if (nums[i] + nums[nums.length - 3] + nums[nums.length - 2] + nums[nums.length - 1] < target) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                // not first and same pre
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                // too big
                if (nums[i] + nums[j] + +nums[j + 1] + +nums[j + 2] > target) {
                    break;
                }
                // too small
                if (nums[i] + nums[j] + nums[nums.length - 2] + nums[nums.length - 1] < target) {
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // left same next
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        // right same next
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        Solution s = new Solution();
        System.out.println(s.fourSum(nums, target));
    }
}
