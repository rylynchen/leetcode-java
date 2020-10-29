package q1365_how_many_numbers_are_smaller_than_the_current_number;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Description:
 * @Author: liuchen created at 22:40 2020-10-26
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {8,1,2,2,3};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.smallerNumbersThanCurrent(nums)));
    }
}
