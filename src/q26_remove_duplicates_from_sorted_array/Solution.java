package q26_remove_duplicates_from_sorted_array;

/**
 * @Description:
 * @Author: liuchen created at 21:12 2020-10-20
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                ++j;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution s = new Solution();
        int len = s.removeDuplicates(nums);
        System.out.println(len);
    }
}
