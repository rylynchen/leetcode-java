package q283_move_zeroes;

import java.util.Arrays;

/**
 * 移动零
 * <p>
 * Solution1: 双指针，快指针正常循环遇到非0与慢指针交换值，慢指针指向当前第一个0位置
 * Solution2: 循环2次，第一次，把所有非0存到nums[j++], 第二次从j到nums.length-1补0
 * <p>
 * Time: O(n), Space:O(1)
 *
 * @Link: https://leetcode-cn.com/problems/move-zeroes
 * @Author: liuchen created at 09:49 2020-10-22
 */
public class Solution {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        Solution s = new Solution();
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
