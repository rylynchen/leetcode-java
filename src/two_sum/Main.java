package two_sum;

import java.util.Arrays;

/**
 * @Description:
 * @Author: liuchen created at 14:31 2020-09-30
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        Solution s = new Solution();
        int[] keys = s.twoSum(nums, target);
        System.out.println(Arrays.toString(keys));
    }
}
