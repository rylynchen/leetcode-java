package q239_sliding_window_maximum;

import java.util.Arrays;

/**
 * @Description:
 * @Author: liuchen created at 11:01 2020-10-31
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] list = new int[k];
        return list;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.maxSlidingWindow(nums, k)));
    }
}
