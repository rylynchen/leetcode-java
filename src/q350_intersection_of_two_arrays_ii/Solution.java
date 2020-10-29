package q350_intersection_of_two_arrays_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author: liuchen created at 22:10 2020-10-26
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>(nums1.length);
        int[] dup = new int[nums1.length];
        for (int i = 0; i< nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        int m = 0;
        for (int j = 0; j < nums2.length; j++) {
            if (!map.containsKey(nums2[j])) {
                continue;
            }
            int n = map.get(nums2[j]);
            if (n > 0) {
                dup[m] = nums2[j];
                m++;
                map.put(nums2[j], n - 1);
            }
        }
        return Arrays.copyOfRange(dup, 0, m);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.intersect(nums1, nums2)));
    }
}
