package q3_3sum;

import java.util.*;

/**
 * @Description:
 * @Author: liuchen created at 20:08 2020-10-22
 */
public class Solution2 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i<nums.length - 2;i++) {
            if (i == 0 || nums[i] != nums[i - 1] ) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[++lo]);
                        while (lo < hi && nums[hi] == nums[--hi]);
                    } else if (nums[lo] + nums[hi] < sum) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return res;
    }
}
