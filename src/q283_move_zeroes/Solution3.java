package q283_move_zeroes;

import java.util.Arrays;

/**
 * @Description:
 * @Author: liuchen created at 09:49 2020-10-22
 */
public class Solution3 {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i++] = num;
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        Solution3 s = new Solution3();
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
