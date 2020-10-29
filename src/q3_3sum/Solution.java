package q3_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: liuchen created at 20:08 2020-10-22
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) ;
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) ;
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        Solution s = new Solution();
        s.threeSum(nums);
    }
}
