package q283_move_zeroes;

import java.util.Arrays;

/**
 * @Description:
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
