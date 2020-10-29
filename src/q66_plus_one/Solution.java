package q66_plus_one;

import java.util.Arrays;

/**
 * @Description:
 * @Author: liuchen created at 15:27 2020-10-20
 */
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length - 1;i>=0;--i) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
//        int[] nums = new int[] {4,3,2,1};
        int[] nums = new int[] {9,9};
        q66_plus_one.Solution s = new q66_plus_one.Solution();
        int[] keys = s.plusOne(nums);
        System.out.println(Arrays.toString(keys));
    }
}